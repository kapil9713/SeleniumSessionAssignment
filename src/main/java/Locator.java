import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	
	 static WebDriver driver;
	
//4: By locator + Create one Generic Method	-create webelement+perform action

	public static void main(String[] args) {
		
		 driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		By partialLinkText = By.partialLinkText("Register");
		By fName = By.id("input-firstname");
		By Email = By.id("input-email");
		
		
		
		getElement(partialLinkText).click();
		getElement(fName).sendKeys("Kapil");
		getElement(Email).sendKeys("kapil9713@gmail.com");
		
		

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	
	}
	

}
