package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionUse {


@Test
public void actionUse()
{
		
			//System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			try
			{
				 WebElement dismissBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@data-action-type='DISMISS']")));
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				 //js.executeScript("arguments[0].click();", dismissBtn);
				
			dismissBtn.click();
			} 
			catch (Exception e) 
			{
			    System.out.println("Popup not displayed");
			}
			Actions action = new Actions(driver);
			//action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
			action.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")))
			.click()
			.keyDown(Keys.SHIFT)
			.sendKeys("hello")
			.keyUp(Keys.SHIFT)
			.perform();
			
			
			/*When you want to store action- build use
			 * 
			Action act = action.moveToElement(element).click().build();
			act.perform();*/

	}

}
