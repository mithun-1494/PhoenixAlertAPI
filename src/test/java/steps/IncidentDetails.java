package steps;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import DataAccess.ReadJson;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.minidev.json.JSONObject;
import resources.PropertiesFile;



public class IncidentDetails extends ReadJson{

    public  ReadJson read;

    public IncidentDetails(ReadJson read) {
        this.read = read;
        
    }
    
    private Scenario scenario;
    
    JSONObject requestParams = new JSONObject();
	
	public String baseuri = PropertiesFile.readPropertiesFile("BaseURI");
	public String BaseURI = RestAssured.baseURI = baseuri;
	
	public String username = PropertiesFile.readPropertiesFile("UserName");
	public String password = PropertiesFile.readPropertiesFile("Password");
	public String database = PropertiesFile.readPropertiesFile("DataBase");
	public static String token = PropertiesFile.readPropertiesFile("Token");
	public String emailid = PropertiesFile.readPropertiesFile("EmailId");
	public String authuri = PropertiesFile.readPropertiesFile("AuthURI");
	RequestSpecification request = RestAssured.given();
	
	
	
	@When("^I Enter CurrentDate$")
	public void enterCurrentDate() {
		this.scenario.log(scenario.getName());
	     requestParams.appendField("userName", username).toJSONString();
	}
	
	@Given("^I Enter Incident Details$")
	public void enterIncidentDetails() throws JsonParseException, JsonMappingException, IOException {
		this.scenario.log(scenario.getName());
		request.header("Content-Type", "application/json");
		request.contentType(ContentType.JSON);
		request.accept(ContentType.JSON);
		request.headers("Authorization", "Bearer"+token);
		System.out.println(read.convertJSONFiletoJsonObject("CreateHardLockDown","Teacher").toString());
		request.body(read.convertJSONFiletoJsonObject("CreateHardLockDown","Teacher").toString());
	}
	
	@Then("^Create Incident$")
	public void getTeacherResponse() throws JsonParseException, JsonMappingException, IOException {
		this.scenario.log(scenario.getName());

		Response response = request.post(BaseURI +read.convertJSONFiletoJsonObject("URI","CreateIncident").asText());
		response.body().jsonPath().prettyPrint();
	}
	
	
	


}


