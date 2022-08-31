package restassured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class post1
{   
	@Test
	void detailspost()
	{
		//specify the basic uri
		RestAssured.baseURI="https://reqres.in";
		
		//request object
		   RequestSpecification requests = RestAssured.given();
		   
		  String payload="{\r\n" + 
		  		"    \"name\": \"morpheus\",\r\n" + 
		  		"    \"job\": \"leader\"\r\n" + 
		  		"}";
		  
		  requests.header("Content-Type","application/json");
		  requests.body(payload);
		  
		     Response responses = requests.request(Method.POST,"api/users");
		     
		     String data = responses.getBody().asPrettyString();
		     System.out.println(data);
		     
		     int statuscode = responses.getStatusCode();
		     System.out.println(statuscode);
		     Assert.assertEquals(201, statuscode);
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		  
		  
		  
		  
		  
		  
		  
	   
//		   //request payload along sending with post request
//		   JSONObject requestparams=new JSONObject();
//		   
//		  
//		   
//		   
//		   
//		   //response
//		  // Response responses = requests.request(Method.POST,"api/users");
//		   
		   
		   
		   
		   
		   
	}
	
	
	
	
	
}
