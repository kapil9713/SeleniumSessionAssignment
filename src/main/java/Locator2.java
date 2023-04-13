import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {
	
//5: Approach	
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		 driver = new ChromeDriver();
			
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			
			By fName = By.id("input-email");
			By lName = By.id("input-password");
			
//			doSendKeys(fName, "Kapil");
//			doSendKeys(lName, "Rathore");
			
			ElementUtil6 util=new ElementUtil6(driver);
			
			util.doSendKeys(fName, "Kapil");
			util.doSendKeys(lName, "Rathore");

	}
//	public static  WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}
//	public static  void doSendKeys(By locator,String value) {
//		 getElement(locator).sendKeys(value);
//	}

}
