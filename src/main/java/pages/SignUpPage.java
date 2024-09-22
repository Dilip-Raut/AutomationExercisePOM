package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumDriver;


public class SignUpPage extends SeleniumDriver{

	@FindBy(name="name")
	public WebElement signUp_name;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	public WebElement signUp_email;
	
	@FindBy(xpath = "//button[text()='Signup']")
	public WebElement signUp;
	
	public SignUpPage(WebDriver driver) {
		super(driver);
	    PageFactory.initElements(driver, this);
	}
	
public void login(String strUserName, String strEmail) {
    	
    	signUp_name.sendKeys(strUserName);
    	signUp_email.sendKeys(strEmail);

	}
    
    public void clickSignUp() {
    	signUp.click();
    	//waitForElementLoad(login);
	    highlightElement(signUp, "red");
    }
}
