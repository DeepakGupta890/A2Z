package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionDemo {

	public static void main(String[] args) throws InterruptedException {
		
		//Action class is used for mouse hover
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//		driver.get("https://www.amazon.in/ref=nav_logo");
//		Actions action = new Actions(driver);
//				action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
//
//		
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[value='OneWay'][id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GOP']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		
		// please learn indexing from here amd [2] is an example
		driver.findElement(By.xpath("(//a[@value='AMD'])[2]")).click();;
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		WebElement elemrnt=driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date1']"));
		String Valuee="30/10";
		ActionDemo.datepickerbynaveen(driver, Valuee, elemrnt);
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//*[@id='divAdult']")).click();
	Select select = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	select.selectByIndex(1);
		JavascriptExecutor js =( JavascriptExecutor)driver;
//		js.executeScript("document.getElementById('ctl00_mainContent_view_date1').value='29/10'");
//		Thread.sleep(2000);
//		js.executeScript("document.getElementById('ctl00_mainContent_view_date2').value='30/10'");
//		js.executeScript("window.scrollBy(0,500)");
//		driver.findElement(By.xpath("//*[contains(@class,'facebook-footer')]")).click();
//		Thread.sleep(5000);
//		js.executeScript("window.history.back()");
		
}
	//currently not working
	public static void datepickerbynaveen(WebDriver driver,String name , WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+name+"');", element);
		
	}	


	}

		

