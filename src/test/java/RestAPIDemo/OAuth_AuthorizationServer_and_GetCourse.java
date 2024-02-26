package RestAPIDemo;


import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class OAuth_AuthorizationServer_and_GetCourse {
	@Test
	public void Oauth()
	{
		
		String response=given()
		.formParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.formParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
		.formParam("grant_type", "client_credentials")
		.formParam("scope", "trust")
		.when().log().all()
		.post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token").asString();
		JsonPath jsonPath= new JsonPath(response);
		String accessToken=jsonPath.getString("access_token");
		
		String responceGetCourse=given()
		.queryParam("access_token", "accessToken")
		.when().log().all()
		.get("https://rahulshettyacademy.com/oauthapi/getCourseDetails").asString();
		
		System.out.println(responceGetCourse);
	
	}

}
