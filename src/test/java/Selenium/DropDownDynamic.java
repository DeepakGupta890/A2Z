package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDynamic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//dropdown loaded based on user action i.e to dropdown shows only after selecting from dropdown
		//System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
	    WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		

	}

}
