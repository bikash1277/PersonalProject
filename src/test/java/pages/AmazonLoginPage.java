package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage {
	
	WebDriver myDriver;
	AmazonRegistrationPage registrationPageObject;
	
	@FindBy(id="ap_email")
	private WebElement username ;
	
	@FindBy(id="ap_password")
	private WebElement password;
	
	@FindBy(id="signInSubmit")
	private WebElement loginButton;
	
	@FindBy(id="auth-fpp-link-bottom")
	private WebElement forgotPassword;
	
	@FindBy(id="createAccountSubmit")
	private WebElement createNewAccount;
	
	public AmazonLoginPage(WebDriver driver) {
		myDriver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void createANewAccount(String username, long mobile, String email, String password) {
		registrationPageObject = new AmazonRegistrationPage(myDriver);
		registrationPageObject.createAnAccount(username, mobile, email, password);
	}
	
	public void resetPassword() {
		
	}
	
	public void logIntoAccount(String customerName, String customerPassword) {
		username.clear();
		username.sendKeys(customerName);
		password.clear();
		password.sendKeys(customerPassword);
		loginButton.submit();		
	}

}
