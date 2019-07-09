package testNGProgram;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginToFacebookUsingTestNGAnnotations {

	WebDriver driver;
	File tempFile, destinationFile;
	TakesScreenshot myScreenShot;

	@Test
	public void loginToFacebook() {
		driver.get("http://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("akanksha24.a@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("password");
		driver.findElement(By.cssSelector("label#loginbutton")).submit();
	}
	
	@Test
	public void captureScreenShot() {
		try {
			destinationFile = new File("C:\\Users\\AkkiAsh\\Desktop\\Edureka\\Facebook1.PNG");
			myScreenShot = (TakesScreenshot) driver;
			tempFile = myScreenShot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(tempFile, destinationFile);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@BeforeClass
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Akanksha\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

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
}
