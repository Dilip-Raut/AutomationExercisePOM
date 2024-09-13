package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumDriver;


public class UserRegistrationPage extends SeleniumDriver {

	@FindBy(id="password")
	public WebElement userNamepassword;
	
	@FindBy(id="first_name")
	public WebElement userfirstname;
	
	@FindBy(id="last_name")
	public WebElement userlastname;
	
	@FindBy(id="address1")
	public WebElement useraddrress;
	
	
	@FindBy(id="state")
	public WebElement userstate;
	
	@FindBy(id="city")
	public WebElement usercity;
	
	@FindBy(id="zipcode")
	public WebElement userzipcode;
	
	@FindBy(id="mobile_number")
	public WebElement usermobile_number;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	public WebElement userCreateAccount;

	public UserRegistrationPage(WebDriver driver) {
		super(driver);
	    PageFactory.initElements(driver, this);
	}
	
	public void fillUserRegistrationInfo(String userpassword,String userfirst_name,String userlast_name,String useraddress,String userstates,String userCitys,String usercode,String usermobile) {
    	userNamepassword.sendKeys(userpassword);
    	userfirstname.sendKeys(userfirst_name);
    	userlastname.sendKeys(userlast_name);
    	useraddrress.sendKeys(useraddress);
    	userstate.sendKeys(userstates);
    	usercity.sendKeys(userCitys);
    	userzipcode.sendKeys(usercode);
    	usermobile_number.sendKeys(usermobile);
    }
    
    public void clickOnCreateAccount() {
    	userCreateAccount.click();
    }
}
