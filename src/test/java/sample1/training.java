package sample1;



import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class training
{


	@Test(dataProvider  ="logintestdata") 
  public void openbrowser(String username,String password , String pin )
  {
	  Reporter.log("openbrowser",true);
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sagar\\OneDrive\\Desktop\\SELENIUM SOFT\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
	 
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://kite.zerodha.com/");
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("username");
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pin");
	  
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
  }
	@DataProvider(name="logintestdata")
	public Object[][] logindata()
	{
	 Object[][] data=new Object[2][2];
	 data[0][0]="YUG204";
	 data[0][1]="sagar@7570";
	 
     data[0][2]="485002";
    // data[1][1]="485002";
 	// data[1][1]="";
	  
	 return data;
	 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
