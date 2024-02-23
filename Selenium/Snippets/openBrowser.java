package Day1;

public class OpenBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Mention the driver and it's path
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromedriver122\\chromedriver-win64\\chromedriver.exe");
		// Open my chrome browser => Syntax
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		// To use locators
		//WebElement username = driver.findElement(By.id("username"));
		WebElement username = driver.findElement(By.className("username"));
		username.sendKeys("some value");
		
	}

}
