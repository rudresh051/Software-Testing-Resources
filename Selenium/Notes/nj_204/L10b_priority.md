# Priority
* What Is Prioritisation In TestNG?

Prioritisation in TestNG is a way to provide a sequence to the methods so that they do not  
run out of order. Since alphabetically running test cases in TestNG have no logical sequence  
(conceming the tests and code), providing priority to these test cases helps us our
tests' execution.
Priority in TestNG test cases is a parameter with attribute value as "priority".
How to give Priority in TestNG test?
The following is the syntax for allocating a priority to a test case method.

* testngpriority.java

```
package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngPriority {
WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromeDriver124-8May\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	}

	
	@Test(priority = 1)
	public void textboxTest() {
		WebElement option1 = driver.findElement(By.cssSelector("input[name='checkBoxOption1']"));
		option1.click();
		WebElement textbox1 = driver.findElement(By.id("autocomplete"));
		textbox1.sendKeys("Hello Selenium");
	}
	
	@Test(priority = 2)
	public void SendKeysTest() {
		WebElement textbox = driver.findElement(By.id("autocomplete"));
		textbox.sendKeys("Rudra is tester of the day");
	}
	
	 @Test(priority = 3)
	 public void dropdownTest() throws InterruptedException {
		 WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		 
		 Select sel = new Select(dropdown);
		 for(int i=0; i<=3;i++) {
			 sel.selectByIndex(i);
			 Thread.sleep(1000);
		 }
	 }
	
	 @Test(priority = 4)
	 public void checkboxTest() {
		 List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		 
		 for(WebElement check:checkboxes) {
			 check.click();
		 }
		 
	 }
	
	
	@AfterMethod(alwaysRun = true)
	public void last() {
		driver.close();
	}
	
}

```