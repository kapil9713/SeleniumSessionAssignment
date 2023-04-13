import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		fullScreen();
		By country = By.id("Form_getForm_Country");

		WebElement countryList = driver.findElement(country);
		
		Select select=new Select(countryList);

		// select.selectByIndex(1);
		// select.selectByValue("India");
		 select.selectByVisibleText("Australia");

//		selectByIndex(country, 1);
//		Thread.sleep(3000);
//		selectByValue(country, "India");
//		Thread.sleep(3000);
//		selectByVisibleText(country,"North Korea");
//		Thread.sleep(3000);

		driver.close();

	}

	public static void fullScreen() {
		driver.manage().window().maximize();
	}
//	public static  WebElement getElement(By locator) {
//		 return driver.findElement(locator);
//	}
//	public static  void selectByIndex(By locator,int Index) {
//		Select select=new Select(getElement(locator));
//		select.selectByIndex(1);
//		
//	}
//	public static void selectByValue(By locator,String value) {
//		Select select=new Select(getElement(locator));
//		select.selectByValue(value);       
//	}
//	public static void selectByVisibleText(By locator,String text) {
//		Select select=new Select(getElement(locator));
//		select.selectByVisibleText(text);
//	}

}
