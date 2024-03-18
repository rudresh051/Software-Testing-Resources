```
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chromeDriver;

public class First{
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Lauch website
        driver.navigate().to("http://www.google.com/");

        // Click on the search text box and send value
        driver.findElement(By.id("lst-ib")).sendKeys("masai school");  

        // Click on the search button
        driver.findElement(By.name("btnK")).click();
    }
}
```