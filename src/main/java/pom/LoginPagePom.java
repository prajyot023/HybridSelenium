package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPagePom extends BaseClass{
	
	public LoginPagePom(){
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	
	@FindBy(xpath = "//img[@alt='company-branding']")
	WebElement companytag;
	
	
	@FindBy(xpath = "//h5[text()='Login']")
	WebElement logintag;
	
	
	@FindBy(xpath = "//p[text()='Username : Admin']")
	WebElement usernameflash;
	
	
	
	@FindBy(xpath = "//p[text()='Password : admin123']")
	WebElement passwordflash;
	
	
	
	@FindBy(xpath = "//label[text()='Username']")
	WebElement usernamelabel;
	
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement username;
	
	
	@FindBy(xpath = "//label[text()='Password']")
	WebElement passwordlabel;
	
	
	@FindBy(xpath = "/input[@name='password']")
	WebElement password;
	
	
	@FindBy(xpath = "//button")
	WebElement loginButton;
	
	
	@FindBy(xpath = "//p[text()='Forgot your password? ']")
	private
	WebElement ForgotPasswordLink;
	
	
	@FindBy(xpath = "//a[text()='OrangeHRM, Inc']")
	WebElement HRMLink;
	
	public String getusername() {
		String text=usernameflash.getText();
		return text.substring('A');
		}
		
	public String getpassword() {
		String text=passwordflash.getText();
		return text.substring(text.lastIndexOf('a'));
		
	}
	public void setusername(String usernameflash){
		 username.sendKeys(usernameflash);
	}
	public void setpassword(String passwordflash) {
		password.sendKeys(passwordflash);
	}
	public void loginclick() {
		loginButton.click();
	
	}

	public WebElement getForgotPasswordLink() {
		return ForgotPasswordLink;
	}

	public void setForgotPasswordLink(WebElement forgotPasswordLink) {
		ForgotPasswordLink = forgotPasswordLink;
	}
		
	

}
