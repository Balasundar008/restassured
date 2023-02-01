package Rest_Assured.basicConcepts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateEmployees {
	@Test
	public void PostMethod() {
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification requestspecification=RestAssured
		.given()
		.header("Content-Type","application/json")
		.body(" {\r\n"
				+ "    \r\n"
				+ "    \"first_name\": \"bala changes b\",\r\n"
				+ "    \"last_name\": \"guru\",\r\n"
				+ "    \"email\": \"balaguru@codingthesmartway.com\"\r\n"
				+ "  }");
		Response response = requestspecification.request(Method.PUT,"/employees/5");
		System.out.println(response.asPrettyString());
	
	}

}
