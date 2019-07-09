package utilities;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TestKeyboardMouseEvents {

	WebDriver driver;
	Actions myAction;
	Action seriesOfActions;

	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\resources\\driver\\ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		testActions();
	}

	public void testActions() {
		myAction = new Actions(driver);
		seriesOfActions = myAction.moveToElement(driver.findElement(By.id("email"))).click()
				.sendKeys("akanksha24.a@gmail.com").sendKeys(Keys.TAB).sendKeys("password").sendKeys(Keys.ENTER)
				.build();
		seriesOfActions.perform();
	}

	public static void main(String[] args) {
		TestKeyboardMouseEvents events = new TestKeyboardMouseEvents();
		events.invokeBrowser();

	}

}
