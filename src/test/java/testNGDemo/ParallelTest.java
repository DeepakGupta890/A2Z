package testNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
	
	WebDriver driver;
	
	@Test()
	public void testOnChromeWithBrowserStackUrl()
	{
	//System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.browserstack.com/");
	driver.manage().window().maximize();
	System.out.println("this is the test related to chrome browserstack homepage"+ " " +Thread.currentThread().getId());

	}

	@Test()
	public void testOnChromeWithBrowserStackSignUp()
	{
		WebDriverManager.firefoxdriver().setup();
	//System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.browserstack.com/users/sign_up");
	driver.manage().window().maximize();
	driver.findElement(By.id("user_full_name")).sendKeys("DeepakKumar");
	driver.findElement(By.id("user_email_login")).sendKeys("Deepak@123");
	driver.findElement(By.id("user_password")).sendKeys("Test@12345");
	System.out.println("this is the test related to chrome browserstack login"+ " " +Thread.currentThread().getId());

	}

	@AfterMethod
	public void close()
	{
	driver.quit();
	}
	

}
