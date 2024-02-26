package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GUTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "./Chrome\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://testing.mihi.info:81/Account/Login?ReturnUrl=%2FAccount%2FLogOff");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUserName")).sendKeys("GUGL_SA");
		driver.findElement(By.className("password")).sendKeys("Admin@123");
		driver.findElement(By.id("CompanyCode")).sendKeys("GU0GLIN");
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.xpath("//a[@onclick='ClientsAligmentsLayout.GetClientAligmentDetails(11)']//div[@class='c-tile-desc']")).click();
		Thread.sleep(3000);
		//driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//div[@class='sixteen wide column']//a[@class='btnsaveblink button ui primary']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("nav_item_294")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='menuTiles']//li//a[@data-title='RoleMenu PermissionLabel Mapping']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//select[@id='ddClientGroup']//following-sibling::i")).click();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@class='menu transition visible']/div[text()='Global PEO Services']"))).build().perform();
		driver.findElement(By.xpath("//input[@class='search']/preceding-sibling::select[@id='ddClientGroup']']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='search']/preceding-sibling::select[@id='ddClientGroup']']")).sendKeys(Keys.ENTER);
		//Select clientGroup =new Select(driver.findElement(By.xpath("//select[@id='ddClientGroup']")));
		Thread.sleep(1000);
		//clientGroup.selectByVisibleText("Global PEO Services");
		Select clientName =new Select(driver.findElement(By.id("ddClientId")));
		clientName.deselectByVisibleText("GPS India");
		Select role =new Select(driver.findElement(By.id("ddRole")));
		role.selectByVisibleText("GPSIN_HR01");
		Select menuName =new Select(driver.findElement(By.id("ddMenu")));
		menuName.selectByVisibleText("Reports");
		Select stage =new Select(driver.findElement(By.id("Type")));
		stage.selectByVisibleText("Candidate");
		Select subMenu =new Select(driver.findElement(By.id("ddSubMenu")));
		subMenu.selectByVisibleText("Candidate Summary Report");
		driver.findElement(By.id("btnShowSelectedDate")).click();
		Thread.sleep(2000);
		//WebElement Controlsdriver.findElement(By.xpath("//div[@class='dataTables_scrollBody']//tbody//tr"))
		List<WebElement> controls=driver.findElements(By.xpath("//div[@class='dataTables_scrollBody']//tbody//tr"));
		System.out.println(controls.size());
		for (WebElement webElement : controls) {
            String Controlname = webElement.getText();
            System.out.println(Controlname);
        }
	}

}
