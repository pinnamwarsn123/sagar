package restassured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class get3 
{

	void getdetails()
	{
	    //specify the base uri
		RestAssured.baseURI="https://reqres.in";
		
		//request object
		RequestSpecification requests = RestAssured.given();
		
		//response
		Response responses = requests.request(Method.GET,"api/users?page=2");
		
		String data = responses.getBody().asPrettyString();
		
		System.out.println(data);
		
		int statuscode = responses.getStatusCode();
		System.out.println("status code is"+statuscode);
	}
	
	
	
	
	
}
