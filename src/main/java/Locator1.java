import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {
	
//4: crt web element + perform action	
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By fName = By.id("input-firstname");
		By lName = By.id("input-lastname");
		By Email = By.id("input-email");
		By Telephone = By.id("input-telephone");
		By Password = By.id("input-password");
		By CPassword = By.id("input-confirm");
		By radioBtn = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
		By checkBox = By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)");
		By Login = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		
		getElement(fName).sendKeys("Kapil");
		getElement(lName).sendKeys("Rathore");
		getElement(Email).sendKeys("kapil9713@gmail.com");
		getElement(Telephone).sendKeys("9713569265");
		getElement(Password).sendKeys("kapil7890");
		getElement(CPassword).sendKeys("kapil7890");
		getElement(radioBtn).click();
		getElement(checkBox).click();
		getElement(Login).click();
		
		
		
		

	}
	public static  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	

}
