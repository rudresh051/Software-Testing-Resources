package Day1;

public class OpenBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Mention the driver and it's path
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromedriver122\\chromedriver-win64\\chromedriver.exe");
		// Open my chrome browser => Syntax
		WebDriver driver = new ChromeDriver();
		
	}

}
