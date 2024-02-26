package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {
	
	public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/login");
	driver.manage().window().maximize();
	String loginTitle=driver.getTitle();
	System.out.println("Page Title before login: " +loginTitle);
	System.out.println("loginTitle lenght : "+ loginTitle.length());
	WebElement username=driver.findElement(By.cssSelector("input[placeholder='UserName']"));
	username.clear();
	username.sendKeys("DeepakQATest");
	WebElement password= driver.findElement(By.cssSelector("input[placeholder='Password']"));
	password.clear();
	password.sendKeys("Deepak@8600");
	driver.findElement(By.cssSelector("#login")).click();
	Thread.sleep(3000);
	String homepageTitle=driver.getTitle();
	System.out.println("Title page after login: " +homepageTitle);
	System.out.println("homepageTitle size: " + homepageTitle.length());
	String currentURL= driver.getCurrentUrl();
	String ExpectedURL= "https://demoqa.com/profile";
	if(currentURL.equals(ExpectedURL))
	{
		System.out.println("Correct URL is opened");
	}
	else
	{
		System.out.println("Expected URL: " + ExpectedURL + " and, Actual URL is: " + currentURL);
	}
	String pagesource= driver.getPageSource();
	System.out.println("Page source lenght is : "+ pagesource.length());
	
	driver.close();

}
}