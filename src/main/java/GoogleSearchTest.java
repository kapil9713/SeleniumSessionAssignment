import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https:\\www.amazon.com");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Pendrive");
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@role='button']"));
		
		System.out.println(list.size());
		
		
		
		
		
		

	}

}
