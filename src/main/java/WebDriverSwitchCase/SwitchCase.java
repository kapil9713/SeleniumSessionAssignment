package WebDriverSwitchCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchCase {

	public static void main(String[] args) {

		String browser = "chrome";
		WebDriver driver = null;

		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "Firefox":
			driver = new FirefoxDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please Pass the Right Browser");
			break;
		}
		driver.get("https://amazon.com");
		
		String actTitle = driver.getTitle();
		System.out.println("Page Title: "+actTitle);
		
		if(actTitle.equals("Amazon.com. Spend less. Smile more.")) {
			System.out.println("Correct Title ");
		}
		else {
			System.out.println("Incorrect Title");
		}
		driver.quit();

	}
	

}
