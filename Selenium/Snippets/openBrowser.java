package Day1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Mention the driver and it's path
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromedriver122\\chromedriver-win64\\chromedriver.exe");
		// Open my chrome browser => Syntax
		WebDriver driver = new ChromeDriver();
		//Load the URL
		//driver.get("https://www.google.com/");
		driver.get("https://the-internet.herokuapp.com/login");
		// To use locators
		//WebElement username = driver.findElement(By.id("username"));
//		WebElement username = driver.findElement(By.className("username"));
//		username.sendKeys("some value");
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("asdflkj");
//		driver.findElement(By.cssSelector("#username")).sendKeys("asdflkj");
	}

}
