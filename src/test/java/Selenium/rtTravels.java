package Selenium;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class rtTravels {

	    
		
		WebDriver driver = new ChromeDriver();
public void details() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".//Selenium//Drivers//chromedriver.exe");
		driver.get("http://rajtravelsindia.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
//		String ExpectedYear = "February 2021";
//		driver.findElement(By.name("departurebox")).click();
//		WebElement next=driver.findElement(By.xpath("//a/span[@class='ui-icon ui-icon-circle-triangle-e']"));
//		next.getText();
//		WebElement x=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
//		//Assert.assertFalse(x.getText().equalsIgnoreCase(ExpectedYear)));
		
		driver.findElement(By.xpath("//input[@id='from']")).click();
		Date d=new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");
		String date = formatter.format(d);
		System.out.println(date);
		String splitter[] = date.split("-");
		String month_year = splitter[1];
		String day = splitter[0]; 
		System.out.println(month_year);
		System.out.println(day);
		
		
		selectDate(month_year,day); 
		Thread.sleep(3000);
}


		public void selectDate(String month_year, String select_day) throws InterruptedException
		{ 
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='ui-datepicker-title']"));

		for (int i=0; i<elements.size();i++)
		{
		System.out.println(elements.get(i).getText());

		//Selecting the month
		if(elements.get(i).getText().equals(month_year))
			
		{ 

		//Selecting the date 
		List<WebElement> days = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']/div[2]/table/tbody/tr/td/a"));

		for (WebElement d:days)
		{ 
		System.out.println(d.getText());
		if(d.getText().equals(select_day))
		{
		d.click();
		Thread.sleep(1000);
		return;
		}
		} 

		} 

		}
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
		selectDate(month_year,select_day);

		}

		
//		
		
	}


