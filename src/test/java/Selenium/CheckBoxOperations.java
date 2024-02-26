package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxOperations {
	
	public static void main(String[] args) {

		String exePath = "./Drivers\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", exePath);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");


		/**
		 * Validate isSelected and click
		 */

		WebElement checkBoxSelected = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
		boolean isSelected = checkBoxSelected.isSelected();

		// performing click operation if element is not selected 
		if(isSelected == false) {
			checkBoxSelected.click();
			System.out.println("checkbox is selected ");
		}

		/**
		 * Validate isDisplayed and click
		 */
		WebElement checkBoxDisplayed = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
		boolean isDisplayed = checkBoxDisplayed.isDisplayed();

		// performing click operation if element is displayed
		if (isDisplayed == true) {
			checkBoxDisplayed.click();
			System.out.println("checkbox is displayed");
		}

		/**
		 * Validate isEnabled and click
		 */
		WebElement checkBoxEnabled = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
		boolean isEnabled = checkBoxEnabled.isEnabled();

		// performing click operation if element is enabled
		if (isEnabled == true) {
			checkBoxEnabled.click();
			System.out.println("checkbox is enabled");
		}

	}

}
