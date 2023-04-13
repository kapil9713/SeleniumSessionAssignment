package DropDown;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://quizkart.com/");
		String windowParentId = driver.getWindowHandle();
		
		WebElement eleFb = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement eleInsta = driver.findElement(By.xpath("//a[contains(@href,'instagram')]"));
		WebElement eleLi = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		
		eleFb.click();
		eleInsta.click();
		eleLi.click();
		
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		while(it.hasNext()) {
			String childWindowId = it.next();
			driver.switchTo().window(childWindowId);
			System.out.println(driver.getCurrentUrl());
			if(!childWindowId.equals(windowParentId)) {
				driver.close();
				
			}
			
		}
		driver.switchTo().window(windowParentId);
		System.out.println("ParentId : "+driver.getCurrentUrl());
		
		driver.quit();

	}

}
