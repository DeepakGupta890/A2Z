package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		List<WebElement> radioButtons=driver.findElements(By.xpath("//*[@type='radio']"));
		//WebElement yesId= driver.findElement(By.xpath("//*[@id='yesRadio']"));
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//yesId.click();
		for(int i=0;i<(radioButtons.size())-1;i++)
		{
			boolean buttondisDisplaystatus= radioButtons.get(i).isDisplayed();
			
			//String radioButtonName=radioButtons.get(i).getText();
			boolean buttonEnableStatus=radioButtons.get(i).isEnabled();
			boolean buttonSelectStatus=radioButtons.get(i).isSelected();
			Thread.sleep(3000);
			System.out.println( "buttondisDisplaystatus : " +buttondisDisplaystatus +" ,buttonEnableStatus: " + buttonEnableStatus + " buttonSelectStatus: " + buttonSelectStatus);
			//System.out.println(radioButtonName);
			if(buttonSelectStatus==false)
			{
				Thread.sleep(2000);
				//try {
				js.executeScript("arguments[0].click();", radioButtons.get(i));
				Thread.sleep(3000);
				//}
				//catch{
					
				//}
				
				
				System.out.println( "buttondisDisplaystatus : " +buttondisDisplaystatus +" ,buttonEnableStatus: " + buttonEnableStatus + " buttonSelectStatus: " + buttonSelectStatus);
			}
			driver.quit();
		}
		

	}

}
