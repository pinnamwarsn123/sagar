package RestAssured1;

import io.restassured.RestAssured;
import static  io.restassured.RestAssured.*;

public class getMethod 
{

	public static void main(String[] args) 
	{
	
		RestAssured.baseURI="https://reqres.in";
		
		given().queryParam("Content-Type", "application/xml")
		.when().get("api/users?page=2").then().log().all().assertThat().statusCode(200);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
