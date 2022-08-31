package sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.jq.Main;

public class ss
{
   public static void main(String[] args)
   {
	
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	    
	   WebDriver driver=new ChromeDriver();
	   
	 driver.get("https://www.flipkart.com/");
	 
}
	
	
	
	
}
