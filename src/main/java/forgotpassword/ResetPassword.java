package forgotpassword;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResetPassword {
	
	
	@FindBy(xpath = "//h6[text()='Reset Password']")
	WebElement resetpassword;
	
	
	@FindBy(xpath = "//p[text()='Please enter your username to identify your account to reset your password']")
	WebElement text;
	
	
	@FindBy(xpath = "//label[text()='Username']")
	WebElement usernamelabel;
	
	
	@FindBy(xpath = "//input[@name=\"username\"]")
	WebElement username;
	
	
	@FindBy(xpath = "//button[text()=' Reset Password ']")
	WebElement resetbutton;
	
	
	@FindBy(xpath = "//button[text()=' Cancel ']")
	WebElement canclebutton;
	
	
	@FindBy(xpath = "//a[@href=\"http://www.orangehrm.com\"]")
	WebElement orangeHRMlink;

}
