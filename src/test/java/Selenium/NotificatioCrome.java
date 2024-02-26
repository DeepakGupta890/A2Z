package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NotificatioCrome {

	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(3000);
		ChromeOptions o=new ChromeOptions();
		
		o.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(o);
		driver.get("https://www.wisdomjobs.com/e-university/test-cases-interview-questions.html");
		driver.manage().window().maximize();
	}

}
