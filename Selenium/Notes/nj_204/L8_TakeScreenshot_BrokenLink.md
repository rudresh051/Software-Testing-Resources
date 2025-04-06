* Javascript Executor code
```
// JavaScript executor

package day4;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromeDriver124-8May\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		Step1 - Invoke the JavaScript executor
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		Step to click
		js.executeScript("document.getElementById('autocomplete').value='Rudreshwar Jha';");
		js.executeScript("document.getElementById('alertbtn').click();");
	}

}

```

# TakesScreenshot Script

```
package day4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromeDriver124-8May\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("checkBoxOption1")).click();
		// Steps to take screenshot
		// Step - 1 - Invoke TakesScreenshot interface and convert the driver instance to takesscreenhot
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		// Step2 - Use the method getScreenshotAs() - and convert it into file type.
		
		
		File file1 = ts.getScreenshotAs(OutputType.FILE);
		
		//Step 3 - We have to create a new file and specify the path of the file.
		
		// We do that by creating object of File class
		File file2 = new File("C:\\Users\\rudre\\OneDrive\\Pictures\\Screenshots\\image1.png");
		
		// Step 4 - copy the file from file1 to the file2
		
		FileUtils.copyFile(file1, file2);
	}
}
```

# Broken Links
**What are Broken Links?**  
• To start with, a link is an HTML object that enables users to migrate from one  
web page to another when they click on it. It is a means to navigate between  
different web pages on the internet.

• A broken link, also often called a dead link, is one that does not work i.e. does  
not redirect to the webpage it is meant to. This usually occurs because the  
website or particular web page is down or does not exist. When someone  
clicks on a broken link, an error message is displayed.  

**Common Reasons for Broken Links**   
* 404 Page Not Found — The destination web page has been removed by the
owner
* 400 Bad Request — The server cannot process the HTTP request triggered by
the link because the URL address requested is wrong
* Due to the user's firewall settings, the browser cannot access the destination
web page.
* The link is misspelt

## How to identify broken links in Selenium WebDriver

**Use the following steps to identify broken links in Selenium** 

1. Use `<a>` tag to fetch all the links present on a web page
2. Send HTTP request for the link
3. Verify the HTTP response code for the link
4. Determine if the link is valid or it is broken based on the HTTP response code
5. Repeat the process for all links captured with the first step.

// Finding all the available links on webpage

Link<WebElement> links = driver.findElements(By.tagName("a"));

```
// Finding broken links script

package day4;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromeDriver124-8May\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		// Step1 - Finding all the available links on webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		// Iterating each link and checking the response status
		for(WebElement link : links) {
			String url = link.getAttribute("href");
			verifyLink(url);
		}

	}

	private static void verifyLink(String url) {
		// TODO Auto-generated method stub
		try {
			// Creating an Object of URL class and passing the URL of each link inside the Constructor.
			URL link = new URL(url);
			
			// Converting our link to HTTPURLConnection and connecting with the server of the URL
			// This is happening in the Backend, this we can't see in our website
			HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
			httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
			httpURLConnection.connect(); // Http Request has been sent
			
			if(httpURLConnection.getResponseCode()==200) {
				System.out.println(url + " - " + httpURLConnection.getResponseMessage());
			}
			else {
				System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(url + " - " + "is a broken link");
		}
		
	}

}

```

## Finding Broken Images
Steps:
1. Find all `<img>` tags on the page.
2. Get the src attribute from each image.
3. Send an HTTP request to each src URL.
4. Check the HTTP response code — if it's >= 400, it's a broken image.


```
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenImagesChecker {
    public static void main(String[] args) {
        // Set the path to chromedriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com"); // Replace with the URL you want to test

        // Get all image elements
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total images found: " + images.size());

        for (WebElement img : images) {
            String imageUrl = img.getAttribute("src");

            if (imageUrl == null || imageUrl.isEmpty()) {
                System.out.println("⚠️ Image with empty src.");
                continue;
            }

            try {
                HttpURLConnection connection = (HttpURLConnection) (new URL(imageUrl).openConnection());
                connection.setRequestMethod("HEAD"); // Faster than GET
                connection.connect();
                int responseCode = connection.getResponseCode();

                if (responseCode >= 400) {
                    System.out.println("❌ Broken image: " + imageUrl + " -- Response Code: " + responseCode);
                } else {
                    System.out.println("✅ Valid image: " + imageUrl + " -- Response Code: " + responseCode);
                }

            } catch (IOException e) {
                System.out.println("⚠️ Error checking image: " + imageUrl + " -- " + e.getMessage());
            }
        }

        driver.quit();
    }
}
```


