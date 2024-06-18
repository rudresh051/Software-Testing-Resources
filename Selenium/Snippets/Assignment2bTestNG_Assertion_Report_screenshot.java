// Implement switch tab to the following URL
// https://v1.training-support.net/selenium/tab-opener
// After switching to the first window, click on the button and try to 
// switch to third window as well and refresh the webpage in the third window
// and close all the tabs at the end.
// Implement this using TestNG and add assertions, Extent Report, add Screenshot to each
// window.


package justPractise;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Assignment2a {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	@BeforeClass
	public void reportsetup() {
		report = new ExtentReports(System.getProperty("user.dir")+"\\extentreportrahultests19thJunea.html");
		test = report.startTest("Extent Reports demo");
	}
	
	
	@BeforeMethod(alwaysRun = true)
	public void commonsetup() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromedriver-win64-12June\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		// Report
		test.log(LogStatus.PASS, "The chrome browser opened successfully");
		driver.get("https://v1.training-support.net/selenium/tab-opener");
		test.log(LogStatus.PASS,"The URL was loaded successfully");
		driver.manage().window().maximize();
		
		
		// Take Screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file1 = ts.getScreenshotAs(OutputType.FILE);
		File file2 = new File("C:\\SelScreenshots\\19JuneS1.png");
		FileUtils.copyFile(file1, file2);
		
		//Assertion
		String expected_url = "https://v1.training-support.net/selenium/tab-opener";
		String actual_url = driver.getCurrentUrl();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(expected_url, actual_url);
		
		
		driver.findElement(By.id("launcher")).click();
		Thread.sleep(2000);
		sa.assertAll();
	}
	
	@Test
	public void switchTabTest() throws InterruptedException {
		
		// Step 1 - Switch the control from parent window to child window
		String child_tab1 = "https://v1.training-support.net/selenium/newtab";
		String child_tab2 = "https://v1.training-support.net/selenium/newtab2";
		String parent_tab = driver.getWindowHandle();
		
		Set<String> all_tab_ids = driver.getWindowHandles();
//		System.out.println(all_tab_ids);
//		System.out.println(parent_tab);
		
		
		// Switching to 2nd tab
		for (String var1 : all_tab_ids) {
//			System.out.println(var1);
			driver.switchTo().window(var1);
			if (driver.getCurrentUrl().contains(child_tab1)) {
//				System.out.println(driver.getCurrentUrl() + " " + var1);
//				System.out.println(driver.getCurrentUrl().contains(child_tab1));
				break;
			}
			
		}
		driver.findElement(By.id("actionButton")).click();
		
		// Close the first child tab
		driver.close();
		
		// Switching to third tab
		Set<String> all_tab_ids1 = driver.getWindowHandles();
		for (String var2 : all_tab_ids1) {
			driver.switchTo().window(var2);
			if(driver.getCurrentUrl().contains(child_tab2)) {
//				System.out.println(driver.getCurrentUrl().contains(child_tab2));
				break;
			}
		}
		
		Thread.sleep(2000);
		driver.navigate().refresh(); // Thread.sleep(2000) is added to so that refresh is visible to the user.
		Thread.sleep(2000);
		
		// Close the 2nd child tab
		driver.close();

	}
	
	@AfterMethod
	public void teardown() {
		// Close the parent tab
		driver.quit();
	}
	
	@AfterClass
	public void flush() {
		report.endTest(test);
		report.flush();
	}
}

