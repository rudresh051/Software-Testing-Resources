# REST Assured

* Dependency Added -

1. JSON Simple
2. Jsoup
3. JSON Path(Rest assured)
4. XML Path
5. JSON Schema validator
6. Rest Assured
7. TestNG


```HTML
<project xmlns="https://maven.apache.org/POM/4.0.0" xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>SDET</groupId>
  <artifactId>API_Testing_21Dec_2024</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <dependencies>
 <!-- https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple -->
 <dependency>
     <groupId>com.googlecode.json-simple</groupId>
     <artifactId>json-simple</artifactId>
     <version>1.1.1</version>
 </dependency>
 <!-- https://mvnrepository.com/artifact/org.jsoup/jsoup -->
 <dependency>
     <groupId>org.jsoup</groupId>
     <artifactId>jsoup</artifactId>
     <version>1.15.3</version>
 </dependency>
 <!-- https://mvnrepository.com/artifact/io.rest-assured/json-path -->
 <dependency>
     <groupId>io.rest-assured</groupId>
     <artifactId>json-path</artifactId>
     <version>5.3.0</version>
 </dependency>
 <!-- https://mvnrepository.com/artifact/io.rest-assured/xml-path -->
 <dependency>
     <groupId>io.rest-assured</groupId>
     <artifactId>xml-path</artifactId>
     <version>4.5.1</version>
 </dependency>
 <!-- https://mvnrepository.com/artifact/io.rest-assured/rest-assured -->
 <dependency>
     <groupId>io.rest-assured</groupId>
     <artifactId>rest-assured</artifactId>
     <version>4.5.1</version>
     <scope>test</scope>
 </dependency>
 <!-- https://mvnrepository.com/artifact/org.testng/testng -->
 <dependency>
     <groupId>org.testng</groupId>
     <artifactId>testng</artifactId>
     <version>7.7.1</version>
     <scope>test</scope>
 </dependency>
  </dependencies>
</project>

```

## Reqres API

```java
package RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class day1 {

 @Test
	public void setup() {
		
		Response URL = RestAssured.get("https://reqres.in/api/users");
		System.out.println(URL);
		int a = URL.statusCode();
		Assert.assertEquals(a, 200);
	}

}

```