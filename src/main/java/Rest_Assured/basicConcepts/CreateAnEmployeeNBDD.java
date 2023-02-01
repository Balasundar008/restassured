package Rest_Assured.basicConcepts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateAnEmployeeNBDD {
	@Test
	private void createAnEmployee() {
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification requestSpecification 
		= RestAssured.given()
		.header("Content-Type","application/json")
		.body("   {\r\n"
				+ "    \"first_name\": \"bala\",\r\n"
				+ "    \"last_name\": \"sundar\",\r\n"
				+ "    \"email\": \"balasundar@codingthesmartway.com\"\r\n"
				+ "    \r\n"
				+ "  }");
		Response response = requestSpecification.request(Method.POST,"/employees");
		System.out.println(response.getStatusLine());
		System.out.println(response.asPrettyString());
		
	}

}
