package testcases;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.LoginPage;


public class SimplilearnLoginTest extends BaseClass{
	
	
	@Test
	public void Test1() {
		
		LoginPage lp = new LoginPage(driver);
		lp.Login("abc@xyz.com","Abc@1234");
		
		//Step6: Validate the error message on screen
		WebElement Error = driver.findElement(By.id("msg_box"));
		
		String ActError = Error.getText();
		String ExpError = "The email or password you have entered is invalid.";
		
		Assert.assertTrue(Error.isDisplayed());
		Assert.assertEquals(ActError, ExpError);
		
		//if(ActError.equals(ExpError)) {
			//System.out.println("TC Passed");
		//}else {
			//System.out.println("TC Failed");
		//}
	}
	
	
	@Test
	@Parameters({"uname","pwd"})
	public void Test2(String UserName, String Password) {
		LoginPage lp = new LoginPage(driver);
		lp.Login(UserName, Password);
		
	}
	//<class name="testcases.HomeTest"/>
}
		
		
	/*				
	}
	
	@Test
	//@Parameters({"uname","pwd"})
	
	public void Test2(String UserName, String Password) {
		
		LoginPage lp = new LoginPage(driver);
		lp.Login("abc@xyz.com","Abc@1234");
	}
	
	@Test
	public void Test2() {
		
		
		
		/*String UserName = sheet.getRow(1).getCell(0).getStringCellValue();
		String Password = sheet.getRow(1).getCell(1).getStringCellValue();
		
		LoginPage lp = new LoginPage(driver);
		lp.Login(UserName,Password);*/
	
	
	



