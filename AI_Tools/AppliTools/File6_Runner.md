# Runner

```java
import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.Rectangle;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.EyesRunner;
import com.applitools.eyes.TestResultsSummary;
import com.applitools.eyes.config.Configuration;
import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.fluent.Target;

public class TestCase {
    static WebDriver driver;
    static BatchInfo myBatch;
    static Configuration suiteConfig;
	static EyesRunner testRunner;

    Eyes eyes;

    @BeforeAll
    public static void beforeAll() {
//    	WebDriverManager.chromedriver().setup();
//    	driver = new ChromeDriver();
    	myBatch = new BatchInfo("My First Batch");
    	driver = WebDriverManager.chromedriver().create();
    	
    	// Scale Configuration for multiple files
    	suiteConfig = new Configuration();
    	suiteConfig.setApiKey(System.getenv("APPLITOOLS_API_KEY"));
    	suiteConfig.setBatch(myBatch);
    	
    	// Runner
    	testRunner = new ClassicRunner();
    }
    
    @BeforeEach
    public void beforeEach(TestInfo testInfo) {
    	eyes = new Eyes(testRunner);
    	eyes.setConfiguration(suiteConfig);
    	
    	eyes.open(
    		    driver,
    		    "My First Tests",  // App name
    		    testInfo.getTestMethod().get().getName(),
    		    new com.applitools.eyes.RectangleSize(1000, 600)  // Correct way to set window size
//    		    new RectangleSize(width:1000, height:600)
    			);

    }
    
    @Test
    public void myTestCase() {
        driver.get("https://applitools.com/helloworld/?diff1");
//        WebElement numbers = driver.findElement(By.cssSelector("span.primary"));
//        WebElement button = driver.findElement(By.cssSelector("div.section:nth-child(3) > button:nth-child(1)"));
//        WebElement titleH = driver.findElement(By.cssSelector("div.fancy:nth-child(1) > span:nth-child(1)"));
//        WebElement titleD = driver.findElement(By.cssSelector("div.fancy:nth-child(1) > span:nth-child(11)"));
//
//        Assertions.assertEquals(numbers.isDisplayed(), true);
//        Assertions.assertEquals(numbers.getText(), "123456");
//        Assertions.assertEquals(numbers.getCssValue("color"), "rgba(78, 90, 99, 1)");
//
//        Assertions.assertEquals(button.isDisplayed(), true);
//        Assertions.assertEquals(button.getText(), "Click me!");
//        Assertions.assertEquals(button.getCssValue("color"), "rgba(255, 255, 255, 1)");
//
//        Assertions.assertEquals(titleH.isDisplayed(), true);
//        Assertions.assertEquals(titleH.getText(), "H");
//        Assertions.assertEquals(titleH.getCssValue("color"), "rgba(255, 0, 0, 1)");
//
//        Assertions.assertEquals(titleD.isDisplayed(), true);
//        Assertions.assertEquals(titleD.getText(), "D");
//        Assertions.assertEquals(titleD.getCssValue("color"), "rgba(70, 0, 255, 1)");
        eyes.check(Target.window());
    }

    @Test
    public void exampleTestCase() {
    	driver.get("https://example.com");
    	eyes.check(Target.window());
    }
    
    
    @AfterEach
    public void afterEach() {
    	eyes.closeAsync();
    }
    @AfterAll
    public static void afterAll() {
    	driver.close();

        // Runner
    	TestResultsSummary results = testRunner.getAllTestResults();
    	System.out.println(results);
    }
}
```