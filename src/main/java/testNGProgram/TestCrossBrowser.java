package testNGProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCrossBrowser {

	WebDriver driver;

	@AfterClass
	public void quitBrowser() {
		try {
			Thread.sleep(2000);
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	@Parameters("browser")
	public void runTestCaseOnDifferentBrowser(String browser) {

		if (browser.equals("CRM")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Akanksha\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("FFX")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\Akanksha\\DRIVERS\\geckodriver-v0.17.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("akanksha24.a@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("password");
		driver.findElement(By.cssSelector("label#loginbutton")).submit();

	}
}
