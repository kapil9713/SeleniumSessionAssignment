import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Madhya_Pradesh");
		
	      List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
	      
	      int size = totalLinks.size();
	    System.out.println(size);
	    
	    int count=0;
	    for (WebElement e : totalLinks) {
			String text = e.getText();
			if(text.length()>0)
			System.out.println(count+":"+text);
		}
	    count++;
	    
	    
		
		

	}

}
