package restassured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*; 


public class getinBDDstyle 
{
    @Test
	void getmethod() 
	{
       
		given().
		when().
		  get("\r\n" + 
		  		"https://gorest.co.in/public/v2/users").
		then().log().body().
		assertThat().statusCode(200);
	}
	
	
	
	
	
	
	
	
	
	
}
