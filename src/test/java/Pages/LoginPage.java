package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testcases.BaseClass;

public class LoginPage {

	//--------------------------------------------Web Element--------------------------------------
	WebDriver driver= BaseClass.driver;
	ExtentTest test = BaseClass.test;
	
	@FindBy(className = "login")
	WebElement LoginLink;
	
	@FindBy(name = "user_login")
	WebElement UserName;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(name = "btn_login")
	WebElement LoginBtn;
	
	@FindBy(className = "rememberMe")
	WebElement RememberMe;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}

	
	//---------------------------------------- Test ------------------------------------------------
public void LoginFunction(String UserNameVal, String PasswordVal) {
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoginLink.click();
		test.log(LogStatus.PASS,"Clicked on Login link successfully");
		UserName.sendKeys(UserNameVal);
		test.log(LogStatus.PASS,"Entered user name successfully");
		Password.sendKeys(PasswordVal);
		test.log(LogStatus.PASS,"Entered Password successfully");
		RememberMe.click();
		test.log(LogStatus.PASS,"Clicked on emember me link successfully");
		LoginBtn.click();
		test.log(LogStatus.PASS,"Clicked on LoginBtn successfully");
	}
	
	}
	

