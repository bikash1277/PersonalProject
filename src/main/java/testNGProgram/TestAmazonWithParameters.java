package testNGProgram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestAmazonWithParameters {
	
	WebDriver driver;
	Select dropDown;

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

	@Test
	@Parameters({"category", "searchString"})
	public void searchAmazon(String category, String searchString) {
		driver.get("http://www.amazon.in");
		WebElement dropDownSelect = driver.findElement(By.id("searchDropdownBox"));
		dropDown = new Select(dropDownSelect);
		dropDown.selectByVisibleText(category);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchString);
		driver.findElement(By.className("nav-input")).submit();
	}
}
