package restassured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.netty.handler.codec.http.HttpRequest;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class TC2_post_request 
{
     @Test
	void post()
	{  
		
		RestAssured.baseURI="https://reqres.in";
		
		RequestSpecification httrequest = RestAssured.given();
		
		String payload="{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}";
//         httrequest.put(payload);  
//	    JSONObject s=new JSONObject();
//	    s.put("name","morpheus");
//	    s.put("job","leader" );
	    httrequest.header("Content-Type", "application/json");
	    httrequest.body(payload);
	 
        Response ss=httrequest.request(Method.POST,"api/users");
        
        System.out.println("respone of post is" +ss.getBody().asPrettyString());
        
        int statuscode=ss.getStatusCode();
        System.out.println(statuscode);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
