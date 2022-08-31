package restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class get1
{
    @Test
    void detailsget()
    {
    	//specify base uri
    	RestAssured.baseURI="https://reqres.in";
    	
    	//request object
    	RequestSpecification requests = RestAssured.given();
    	
    	//response
    	
    	Response response = requests.request(Method.GET,"api/users?page=2");
    	
    	String data = response.getBody().asPrettyString();
    	
    	System.out.println("response data is"+data);
    	
    	int statuscode = response.getStatusCode();
    	System.out.println("status code is"+statuscode);
    	Assert.assertEquals(200, statuscode);
 
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
}
