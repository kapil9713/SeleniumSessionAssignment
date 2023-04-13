package LocatorsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	
	 static  WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
	
//1: id common approach		
		
		driver.findElement(By.partialLinkText("Register")).click();
//		driver.findElement(By.id("input-firstname")).sendKeys("Kapil");
//		
//		driver.findElement(By.name("lastname")).sendKeys("Rathore");
//		
//		driver.findElement(By.id("input-email")).sendKeys("kapil9713@gmail.com");
//		
//		driver.findElement(By.id("input-telephone")).sendKeys("12345");
		

		
		
//2: Reusability 
		
//		WebElement firstName = driver.findElement(By.id("input-firstname"));
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		
//		firstName.sendKeys("Kapil");
//		emailId.sendKeys("kapil9713@gmail.com");
		
		
//3: By Locator:
		
		
//		By firstName = By.id("input-firstname");
//		By emailId = By.id("input-email");
//		
//		WebElement fName = driver.findElement(firstName);
//		WebElement Email = driver.findElement(emailId);
//		
//		fName.sendKeys("Kapil");
//		Email.sendKeys("kapil9713@gmail.com");
		
//4: By Locator + Create One Generic Method
		
		
		
		By Fname = By.id("input-firstname");
		By Email = By.id("input-email");
		
		getElement(Fname).sendKeys("Kapil");
		getElement(Email).sendKeys("kapil9713@gmail.com");
		
		
		
		
		

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
