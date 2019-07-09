package testNGInterviewPreparation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GmailLoginUsingDataProviders {

	WebDriver driver;
	ReadExcelData data;

	@DataProvider(name="LC")
	public Object[][] LoginCredentials() {	
		
		data = new ReadExcelData();		
		Object[][] Cred = data.createDataArray("D:\\Akanksha Personal\\Udemy\\Module 6 - TestNG\\UdemyData.xlsx", "Data");
		return Cred;
	}

	@Test(dataProvider = "LC")
	public void testLogin(String Userid, String Pass) {

		try {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Akanksha\\DRIVERS\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://www.gmail.com");
			driver.findElement(By.id("identifierId")).clear();
			driver.findElement(By.id("identifierId")).sendKeys(Userid);
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys(Pass);
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			//driver.findElement(By.id("signIn")).click();
			System.out.println("Clicked on signin button");
			Thread.sleep(3000);
			closeBrowser();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	public void closeBrowser() {
		driver.quit();
	}

}
