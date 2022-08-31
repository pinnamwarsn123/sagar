package restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class post2 
{
    @Test
	void postdetails()
	{
		//specify basic uri
    	RestAssured.baseURI="https://reqres.in";
    	
    	//request object
    	RequestSpecification requests = RestAssured.given();
    	
    	//payload
    	String payload="{\r\n" + 
    			"    \"name\": \"morpheus\",\r\n" + 
    			"    \"job\": \"leader\",\r\n" + 
    			"    \"id\": \"616\",\r\n" + 
    			"    \"createdAt\": \"2022-07-09T14:52:33.681Z\"\r\n" + 
    			"}";
    	
    	requests.header("Content-Type","application/json");
    	requests.body(payload);
    	
    	Response responses = requests.request(Method.POST,"api/users");
    	
    	String data = responses.getBody().asPrettyString();
    	
    	System.out.println(data);
    	
    	int statuscode = responses.getStatusCode();
    	
    	System.out.println(statuscode);
    	
    	Assert.assertEquals(201,statuscode );
    	
    	
    	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
