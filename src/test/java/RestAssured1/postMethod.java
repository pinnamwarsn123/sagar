package RestAssured1;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class postMethod {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://reqres.in";

		String data = given().queryParam("Content-Type", "application/json")
				.body(payload.adddata())
				.when().post("api/users").then().log().all().assertThat().statusCode(201).header("server", "cloudflare")
				.extract().response().asPrettyString();

		System.out.println(data);

		// Extracting any 1 field from these

		JsonPath js = new JsonPath(data);

		String extractdata = js.getString("id");

		System.out.println(extractdata);

	}

}
