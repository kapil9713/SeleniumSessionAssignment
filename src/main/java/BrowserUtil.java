import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

	  private WebDriver driver;
	
	public WebDriver initDriver(String browserName) {
		
		System.out.println("browserName"+browserName);
		
		switch (browserName) {
		case "chrome":
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			driver=new FirefoxDriver();
			break;
			
		case "Edge":
			driver=new EdgeDriver();
			break;

		default:
			System.out.println("Please Pass the right browser");
			break;
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}
	public void launchUrl(String url) {
		if(url==null) {
			System.out.println("cannot be a null url");
		}
		if(url.indexOf("https")==0) {
			driver.get(url);
		}
		
	}
	public String getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}
	public void closeBrowser() {
		driver.close();
	}
	

}
