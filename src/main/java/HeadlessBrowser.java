import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		
		
		ChromeOptions co=new ChromeOptions();
		//co.setHeadless(true);
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.amazon.com");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Smile")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		driver.close();

	}

}
