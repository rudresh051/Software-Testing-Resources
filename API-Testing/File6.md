* Reqres.in

```java
package RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matcher.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

public class day1 {

 @Test(enabled = false)
 public void setup() {
  
  Response rep = RestAssured.get("https://reqres.in/api/users");
//  System.out.println(rep);
  int statusCode = rep.statusCode();
  Assert.assertEquals(statusCode, 200);
 }
 
 @Test(enabled = false)
 public void ListUsers() {
  given().get("https://reqres.in/api/users?page=2").then().statusCode(200).log().all();
 }
 
 @Test(enabled = true)
 public void SingleUser() {
//  given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[0]", equalTo(7));                                     
  given().get("https://reqres.in/api/users/2").then().statusCode(200).body("data.first_name", equalTo("Janet"));                                     
 }

  @Test(enabled = true)
 public void ListResource() {
  given().get("https://requres.in/api/unknown").then().statusCode(200).log().all();
 }

   @Test(enabled = true)
 public void SingleResource() {
  given().get("https://reqres.in/api/unknown/23").then().statusCode(200).body("data.id", equalTo(2)).log().all();
 }
 
 @Test(enabled = true)
 public void SingleResourceNotFound1() {
  given().get("https://reqres.in/api/unknown/23").then().statusCode(404).log().all();
 }
 
 @Test(enabled = true)
 public void Create() {
  JSONObject obj = new JSONObject();
  obj.put("name", "rudresh");
  obj.put("job","tester");
  given().body(obj.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201).log().all();
 }
 
 @Test(enabled = true)
 public void Delete() {
  given().delete("https://reqres.in/api/users/2").then().statusCode(204).log().all();
 }

 @Test(enabled = true)
 public void Register() {
  JSONObject obj = new JSONObject();
  obj.put("email", "jharudreshwar17@gmail.com");
  obj.put("password", "rudresh123");
  given().body(obj.toJSONString()).when().post("https://reqres.in/api/register").then().statusCode(200).log().all();
 }
 
 
 @Test(enabled = true)
 public void RegisterUnsuccessful() {
  JSONObject obj = new JSONObject();
  obj.put("email", "jharudreshwar17@gmail.com");
  given().body(obj.toJSONString()).when().post("https://reqres.in/api/register").then().statusCode(400).log().all();
 }

 @Test(enabled = false)
 public void LoginSuccessful() {
  JSONObject obj = new JSONObject();
  obj.put("email", "eve.holt@reqres.in");
  obj.put("password", "cityslicka");
  given().body(obj.toJSONString()).when().post("https://reqres.in/api/login").then().statusCode(200).log().all();

 }
 
 @Test(enabled = true)
 public void LoginUnsuccessful() {
  JSONObject obj = new JSONObject();
  obj.put("email", "jharudreshwar17@gmail.com");
  given().body(obj.toJSONString()).when().post("https://reqres.in/api/login").then().statusCode(400).log().all();
 }
 
 @Test(enabled = true)
 public void DeleayedResponse() {
  given().get("https://reqres.in/api/users?delay=3").then().statusCode(200).log().all();                                     

 }
}
```