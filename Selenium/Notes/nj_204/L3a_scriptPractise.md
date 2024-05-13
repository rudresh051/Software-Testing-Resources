# 1. ClickRadioButton.java
```package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromeDriver124-8May\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radio1 = driver.findElement(By.xpath("(//input[@name='radioButton'])[1]"));
		radio1.click();
		

	}

}
```

# 2. ClickCheckBox
```
package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickCheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rudre\\Downloads\\chromeDriver124-8May\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='option1']"));
		checkbox1.click();

	}

}

```

# 3. SendTextToBox.java
```
package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rudre\\Downloads\\chromeDriver124-8May\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement text1 = driver.findElement(By.cssSelector("input#autocomplete"));
		text1.sendKeys("Selenium learning is awesome");
		
		

	}
}
```

# 4. RedBusAction.java
```
package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromeDriver124-8May\\chromedriver-win64\\chromedriver.exe");
		
		// Call the driver
		WebDriver driver = new ChromeDriver();
		
		// Get the URL
		driver.get("https://www.redbus.in/");
		
		// Tell driver to find element
		WebElement clickRailTicketsIcon = driver.findElement(By.xpath("(//img[@title='Online Train Tickets Booking'])[1]"));
		clickRailTicketsIcon.click();
		
		WebElement clickPnrLink = driver.findElement(By.xpath("//p[text()='Check PNR Status']"));
		clickPnrLink.click();
		
	}

}
```

# 5. DEMOQA Website send Keys
```
package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQAWebsite4Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rudre\\Downloads\\chromeDriver124-8May\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		
		WebElement fullName = driver.findElement(By.cssSelector("input#userName"));
		fullName.sendKeys("Rudreshwar Jha");
		
		WebElement email = driver.findElement(By.cssSelector("input#userEmail"));
		email.sendKeys("qwertyasdfzxcv@gmail.com");
		
		WebElement currentAddress = driver.findElement(By.cssSelector("textarea#currentAddress"));
		currentAddress.sendKeys("Bengaluru");
		
		WebElement permanantAddress = driver.findElement(By.cssSelector("textarea#permanentAddress"));
		permanantAddress.sendKeys("Bihar");
		
		
	}

}

```