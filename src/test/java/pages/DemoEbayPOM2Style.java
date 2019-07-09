package pages;

import driverFactory.BrowserFactory;

public class DemoEbayPOM2Style {

	public static void main(String[] args) {
		BrowserFactory driver = new BrowserFactory();

//		driver.setPageLoadTimeout(90l);
//		driver.setElementDetectionTimeout(30l);
		driver.getBrowser("chrome");
		driver.loadURL("http://ebay.in");

		EbayPOM2Style homePage = new EbayPOM2Style(driver.getBrowser("chrome"));

		homePage.searchProduct("Apple Watch", "Watches");

	}

}
