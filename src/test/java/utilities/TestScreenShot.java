package utilities;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class TestScreenShot {

	WebDriver driver;
	Select dropDown;
	File tempFile, destinationFile;
	TakesScreenshot myScreenShot;

	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\resources\\driver\\ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.w3schools.com");
		takeScreenShot();

	}

	public void takeScreenShot() {
		try {
			destinationFile = new File(System.getProperty("user.dir") + "\\Report\\w3schools.PNG");
			myScreenShot = (TakesScreenshot) driver;
			tempFile = myScreenShot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(tempFile, destinationFile);
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestScreenShot obj = new TestScreenShot();
		obj.invokeBrowser();
		SoftAssert asset=new SoftAssert();
		asset.assertAll();

	}

}
