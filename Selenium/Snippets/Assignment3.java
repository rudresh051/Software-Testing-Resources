// Implement handle dropdowns and select atleast 3 options in
// each dropdown. Use Junit to Implement these dropdowns
// v1.training-support.net/selenium/selects
package justPractise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {
	
	WebDriver driver;
	
	@Before
	public void commonsetup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromedriver-win64-23rdJune\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/selects");
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void selecttest() throws InterruptedException {
//		System.out.println("helloworld");
		 WebElement dropdown1 = driver.findElement(By.id("single-select"));
		 Select sel1 = new Select(dropdown1);
		 sel1.selectByIndex(1);
		 Thread.sleep(1000);
		 
		 WebElement dropdown2 = driver.findElement(By.id("multi-select"));
		 Select sel2 = new Select(dropdown2);
		 
		 //  Select by Index method
		 for(int i=0;i<=2;i++) {
			 sel2.selectByIndex(i);
			 Thread.sleep(2000);
		 }
		 
		 
		// Select by value method
		sel1.selectByValue("2");
		Thread.sleep(2000);
		sel2.selectByValue("design");
		sel2.selectByValue("ember");
		sel2.selectByValue("html");
		
		// Select by visible method
		sel1.selectByVisibleText("Option 3");
		Thread.sleep(2000);
		sel2.selectByVisibleText("Information Architecture");
		sel2.selectByVisibleText("Javascript");
		sel2.selectByVisibleText("Mechanical Engineering");
	}
	
	@After
	public void teardown() {
		driver.close();
	}
}
