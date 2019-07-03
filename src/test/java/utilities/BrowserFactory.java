package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Report.ExtentReportsClass;

public class BrowserFactory extends DateTime {

	protected WebDriver driver;

	public WebDriver initBrowser(String _browser) {
		try {
			switch (_browser) {
			case "Chrome":
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "/resource/chromedriver.exe");
				/*
				 * prefs.put("download.prompt_for_download", true);
				 * prefs.put("download.default_directory",System.getProperty("user.dir")+
				 * "\\output"); options.setExperimentalOption("prefs", prefs); WebDriver driver
				 * = new ChromeDriver(options);
				 */
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				System.out.println("Driver Launched!!");
				break;
			case "Firefox":
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "/resource/geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				System.out.println("Driver Launched!!");
				break;
			case "Internet Explorer":
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "/resource/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				System.out.println("Driver Launched!!");
				break;
			default:
				System.out.println("Driver unable to Launched!!");
				break;
			}

		} catch (Exception e) {
			System.out.println("Exception Occured in:" + e.getMessage());
		}
		return driver;
	}
	public void closeBrowser() {
		driver.close();
	}
	
}
