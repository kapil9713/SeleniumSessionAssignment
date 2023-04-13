package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiddleElement {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By country = By.id("Form_getForm_Country");
		By countryList = By.xpath("//select[@id='Form_getForm_Country']//option");
		
		List<WebElement> optionList = driver.findElements(countryList);
		int size = optionList.size()-1;
		int middle=size/2;
		   optionList.get(middle).click();
		   String text = optionList.get(middle).getText();
		  System.out.println(middle+":"+":"+text);

		
		
		

	}

}
