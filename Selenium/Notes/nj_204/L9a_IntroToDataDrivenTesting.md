# Introduction to Data-driven testing using Apache POI and Implementation

Data-driven testing in Selenium using Apache POI involves reading test data from  
external Excel files, enhancing test robustness and flexibility by separating data from  
the test scripts.  

Data-driven testing using Apache POI (Poor Obfuscation Implementation) in Java  
Selenium allows you to read test data from external sources like Excel files.  

Add Apache POI dependencies:
Include the Apache POI dependencies in your project.
You cann add these dependencies to your Maven pom.xml

For Maven:

# Junit - Installation steps -
1. Add junit dependency into your pom.xml file

## Who uses Junit?
Developers writing unit test cases will make use of Junit to write and Execute Unit Test cases.   
Also Test engineers make use of Junit To write Test Scripts
It is used to run multiple scripts at once.

# What is Junit?
Junit is Unit testing framework available in Java.

```
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>company9May</groupId>
  <artifactId>seleniumproject9May</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  
  <dependencies>
	<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
	<dependency>
	    <groupId>org.seleniumhq.selenium</groupId>
	    <artifactId>selenium-java</artifactId>
	    <version>4.20.0</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
	<dependency>
	    <groupId>commons-io</groupId>
	    <artifactId>commons-io</artifactId>
	    <version>2.11.0</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/junit/junit -->
	<dependency>
	    <groupId>junit</groupId>
	    <artifactId>junit</artifactId>
	    <version>4.13.2</version>
	    <scope>test</scope>
	</dependency>
  </dependencies>
  
</project>
```
