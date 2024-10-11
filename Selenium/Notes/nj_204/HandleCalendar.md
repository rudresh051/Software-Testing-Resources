```
package handleCalendar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCalendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		//driver.findElement(By.id("datepicker")).sendKeys("31/12/2025",Keys.ENTER);
	
		//2nd approach
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(3000);
		//datepicker will be visible
		
		WebElement actualmonth = driver.findElement(By.cssSelector(".ui-datepicker-month"));
		WebElement actualyear = driver.findElement(By.cssSelector(".ui-datepicker-year"));
		
		String monthtext = actualmonth.getText();
		String yeartext = actualyear.getText();
		
		// I've to start a loop
		// it will continue executing until the condition if failed
		
		
		while(!(monthtext.equals("December")&&yeartext.equals("2025"))) {	
			driver.findElement(By.cssSelector(".ui-datepicker-next")).click();
			
			monthtext = driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();
			yeartext = driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();
			
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@data-month='11']/a[.='31']")).click();
	}

}

```