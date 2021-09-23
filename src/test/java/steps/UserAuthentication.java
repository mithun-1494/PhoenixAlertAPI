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



public class UserAuthentication extends ReadJson{

    public  ReadJson read;

    public UserAuthentication(ReadJson read) {
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
	
	
	
	@Given("^Headers$")
	public void headers() {
		this.scenario.log(scenario.getName());
		request.header("Content-Type", "application/json");
		request.contentType(ContentType.JSON);
		request.accept(ContentType.JSON);
		request.headers("Authorization", "Bearer"+token);
	}
	
	@When("^I Enter Username$")
	public void enterUsername() {
		this.scenario.log(scenario.getName());
	     requestParams.appendField("userName", username).toJSONString();
	}
	
	@And("^I Enter Password$")
	public void enterPassword() {
		this.scenario.log(scenario.getName());
	     requestParams.appendField("password", password).toJSONString();
	}
	
	@And("^I Enter EmailID$")
	public void enterEmailID() {
		this.scenario.log(scenario.getName());
	     requestParams.appendField("emailId",  emailid).toJSONString();
	}
	
	@And("^I Enter Database$")
	public void enterDatabase() {
		this.scenario.log(scenario.getName());
	     requestParams.appendField("DataBase", database).toJSONString();
	    
	}
	
//	@Then("^get Token$")
//	public void getToken() {
//	     Response response = request.get(BaseURI + authuri);
////	     request.body(requestParams.toString());
//			String successCode=response.body().jsonPath().get("token");
//			System.out.println(successCode);
//	}
	
	@Given("^I Login With Teacher using User Credentials$")
	public void loginWithTeacher() throws JsonParseException, JsonMappingException, IOException {
		this.scenario.log(scenario.getName());
		request.body(read.convertJSONFiletoJSONString("/Teacher").toString());
	}
	
	@Then("^I Should get Teacher User Response$")
	public void getTeacherResponse() throws JsonParseException, JsonMappingException, IOException {
		this.scenario.log(scenario.getName());
		Response response = request.post(BaseURI +read.convertJSONFiletoJsonObject("URI","SignIn").asText());
		response.body().jsonPath().prettyPrint();
	}
	
	@Given("^I Login With SysAdmin using User Credentials$")
	public void loginWithSysadmin() throws JsonParseException, JsonMappingException, IOException {
		this.scenario.log(scenario.getName());
		request.body(read.convertJSONFiletoJSONString("/SysAdmin"));
	}
	
	@Given("^I Login as SysAdmin$")
	public void loginasSysadmin() throws JsonParseException, JsonMappingException, IOException {
		this.scenario.log(scenario.getName());
		request.body(requestParams.toString());
	}
	
	@Then("^I Should get SysAdmin User Response$")
	public void getSysAdminResponse() throws JsonParseException, JsonMappingException, IOException {
		this.scenario.log(scenario.getName());
		Response response = request.post(BaseURI +read.convertJSONFiletoJsonObject("URI","SignIn").asText());
		response.body().jsonPath().prettyPrint();
	}
	
	@Given("^I Login With TenantAdmin using User Credentials$")
	public void loginWithTenantadmin() throws JsonParseException, JsonMappingException, IOException {
		this.scenario.log(scenario.getName());
		request.body(read.convertJSONFiletoJSONString("/TenantAdmin"));
	}
	
	@Then("^I Should get TenantAdmin User Response$")
	public void getTenantAdminResponse() throws JsonParseException, JsonMappingException, IOException {
		this.scenario.log(scenario.getName());
		Response response = request.post(BaseURI +read.convertJSONFiletoJsonObject("URI","SignIn").asText());
		response.body().jsonPath().prettyPrint();
	}
	
	@Given("^I Login With \"([^\"]*)\" using User Credentials$")
	public void loginUsingAtUser(String str) throws JsonParseException, JsonMappingException, IOException {
		this.scenario.log(scenario.getName());
		request.body(read.convertJSONFiletoJSONString(str));
	}
	
	@Then("^I Should get PropertyAdmin User Response$")
	public void getPropertyAdminResponse() throws JsonParseException, JsonMappingException, IOException {
		this.scenario.log(scenario.getName());
		Response response = request.post(BaseURI +read.convertJSONFiletoJsonObject("URI","SignIn").asText());
		response.body().jsonPath().prettyPrint();
	}
	


}


