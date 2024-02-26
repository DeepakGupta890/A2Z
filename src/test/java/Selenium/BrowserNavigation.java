package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#newUser")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://demoqa.com/login");
		driver.navigate().refresh();
		driver.close();
		
		
		

	}

}
