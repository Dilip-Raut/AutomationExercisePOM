package steps;



import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.SeleniumDriver;

public class Hoooks {

	public static WebDriver driver;
	
	@Before
	public static void setUp() {
		//SeleniumDriver.setUpDriver();
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait waitDriver=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}

	@After
	public static void tearDown(Scenario scenario) {
		
		
		
		  WebDriver driver=SeleniumDriver.getDriver();
		  System.out.println(scenario.isFailed()); if (scenario.isFailed()) { byte[]
		  screenshotBytes =
		 ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		  scenario.attach(screenshotBytes, "image/png",scenario.getName()); }
		 
		  		 
		SeleniumDriver.tearDown();
	}

}
