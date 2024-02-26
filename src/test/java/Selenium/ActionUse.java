package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionUse {


@Test
public void actionUse()
{
		
			System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
			//WebDriverManager.chromedriver.setup();
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
			Actions action = new Actions(driver);
			//action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
			action.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")))
			.click().keyDown(Keys.SHIFT).sendKeys("hello");
			

	}

}
