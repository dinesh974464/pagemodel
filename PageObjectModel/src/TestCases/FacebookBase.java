package TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.FaceBookLogin;

public class FacebookBase {
	
	public static WebDriver driver = null;
	 @BeforeTest
	   public void basicSetUp() throws IOException 
	    { 
	    
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\selenium\\chromedriver.exe");
	      driver = new ChromeDriver();
	      
	      
	 // To maximize browser. 
	      driver.manage().window().maximize(); 
	 // Implicit wait. 
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	 // Open SIM page. 
	      driver.get("https://www.facebook.com/"); 
	      driver.manage().deleteAllCookies();
	  }
	 
	 @Test
	 public void login() 
	   { 
	 // Create an object of SIMLoginPage class and pass WebDriver reference to its constructor. 
	    FaceBookLogin abc = new FaceBookLogin(driver);
	    
	 // Call loginData() method using reference variable fblogin and pass username and passw;ord as an input parameter. 
	    
	    
	   
	    abc.loginData("9440580995","britanica");
	  }

}
