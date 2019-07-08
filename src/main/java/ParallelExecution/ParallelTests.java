package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTests {

	@Test
	public void getFirefox() {
		// System.setProperty("webdriver.gecko.driver", "geckodriver.exe path");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mishrbik\\Desktop\\drivers\\geckodriver.exe");
		System.out.println("GetFirefox Method is running on Thread : " + Thread.currentThread().getId());
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.SoftwareTestingMaterial.com");
		driver.close();
	}

	@Test
	public void getChorme() {
		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe path");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mishrbik\\Desktop\\drivers\\chromedriver.exe");
		System.out.println("GetChrome Method is running on Thread : " + Thread.currentThread().getId());
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();
	}
	/*@Test
	public void getEdge() {
		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe path");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\mishrbik\\Desktop\\drivers\\chromedriver.exe");
		System.out.println("GetChrome Method is running on Thread : " + Thread.currentThread().getId());
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.SoftwareTestingMaterial.com");
		driver.close();
	}*/
	
	
}
