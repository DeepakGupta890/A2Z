package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AmazonTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/ ");
		driver.manage().window().maximize();
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
