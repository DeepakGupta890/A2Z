package Selenium;




	import java.time.Duration;
	import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Linkdin2 {
		
		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
			
			driver.findElement(By.id("username")).sendKeys("erdeepakg1@gmail.com");
			driver.findElement(By.id("password")).sendKeys("Deepak@93");
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			
			Thread.sleep(5000);
			
			WebElement searchBar = driver.findElement(By.xpath("//input[@placeholder='Search']"));
			searchBar.sendKeys("Hiring for software Tester");
			searchBar.sendKeys(Keys.ENTER);

			Thread.sleep(4000);

			driver.findElement(By.xpath("//div[@id='search-reusables__filters-bar']//button[normalize-space()='Jobs']")).click();
			Thread.sleep(3000);
			
			WebElement datePostedDropdown = driver.findElement(By.xpath("(//button[normalize-space()='Date posted'])[1]"));
			WebElement pastWeekDates = driver.findElement(By.cssSelector("label[for='timePostedRange-r604800'] span[class='t-14 t-black--light t-normal']"));

			while (true) {
			    datePostedDropdown.click(); // click dropdown

			    try {
			        wait.until(ExpectedConditions.visibilityOf(pastWeekDates)); // wait for pastweekDates
			        break; // exit loop when element is visible
			    } catch (Exception e) {
			        // if not visible, keep clicking
			        System.out.println("pastweekDates not visible yet, clicking again...");
			    }
			}

			// Now you can interact with pastweekDates
			pastWeekDates.click();
			Thread.sleep(3000);
			WebElement showresult=driver.findElement(By.xpath("//span[contains(normalize-space(.),'results')][1]"));
			System.out.println(showresult.getText());
			showresult.click();
			Thread.sleep(4000);
			// Create a list to store all matching job links
			List<String> allMatchingJobLinks = new ArrayList<>();
			 List<WebElement> nextButton = driver.findElements(By.xpath("//button[normalize-space()='Next']"));
			 String parentWindow = driver.getWindowHandle();

			while (true) {
			    Thread.sleep(3000); // Small wait
			   

			    List<WebElement> jobCards = driver.findElements(By.xpath("//ul[@class='NXKFkRARPMimVCZuwDAYSScOQZmAHOtYdyZg']/li"));

			    //System.out.println("Found " + jobCards.size() + " job cards on this page.");

			    for (WebElement jobCard : jobCards) 
			    {
			    	try
			    	{
			    		
			    	
			      
			            WebElement locationElement = jobCard.findElement(By.xpath(".//div[3]//span[@dir='ltr']"));
			            String location = locationElement.getText();

			            if (location.contains("Gurgaon") || location.contains("Noida") || location.contains("Remote") 
			                || location.contains("Haryana") || location.contains("Delhi"))
			            {
			                
			                System.out.println("Location matched: " + location);

			                WebElement jobLinkElement = jobCard.findElement(By.xpath(".//div[1]//div//a"));
			                String jobLink = jobLinkElement.getAttribute("href");
			                allMatchingJobLinks.add(jobLink);
			                //String parentWindow = driver.getWindowHandle();
			                ((JavascriptExecutor) driver).executeScript("window.open(arguments[0], '_blank');", jobLinkElement);
					        Thread.sleep(3000);
					        Set<String> allWindows = driver.getWindowHandles();
		                    for (String window : allWindows) {
		                        if (!window.equals(parentWindow)) {
		                            driver.switchTo().window(window);
		                        }
		                    }
					       
					   
					          
					                
					                Thread.sleep(3000);
					                try
					                {
					                WebElement companyLink = driver.findElement(By.cssSelector(".job-details-jobs-unified-top-card__company-name a"));
						            companyLink.click();
						            Thread.sleep(3000);
					                }
					                catch (Exception e)
					                {
					                	System.out.println("Company link not found: " + e.getMessage());
					                }

					                try
					                {

						            WebElement people = driver.findElement(By.xpath("//a[normalize-space()='People']"));
						            people.click();
						            Thread.sleep(3000);
					                }
					                
					                catch(Exception e)
					                {
					                	System.out.println("People tab not found: " + e.getMessage());
					                }
					                try
					                {

						            WebElement showMoreButton = driver.findElement(By.xpath("//button[normalize-space()='Show more']"));
						            showMoreButton.click();
						            Thread.sleep(2000);
					                }
					                catch(Exception e)
					                {
					                	System.out.println("Show more button not found: " + e.getMessage());
					                }
					                

						           // WebElement jobLocation = driver.findElement(By.cssSelector("span.topcard__flavor.topcard__flavor--bullet"));
					                driver.switchTo().window(parentWindow);
					              
			                
			            }
			    	}
			    catch(Exception e)
			    	{
			    	System.out.println("Error handling a job card: " + e.getMessage());
			    	}
			       
			    }
			    

			    // Now try clicking Next button
			  
			       
			        if ( nextButton.get(0).isDisplayed() && nextButton.get(0).isEnabled()) 
			        {
			            System.out.println("Clicking Next...");
			            nextButton.get(0).click();
			            Thread.sleep(5000); // wait for next page load
			        }
			        
			    }
			    
			
			    

			
			}}