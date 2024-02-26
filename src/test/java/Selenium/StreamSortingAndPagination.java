package Selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StreamSortingAndPagination {

	
	@Test(enabled=false)
	public void arrayApprochFilter()
	{
		List<String> name= new ArrayList<String>();
		name.add("Rahul");
		name.add("Pranjal");
		name.add("Shiv");
		name.add("Deepak");
		name.add("Ramu");
		name.add("Ratanlal");
		
		int count=0;
		for(int i=0;i<name.size();i++)
		{
			String actualName= name.get(i);
			if(actualName.startsWith("R"))
			{
				count++;
			}
		}
		System.out.println(count);
		
		
			
	}
	//.............Alternate Stream way................
	
	@Test(enabled=false)
	public void streamFilter()
	{
		List<String> name= new ArrayList<String>();
		name.add("Rahul");
		name.add("Pranjal");
		name.add("Shiv");
		name.add("Deepak");
		name.add("Ram");
		name.add("Ratanlal");
		Long c=name.stream().filter(s->s.startsWith("R")).count();
		
		//s -> Lambda expression , divides in two parts.
		//1. left side specifies parameters required 
		//by the expression, which could also be empty 
		//if no parameters are required.
		//2. right side is lambda body 
		//which specifies the actions of the lambda expressions.
		//there is no life for intermediate op if there is no terminal op.
		//terminal operation will execute only if intermediate op (filter) returns true.
		//we can create stream.
		System.out.println(c);
		
		Stream.of("Rahul","Pranjal", "Shiv", "Deepak","Ramu","Ratanlal").filter(s->
		{
			s.startsWith("R");
		    return true;
		
		}).count();
		System.out.println(c);
		
		//print all the name of arrayList name with >4
		name.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		System.out.println("...........................");
		//print 1 record which have length of>4
		name.stream().filter(s-> s.length()>4).limit(1).forEach(s->System.out.println(s));
	}
	
	@Test(enabled=false)
	public void streamMap()
	//used for manipulate the values
	{
		List<String> name= new ArrayList<String>();
		name.add("man");
		name.add("woman");
		name.add("don");
		
		//print name >4 with upper case which have last letter l
		//Stream.of("Rahul","Pranjal", "Shiv", "Deepak","Ramu","Ratanlal")
		//.filter(s->s.endsWith("l"))
		//.map(s->s.toUpperCase())
		//.forEach(s->System.out.println(s));
		
		//list with sorted upper case have first word l
		//change arrays into list
		List <String> names=Arrays.asList("Rahul","Pranjal", "Shiv", "Deepak","Ramu","Ratanlal");
		//names.stream().filter(s->s.startsWith("R")).sorted()
		//.forEach(s-> System.out.println(s));
		
		//merging two different list
		Stream<String> newStream=Stream.concat(name.stream(), names.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		
		//check any match is available or not
		boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Deepak"));
		Assert.assertTrue(flag);
	
	
		
		
	}
	
	@Test
	public void streamCollector()
	{
		List<String> ls= Stream.of("Rahul","Pranjal", "Shiv", "Deepak","Ramu","Ratanlal")
				.filter(s->s.endsWith("l")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(0));
		List<Integer> numbers=Arrays.asList(3,2,2,7,5,1,9,7);
		//print unique numbers
		numbers.stream().distinct().forEach(s->System.out.println(s));
		
		//sort the array and provide 3rd sorting value
		List<Integer> li = numbers.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("------------");
		System.out.println(li.get(2));
		
		
	}
	
	@Test(enabled=false)
	public void webTableSoting()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		//click on column
		driver.findElement(By.cssSelector("th span.sort-descending")).click();
		
		//capture the webElements into list
		List<WebElement> element_List=driver.findElements(By.xpath("//tbody//tr//td[1]"));
		
		//capture all text of webElement into new List(original list)
		List<String>original_List=element_List.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort the list of original list
		List<String> sorted_List=original_List.stream().sorted().collect(Collectors.toList());
		//compare sorted and original list
		Assert.assertTrue(original_List.equals(sorted_List));
		
		
		driver.findElement(By.xpath("//span[@class='sort-icon sort-ascending' or @class='sort-icon sort-descending' ]")).click();
		//scan the name column with text value-Rice > get the price of the same.
		List<String> price;
		do
		{
			List<WebElement> rows=driver.findElements(By.xpath("//tbody//tr//td[1]"));
		price= rows.stream().filter(s->s.getText().contains("Beans"))
		.map(s->getPriceOfVeg(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		
		//pagination handle
		if(price.size()<1)
		{
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		}
		while(price.size()<1);
		
		
	}

	private static String getPriceOfVeg(WebElement s) {
		////tr//td[1]/following-sibling::td[1]
		String priceValue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		// TODO Auto-generated method stub
		return priceValue;
	}
	
	@Test
	public void seachFilterValidation()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> veggies=driver.findElements(By.xpath("//tbody//tr//td[1]"));
		
		List<WebElement> filteredList_veggies=veggies.stream().filter(veggie->veggie.getText().contains("Rice")).collect(Collectors.toList());
		Assert.assertEquals(veggies.size(), filteredList_veggies.size());
		
		
	}
	
	
	   
	
	
}
