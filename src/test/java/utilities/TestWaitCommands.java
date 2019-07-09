package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestWaitCommands {

	WebDriver driver;
	WebDriverWait expWait;

	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Akanksha\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.amazon.in");
		testExplicitWait();
	}

	public void testExplicitWait() {
		expWait = new WebDriverWait(driver, 30);
		expWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='a-carousel-goto-nextpage']")));
		driver.findElement(By.xpath("//a[@class='a-carousel-goto-nextpage']")).click();
	}

	public static void main(String[] args) {
		TestWaitCommands obj = new TestWaitCommands();
		obj.invokeBrowser();

	}

}
