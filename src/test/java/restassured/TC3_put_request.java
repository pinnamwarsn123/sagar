package restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TC3_put_request
{
    @Test
	void detailsput()
	{
		//specify the base uri
		RestAssured.baseURI="https://reqres.in";
		
		//request object
		RequestSpecification request = RestAssured.given();
		
		request.header("Authorization","Basic Auth");
		request.header("Content-Type","application/json");
		
		
		String replacementdetails="{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"leader\",\r\n" + 
				"    \"updatedAt\": \"2022-07-09T10:56:43.524Z\"\r\n" + 
				"}";
		
		Response replaceresponse = request.body(replacementdetails).put("api/users/2");
		
		Assert.assertEquals(200, replaceresponse.getStatusCode());
		
		System.out.println(replaceresponse.asPrettyString());
				
	}
	
	
	
	
	
	
	
	
	
}
