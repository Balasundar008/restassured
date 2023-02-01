package RestAssuredBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreateEmployees {
	@Test

	private void createEmployees() {
			RestAssured
			.given()
			   .baseUri("http://localhost:3000")
			   .header("Content-Type","application/json")
			   .body("{\r\n"
					+ "    \"first_name\": \"bala changes b\",\r\n"
					+ "    \"last_name\": \"guru\",\r\n"
					+ "    \"email\": \"balaguru@codingthesmartway.com\"\r\n"
					+ "    \r\n"
					+ "  }")	
		   .when()
			  .post("/employees")
		   .prettyPrint();
			
		}

	}


