package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utils.SeleniumDriver;

public class ProductDetailsPage extends SeleniumDriver {

	@FindBy(xpath="//a[text()='Continue']")
	public WebElement usercontinue;
	
	@FindBy(xpath = "(//div[contains(@class,'productinfo')])/child::h2")
	public List<WebElement> productPrice;

	@FindBy(xpath = "(//div[contains(@class,'productinfo')])/child::p")
	public List<WebElement> productColor;
	
	@FindBy(xpath="//a[text()=' Logout']")
	public WebElement userLogout;
	
	@FindBy(xpath="//a[contains(text(),' Delete')]")
	public WebElement userDelectAccount;

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	    PageFactory.initElements(driver, this);
	}
	
	public void clickOnContinue() {
    	usercontinue.click();
    }
    
	public void gettingProductInfo() {
		JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();
		js.executeScript("window.scrollBy(0,450)", "");
		System.out.println("Total Number Of Products "+productPrice.size());
		int price=productPrice.size();
		int colour=productColor.size();
		for(int i=0;i<price-1;i++) {
			{
				for(int j=0;j<colour-1;j++) {
					if(i==j) {
						System.out.println("Product Name is - "+productColor.get(j).getText());
						System.out.println("Product Price is - "+productPrice.get(i).getText());
						System.out.println("********************************");
					}
					
				}
			}
		}
	}
	
	public void clickOnLogout() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();
		js.executeScript("window.scrollBy(0,-450)", "");
		Thread.sleep(2000);    
		userLogout.click();
    }
	
	public void clickOnDeletAccount() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();
		js.executeScript("window.scrollBy(0,-450)", "");
		Thread.sleep(2000);    
		userLogout.click();
    }
}
