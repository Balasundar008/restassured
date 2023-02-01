package RestAssuredAuthorization;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class oAuth2 {
	@Test
	private void OAuth2() {
		RestAssured
				.given()
					.auth()
						.oauth2("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")
				.when()
					.get("https://api.github.com/user/repos")
				.prettyPrint();
	
	}

}
 