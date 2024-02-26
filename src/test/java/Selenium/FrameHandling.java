package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/frames");
		
		   //Switch to Frame using id of the frame
		//driver.switchTo().frame("frame1");
		
		 //Identifying the heading in webElement
		driver.switchTo().frame(driver.findElement(By.id("frame1")));
		
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		driver.close();

	}

}
