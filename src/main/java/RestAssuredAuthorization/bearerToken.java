package RestAssuredAuthorization;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class bearerToken {
	@Test
	private void BearerToken() {
		RestAssured
		.given()
			.header("Authorization","Bearer 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")
		.when()
			.get("https://api.github.com/user/repos")
		.prettyPrint();
			
	}

}
