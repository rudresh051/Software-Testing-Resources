package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromedriver122\\chromedriver-win64\\chromedriver.exe");
		// Open my chrome browser => Syntax
		WebDriver driver = new ChromeDriver();
		//Load the URL
		//driver.get("https://www.google.com/");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// To use locators
//		driver.findElement(By.className("ui-autocomplete-input")).sendKeys("abcdefghi ");
//		driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
//		driver.findElement(By.partialLinkText("Free Access")).click();

	}

}
