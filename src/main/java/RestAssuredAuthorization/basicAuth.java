package RestAssuredAuthorization;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class basicAuth {
	@Test(enabled = false)
	private void BasicAuth() {
		RestAssured
		.given()
		  .auth()
		    .basic("postman", "password")
		  .baseUri("https://postman-echo.com/")  
		.when() 
	      .get("basic-auth")
	    .prettyPrint(); 
	
	
	}
	@Test
	private void BasicAuthWithoutBaseUri() {
		RestAssured
		.given()
		  .auth()
		    .basic("postman", "password")
		.when() 
	      .get("https://postman-echo.com/basic-auth")
	    .prettyPrint(); 

}
}