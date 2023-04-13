package LocatorsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	private WebDriver driver;
	
	public void ElementUtil(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
