package RestAssured1;

import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static  io.restassured.RestAssured.*;

public class updateMethod
{

	public static void main(String[] args)
	{
	 RestAssured.baseURI="https://reqres.in";
	 
	 
	 
	 String  newname="ganesh";
	 
	String updated1 = given().queryParam("Content-Type","application/json").body(payload.adddata()).when().put("api/users/2")
	 .then().log().all().assertThat().statusCode(200).body("updatedAt", equalTo("2022-08-27T11:13:03.956Z")).extract().response().asString();
		
	JsonPath js=new JsonPath(updated1);
	String actualname = js.getString(newname);
	
	System.out.println(actualname);
	
	 String newget = given().queryParam("Content-Type","application/json").body(payload.adddata()).when().get("api/users/2")
	 .then().log().all().assertThat().statusCode(200).extract().response().asPrettyString();
	 
	System.out.println(newget);
	
	
	//GET place
	 
	// String getPlaceResponse=given().log().all().
	 
		
		
		
		
		
		
		
		
		
		
		
	}

	private static ResponseAwareMatcher<Response> equalTo(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
