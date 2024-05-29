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

```
<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi</artifactId>
    <version>5.2.5</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>5.2.5</version>
</dependency>
```

Components - 
1. External Excel file.
2. Apache POI jars
3. Test Script - java Selenium script  



###
DataDrivenTest.java

```
package day5;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DataDrivenTest {

WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rudre\\Downloads\\chromeDriver124-8May\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
	}
	
	
	@org.testng.annotations.Test
	public void logintest() throws EncryptedDocumentException, IOException {
		
		// Declaring locators
		WebElement username = driver.findElement(By.cssSelector("#username"));
		WebElement password = driver.findElement(By.cssSelector("input#password"));
		
		
		// Connected my excel file with my Test script.
		// Reading My Excel file. Create an object of FileInputStream.
		FileInputStream fis = new FileInputStream("C:\\Users\\rudre\\Documents\\workspace-spring-tool-suite-4-4.22.1.RELEASE\\seleniumproject9May\\src\\main\\resources\\TestData.xlsx");
		
		// Next step - We have to use Apache POI method WorkbookFactory class(Apache POI)
		// creating a workbook - Technical term for excel file.
//		org.apache.poi.ss.usermodel.Workbook book = WorkbookFactory.create(fis);
		Workbook book = WorkbookFactory.create(fis);
		
		// We have to mention the sheet name from the workbook variable.
		Sheet sh = book.getSheet("Sheet1");
		
		// Mention the row that you want to read from the sheet instance.
		Row row = sh.getRow(1); // Why 1? that is where the data is 
		
		// mention the Cell by mentioning column
		Cell cell = row.getCell(0);
		
		// Now get the cell value for username and password
		String usernamevalue = cell.getStringCellValue();
		String passwordvalue = sh.getRow(1).getCell(1).getStringCellValue();
		
//		System.out.println("Username is" +usernamevalue);
//		System.out.println("password is" + passwordvalue);
		
		// I have to enter these values inside my username and password text fields in browser
		username.sendKeys(usernamevalue);
		password.sendKeys(passwordvalue);
		
		
		// close the workbook after opening
		book.close();
		
		
	}
	
	
}

```

```
package day6;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrivenTest1 {

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rudre\\Downloads\\chromeDriver124-8May\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
	}
	
	@Test
	public void logintest() throws EncryptedDocumentException, IOException {
		WebElement username = driver.findElement(By.cssSelector("#username"));
		WebElement password = driver.findElement(By.cssSelector("input#password"));
		
		FileInputStream fis = new FileInputStream("C:\\Users\\rudre\\Documents\\workspace-spring-tool-suite-4-4.22.1.RELEASE\\seleniumproject9May\\src\\main\\resources\\testdata.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sh = book.getSheet("Sheet1");
		
		String usernamevalue = sh.getRow(1).getCell(0).getStringCellValue();
		String passwordvalue = sh.getRow(1).getCell(1).getStringCellValue();
		
		
		username.sendKeys(usernamevalue);
		password.sendKeys(passwordvalue);
		
		book.close();
		
	}
}
```

# Data Providers

What are DataProviders in TestNG?  

The DataProviders in TestNG are another way to pass the parameters in the test function,  
the other one being TestNG parameters. DataProviders pass different values to the TestNG  
Test Case in a single execution and in the form of TestNG Annotations.  

It is a part of the inbuilt TestNG data-driven testing for which TestNG is quite popular DataProviders help in    
passing the parameters in different ways.
DataProvider 

## Syntax:
```
The TestNG DataProvider is used in the following manner

@DataProvider (name="name_of_dataprovider")
public Object[][] dpMethod(){
	return new Object [][]{ value }
}
```

## How DataProvider works
Data Provider is an annotation available in TestNg  
It allows testers to execute a single test method with multiple sets of data.  
We have to write the test method only once and mention the Data provider.

This will execute the test method multiple times with multiple sets of data provided.

* Steps to Implement Data Provider :
Step 1 : Create 2 Dimensional Object array and mention the size of it wrt rows and
column size of your Excel sheet.  

Get the row and column size by using the predefined methods in Xls_reader class.  

Step 2 : Create 2 for loops (1 for Rows and 1 for Columns) and get the cell value and
Store it in a 2d array.
Step 3 : Return the Object array

### DataExtract.java
```
package day6;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataExtract {
	
	// In this class we are getting the data from excel and storing it all into
	// a 2 Dimensional object array
	
	public Object[][] getdatafromexcel() throws EncryptedDocumentException, IOException{
		// Reading our Excel File through FileInputStream
		FileInputStream fis = new FileInputStream("C:\\Users\\rudre\\Documents\\workspace-spring-tool-suite-4-4.22.1.RELEASE\\seleniumproject9May\\src\\main\\resources\\TestData1.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		
		// next step is get last row number and last column number
		short cellsize = sh.getRow(0).getLastCellNum();
		int rowcount = sh.getLastRowNum();
		
		
		// Next step - Create/Define a 2 dimensional Object array.
		Object[][] obj = new Object[rowcount][cellsize];
		
		// Here 2 loops are used so that first we keep the row value same and iterate over
		// columns and do the same for all the rows
		
		for(int i=0; i<rowcount;i++) {
			for(int j=0; j<cellsize;j++) {
				obj[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		return obj;
		
	}
}

```