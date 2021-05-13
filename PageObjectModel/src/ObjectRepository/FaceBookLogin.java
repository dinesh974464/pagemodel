package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FaceBookLogin {
	
	WebDriver driver;
	
	public FaceBookLogin(WebDriver driver) {
		this.driver=driver;
	}
	
	By Phone=By.xpath("//*[@id='email']");
	By Password=By.xpath("//*[@id=\"pass\"]");
	By login=By.name("login");
	
	public void setphone(String phone) 
    { 
         driver.findElement(Phone).sendKeys(phone);   
     } 
	
	public void setpassword(String password) { 
		driver.findElement(Password).sendKeys(password); 
	}
	
	public void loginClick() 
    { 
       driver.findElement(login).click(); 
    }
	
	public void loginData(String phone, String password) 
    { 
       //this.titleText(); 
       this.setphone(phone); 
       this.setpassword(password); 
       this.loginClick(); 
      }
}
