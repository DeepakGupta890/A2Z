package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HightAndWidthOfWebElement {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();;
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		WebElement name= driver.findElement(By.name("name"));
		name.sendKeys("testscreenshot for partial image");
		File file=name.getScreenshotAs(OutputType.FILE);
		// Need Apache Commons IO jar file.
		
		FileUtils.copyFile(file, new File("./screenshot//partialScreenshot.png"));
		
		System.out.println("Hight "+ name.getRect().getDimension().height);
		System.out.println("Width: "+name.getRect().getDimension().width);
		driver.close();

	}

}
