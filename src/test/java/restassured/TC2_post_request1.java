package restassured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC2_post_request1 
{
    @Test
	void detailspost()
	{
		//specify the base uri
    	RestAssured.baseURI="https://reqres.in";
    	
    	//request object
    	RequestSpecification httprequest = RestAssured.given();
    	
    	//request payload sending along with post request
    	JSONObject requestparams=new JSONObject();
    	
    	requestparams.put("{\r\n" + 
    			"    \"name\": \"morpheus\",\r\n" + 
    			"    \"job\": \"leader\"\r\n" + 
    			"}","");
    	
         httprequest.header("Content-Type", "application/json");
         
          httprequest.body(requestparams.toJSONString());
          
          
          //print response in console window

          Response ss=httprequest.request(Method.POST,"api/users");
          
          System.out.println("respone of post is" +ss.getBody().asPrettyString());
          
          int statuscode=ss.getStatusCode();
          System.out.println(statuscode);
  		
          
          
          	
          
          
          
         
         
         
         
    	
    	
    	
    	
	}
	
	
	
	
	
	
	
	
	
}
