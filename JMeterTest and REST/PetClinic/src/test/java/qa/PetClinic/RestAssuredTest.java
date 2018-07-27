package qa.PetClinic;

import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.junit.Ignore;
import org.junit.Test;

import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class RestAssuredTest {
	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;
	
	@Test
	
	public void add () {
		
	
	RestAssured.baseURI = "http://10.0.10.10:9966/petclinic/api/owners";
	RequestSpecification request = given().contentType(ContentType.JSON);
	
	JSONObject variables = new JSONObject ();
	
		variables.put("address","12 Headfield Road");
		variables.put("city", "Manchester");
		variables.put("Telephone", "0123456789");
		variables.put("firstname", "Fozia");
		variables.put("lastname", "Khan");
		//variables.put("id", 12);
		
	
		
		System.out.println(request.body(variables.toString()));
		
		Response response = request.post("http://10.0.10.10:9966/petclinic/api/owners");
		System.out.println(response.getStatusCode());
	}
	
	@Test
	
	public void delete () {
		
	request = given().contentType(ContentType.JSON);
	
	response = request.delete("http://10.0.10.10:9966/petclinic/api/owners/10");
	
	}
	
	@Test
	
		public void updateOwner() {
		
		JSONObject variables = new JSONObject ();
		
		request = given().contentType(ContentType.JSON);
		
		variables.put("address","12 Headfield Road");
		variables.put("city", "Manchester");
		variables.put("Telephone", "0123456789");
		variables.put("firstname", "Fozia");
		variables.put("lastname", "Khan");
		variables.put("id", 8);
		
		response = request.put("http://10.0.10.10:9966/petclinic/api/owners/8");
		
		System.out.println("response: " + response.prettyPrint());
		System.out.println(response.getStatusCode());
		
		
	}
	
	
	

}


