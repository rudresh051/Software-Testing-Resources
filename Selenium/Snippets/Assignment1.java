// Implement Data driven using data provider with at least 10 data
// for the form in this url
// https://v1.training-support.net/selenium/simple-form


package justPractise;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment1 {
	
	WebDriver driver;
	Assignment1ExtractData get;
	
	@org.testng.annotations.DataProvider(name="getdata")
	public Object[][] getdata() throws EncryptedDocumentException, IOException{
		get = new Assignment1ExtractData();
		Object[][] data = get.getdatafromexcel();
		return data;
		
	}
	
	
	@BeforeMethod
	public void commonSetup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromedriver-win64-12June\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/simple-form");
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider = "getdata")
	public void formTest(String fname, String lname, String emailid, String mobile, String message) throws InterruptedException {
		WebElement firstname = driver.findElement(By.id("firstName"));
		WebElement lastname = driver.findElement(By.id("lastName"));
		WebElement emailid1 = driver.findElement(By.id("email"));
		WebElement number = driver.findElement(By.id("number"));
		WebElement message1 = driver.findElement(By.tagName("textarea"));
		
		Thread.sleep(2000);
		
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		emailid1.sendKeys(emailid);
		number.sendKeys(mobile);
		message1.sendKeys(message);
		
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
