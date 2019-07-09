package pages;

import driverFactory.BrowserFactory;

public class DemoEbayPOM3Style {

	public static void main(String[] args) {
		BrowserFactory driver = new BrowserFactory();

//		driver.setPageLoadTimeout(90l);
//		driver.setElementDetectionTimeout(30l);
		driver.getBrowser("chrome");
		driver.loadURL("http://ebay.in");

		EbayPOM3Style homePage = new EbayPOM3Style(driver.getBrowser("chrome"));

		homePage.searchProduct("Apple Watch", "Watches");

	}

}
