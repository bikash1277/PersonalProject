package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import Report.ExtentReportsClass;

public class STMPage extends ExtentReportsClass {

    WebDriver driver;
	 @Test
	    public void captureScreenshot()
	    {
	        test = extent.startTest("captureScreenshot");
	        driver = getBrowser("Chrome");
	        driver.navigate().to("https://www.google.com");
	        String title = driver.getTitle();
	        Assert.assertEquals("Google", title);
	        test.log(LogStatus.PASS, "Test Passed");
	  	    }

}
