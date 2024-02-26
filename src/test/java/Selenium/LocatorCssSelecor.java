package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorCssSelecor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("testUsername");
		
		driver.findElement(By.name("inputPassword")).sendKeys("TestPassword");
		
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		// in console of dev tool to check css- $('p.error')

	}

}
