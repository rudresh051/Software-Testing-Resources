# How to upload file in selenium
File upload is performed when there is a need of uploading any file or a document on  
a specific website such as forms, registration pages, document upLQ@Aers, etc.  

Uploading a file process includes browsing a file from the desired location or from  
your computer and uploading it to the website  

`WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));`


// enter the file path onto the file-selection input field

uploadElement.sendKeys("C:\\newhtml.html");

// click the "UploadFile" button

driver.findElement(By.name("send")).click()

**Remember following two things when uploading files in WebDriver**


```
// UploadFileTest

package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromeDriver124-8May\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		
		// Step 1 - Store the locator of the upload web element.
		WebElement upload_button = driver.findElement(By.id("uploadfile_0"));
		
		// Step 2 - Use sendkeys to send the file path of the uploading file.(Without performing click)		
		upload_button.sendKeys("C:\\Users\\rudre\\OneDrive\\Documents\\screenshot.png");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		

	}

}


```