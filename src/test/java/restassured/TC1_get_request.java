package restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TC1_get_request
{
    @Test
	public void details()
	{
		//specify the base URI
		RestAssured.baseURI="https://reqres.in";
		
		//request
		RequestSpecification htRequest = RestAssured.given();
		
		//response object
		Response response = htRequest.request(Method.GET,"api/users?page=2");
		
		//print response in console window
		String responsbody = response.getBody().asPrettyString();
		System.out.println(responsbody);
		int statuscode=response.getStatusCode();
		System.out.println("status code is" +statuscode);	
		Assert.assertEquals(statuscode,200 );
		
			JsonPath path=	response.jsonPath();
			System.out.println(path.getString("data.first_name[0]"));
	  // String responsbody = response.getBody().asString();
	  //	System.out.println("response body is"+responsbody);
		//Assert.assertEquals(responsbody, 200);
		
		
		 
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
     