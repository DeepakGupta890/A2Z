package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		//Find no of frame present
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		WebElement list=driver.findElements(By.tagName("iframe")).get(0);
		System.out.println(list);
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		driver.findElement(By.id("draggable")).click();
		Actions action = new Actions(driver);
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		action.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();// Now it will come back to the normal window.
		
		
	    

	}

}
