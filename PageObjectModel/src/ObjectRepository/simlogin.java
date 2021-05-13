package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class simlogin {
	WebDriver driver;
	
	public simlogin(WebDriver driver)
	 { 
	  this.driver = driver; 
	 }
	
	//public simlogin(){
		
	//}
	By reset=By.xpath("/html/body");
	By username= By.xpath("//*[@id=\"username\"]");
	By password=By.xpath("//*[@id=\"password\"]");
	By login=By.xpath("//*[@id=\"btnsubmit\"]");
	
	public void reset() {
		driver.findElement(reset).click();
	}
	
	public void setUsername(String strUsername) 
    { 
		driver.findElement(username).clear();
         driver.findElement(username).sendKeys(strUsername);   
     } 
	
	public void setPassword(String strPassword) 
    { 
		driver.findElement(password).clear();
       driver.findElement(password).sendKeys(strPassword); 
    } 
	
	public void loginClick() 
    { 
       driver.findElement(login).click(); 
    }
	
	public void loginData(String strUsername, String strPassword) 
    { 
       //this.titleText(); 
       this.setUsername(strUsername); 
       this.setPassword(strPassword); 
       this.loginClick(); 
      } 
	
	
}
