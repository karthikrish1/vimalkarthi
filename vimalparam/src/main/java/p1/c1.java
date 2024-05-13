package p1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class c1 {
//parameterisation: providing value to the test data through testng.xml file 
	@Parameters({"A","B"})//A=u    B=v
	@Test
	public void t1(String u, String v)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		//id=user
		ob.findElementById("user").sendKeys(u);
		
		//name=pass
		
		ob.findElementByName("pass").sendKeys(v);
		
		//classname=btn_log
		ob.findElementByClassName("btn_log").click();
	}
}
