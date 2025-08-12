package designfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginclass {
	
	

	WebDriver driver;

	public Loginclass(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

		@FindBy(id = "input-email")
		private WebElement Email;

		@FindBy(id = "input-password")
		private WebElement password;

		@FindBy(css = "input[value='Login']")
		private WebElement loginButton;
		
		
		public WebElement Email() {
			
			return  Email;
		}
		
		
		public WebElement password() {
			
			
			return password;
		}
		
		public WebElement loginButton() {
			return loginButton;
		}
}


