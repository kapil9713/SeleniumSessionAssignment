import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllDropDownList {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By country = By.id("Form_getForm_Country");
		By countryList = By.xpath("//select[@id='Form_getForm_Country']//option");
		
		 List<WebElement> optionList = driver.findElements(countryList);
		int size = optionList.size()-1;
		System.out.println("Total No of Country"+":"+size);
		
		for(WebElement e:optionList) {
			String text = e.getText();
			System.out.println("List of Country"+":"+text);
		}
		
		
		
		
		
		
		
		

	}

}
