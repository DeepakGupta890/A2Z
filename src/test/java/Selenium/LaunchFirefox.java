package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://sites.google.com/a/chromium.org/chromedriver/downloads");


}
}
