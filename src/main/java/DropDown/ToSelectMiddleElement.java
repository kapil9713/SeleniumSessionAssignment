package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSelectMiddleElement {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By country = By.id("Form_getForm_Country");
		By countryList = By.xpath("//select[@id='Form_getForm_Country']//option");
		
		List<WebElement> option = driver.findElements(countryList);
		int size = option.size()-1;
		int middle=size/2;
		
		
		option.get(middle).click();
		
     	System.out.println("Middle ele"+":"+middle);
     	for(WebElement e: option) {
     		String text = e.getText();
     		System.out.println(text);
     	}
     	
     	
		
//		for(WebElement e:option) {
//			String text=e.getText();
//			System.out.println("List of country"+":"+text);
//			if(text.equals("India")) {
//				
//				break;
//			}
//		}
		
		

	}

}
