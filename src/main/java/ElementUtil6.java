import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil6 {
	
//6: 5th or 6th approach same but 5th app ke method hamne element util class 
	//ko de diye 
	
	private WebDriver driver;
	
	public  ElementUtil6(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	public   WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public  void doSendKeys(By locator,String value) {
		 getElement(locator).sendKeys(value);
	}

}
