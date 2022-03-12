package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import Pages.LoginPage;

@Test
public class LoginTest extends BaseClass {
	
WebDriver driver;

	
	@Test
	public void LoginFailiureTest() {
	
	test = report.startTest("LoginFailureTest");

	LoginPage Login = new LoginPage();
		
	Login.LoginFunction("xyz@abc.com","Abc@12345");
		
	WebElement ErrorMsg = driver.findElement(By.id("msg_box")); 
		
	String ActualMsg = ErrorMsg.getText();
	String ExpMsg = "The email or password you have entered is invalid.";
		
	Assert.assertEquals(ActualMsg, ExpMsg);
		
	report.endTest(test);
	
	}
	
@Test	
public void LoginSuccessTest() {

	test = report.startTest("LoginFailureTest");
	
	LoginPage Login1=new LoginPage();
	Login1.LoginFunction("xyz@abc.com","Abc@12345");
	
	report.endTest(test);		
	
}

@Test
@Parameters({"Parameter1","Parameter2"})

public void ParameterizedTest(String UserName, String Password) {
	
	test = report.startTest("LoginFailureTest");
	
	LoginPage login = new LoginPage();
	
	login.LoginFunction(UserName, UserName);
	
	report.endTest(test);
}
@Test
public void ExternalData() {
	
	test = report.startTest("LoginFailureTest");	
	
	String UserNameVal= sheet.getRow(1).getCell(0).getStringCellValue();
	String Password=sheet.getRow(1).getCell(1).getStringCellValue();
	
	LoginPage Login1=new LoginPage();
	Login1.LoginFunction(UserNameVal,Password);
	
	report.endTest(test);
		
	}


}
