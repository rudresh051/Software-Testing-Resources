# Why do we need waits?
Synchronization issue — When the Script execution speed doesn't match with
the browser speed.

# Wait Commands
What are Wait commands in Selenium?
The wait commands are essential when it comes to executing Selenium tests. They help to  
observe and troubleshoot issues that may occur due to variation in time lag  
While running Selenium tests, it is common for testers to get the message "Element Not  
Visible Exception'. This appears when a particular web element with which has to  
interact, is delayed in its loading. To prevent this Exception, Selenium Wait Commands must  
be used.  

In automation testing, Selenium Uebdtiygc wait commands direct test execution to pause  
for a certain length of time before moving onto the next step. This enables UeÄQÄgrto  
check if one or more web elements are present/visible/enriched/clickable, etc when  
identifying certain elements. If an element is not located, then the  
appears. Selenium Wait commands help resolve this  
issue.  
Important point — When the element is actually but there is a browser  
delay issue.

# Implicit Wait in Selenium
Implicit Wait directs the Selenium to wait for a certain measure of time before  
throwing an exception. Once this time is set, will wait for the element before the  
exception occurs.  
It sets a global wait for a certain amount of time for the entire script. Selenium will wait for a  
specified amount of time before throwing a if an element is not  
present  
Once the command is run, Implicit Wait remains forthe entire duration for which the browser  
is open. default setting is 0, and the specific wait time needs to be set by the following  
protocol.  
Implicit Wait Syntax  

```
ImplicitWaitTest

package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromeDriver124-8May\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		Thread.sleep(10000);
//      Thread.sleep(10000) will definately wait for 10 seconds irrespective of whether u are getting the element or not.
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		driver.findElement(By.cssSelector("input[placeholder='Type to Select Countries']")).sendKeys("some country");
		driver.findElement(By.cssSelector("input[placeholder='Type to ']")).sendKeys("some country");
		driver.findElement(By.xpath("//a[@href='https://rahulshettyacademy.com/documents-request']")).click();

	}

}

```

# Explicit wait
**Explicit Wait in Selenium**  

By using the Explicit Wait command, the WebDriver is directed to wait until a **certain  
condition occurs** before proceeding with executing the code. 

Setting Explicit Wait is important in cases where there are certaih elements that  
naturally take more time to load. If one sets an implicit wait command, then the  
browser will wait for the same time frame before loading **every web element**. This  
causes an unnecessary delay in executing the test script.  

Explicit wait is more intelligent, but can only be applied for specified elements.    
However, it is an improvement on implicit wait since it allows the program to pause
for dynamically loaded Ajax elements.  
In order to declare explicit wait, one has to use ExpectedConditions. The following  
**Expected Conditions** can be used in Explicit Wait.  
1. alertIsPresent()
2. elementSelectionStateToBe()
3. elementToBeClickable()
4. elementToBeSelected()
5. frameToBeAvailableAndSwitchToIt()
6. invisibilityOfTheElementLocated()
7. invisibilityOfElementWithText()
8. presenceOfAllElementsLocated()
9. presenceOfElementLocated()
10. textToBePresentInElement()
11. textToBePresentInElementLocated()
12. textToBePresentInElementValue()
13. titles()
14. titleContains()
15. visibilityOf()
16. visibilityOfAllElements()
17. visibilityOfAllElementsLocatedBy()
18. visibilityOfElementLocated()

* Syntax
WebDriverWait wait = new WebDriverWait(driver,30);

```
ExplicitWaitTest.java

package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromeDriver124-8May\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Step1 - Create object of WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.ebay.com/");
		
		
		// Step2 - Make use of until method and expected conditions
		// Step3 - We will mention the condition in ExpectedConditions
		wait.until(ExpectedConditions.urlToBe("https://www.ebay.com/"));
		
		// What happens in the above line?
		// It will compare the mentioned to the URL that is loaded inside the browser.
		// If the URL matches then it will not make it wait, it will allow the execution smoothly.
		// What if the URL is wrong? It will make it wait for specified time and then throw the Exception.
		
		
		driver.manage().window().maximize();
		// Creating an object of Actions class.
		
		Actions act = new Actions(driver);
		WebElement electronics_link = driver.findElement(By.linkText("Electronics"));
		electronics_link.click();
				
	}

}


```
 