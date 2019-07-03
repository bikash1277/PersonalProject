package Report;

import java.io.IOException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utilities.BrowserFactory;

public class ExtentReportsClass extends BrowserFactory {
	protected ExtentReports extent;
	protected ExtentTest test;
	@BeforeTest
	public void init() throws Exception {
		extent = new ExtentReports(System.getProperty("user.dir") + "/Report/ExtentScreenshot_" + getTime() + ".html",
				true);
	}
	@AfterMethod
	public void getResult(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			String screenShotPath = GetScreenShot.capture(driver, "screenShotName" + getTime());
			test.log(LogStatus.FAIL, result.getThrowable());
			test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
		}
		extent.endTest(test);
	}
	@AfterTest
	public void endreport() {
		driver.close();
		extent.flush();
		extent.close();
	}
}