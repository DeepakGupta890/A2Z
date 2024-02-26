package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpathTraverse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
		//WebDriverManager.chromedriver.setup();
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("testUsername");
		driver.findElement(By.name("inputPassword")).sendKeys("TestPassword");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Deepak");
		
		// write xpath in console--- $x('//input[@placeholder="Name"]')
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("erdeepakg1+3@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
		// nth child is for css as indexing is worked for xpath only
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("erdeepakg1+3@gmail.com");
		//xpath trverse
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("597398759");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		//css traverse
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

		Thread.sleep(1000);

		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		// * will work for partial text in css like bellow

		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

		driver.findElement(By.id("chkboxOne")).click();
		//contains will work for partial attribute value in xpath

		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

	}

}
