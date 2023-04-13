import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SalesforceReg {

	public static void main(String[] args) {
		
		String browserName="chrome";
		
		BrowserUtil util=new BrowserUtil();
		WebDriver driver = util.initDriver(browserName);
		
		util.launchUrl("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
		
		String title=util.getTitle();
		System.out.println(title);
		
		util.closeBrowser();
		
		 By firstName = By.id("UserFirstName-juUh");
		 By lastName = By.id("UserLastName-kWWk");
		 By email = By.id("UserEmail-4BpJ");
		 
		
		
		
		
		

	}
	

}
