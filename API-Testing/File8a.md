# What is Data Driven Testing?

DDT is a testing approach where test scenarios are
executed multiple times with different sets of input data.

* DDT helps in increasing test coverage and ensuring that the application behaves correctly under various conditions.

* DDT separates test data from test scripts because it makes it easier to maintain and resuse test cases.

## what are the data sources for DDT?

=> External files e.g. csv files
Test data can be stored in external files such as csv, excel, json, xml.
=> Data bases - Test data can be retrieved from data bases such as mysql.
=> Data provider - TestNG and JUnit provides data provider annotations to supply test data directly within the code.

* Using TestNG data provider
TestNG provides @dataProvider annotation to supply test data to test methods.
Each data provider method returns a 2D array of objects representing different test data sets.

@Test(dataProvider = "data Provider Method Name") to receive test data from Data Provider.

@Test(dataProvider = "dataProviderMethodName") to receive test data from Data Provider.

```java
package RestAssured;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataDriven {
	
	@DataProvider
	public Object[][] data() {
		return new Object[][]{
			
			{"p", "sdet"},
			{"q","SDET"},
			{"r", "SDET"},
			{"s","SDET"},
		};
		
	}
	
	@Test(dataProvider = "data")
	public void CreateAnUser(String name, String job) {
		JSONObject obj = new JSONObject();
		obj.put("name",name);
		obj.put("job", job);
		given().body(obj.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201).log().all();
	};

	@DataProvider
	public Object[][] newdata(){
		return new Object[][] {
			{"a","sdet",6},
			{"b","sdet",3},
			{"c","sdet",10},
			{"d","sdet",11}
			
		};
	}
	
	
	@Test(dataProvider = "newdata", enabled = true)
	public void update_user(String name, String job, int id) {
		JSONObject js = new JSONObject();
		js.put("name",name);
		js.put("job", job);
		
		given().body(js.toJSONString()).when()
		.put("https://reqres.in/api/users"+"/"+id)
		.then().statusCode(200).log().all();
		
		
	}
	
}

```