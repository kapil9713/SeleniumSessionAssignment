package DropDown;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowFeature {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:\\quizkart.com");
		 String windowHandle = driver.getWindowHandle();
		 
		
		System.out.println("parentWindow : "+ driver.getCurrentUrl());
		Thread.sleep(1500);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https:\\google.com");  
		
		System.out.println("childWindow : "+driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(windowHandle);
		System.out.println(driver.getTitle());
		
		
		
		

	}

}
