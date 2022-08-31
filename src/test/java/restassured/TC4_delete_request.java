package restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TC4_delete_request 
{
    @Test
	void detailsdelete()
	{
		//specify the basic uri
    	RestAssured.baseURI="https://reqres.in";
    	
    	//request object
    	RequestSpecification request = RestAssured.given();
    	
    	//response 
    	String removedetails="{\r\n" + 
    			"    \"name\": \"morpheus\",\r\n" + 
    			"    \"job\": \"leader\",\r\n" + 
    			"    \"updatedAt\": \"2022-07-09T11:28:04.330Z\"\r\n" + 
    			"}";
    	
    	request.header("Authorization","Basic");
    	request.header("Content-Type","application/json");
    	
    	Response response = request.body(removedetails). delete("api/users/2");
    	
    	System.out.println("response status code is"+response.getStatusCode());
    	
    	Assert.assertEquals(204,response.getStatusCode() );
    	 
    	
    	
    	
    	
    	
    	
    	
    	
	}
	
	
	
	
	
}
