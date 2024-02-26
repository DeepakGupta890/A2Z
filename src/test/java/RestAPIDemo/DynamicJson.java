package RestAPIDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import APIFiles.ReUsableMethods;
import APIFiles.payload;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class DynamicJson {
	
	@Test(dataProvider="BooksData")
	public void addBook(String isbn,String aisle)
	{
		RestAssured.baseURI="http://216.10.245.166";
		
		String response=given().header("Content-Type", "application/json").
		headers("Content-Type", "application/json").
		body(payload.AddBook(isbn,aisle )).
		
		when().post("Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200)
		.extract().response().asString();
		
		JsonPath js1=ReUsableMethods.rawToJson(response);
		String id=js1.get("ID");
		System.out.println(id);
		
		
		
	}
	
	@DataProvider(name="BooksData")
	
	//array=collection of elements

	//multidimensional array= collection of arrays
	public Object[][] getData()
	{
		return new Object[][] {{"nkjk","688"},{"ljihd","4345"},{"hkjh","090"}};
	}

}
