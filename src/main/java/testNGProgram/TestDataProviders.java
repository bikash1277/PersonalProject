package testNGProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProviders {

	WebDriver driver;

	@BeforeClass
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Akanksha\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test(dataProvider="dataProvider", dataProviderClass=DataProviderClass.class)
	public void goToFacebook(String emailId, String password) {
		try {
			driver.get("http://www.facebook.com");
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(emailId);
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys(password);
			driver.findElement(By.id("loginbutton")).submit();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test(dataProvider="dataProvider", dataProviderClass=DataProviderClass.class)
	public void printName(String name) {
		System.out.println(name);
	}


}
