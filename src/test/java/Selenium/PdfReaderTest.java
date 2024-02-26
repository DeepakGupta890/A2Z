package Selenium;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;


import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PdfReaderTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//PDF box dependency should be added
		//open source
		
		String url= "http://www.pdf995.com/samples/pdf.pdf";
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		//create object of url class
		//java.net.URL package
		URL pdfUrl= new URL(url);
		//open connection with openstream for pdf
		
		InputStream ip=pdfUrl.openStream();
		BufferedInputStream bf= new BufferedInputStream(ip);
		
		
		//File pdffile =new File ("C:\\Users\\hp\\Downloads\\QueueBuster (DPD Technologies Pvt. Ltd.).pdf");
		//load file in form of pdf doc
		PDDocument pdfDocument = PDDocument.load(bf);   //load method is available upto 2.0.29 version of pdfbox
		//from 3.0.0 version Loader class is available instead of PDDocument and method is loadPDF
		//PDDocument pdfDocument1= Loader.loadPDF(bf);
		
		
		//Page Count
		int pageCount=pdfDocument.getNumberOfPages();
		System.out.println(pageCount);
		Assert.assertEquals(pageCount,5);
		
		//full Page Complete Text
		PDFTextStripper pdfStripper= new PDFTextStripper();
		//String pdfText=pdfStripper.getText(pdfDocument);
		//System.out.println(pdfText);
		//Assert.assertTrue(pdfText.contains("Pdf995 makes it easy and affordable to create professional-quality documents i"));
		
		//set the page number and get the text
		pdfStripper.setStartPage(3);
		String pdfText=pdfStripper.getText(pdfDocument);
		System.out.println(pdfText);

	}

}
