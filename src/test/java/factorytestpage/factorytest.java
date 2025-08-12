package factorytestpage;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

import designfactory.Accountclass;
import designfactory.Loginclass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class factorytest {
	WebDriver driver;

	@Test
	public void logintest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		
		Loginclass obg1= new Loginclass(driver);
		obg1.Email().sendKeys("klaleche09@gmail.com");
		obg1.password().sendKeys("Mourad@1146");
		obg1.loginButton().click();
		
		
		
		
		Accountclass obg2= new Accountclass(driver);
		
	Assert.assertTrue( obg2.account().isDisplayed());	  
		
		
		
		
		
	}

}
