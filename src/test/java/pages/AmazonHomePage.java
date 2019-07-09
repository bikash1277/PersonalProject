package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonHomePage {

	AmazonLoginPage loginPageObject;
	WebDriver myDriver;

	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchBox;

	@FindBy(how = How.ID, using = "searchDropdownBox")
	private WebElement dropDownList;

	@FindBy(xpath = "//input[@value='Go']")
	private WebElement searchButton;

	@FindBy(linkText = "Your Amazon.in")
	private WebElement yourAmazonLink;

	@FindBy(xpath = "//span[contains(text(),'Hello. Sign in')]")
	private WebElement signInLink;

	@FindBy(id = "nav-link-prime")
	private WebElement tryPrimeLink;

	Select dropDown;

	public AmazonHomePage(WebDriver driver) {

		myDriver = driver;
		PageFactory.initElements(driver, this);
		dropDown = new Select(dropDownList);
	}

	public void searchItem(String category, String searchItem) {
		dropDown.selectByVisibleText(category);
		searchBox.sendKeys(searchItem);
		searchButton.submit();
	}

	public void goToYourAmazon(String username, String password) {
		yourAmazonLink.click();
		signIntoAccount(username, password);

	}

	public void clickOnSignIn(String username, String password) {
		signInLink.click();
		signIntoAccount(username, password);
	}

	public void signIntoAccount(String username, String password) {
		loginPageObject = new AmazonLoginPage(myDriver);
		loginPageObject.logIntoAccount(username, password);

	}

	public void tryPrime(String username, String password) {
		tryPrimeLink.click();
		signIntoAccount(username, password);

	}
}
