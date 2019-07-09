package seleniumInterviewQuestions;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypesProgram  {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver=BrowserFactory.getBrowser("Chrome");
		Date date=new Date();
		
		
		
		WebDriverWait wait=new WebDriverWait(driver, 45);
		String title=BrowserFactory.loadURL("https://www.softwaretestinghelp.com/");
		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath("//*[@id=\"post-84538\"]/div/header/h2/a")).click();
		
		/**
		 * 
		 * Take screenshot Utility
		 * 
		 * **/
		TakesScreenshot scr=((TakesScreenshot)driver);
		File scrFile=scr.getScreenshotAs(OutputType.FILE);
		File destFile=new File(System.getProperty("user.dir")+"//Report//scr1.png");
		FileUtils.copyFile(scrFile, destFile);
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"mega-menu-item-1548\"]/a")).click();
		
		WebElement wElement=wait.until(ExpectedConditions.elementToBeClickable(By.className("mega-menu-link")));
		wElement.click();
		BrowserFactory.closeAllDriver();
	}

}
