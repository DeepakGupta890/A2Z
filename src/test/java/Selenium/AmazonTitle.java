package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/ ");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		 //OR
		
	    String titleName=driver.getTitle();
	    if(titleName.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
	    {
	    	System.out.println("Title is correct");
	    }
	    else
	    {
	    	System.out.println("Title is not correct");
	    }
	    
	    //Go to the cart page
	    driver.findElement(By.cssSelector("span.nav-cart-icon")).click();

	}

}
