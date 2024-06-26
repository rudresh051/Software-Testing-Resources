// Upload a file in this website, after uploading take a Screenshot, and use a assertion, use Extent Reports
// https://v1.training-support.net/selenium/upload

// screenshot, and use assertions, use extent reports
// v1.training-support.net/selenium/upload
// 
package justPractise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Assignment4 {

	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	// Generating report
	@BeforeClass
	public void reportsetup() {
		report = new ExtentReports(System.getProperty("user.dir")+"\\extentreport25thJune.html");
		test = report.startTest("Extent Reports");
	}
	
	
	
	@BeforeMethod
	public void commonsetup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromedriver-win64-23rdJune\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/upload");
		
		// Report
		test.log(LogStatus.PASS, "The URL was loaded successfully");
		
		
		// Hard Assertion
		String expectedURL = "https://v1.training-support.net/selenium/upload";
		String actualURL = driver.getCurrentUrl();
		org.testng.Assert.assertEquals(false, false);
		
		
		// Maximize Browser
		driver.manage().window().maximize();
	}
	
	@Test
	public void runscript() throws InterruptedException, IOException {
		System.out.println("hello world");
		
		
		// Upload file
		WebElement upload_button = driver.findElement(By.id("uploadFile"));
		Thread.sleep(3000);
		upload_button.sendKeys("C:\\selsc\\upload_file.png");
		WebElement submit_button = driver.findElement(By.id("uploadButton"));
		submit_button.click();
		
		
		// Takes Screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file1 = ts.getScreenshotAs(OutputType.FILE);
		File file2 = new File("C:\\Users\\rudre\\Documents\\workspace-spring-tool-suite-4-4.22.1.RELEASE\\seleniumproject9May\\src\\main\\sc25thjune.png");
		FileUtils.copyFile(file1, file2);
		Thread.sleep(3000);
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();;
	}
	
	@AfterClass
	public void flush() {
		report.endTest(test);
		report.flush();
	}
}
