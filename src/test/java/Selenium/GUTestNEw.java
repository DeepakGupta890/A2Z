package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GUTestNEw {

	


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://testing.mihi.info:81/Account/Login?ReturnUrl=%2F#");
			driver.manage().window().maximize();
			WebElement username=driver.findElement(By.id("txtUserName"));
			 WebElement password=driver.findElement(By.className("password"));
			 WebElement companyCode=driver.findElement(By.id("CompanyCode"));
			 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			 
			
			 
			    username.clear();
				username.sendKeys("GUGL_HR");
				password.clear();
				password.sendKeys("Admin@123");
				companyCode.clear();
				companyCode.sendKeys("GU0GLIN");
				driver.findElement(By.id("loginBtn")).click();
				driver.findElement(By.xpath("//div[@class='sixteen wide column']//a[@class='btnsaveblink button ui primary']")).click();
				Thread.sleep(10000);
				driver.findElement(By.id("nav_item_91")).click();
				Thread.sleep(10000);
				driver.findElement(By.xpath("//div[@class='flex_content_wrap']//li//a[@data-title=\"Add Employee\"]")).click();
				Thread.sleep(20000);
				WebElement employeeCode=driver.findElement(By.id("txtEmployeeCode"));
				WebElement userName=driver.findElement(By.id("txtUsername"));
				WebElement firstName=driver.findElement(By.id("txtFirstName"));
				WebElement lastName=driver.findElement(By.id("txtLastName"));
				WebElement attandanceCode=driver.findElement(By.id("txtAttendanceCode"));
				
				WebElement dob=driver.findElement(By.id("txtDateOfBirth"));
				WebElement doj=driver.findElement(By.id("txtdateOfJoining"));
				
				//WebElement save=driver.findElement(By.id("btnSave"));
				
				
				Thread.sleep(30000);
				employeeCode.sendKeys("abc");
				userName.sendKeys("abc");
				firstName.sendKeys("abc");
				lastName.sendKeys("lastName");
				attandanceCode.sendKeys("attandanceCode");
				//dob.sendKeys("25/01/1993");
				//doj.sendKeys("21/04/2021");
				WebElement gender = driver.findElement(By.id("ddGender"));
				gender.sendKeys("Male");
//				Thread.sleep(7000);
//				gender.click();
//				Thread.sleep(7000);
				//Select select = new Select(gender);
				
				//Thread.sleep(10000);
				//select.selectByValue("129");
				
					
				
						
					
					
				
			   
			
				
//				
//				WebElement dataCatagory=driver.findElement(By.id("dataCategory"));
//				Select getDataCategory=new Select(dataCatagory);
//	    		getDataCategory.selectByVisibleText("Production");
				
				
				
				
				
				

		}

	}