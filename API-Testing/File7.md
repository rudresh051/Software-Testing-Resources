# Trello API

```java
package RestAssured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matcher.*;

import org.json.simple.JSONObject;

import static io.restassured.matcher.RestAssuredMatchers.*;
//https://api.trello.com/1/boards/?name={name}&key=APIKey&token=APIToken


public class Trello {
	@Test
	public void CreateBoard() {
		RestAssured.baseURI = "https://trello.com";
		given().queryParam("name", "Rudra_board_c")
		.queryParam("key", "fe9049e46913337fe2e27ffaf75a")
		.queryParam("token", "ATTA77c4e48363d7a3354574194bfe60bdadf6b99534e3c55b902b28d94c3d9C0723F0")
		.header("Content-Type","application/json")
		.when().post("/1/boards/")
		.then().contentType(ContentType.JSON);
	}
	
}
```








