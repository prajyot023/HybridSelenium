package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;


public class LoginPageTest extends  BaseClass{
	@BeforeClass
	public void setup() {
		launchWeb();
		
	}
	@AfterClass
	public void teardown() {
		driver.close();
		
	}
	
	
	@Test
	public void checkPageTitle() { 
		
	String pageTitle = driver.getTitle();
	
	
	if(pageTitle.equalsIgnoreCase("OrangeHRM")) {
	System.out.println("We are on correct page");
	}
	
	

}
	
	
}
