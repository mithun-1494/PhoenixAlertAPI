package DataAccess;

import java.io.IOException;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ReadJson{
	
	public String path="D:\\Latest\\L3\\APICucucumber\\src\\test\\java\\dataAccess\\";
	
	//To convert a Java Object to a JSON string, you can use the writeValueAsString() method of ObjectMapper, as shown below:
	
	
	public  String convertJSONFiletoJSONString(String str) throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper objectMapper = new ObjectMapper();
		

		    JsonNode jsonNode = objectMapper.readValue(Paths.get(path+"AlertAPI.json").toFile(), JsonNode.class);
		    jsonNode.at(str);
		    System.out.println(jsonNode.at(str).toString());
		    return jsonNode.at(str).toString();
	}
	
	public void convertJSONFiletoStringUsingNode(String str)
	{
		ObjectMapper objectMapper = new ObjectMapper();
		try {

		    JsonNode jsonNode = objectMapper.readValue(Paths.get(path+"AlertAPI.json").toFile(), JsonNode.class);
		    System.out.println(jsonNode.at(str).toString());
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
	
	public JsonNode convertJSONFiletoJsonObject(String node,String field) throws JsonParseException, JsonMappingException, IOException
	{

		ObjectMapper objectMapper = new ObjectMapper();
		

		    JsonNode jsonNode = objectMapper.readValue(Paths.get(path+"AlertAPI.json").toFile(), JsonNode.class);
		    JsonNode child = jsonNode.get(node);
		    JsonNode childField = child.get(field);
			return childField;
	
	}
	
	public JsonNode getArrayOfObjectFromJSON(String node,String field) throws JsonParseException, JsonMappingException, IOException
	{

		ObjectMapper objectMapper = new ObjectMapper();
		

		    JsonNode jsonNode = objectMapper.readValue(Paths.get(path+"AlertAPI.json").toFile(), JsonNode.class);
		    
		    JsonNode array = jsonNode.get(node);
		    JsonNode childField = array.get(field);
		    String john = childField.asText();
			return childField;
	
	}
		
	public void convertJSONValueFromJSONTree()
	{
		String carJson =
		        "{ \"brand\" : \"Mercedes\", \"doors\" : 5," +
		        "  \"owners\" : [\"John\", \"Jack\", \"Jill\"]," +
		        "  \"nestedObject\" : { \"field\" : \"value\" } }";

		ObjectMapper objectMapper = new ObjectMapper();


		try {

		    JsonNode jsonNode = objectMapper.readValue(carJson, JsonNode.class);

		    JsonNode brandNode = jsonNode.get("brand");
		    String brand = brandNode.asText();
		    System.out.println("brand = " + brand);

		    JsonNode doorsNode = jsonNode.get("doors");
		    int doors = doorsNode.asInt();
		    System.out.println("doors = " + doors);

		    JsonNode array = jsonNode.get("owners");
		    JsonNode jsonNode1 = array.get(0);
		    String john = jsonNode1.asText();
		    System.out.println("john  = " + john);

		    JsonNode child = jsonNode.get("nestedObject");
		    JsonNode childField = child.get("field");
		    String field = childField.asText();
		    System.out.println("field = " + field);

		} catch (IOException e) {
		    e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
