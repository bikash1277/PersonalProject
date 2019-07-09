package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonRegistrationPage {
	
	@FindBy(id="ap_customer_name")
	private WebElement userName  ;
	
	@FindBy(id="ap_phone_number")
	private WebElement userMobileNumber ;
	
	@FindBy(id="ap_email")
	private WebElement userEmailAddress ;
	
	@FindBy(id="ap_password")
	private WebElement  password;
	
	@FindBy(id="continue")
	private WebElement  creatAccount;
	
	public AmazonRegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void createAnAccount(String name, long mob_no, String email_add, String password) {
		
		userName.sendKeys(name);
		userMobileNumber.sendKeys(String.valueOf(mob_no));
		userEmailAddress.sendKeys(email_add);
		this.password.sendKeys(password);
		creatAccount.submit();
	}

}
