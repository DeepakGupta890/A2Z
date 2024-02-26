package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=oppo+mobile+5g&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_12_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_12_na_na_na&as-pos=1&as-type=RECENT&suggestionId=oppo+mobile+5g%7CMobiles&requestId=d4c59093-f97b-49b1-afd1-63234d716e33&as-searchtext=oppo%20mobile%20");
		
		//list of items 
		List <WebElement> items=driver.findElements
	(By.xpath("//div[@class='_3pLy-c row']//div[@class='col col-7-12'][1]/div[@class='_4rR01T']"));
		
		for(WebElement item:items)
		{
			System.out.println(item.getText()+ "..........");
			
		}
		System.out.println(driver.findElement
	 (By.xpath("(//div[@class='_3pLy-c row']//div[@class='col col-7-12'][1]/div[@class='_4rR01T'])[24]")));
		System.out.println(items.size());

}
}
