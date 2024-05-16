# Mouse hover
```
Mouse hover in Ebay Website - 
package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromeDriver124-8May\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		// Creating an object of Actions class
		Actions act = new Actions(driver);
		
		WebElement electronicslink = driver.findElement(By.linkText("Electronics"));
		WebElement motorsLink = driver.findElement(By.linkText("Motors"));
		
		// Whenever we are using Actions class, we have to use .build().perform.
		act.moveToElement(electronicslink).build().perform();
		Thread.sleep(2000);
		act.moveToElement(motorsLink).build().perform();
	}

}

```

# Right Click

```
package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromeDriver124-8May\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		
		//ContextClick() is a method in Actions class for Right click operation.
		// build().perform() is mandatory for actions methods.
		act.contextClick(right_click).build().perform();

	}

}
```

# Double Click
```
package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("we bdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromeDriver124-8May\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		
		Actions act = new Actions(driver);
		act.doubleClick(doubleClick).build().perform();
	}

}

```

# Handling Pop-ups
```
Alert with 5 seconds wait
package day3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest5Seconds {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromeDriver124-8May\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("timerAlertButton")).click();
		
		//to handle Pop up - First we have to Switch to the Pop up.
		Thread.sleep(5000);
		Alert alert_popup = driver.switchTo().alert();
		Thread.sleep(2000);
		alert_popup.accept();

	}

}

```
# Frames
What are Frames in Selenium?
The term "frames" in Selenium refers to segmenting an HTML document into several  
portions, each of which can contain a separate HTML document. These frames are  
also referred to as (inline frames). Frames are frequently used when a web  
page has numerous sections or pages that must be displayed simultaneously or  
interacted with independently.  


We must first identify the frame to handle frames in selenium using  
commands. This can be done in three ways index, by name or id, and by web  
elements. Selenium yygÄQOyer has a few simple steps to handle frames:  
* Switch the drivers focus to the frame using the method.  
* Using web driver interact with the elements of the frame and
perform the operations.  
* Switch back to the web content by the method  

1. By Index
```
package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromeDriver124-8May\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/iframes");
		
		driver.manage().window().maximize();
		
		// Step 1 => Switch the control from webpage to frame.
		Thread.sleep(2000);
		// 1st method - We passed the index
//		driver.switchTo().frame(0);
		
		// 2nd Method 
		WebElement frame = driver.findElement(By.xpath("//iframe[@src='/selenium/frame1']"));
		driver.switchTo().frame(frame);
		
		
		
		// Inside frame - after switching
		WebElement frame_ele = driver.findElement(By.id("actionButton"));
		frame_ele.click();
		
	}

}

```

2. 
```
Frame Test 2 - 

package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromeDriver124-8May\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/iframes");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// Now let's switch to frame
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='/selenium/frame2']"));
		driver.switchTo().frame(frame2);
		
		WebElement frame_ele = driver.findElement(By.id("actionButton"));
		frame_ele.click();
	}

}
```

FrameTest3
```
package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromeDriver124-8May\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// First let's switch to frame by finding the id
		// We will switch using the method using the frame name
		driver.switchTo().frame("SingleFrame");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Rudreshwar Jha");

	}

}

```
3. Nested Frames

```
package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rudre\\Downloads\\chromeDriver124-8May\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
//		Step1 - Switch the control form webpage to outer frame
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);
		
//		Step2 - Switch to the inner frame
		WebElement innerframe = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));
		driver.switchTo().frame(innerframe);
		
//		Step3 - SendKeys
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
		
//		Step4 - Now again switch back to outer frame
//		It will back to outer layer
//		It is the nature of default method.
		driver.switchTo().defaultContent();
//		Step5 - Switch to Main webpage
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='WebTable.html']")).click();
		

	}

}

```

# Working with windows and tabs
### Get window handle
WebDriver does not make the distinction between windows and tabs. If your site opens a new tab or window, Selenium will let you work with it using a window handle. Each window has a unique identifier which remains persistent in a single session. You can get the window handle of the current window by using: 
`driver.getWindowHandle()`