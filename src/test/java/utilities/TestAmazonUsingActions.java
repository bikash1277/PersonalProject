package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TestAmazonUsingActions {

	WebDriver driver;
	Actions myAction;
	Action seriesOfActions;

	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Akanksha\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.amazon.in");
		testActions();
	}

	public void testActions() {
		myAction = new Actions(driver);
		seriesOfActions = myAction.moveToElement(driver.findElement(By.xpath("//div[@class='nav-search-facade']/i")))
				.click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN).click().moveToElement(driver.findElement(By.id("twotabsearchtextbox")))
				.keyDown(Keys.SHIFT).sendKeys("mixer").keyUp(Keys.SHIFT)
				.moveToElement(driver.findElement(By.className("nav-input"))).click().build();
		seriesOfActions.perform();
		// moveToElement(driver.findElement(By.xpath("//select[@id='searchDropdownBox']/option[5]")))
	}

	public static void main(String[] args) {
		TestAmazonUsingActions obj = new TestAmazonUsingActions();
		obj.invokeBrowser();

	}

}
