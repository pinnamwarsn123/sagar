package restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class sample1
{  
	
	 @Test
     public void getallstudents()
     
   {
	 RequestSpecification requestsp = RestAssured.given();
	
	  Response response = requestsp.get("https://reqres.in/api/users?page=2");
	  
	  System.out.println(response.getBody().asPrettyString());
	  
	   ValidatableResponse validatableresponse = response.then();
	   
	    
	 validatableresponse.statusCode(200);
	 Assert.assertEquals(200,response.getStatusCode() );
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
