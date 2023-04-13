package WebDriverSwitchCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchCase1 {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		String browser="chrome";
		
		switch (browser) {
		case "chrome":
			driver=new ChromeDriver();
			break;
			
		case "Firefox":
			driver=new FirefoxDriver();
			break;
			
		case "Edge":
			driver=new EdgeDriver();
			break;

		default:
			System.out.println("Please Pass the Right Browser");
			break;
		}
		
		driver.get("https://flipkart.com");
		
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		
		if(actTitle.contains("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {
			System.out.println("Correct Title");
		}else {
			System.out.println("Incorrect Title");
		}
		
		driver.quit();
		
		

	}

}
