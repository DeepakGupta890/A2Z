package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.commons.io.FileUtils;

public class JavaScriptExecutor {
	

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
        ChromeOptions options= new ChromeOptions();
       
		//System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List <WebElement>values= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		//js.executeScript("arguments[0].click();", radioButtons.get(i));
		//above is only code syntax example
		int sum=0;
		for (int i=0;i<values.size();i++)
		{
			int intValues=Integer.parseInt(values.get(i).getText());
			sum=sum+intValues;
		}
		System.out.println(sum);
		int total=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		//Assert.assertEquals(sum,total);
//		driver.close();
//		WebElement cources = driver.findElement(By.cssSelector("body > div > header > div.header-upper > div > div > div.nav-outer.clearfix > nav > div.navbar-collapse.collapse.clearfix > ul > li:nth-child(2) > a"));
//        Actions hoveronCources= new Actions(driver);
//        hoveronCources.moveToElement(cources).build().perform();
//
//		File scrshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(scrshot, new File ("./scrshot\\scrshot2.png"));
		//driver.quit();
		
	}
	

}
