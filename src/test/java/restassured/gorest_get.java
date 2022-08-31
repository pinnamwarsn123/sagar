package restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class gorest_get 
{
    @Test
	public void getdetails()
	{
    	//specify basic uri
    	
    	
     RestAssured.baseURI="https://gorest.co.in/public/v2/users";
    	
    //request object
     RequestSpecification requests = RestAssured.given();
     
     //response
     Response responses = requests.request(Method.GET,"/public/v2/users/29");
     
     System.out.println("data is "+responses);
     int statuscode = responses.getStatusCode();
     
     Assert.assertEquals(statuscode, 200);
     
     
    			            
    	
    	
    	
    	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
