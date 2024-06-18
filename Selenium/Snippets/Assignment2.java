// Implement switch tab to the following URL
// https://v1.training-support.net/selenium/tab-opener
// After switching to the first window, click on the button and try to 
// switch to third window as well and refresh the webpage in the third window
// and close all the tabs at the end.
// Implement this using TestNG and add assertions, Extent Report, add Screenshot to each
// window.

package justPractise;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromedriver-win64-12June\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/tab-opener");
		driver.findElement(By.id("launcher")).click();
		Thread.sleep(3000);
		// Step 1 - Switch the control from parent window to child window
		String child_tab1 = "https://v1.training-support.net/selenium/newtab";
		String parent_tab = driver.getWindowHandle();
		
		Set<String> all_tab_ids = driver.getWindowHandles();
		System.out.println(all_tab_ids);
		
//		System.out.println(parent_tab);
		
		for (String var1 : all_tab_ids) {
			System.out.println(var1);
			driver.switchTo().window(var1);
			if (driver.getCurrentUrl().contains(child_tab1)) {
				break;
			}
			
		}
		driver.findElement(By.id("actionButton")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
