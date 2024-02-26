package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandling {
	
	
	@Test
	public void calender1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("datepicker")).click();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ui-datepicker-header")));
		String cMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		String cYear= driver.findElement(By.className("ui-datepicker-year")).getText();
		//WebElement nextButton=driver.findElement(By.xpath("//a[@data-handler='next']"));
		WebElement nextButton=driver.findElement(By.cssSelector(".ui-datepicker-next"));
		WebElement previousButton=driver.findElement(By.xpath("//a[@data-handler='prev']"));
		String expectedMonth="Jun";
		String expectedYear="2023";
		String expectedDay="20";
		System.out.println(Integer.parseInt(expectedYear)>=Integer.parseInt(cYear));
		while(!(cMonth.equals(expectedMonth)&& cYear.equals(expectedYear)) )
			
		{
			System.out.println("Inside while loop");
			if(Integer.parseInt(expectedYear)>=Integer.parseInt(cYear))
			{
				System.out.println("Inside while if loop");
				try
				{
					nextButton.click();
				}
				catch(StaleElementReferenceException e)
				{
					nextButton=driver.findElement(By.cssSelector(".ui-datepicker-next"));
					nextButton.click();
				}
				
				cMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
				cYear= driver.findElement(By.className("ui-datepicker-year")).getText();
				System.out.println(cMonth);
				System.out.println(cYear);
			
				
			}
			else if(Integer.parseInt(expectedYear)<Integer.parseInt(cYear))
			{
				System.out.println("Inside while else if loop");
				
				//stale element exception handle
				try {
					previousButton.click();
				}
				catch(StaleElementReferenceException e)
				{
					previousButton=driver.findElement(By.xpath("//a[@data-handler='prev']"));
					previousButton.click();
				}
				
				cMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
				cYear= driver.findElement(By.className("ui-datepicker-year")).getText();
			}
		}
		driver.findElement(By.xpath("//a[@class='ui-state-default' and text()='20']")).click();
		
		
	}

}
