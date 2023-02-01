package RestAssuredAuthorization;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class apiKey {
	@Test(enabled = false)
	private void apiByDirectbyUrl() {
		RestAssured.
		given()
		.when()
			.get("https://api.openweathermap.org/data/2.5/weather?q=exton&appid=8aab3f7c2d5bed1e0385295804e379ae")
		.prettyPrint();
	
 	
	
	}
	@Test(enabled = false)
	private void apiByQuery() {
		RestAssured
		.given()
			.queryParam("q", "exton")
			.queryParam("apikey", "8aab3f7c2d5bed1e0385295804e379ae")
		.when()
			.get("https://api.openweathermap.org/data/2.5/weather")
		.prettyPrint();
		
		
	}
	@Test
	private void apiByHeader() {
		RestAssured
		.given()
			.queryParam("q", "exton")
			.header("apikey", "8aab3f7c2d5bed1e0385295804e379ae")
		.when()
			.get("https://api.openweathermap.org/data/2.5/weather")
		//.prettyPrint();
		.then()
			.log().body();
	
	
	

}
}