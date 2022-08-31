package RestAssured1;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class getArray {

	public static void main(String[] args) {

		// print number of courses written by api
		JsonPath js = new JsonPath(arrayPayload.itcourse());

		int count = js.getInt("courses.size()");

		System.out.println(count);

		// print purchase amt

		int amt = js.getInt("dashboard[0].purchaseamount");

		System.out.println(amt);

		// print title of the first course

		String firsttitle = js.get("courses[0].title");
		System.out.println(firsttitle);

		// print all courses titles and there respective prices
		
		for (int i=0;i<count;i++)
		{
			String alltitle = js.get("courses["+i+"].title");
			System.out.println(js.getInt("courses["+i+"].price"));
			System.out.println(alltitle);
			
		}
		
		//no of copies sold by RPA Course
	for(int i=0;i<count ;i++)
	{
		String title = js.getString("courses["+i+"].title");
		if(title.equalsIgnoreCase("rpa"))
		{
			int copies = js.getInt("courses["+i+"].copies");
			System.out.println(copies);
			break;
		}
	}
	//verify if sum of all course prices matches with purchase amount 
	
	
	
	
	
	
	
	
	
	
		
		

	}

}
