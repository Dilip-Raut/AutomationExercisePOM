package utils;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {

    static SeleniumDriver seleniumDriver;
	
	//Initialize  WebDriver
	protected static WebDriver driver;
	
	public static WebDriverWait waitDriver;
	public final static int TIMEOUT=40;
	public final static int PAGE_LOAD_TIMEOUT=60;
	
	protected SeleniumDriver(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public static void openPage(String url) {
		driver.get(url);
	}
	
	public static WebDriver getDriver() {
		return driver;
		
	}
	
	public static void setUpDriver() {
		if(seleniumDriver==null) {
			seleniumDriver =new SeleniumDriver(driver);
		}
		
	}
	
	
	
	protected void highlightElement(WebElement element, String color) {
	    //keep the old style to change it back
	    String originalStyle = element.getAttribute("style");
	    String newStyle = "border: 5px dotted " + color + ";" + originalStyle;
	    JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();

	    // Change the style
	    js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '" + newStyle + "');},0);",
	            element);

	    // Change the style back after few miliseconds
		/*
		 * js.
		 * executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '"
		 * + originalStyle + "');},800);", element);
		 */
	}
	
	public static void tearDown() {
		if(driver !=null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver=null;
	}
	
}
