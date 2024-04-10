package test;

import org.testng.annotations.Test;

import baseClass.Base;
import pages.Omayopage;

public class Omayotest001  extends Base{

	 Omayopage omayo;
	
	
	
	@Test
	public void tc_001() throws InterruptedException {
		
		driver.get("https://omayo.blogspot.com/");
		omayo = new Omayopage(driver);
		omayo.searchbox().sendKeys("vignesh");
		omayo.searchbox1().sendKeys("gaja");
		
	}
	@Test
	public void tc_002() throws InterruptedException {

		omayo.alerclick().click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
	}
	
}
