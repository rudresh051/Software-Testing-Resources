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