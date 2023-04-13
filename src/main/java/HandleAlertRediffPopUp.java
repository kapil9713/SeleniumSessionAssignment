import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertRediffPopUp {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//1.		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(3000);
		
//		Alert alert = driver.switchTo().alert();
//		
//		String getText = alert.getText();
//		System.out.println(getText);
//		
//		alert.accept();
		
		
		
//		driver.findElement(By.name("login")).sendKeys("kapil9713@gmail.com");
//2.
//		driver.findElement(By.name("proceed")).click();
//		
//		
//		Alert alert = driver.switchTo().alert();
//		String getText= alert.getText();
//		System.out.println(getText);
//		
//		
//		alert.accept();
		
		driver.findElement(By.name("login")).sendKeys("kapil9713@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("kapil9713");
		
//3.
				driver.findElement(By.name("proceed")).click();
				
				
				Alert alert = driver.switchTo().alert();
				String getText= alert.getText();
				System.out.println(getText);
				
				
				alert.accept();
		

	}

}

