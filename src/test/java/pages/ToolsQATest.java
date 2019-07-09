package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import driverFactory.BrowserFactory;

public class ToolsQATest {

	String project=System.getProperty("user.dir");
	
	@Test
		public void testDemoQA() {
//		System.setProperty("webdriver.chrome.driver", project+"\\resources\\driver\\chromedriver.exe");
//		WebDriver driver =new ChromeDriver();
		WebDriver driver=BrowserFactory.getBrowser("Chrome");
		BrowserFactory.loadURL("http://www.store.demoqa.com");
		System.out.println(driver.getTitle());
		BrowserFactory.closeAllDriver();
//        Log.info("I am on demoQA page");
        
//        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
////        Log.info("I clicked on Login button");
//        driver.findElement(By.id("log")).sendKeys("testuser_1"); 
//        driver.findElement(By.id("pwd")).sendKeys("Test@123");
//        driver.findElement(By.id("login")).click();
////        Log.info("Error message recieved");
//        System.out.println("Login Successfully");   
//        driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
//        System.out.println("LogOut Successfully");
//        driver.quit();
//        String actualResult=driver.findElement(By.xpath("//p[text()=\": The password you entered for the username \"]")).getText();
//        if(actualResult.equalsIgnoreCase(": The password you entered for the username "))
////      	 return true;
//        	System.out.println("Pass");
//        else
////        return false;
//        	System.out.println("Fail");
	}
}
