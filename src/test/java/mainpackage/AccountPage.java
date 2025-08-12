package mainpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AccountPage {

	WebDriver driver;
	public AccountPage(WebDriver driver) {
		this.driver=driver;
		
		
	}

	private By account = By.linkText("Account");

	public WebElement account() {
		
		
		return driver.findElement(account);

	}
}
