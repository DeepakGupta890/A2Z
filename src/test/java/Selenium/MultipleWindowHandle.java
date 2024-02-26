package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();;
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		//TO open new window or tab use below command
		driver.switchTo().newWindow(WindowType.TAB);
		
		//Now switch the window id
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> iterator=handles.iterator();
		String parentId=iterator.next();
		String newTab=iterator.next();
		
		driver.switchTo().window(newTab);
		driver.get("https://courses.rahulshettyacademy.com/courses/");
		String CourceName=driver.findElements(By.cssSelector("div[class='course-listing-title']")).get(2).getText();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@class='form-group']//input[@name='name']")).sendKeys(CourceName);
		

	}

}
