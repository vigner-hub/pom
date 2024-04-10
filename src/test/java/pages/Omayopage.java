package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseClass.Base;

public class Omayopage  extends Base{

	public Omayopage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	By searchbox= By.className("classone");	
	By searchbox1=By.id("ta1");
	By alerclick=By.id("alert1");
	
	public WebElement searchbox() {
		
		WebElement element=driver.findElement(searchbox);
		
		return element;
	}
	
    public WebElement searchbox1() {
		
		WebElement element=driver.findElement(searchbox1);
		
		return element;
	}
 public WebElement alerclick() {
		
		WebElement element=driver.findElement(alerclick);
		
		return element;
	}
	
}
