package api.endPoints;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import io.restassured.response.Response;

public class AuthEndpoints {

	
	public static Response getToken(String username,String password) {
		HashMap<String,String> body=new HashMap<>();
		body.put("username" , username);
		body.put("password" , password);
		
		Response response=given()
				.header("Content-Type","application/json")
				.body(body)
		.when()
				.post(Routes.auth_URL)
		;
		return response;
	}
}
