package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckUnderlineText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/?gfe_rd=ctrl&ei=bXAwU8jYN4W6iAf8zIDgDA&gws_rd=cr");
		driver.manage().window().maximize();

		 String cssValue= driver.findElement(By.xpath("//a[text()='Hindi']")).getCssValue("text-decoration");

		 System.out.println("value"+cssValue);

		 Actions act = new Actions(driver);

		 act.moveToElement(driver.findElement(By.xpath("//a[text()='Hindi']"))).perform();

		 String cssValue1= driver.findElement(By.xpath("//a[text()='Hindi']")).getCssValue("text-decoration");

		 System.out.println("value over"+cssValue1);

		 driver.close();

	}

}
