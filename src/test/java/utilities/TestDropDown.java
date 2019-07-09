package utilities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDown {

	WebDriver driver;
	Select dropDown;

	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Akanksha\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.amazon.in");
		testDropDown();

	}
	
	public void testDropDown() {
		WebElement dropDownSelect = driver.findElement(By.id("searchDropdownBox"));
		dropDown = new Select(dropDownSelect);
		System.out.println("Multiple Allowed: "+ dropDown.isMultiple());
		List<WebElement> dropDownCategories =  dropDown.getOptions();
		for( WebElement category : dropDownCategories) {
			System.out.println(category.getText());
		}
		dropDown.selectByVisibleText("Books");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("The magic of Thinking BIG");
		driver.findElement(By.className("nav-input")).submit();
	}

	public static void main(String[] args) {
		TestDropDown obj = new TestDropDown();
		obj.invokeBrowser();

	}

}
