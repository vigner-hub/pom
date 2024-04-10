package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	protected static WebDriver driver;
	
	@BeforeClass
	public void browserSetup() {
	
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Driver initialized.");
	}
	
	@AfterClass
	public void teardown() {
		
		
		driver.quit();
	}

	
}
