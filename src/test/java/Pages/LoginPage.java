package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

	WebDriver driver;

	//**********************************objects*********************
	@FindBy(linkText = "Log in")
	WebElement LoginLink;
	
	@FindBy(name = "user_login")
	WebElement UserName;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(className = "rememberMe")
	WebElement Checkbox;
	
	@FindBy(name = "btn_login")
	WebElement LoginBtn;
	
	
	
	public LoginPage(WebDriver basedriver) {
		this.driver = basedriver;
		PageFactory.initElements(basedriver, this);
		
	}
	
	//*******************************Methods*********************
	public void Login(String UserNameVal, String PassVal) {
		
		//step1 click login link
		
		LoginLink.click();
		
		// step2 Enter username
		
		UserName.sendKeys(UserNameVal);
		
		//step :3 Enter password
		
		Password.sendKeys(PassVal);
		
		//step 4 :click remember me checkbox
		
		Checkbox.click();
		
		
		//step 5:click on login button
		
		LoginBtn.click();
		
	}
}
