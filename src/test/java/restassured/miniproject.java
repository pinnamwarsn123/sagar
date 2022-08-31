 package restassured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import io.opentelemetry.sdk.logs.data.Body;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import junit.framework.Assert;
import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;



public class miniproject 
{   
	@Test(priority = 1)
   public void gettestdata()
   {
	  
	  given().
	  when().
	  get("https://reqres.in/api/users?page=2").
	then().
	log().body().
	statusCode(200);	
		
   }
	
	@Test(priority = 2)
	public void addnewdata()
	{
		HashMap data=new HashMap();
		data.put("id", "3020");
		data.put("name", "sagar");
		data.put("email","sagarpp@gmail.com" );
		data.put("gender", "male");
		data.put("status", "active");
		
		
		Response res = given().		
		contentType("application/json").
		body(data).
		when().
		post("https://reqres.in/api/users").
		then().
		statusCode(201).
		log().body().
		extract().response();
		//String jsonstring = res.asString();
		//Assert.assertEquals(jsonstring.contains("record added successfully"), );
		//Assert.assertEquals(jsonstring.contains("record added successfully"), true);
	}
	 @Test(priority = 3 )
	public void updatedata()
	{
		HashMap data=new HashMap();
		data.put("id", "3021");
		data.put("email", "sagarp@gmail.com");
		
		given().
		contentType("application/json").
		body(data).
		when().
		put("https://reqres.in/api/users/2").
		then().
		statusCode(200).
		log().body();
	
	}
      @Test(priority = 4)
	 public void deletedata()
	 {
		 Response res = given().
		 when().
		delete("https://reqres.in/api/users?page=2"). 
		then().
		statusCode(204).
		log().body().
		extract().response();
	//	String jsonstring = res.asString();
	//	Assert.assertEquals(jsonstring,204);
	 }
	  
	  
	 
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	

