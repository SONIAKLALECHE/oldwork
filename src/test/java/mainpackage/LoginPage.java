package mainpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {

	 WebDriver driver;
public LoginPage(WebDriver driver) {
	this.driver=driver;
	

}
	private By emailaddress = By.id("input-email");
	private By password=By.id("input-password");
	private By loginbutton=By.cssSelector("input[value='Login']");

	
	
	public WebElement emailaddress() {
		return driver.findElement(emailaddress);
	}
	public WebElement password() {
		return driver.findElement(password);
	}
	public WebElement loginbutton() {
		return driver.findElement(loginbutton);
	}
	
		
	}
	

