package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSwitchToCommands {
	
	WebDriver driver;

	public void invokeBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\Akanksha\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	public void switchToAlert() {
		try {
			invokeBrowser("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
			driver.switchTo().frame("iframeResult");
			driver.findElement(By.tagName("button")).click();
			Alert myAlert = driver.switchTo().alert();
			Thread.sleep(2000);
			myAlert.accept();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
