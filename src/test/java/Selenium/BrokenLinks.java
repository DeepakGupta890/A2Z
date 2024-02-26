package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	//public static void main(String[] args) throws MalformedURLException, IOException {
		
		@Test
		public void brokenLink() throws MalformedURLException,IOException
		{
		
		//System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://freecrm.com/");
		driver.findElement(By.xpath("//a//span[text()='Log In']")).click();
		
		driver.findElement(By.name("email")).sendKeys("deepakmodanwal93@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		//driver.findElement(By.xpath("//div//a//span[text()='Calendar']")).click();
		
        //1. get the list of links and image
		List<WebElement>linkList=driver.findElements(By.tagName("a"));
		linkList.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Size of All links: "+linkList.size());
		
		List<WebElement> activeLinks=new ArrayList<WebElement>();
		
//2.iterate linkList:exclude all links/images which doen't have href
		for(int i=0;i<linkList.size();i++)
		{
			System.out.println(linkList.get(i).getAttribute("href"));
			if(linkList.get(i).getAttribute("href")!=null 
					&&(! linkList.get(i).getAttribute("href").contains("javascript"))) {
				activeLinks.add(linkList.get(i));
			}
		}
		
		//3. Get the size of ActiveLinks
		System.out.println("Active links of size/image: "+ activeLinks.size());
		
		//3. check the href, with httpconnection API:
		for(int j=0;j<activeLinks.size();j++)
		{
			HttpURLConnection connection=(HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String responce =connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href")+ "...>"+ responce);
		}
	}
		//OR
		
		@Test
		public void brokenLink1()
		{
			WebDriver driver = new ChromeDriver();


			// Navigate to BStackDemo Website
			driver.get("https://bstackdemo.com/");


			// Finding all the available links on webpage
			List<WebElement> links = driver.findElements(By.tagName("a"));


			// Iterating each link and checking the response status
			for (WebElement link : links) {
			String url = link.getAttribute("href");
			verifyLink(url);
			}


			driver.quit();
			}


			public static void verifyLink(String url) {
			try {
			URL link = new URL(url);
			HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
			httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
			httpURLConnection.connect();


			if (httpURLConnection.getResponseCode() == 200) {
			System.out.println(url + " - " + httpURLConnection.getResponseMessage());
			} else {
			System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
			}
			} catch (Exception e) {
			System.out.println(url + " - " + "is a broken link");
			}
			}
		}
	
	



