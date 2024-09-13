package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {

    static SeleniumDriver seleniumDriver;
	
	//Initialize  WebDriver
	private static WebDriver driver;
	
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
	
	
	public static void tearDown() {
		if(driver !=null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver=null;
	}
	
}
