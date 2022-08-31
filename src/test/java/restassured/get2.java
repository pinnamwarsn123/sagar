package restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class get2 
{
     @Test
     void getdetails()
     {
    	//specify the base uri
    	 RestAssured.baseURI="https://reqres.in";
    	 
    	 //request object
    	 RequestSpecification requests = RestAssured.given();
    	 
    	 //response
    	 Response responses = requests.request(Method.GET,"api/users?page=2");
    	 
    	 String data = responses.getBody().asPrettyString();
    	 
    	 System.out.println("response data is"+data);
    	 int statuscode = responses.getStatusCode();
    	 System.out.println(statuscode);
    	 
    	 
    	 
     }
	
	
	
	
	
	
	
	
	
	
	
	
}
