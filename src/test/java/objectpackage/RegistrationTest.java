package objectpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainpackage.AccountPage;
import mainpackage.LoginPage;

public class RegistrationTest {

	WebDriver driver;

	@Test

	public void loginwithvalidCredentials() throws InterruptedException  {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		LoginPage pg = new LoginPage(driver);
		pg.emailaddress().sendKeys("klaleche09@gmail.com");
		pg.password().sendKeys("Mourad@1146");
		pg.loginbutton().click();

		AccountPage ap = new AccountPage(driver);
		Assert.assertTrue(ap.account().isDisplayed());
		Thread.sleep(2000);
	}

	@AfterMethod
	public void shutdone() {

		driver.close();

	}

}
