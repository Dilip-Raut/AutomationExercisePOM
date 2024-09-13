package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumDriver;


public class LoginPage extends SeleniumDriver {
	
	@FindBy(xpath = "//a[text()=' Signup / Login']")
    public WebElement login;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	    PageFactory.initElements(driver, this);
	}
	
	public void clickLogin() {
		login.click();
	}


}
