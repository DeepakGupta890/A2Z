package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;





public class ActionMouceMovement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\crome\\122\\chromedriver-win32\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.chromedriver().clearDriverCache().setup();
		//WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
	     
		Thread.sleep(7000);
		
		Actions action=new Actions(driver);
	
		
		//contextClick is used for right click.
		//Double click is used for double click operation
		//Actions class is used to handle the mouse and keyboard actions.
		//Actions class should be imported from the package org.openqa.selenium.interactions
	    //Actions class contains a constructor which takes an argument of type WebDriver
		//kes.shift is used for click on enter
		//key.enter is used for tab click
		//Robot class is used to perform keyboard action
		//In Robot class, to press the key we use keypress() and to release the key we use 
		//keyRelease().
		
		action.moveToElement(driver.findElement(By.id("nav-link-accountList")))
		.contextClick().build().perform();
		action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click()
		
		//KeyDown is used for press the key
		//KeyUP is used for release the key
		
		.keyDown(Keys.SHIFT).sendKeys("hello")
		.doubleClick().build().perform();
		
		driver.navigate().back();

		/*driver.get("https://www.spicejet.com/");
		System.out.println(driver.findElement(By.tagName("iframe")).getSize());
		driver.switchTo().frame(2);
		
		WebElement path=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select s=new Select(path);
		s.selectByVisibleText("AED");
		driver.findElement(By.id("divpaxinfo")).click();
		
		Select a=new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		a.selectByVisibleText("2");*/
	
		
	}

}
