package driverFactory;

import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

	private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();
	public static WebDriver driver = null;
	public static String path = System.getProperty("user.dir") + "\\resources\\driver";

	public BrowserFactory() {
	}

	public static WebDriver getBrowser(String browserName) {
		try {
			switch (browserName) {
			case "Edge":
				driver = drivers.get("Edge");
				if (driver == null) {
					System.setProperty("webdriver.ie.driver", path + "\\MicrosoftWebDriver.exe");
					driver = new InternetExplorerDriver();
					drivers.put("Edge", driver);
				}
				break;
			case "Chrome":
				driver = drivers.get("Chrome");
				if (driver == null) {
					System.setProperty("webdriver.chrome.driver", path + "\\ChromeDriver.exe");
					driver = new ChromeDriver();
					drivers.put("Chrome", driver);
				}
				break;
			default:
				System.out.println("Incorrect Browser Name!!!!");
			}
		} catch (Exception ex) {
			ex.getMessage();
		}
		return driver;
	}
	
	public static String loadURL(String url) {
		try {
		if(url.isEmpty()) {
			url= "URL is Empty";
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to(url);
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return driver.getTitle();
	}
	public static void closeAllDriver() {
		for (String key : drivers.keySet()) {
			drivers.get(key).close();
			drivers.get(key).quit();
		}
	}
}