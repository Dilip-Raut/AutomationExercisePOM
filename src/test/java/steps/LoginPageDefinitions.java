package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.ProductDetailsPage;
import pages.SignUpPage;
import pages.UserRegistrationPage;
import utils.SeleniumDriver;


public class LoginPageDefinitions {

	public WebDriver driver;
	LoginPage objloginPage;
	ProductDetailsPage objproductDetailsPage;
	SignUpPage objsignUpPage;
	UserRegistrationPage objUserRegistrationPage;
	
	public LoginPageDefinitions() {
		driver=Hoooks.driver;
		objloginPage=new LoginPage(driver);
		objproductDetailsPage=new ProductDetailsPage(driver);
		objsignUpPage=new SignUpPage(driver);
		objUserRegistrationPage=new UserRegistrationPage(driver);
	}
	
	@Given("User is on AutomationExercise page {string}")
	public void user_is_on_automation_exercise_page(String url) throws InterruptedException {
		SeleniumDriver.openPage(url);
		Thread.sleep(2000);
	}

	@And("User click on sign in button")
	public void user_click_on_sign_in_button() throws InterruptedException {
		objloginPage.clickLogin();
		Thread.sleep(2000);
	}
	
	@When("User entered username as {string} and Email as {string}")
	public void user_entered_username_as_and_Email_as(String userName, String passWord) throws InterruptedException {
		objsignUpPage.login(userName, passWord);
		Thread.sleep(2000);
	}

	@And("User is logout from Application")
	public void user_is_logout_from_application() throws InterruptedException {
		objproductDetailsPage.clickOnLogout();
	    Thread.sleep(2000);
	}
	
	@When("User click on SignUp button")
	public void user_click_on_sign_up_button() throws InterruptedException {
		Thread.sleep(2000);
		objsignUpPage.clickSignUp();
	    Thread.sleep(2000);
	}

	@Then("User Enter Account Information")
	public void user_enter_account_information() throws InterruptedException {
		objUserRegistrationPage.fillUserRegistrationInfo("12345", "ABC", "PQR","Colony", "Maharashtra", "Nagpur", "000007","+91911119191");
	    Thread.sleep(2000);
	}

	@Then("User click on Create Account button")
	public void user_click_on_create_account_button() throws InterruptedException {
		objUserRegistrationPage.clickOnCreateAccount();
	    Thread.sleep(2000);
	}

	@Then("User Fetching the feature Items Details")
	public void user_fetching_the_feature_items_details() throws InterruptedException {
		objproductDetailsPage.clickOnContinue();
	    Thread.sleep(2000);
	    objproductDetailsPage.gettingProductInfo();
	    Thread.sleep(2000);
	}

	@And("User is Delete Account from Application")
	public void User_is_Delete_Account_from_Application() throws InterruptedException {
		objproductDetailsPage.clickOnLogout();
	    Thread.sleep(2000);
	}
	
}
