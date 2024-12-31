# GitHub API

1. Create a repo

```java
package RestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matcher.*;

import org.json.simple.JSONObject;

import static io.restassured.matcher.RestAssuredMatchers.*;

public class Git {
	@Test
	public void createRepo() {
		JSONObject obj = new JSONObject();
		obj.put("name", "Rudreshwar Jha");
		obj.put("description","SDET");
		obj.put("homepage", "https://github.com");
		obj.put("private", false);
		obj.put("is_template",true);
		
		given().auth().oauth2("Generate Token and Paste")
		.headers("Content-Type","application/json")
		.body(obj.toJSONString()).when().post("https://api.github.com/user/repos")
		.then().log().all();
		
	}
}
```