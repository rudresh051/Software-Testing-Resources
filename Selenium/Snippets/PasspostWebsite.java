package openWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenPassportOfficialWebsite {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromeDriver124-8May\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.passportindia.gov.in/AppOnlineProject/welcomeLink");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement PopUpCloseButton = driver.findElement(By.cssSelector("a.twoyears-close-btn"));
		PopUpCloseButton.click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
