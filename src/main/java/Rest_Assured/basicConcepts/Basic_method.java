package Rest_Assured.basicConcepts;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class Basic_method {
	@Test

	private void getMethod() {
	
		RestAssured.baseURI="https://api.github.com/";
		String bearerToken= "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";
		Response response =
				RestAssured
			.given()
				.header("Authorization", "Bearer "+bearerToken)
				.auth().basic("", "")
				.body("")
				
			.when()
				.get("user/repos")
			.then()
				.log().all().extract()
				.response();
			int statusCode =response.getStatusCode();
			Assert.assertEquals(200,statusCode);
			System.out.println(response.asString());
		
				
	}}


 