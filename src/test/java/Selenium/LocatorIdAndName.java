package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorIdAndName {
	
	public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.manage().window().maximize();
	driver.findElement(By.id("inputUsername")).sendKeys("testUsername");
	
	driver.findElement(By.name("inputPassword")).sendKeys("TestPassword");
	
	driver.findElement(By.className("signInBtn")).click();

}
}
