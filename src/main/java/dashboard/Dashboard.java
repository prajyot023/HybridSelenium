package dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard {
	 /*client brand banner*/
	@FindBy(xpath = "//img[@alt='client brand banner']")
	WebElement clientBraandBanner;

	
	@FindBy(xpath = "//h6[text()='Dashboard']")
	WebElement dashbordHeadling;
	
	  /*button*/
	@FindBy(xpath = "//button[text()=' Upgrade']")
	WebElement upgradebutton;
	
	
	@FindBy(xpath = "//img[@alt='profile picture']")
	WebElement profilepictureimg;
	
	   
	@FindBy(xpath = "//p[@class=\"oxd-userdropdown-name\"]")
	WebElement userdropdownparagraph;
	
	
	@FindBy(xpath = "//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]")
	WebElement genericUpAndDown;
	
	  ......menuitem About
	@FindBy(xpath = "//a[text()='About']")
	WebElement menuitemAbout;
	
	 .....menuitem support
	@FindBy(xpath = "//a[text()='Support']")
	WebElement menuitemSupport;
	
	......menuitem change password
	@FindBy(xpath = "//a[text()='Change Password']")
	WebElement menuitemChangePass;
	
	  .............menuitem logout
	@FindBy(xpath = "//a[text()='Logout']")
	WebElement menuitemLogout;
	
	
	
	/*Side bar itms like searchbox,admin,PIM,LEAVE,Time,etc.*/
	
	
	@FindBy(xpath = "//input[@placeholder=\"Search\"]")
	WebElement Search;
	
	
	@FindBy(xpath = "//span[text()='Admin']")
	WebElement Admin;
	
	
	@FindBy(xpath = "//span[text()='PIM']")
	WebElement pIM;
	
	
	@FindBy(xpath = "//span[text()='Leave']")
	WebElement Leave;
	
	
	@FindBy(xpath = "//span[text()='Time']")
	WebElement Time;
	
	
	@FindBy(xpath = "//span[text()='Recruitment']")
	WebElement Recruitment;

	
	@FindBy(xpath = "//span[text()='My Info']")
	WebElement myInfo;
	
	
	@FindBy(xpath = "//span[text()='Performance']")
	WebElement Performance;
	
	
	@FindBy(xpath = "//span[text()='Dashboard']")
	WebElement Dashboard;
	
	
	@FindBy(xpath = "//span[text()='Directory']
	WebElement Directory;
	
	
	@FindBy(xpath = "//span[text()='Maintenance']")
	WebElement Maintenance;
	
	
	@FindBy(xpath = "//span[text()='Claim']")
	WebElement Claim;
	
	
	
	@FindBy(xpath = "//span[text()='Buzz']")
	WebElement buzz;
	
	 
	@FindBy(xpath = "//i[@class=\"oxd-icon bi-chevron-left\"]")
	WebElement genericRightOrLeft;
	
	
	
	/*Time at work*/
	
	
	@FindBy(xpath = "//p[text()='Time at Work']")
	WebElement timeAtWorkText;
	
	  ......generic
	@FindBy(xpath = "//i[@class='oxd-icon bi-stopwatch']")
	WebElement Stopwatchgeneric;
	
	/*My Action*/
	
	
	@FindBy(xpath = "//p[text()='My Actions']")
	WebElement MyActionText;
	
	
	@FindBy(xpath = "//p[text()='(1) Pending Self Review']")
	WebElement PendingSelfReviewText;
	
	
	@FindBy(xpath = "//p[text()='(1) Candidate to Interview']")
	WebElement CandidateToInterviewText;
	
	/*Quick launch*/
	
	
	
	
	
	

}
