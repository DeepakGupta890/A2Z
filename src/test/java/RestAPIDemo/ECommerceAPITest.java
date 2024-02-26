package RestAPIDemo;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import POJO_API.ECommerceAPITest_Orders;
import POJO_API.ECommerceAPITest_Orders_OrderDetails;
import POJO_API.ECommerceAPITest_RequestLogin;
import POJO_API.ECommerceAPITest_ResponceLogin;
public class ECommerceAPITest {
	
	public static void main(String[] args) {
		
		//login
		
		RequestSpecification res=new RequestSpecBuilder()
				.setBaseUri("https://rahulshettyacademy.com")
				.setContentType(ContentType.JSON).build();
		ECommerceAPITest_RequestLogin loginRequest= new ECommerceAPITest_RequestLogin();
		loginRequest.setUserEmail("deepaktest+2@gmail.com");
		loginRequest.setUserPassword("Test@123");
		
		RequestSpecification reqLogin = given().log().all().spec(res).body(loginRequest);
		ECommerceAPITest_ResponceLogin loginResponse = reqLogin.when().post("/api/ecom/auth/login")
		.then().log().all().extract().response()
		.as(ECommerceAPITest_ResponceLogin.class);
		System.out.println(loginResponse.getToken());
		String token=loginResponse.getToken();
		System.out.println(loginResponse.getUserId());
		String userId=loginResponse.getUserId();
		
		
		//Create Product
		
		RequestSpecification addProductBaseReq=	new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addHeader("authorization", token)
				.build();
		
		RequestSpecification reqAddProduct = given().log().all().spec(addProductBaseReq).param("productName", "Laptop")
		.param("productAddedBy", userId).param("productCategory", "fashion")
		.param("productSubCategory", "shirts").param("productPrice", "11500")
		.param("productDescription", "Lenova").param("productFor", "men")
		//for attachment multipart used
		.multiPart("productImage",new File("C:\\Users\\hp\\OneDrive\\Pictures\\Saved Pictures//ls-logo.jpg"));
		
		String addProductResponse =reqAddProduct.when().post("/api/ecom/product/add-product").
		then().log().all().extract().response().asString();
		JsonPath js = new JsonPath(addProductResponse);
		String productId =js.get("productId");
		
		
		//Create Order
		RequestSpecification createOrderBaseReq=	new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addHeader("authorization", token).setContentType(ContentType.JSON)
				.build();
		ECommerceAPITest_Orders_OrderDetails orderDetail = new ECommerceAPITest_Orders_OrderDetails();
		orderDetail.setCountry("India");
		orderDetail.setProductOrderedId(productId);
		
		List<ECommerceAPITest_Orders_OrderDetails> orderDetailList = new ArrayList<ECommerceAPITest_Orders_OrderDetails> ();
		orderDetailList.add(orderDetail);	
		ECommerceAPITest_Orders orders = new ECommerceAPITest_Orders();
		orders.setOrders(orderDetailList);
		
	RequestSpecification createOrderReq=given().log().all().spec(createOrderBaseReq).body(orders);

	String responseAddOrder = createOrderReq.when().post("/api/ecom/order/create-order").then().log().all().extract().response().asString();
	System.out.println(responseAddOrder);
	
	//Delete Product

	RequestSpecification deleteProdBaseReq=	new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
	.addHeader("authorization", token).setContentType(ContentType.JSON)
	.build();

	RequestSpecification deleteProdReq =given().log().all().spec(deleteProdBaseReq).pathParam("productId",productId);

	String deleteProductResponse = deleteProdReq.when().delete("/api/ecom/product/delete-product/{productId}").then().log().all().
	extract().response().asString();

	JsonPath js1 = new JsonPath(deleteProductResponse);

	Assert.assertEquals("Product Deleted Successfully",js1.get("message"));


	}

}
