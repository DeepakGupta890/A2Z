package Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoITConcepts {

	
		@Test (enabled=true)
		public void auTOITUse() throws IOException, InterruptedException
		{
	
		
		String downloadPath=System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		
		//from chrome doc below code is provided for set default directory path
		
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		
		
		driver.get("https://smallpdf.com/word-to-pdf");
		driver.findElement(By.cssSelector("span.gGeCVP")).click();
		Thread.sleep(3000);
		//uploading the file- to upload file we need AutoIT tool 
		//and write script into AutoIT so that selenium can bind with it.
		//SciTe- is an editor for script writing
		//download and install Auto IT Tool>go to c:Program Files> AutoIT> SciTe> click on application
		//Now we have to 
		//Shift focus to the file upload windows and 
		//set text/path into file name edit box of window pop up for upload file
		//click open to upload file
		//Au3info- record window component objects-go to c:Program Files> AutoIT> Au3Info_x64- click on application(recorder open)
		//with the help of recorder Build Script -scite.exe 
		//ex.
		//ControlFocus("Open","","Edit1")-open and edit1 is captured from Au3Info_x64 recorder 

		//ControlSetText("Open","","Edit1","C:\Users\hp\Documents\check\visit.pdf")

		//ControlClick("Open","","Button1")

		//Save it- .au3 extension

		//Convert file into .exe by compiling .au3 file-right click and select compile x86

		//Call .exe file with Runtime class in java into your selenium test

		Runtime.getRuntime().exec("D:\\Study\\AutoIT\\fileUpload.exe");
		//above code will upload the file now we check for download the file
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(40));
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[@class='r5zwp6-3 iiSRjo'] [text()='Download']")));
			
			driver.findElement(By.xpath("//span[@class='r5zwp6-3 iiSRjo'] [text()='Download']")).click();
			//verify downloaded file
			//For General customized code we need to provide file download path within the project
			//for that we need project path-downloadPath
			//and we have to use chrome option so that downloaded file will received in project only
			File f= new File(downloadPath+ "/Deepak_Gupta Resume.pdf");
			if(f.exists())
			{
				Assert.assertTrue(f.exists());

				if(f.delete())

				System.out.println("file deleted");
			}
		}
			
			
			@Test(enabled= true)
			public void windowAuthenticationPopUpWithoutAutoIT()
			{
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				//for user name and password pop up in desktop pop up use below format to provide 
				//credential
				//url-https://the-internet.herokuapp.com/
				//syntax- "http://Username:Password@SiteURL"
				//ex- http://
				driver.get("http://admin:admin@the-internet.herokuapp.com/");
				driver.findElement(By.linkText("Basic Auth")).click();
			}
		
		
		

	

}
