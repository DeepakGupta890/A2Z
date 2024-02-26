package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {
	
	public static void main(String[] args) throws InterruptedException {
		Alert alert;
	
		//System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		
		driver.findElement(By.id("alertButton")).click();
		 alert=driver.switchTo().alert();
		 
		System.out.println("Alert1 Text : " + alert.getText());
		alert.dismiss();
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(6000);
		String alert2text=driver.switchTo().alert().getText();
		System.out.println("Alert 2 Text: "+alert2text);
		alert.dismiss();
		driver.findElement(By.id("confirmButton")).click();
		String alert3text=driver.switchTo().alert().getText();
		System.out.println("Alert 3 Text: "+alert3text);
		alert.accept();
		WebElement prompt=driver.findElement(By.id("promtButton"));
		
		//click by javascript
		js.executeScript("arguments[0].click();", prompt);
		String alert4textPrompt=driver.switchTo().alert().getText();
		System.out.println("Alert 4 Text of Prompt Alert: "+ alert4textPrompt);
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Hello");
		alert.accept();
		driver.close();
	}

}
