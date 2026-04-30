package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkdinForApplyOnLocationBasis {
	
	public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	driver.findElement(By.id("username")).sendKeys("erdeepakg1@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Deepak@93");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	Thread.sleep(3000);
	WebElement searchBar=driver.findElement(By.xpath("//input[@placeholder='Search']"));
	searchBar.sendKeys("Hiring for software Tester");
	searchBar.sendKeys(Keys.ENTER);
	WebElement searchButton=driver.findElement(By.xpath("//button[normalize-space()='Search']"));
	//searchButton.click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[@id='search-reusables__filters-bar']//button[normalize-space()='Jobs']")).click();
	Thread.sleep(3000);
	WebElement datePostedDropdown=driver.findElement(By.xpath("(//button[normalize-space()='Date posted'])"));
	WebElement pastweekDates=driver.findElement(By.cssSelector("label[for='timePostedRange-r604800'] span[class='t-14 t-black--light t-normal']"));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	while (true) {
	    datePostedDropdown.click(); // click dropdown

	    try {
	        wait.until(ExpectedConditions.visibilityOf(pastweekDates)); // wait for pastweekDates
	        break; // exit loop when element is visible
	    } catch (Exception e) {
	        // if not visible, keep clicking
	        System.out.println("pastweekDates not visible yet, clicking again...");
	    }
	}

	// Now you can interact with pastweekDates
	pastweekDates.click();
	Thread.sleep(3000);
	//driver.findElement(By.cssSelector("label[for='timePostedRange-r604800'] span[class='t-14 t-black--light t-normal']")).click();
	WebElement showresult=driver.findElement(By.xpath("//span[contains(normalize-space(.),'results')][1]"));
	System.out.println(showresult.getText());
	showresult.click();
	Thread.sleep(4000);
	/*WebElement companyLink= driver.findElement(By.xpath("(//ul[@class='jVCPXrBKVQJokoRUZjHYQYLRlaVTpaGizJTkiHA']//li//div[3]//span[@dir='ltr']/preceding-sibling::div)//a"));
	
	List<WebElement> location=driver.findElements(By.xpath("//ul[@class='jVCPXrBKVQJokoRUZjHYQYLRlaVTpaGizJTkiHA']//li//div[3]//span[@dir='ltr']"));
	for(WebElement desiredLocation: location)
	{
		if(location.contains("Haryana") || location.contains("Gurgaon") || location.contains("Remote"))
		{
			companyLink.click();
		}
	}*/
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='jVCPXrBKVQJokoRUZjHYQYLRlaVTpaGizJTkiHA']//li//div[3]//span[@dir='ltr']")));

	// Find all job cards
	List<WebElement> jobCards = driver.findElements(By.xpath("//ul[@class='jVCPXrBKVQJokoRUZjHYQYLRlaVTpaGizJTkiHA']//li//div[3]//span[@dir='ltr']"));

	// Loop through each job card
	for (WebElement job : jobCards) {
	    try {
	        // Find location inside the job card
	       // WebElement locationElement = job.findElement(By.xpath(".//span[contains(@class,'job-card-container__metadata-item')]"));
	        String location = job.getText();
	        
	        // Check if location matches your keywords
	        if (location.contains("Gurgaon") || location.contains("Noida") || location.contains("Remote") || location.contains("Haryana")) {
	            
	            // Print location
	            System.out.println("Location: " + location);

	            // Open company link in new tab
	            WebElement companyElement = driver.findElement(By.xpath("//ul[@class='jVCPXrBKVQJokoRUZjHYQYLRlaVTpaGizJTkiHA']//li//div[1]//div//a")) ;
	            String companyDesignationName = companyElement.getText();
	            String companyLink = companyElement.getAttribute("href");

	            // Print company name
	            System.out.println("Company Name: " + companyDesignationName);

	            // Open link in new tab (using JavaScript)
	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            js.executeScript("window.open(arguments[0], '_blank');", companyLink);

	            // Stop after the first match
	            break;
	        }
	    } catch (Exception e) {
	        System.out.println("Error in one job card: " + e.getMessage());
	    }}
	

	}
	
	

}
