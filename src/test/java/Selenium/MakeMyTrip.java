package Selenium;


 
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@title,'Sign in with Google Button']")));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='commonModal__close']")));
		//driver.switchTo().frame(5);
		driver.findElement(By.cssSelector(".commonModal__close")).click();
		WebElement from=driver.findElement(By.id("fromCity"));
		from.click();
		from.sendKeys("Pune");
		Thread.sleep(3000);
		List<WebElement> fromOptions =driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']//li//div//p"));
		for(WebElement option: fromOptions)
		{
			if(option.getText().equalsIgnoreCase("Pune, India"))
			{
			option.click();
			break;
			}
		}
		WebElement toCity=driver.findElement(By.id("toCity"));
		toCity.click();
		Thread.sleep(3000);
		toCity.sendKeys("Delhi");
		Thread.sleep(3000);
		toCity.sendKeys(Keys.ARROW_DOWN);
		toCity.sendKeys(Keys.ENTER);
		
	}

}
