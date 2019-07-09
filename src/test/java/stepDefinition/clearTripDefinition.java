package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.testng.annotations.Test;

import driverFactory.BrowserFactory;

public class clearTripDefinition {
	private static WebDriver driver = null;
	public static String report=System.getProperty("user.dir");
	BrowserFactory browser;
	
	@Test
		public boolean testDemoQA() {
		driver=BrowserFactory.getBrowser("Chrome");
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
		System.setProperty("webdriver.chrome.driver", report+"\\resources\\chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.store.demoqa.com");
//        Log.info("I am on demoQA page");
        
        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
//        Log.info("I clicked on Login button");
        driver.findElement(By.id("log")).sendKeys("testuser_1"); 
        driver.findElement(By.id("pwd")).sendKeys("Test@123");
        driver.findElement(By.id("login")).click();
//        Log.info("Error message recieved");
        System.out.println("Login Successfully");   
        driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
        System.out.println("LogOut Successfully");
        driver.quit();
        String actualResult=driver.findElement(By.xpath("//p[text()=\": The password you entered for the username \"]")).getText();
        if(actualResult.equalsIgnoreCase(": The password you entered for the username "))
      	 return true;
        else
        return false;
	}
}
