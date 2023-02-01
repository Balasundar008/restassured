package RestAssuredBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UpdateEmployees {
	@Test
	private void updateEmployees() {
		
		RestAssured
		.given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body("{\r\n"
				+ "    \"first_name\": \"name\",\r\n"
				+ "    \"last_name\": \"surname\",\r\n"
				+ "    \"email\": \"sundar@codingthesmartway.com\"\r\n"
				+ "    \r\n"
				+ "  }")	
		.when()
		.put("/employees/5")
		.prettyPrint();
		
	}
	@Test
	private void DeleteEmployees() {
		RestAssured
		.given()
		.baseUri("http://localhost:3000")
		.when()
		.delete("/employees/2")
		.prettyPrint();
		
		

	}
	}


