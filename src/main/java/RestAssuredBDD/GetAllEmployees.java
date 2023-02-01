package RestAssuredBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAllEmployees {
	@Test
	private void getAllEmployees() {
		RestAssured
		.given ()
			.baseUri("http://localhost:3000")
		.when()
			.get("/employees")
		.prettyPrint();
		
	}

}
