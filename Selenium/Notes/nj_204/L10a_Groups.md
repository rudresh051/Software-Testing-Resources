# Groups
TestNG Groups with Example  

We use groups in Testing when,
* We don't want to define test methods separately in different classes(depending upon functionality) and  
* At the same time want to ignore (not execute). Some test cases as if they do not exist in the code.
* So to carry out this we have to Group them. This is done by using the "include" and "exclude" mechanisms supported in TestNG

In the example below, we have shown the syntax of how to use groups in the XML file.

```
@Test (groups = {"smoke"})
```

* TestngGroupsFeatures
```
package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngFeaturesTest {
	
	WebDriver driver;
	
	@BeforeTest(alwaysRun = true)
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromeDriver124-8May\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	}

	
	@Test(groups="smoke")
	public void textboxTest() {
		WebElement option1 = driver.findElement(By.cssSelector("input[name='checkBoxOption1']"));
		option1.click();
		WebElement textbox1 = driver.findElement(By.id("autocomplete"));
		textbox1.sendKeys("Hello Selenium");
	}
	
	@Test(groups= "smoke")
	public void SendKeysTest() {
		WebElement textbox = driver.findElement(By.id("autocomplete"));
		textbox.sendKeys("Rudra is tester of the day");
	}
	
	 @Test(groups="sanity")
	 public void dropdownTest() throws InterruptedException {
		 WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		 
		 Select sel = new Select(dropdown);
		 for(int i=0; i<=3;i++) {
			 sel.selectByIndex(i);
			 Thread.sleep(1000);
		 }
	 }
	
	 @Test(groups="Regression")
	 public void checkboxTest() {
		 List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		 
		 for(WebElement check:checkboxes) {
			 check.click();
		 }
		 
	 }
	
	
	@AfterTest(alwaysRun = true)
	public void last() {
		driver.close();
	}
	
}

```

* smoketestng.xml

```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test name="Test">
	<groups>
		<run>
			<include name="Regression"></include>
		</run>
	</groups>
    <classes>
      <class name="day6.TestngFeaturesTest"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->

```