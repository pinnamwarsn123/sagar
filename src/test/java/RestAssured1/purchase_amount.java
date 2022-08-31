package RestAssured1;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import junit.framework.Assert;

public class purchase_amount
{

	
	@Test
	public void purchasemethod()
	{
	       int sum=0;
		JsonPath js=new JsonPath(arrayPayload.itcourse());
		
		int count = js.getInt("courses.size()");
		
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
		int	price=js.getInt("courses["+i+"].price");
		int copies=js.getInt("courses["+i+"].copies");
		int amt = price*copies;
		System.out.println(amt);
		
		sum=sum+amt;
	
		}
		System.out.println(sum);

}

	@Test
     public void purchaseamt()
   {
		int sum=800;
		JsonPath js=new JsonPath(arrayPayload.itcourse());
		
		int puramt = js.getInt("dashboard[0].purchaseamount");
		System.out.println(puramt);
     Assert.assertEquals(sum, puramt);
     
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
