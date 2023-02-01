package Rest_Assured.basicConcepts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteEmployees {
	@Test
public void DeleteEmp() {
	RestAssured.baseURI="http://localhost:3000";
	RequestSpecification requestspecification= RestAssured
			.given();
	Response response=requestspecification.request(Method.DELETE,"/employees/1");
	System.out.println(response.asPrettyString());

	
	
	
	}
	@Test
	private void getAnEmployee() {
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.request(Method.GET,"employees/2");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());

	}
}
