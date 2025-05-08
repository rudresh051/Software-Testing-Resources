# Utilities
In a **Selenium framework**, **utilities** (or utility classes) are helper classes or components that contain **common reusable functions** used across your test automation codebase. These are not tied to any specific test case but serve as **support functions** to simplify and modularize the framework.

---

### 🔧 Common Types of Utilities in a Selenium Framework

| Utility Name                   | Purpose                                                                                                                  |
| ------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| **DriverUtility**              | Handles browser initialization, launching, quitting, etc.                                                                |
| **WaitUtility**                | Manages explicit waits (e.g., waiting for elements to be clickable, visible).                                            |
| **ElementUtility**             | Provides wrappers for common element operations like `click`, `sendKeys`, `getText` with logging and exception handling. |
| **ExcelUtility / FileUtility** | Reads from or writes to Excel, CSV, JSON, or properties files. Useful for data-driven testing.                           |
| **ScreenshotUtility**          | Captures screenshots on test failure or at any test step.                                                                |
| **LoggerUtility**              | Manages logging using log4j or another logging framework.                                                                |
| **ConfigUtility**              | Reads configuration values from `.properties` or `.yaml` files.                                                          |
| **AssertionUtility**           | Provides custom assertion wrappers for better reporting.                                                                 |
| **DateUtility**                | Handles date and time formatting, manipulation, and comparison.                                                          |

---

### ✅ Example: WaitUtility in Java (using Selenium)

```java
public class WaitUtility {
    WebDriver driver;

    public WaitUtility(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement waitForElementToBeVisible(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
```

You can then use this in your test class like:

```java
WaitUtility waitUtil = new WaitUtility(driver);
WebElement loginBtn = waitUtil.waitForElementToBeVisible(By.id("loginButton"), 10);
```

---

### Why Use Utilities?

* Avoids **code duplication**
* Makes test code **clean and readable**
* Centralizes logic for **easy maintenance**
* Increases **reusability and modularity**

## Driver Utility

A **Driver Utility** (or `DriverManager`) in a Selenium framework is a class responsible for managing the **WebDriver instance** — creating it, returning it when needed, and closing it after use. It ensures your test classes don’t deal with the setup/teardown of drivers directly, following the **Single Responsibility** and **DRY** principles.

---

### ✅ Typical Responsibilities of a Driver Utility:

1. **Initialize browser drivers (Chrome, Firefox, etc.)**
2. **Load browser configurations** (e.g., headless mode, window size)
3. **Return a single WebDriver instance** (singleton pattern)
4. **Close or quit the driver** properly
5. **Support cross-browser testing**

---

### 🔧 Example: `DriverUtility` in Java (Selenium with TestNG)

```java
public class DriverUtility {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            String browser = ConfigUtility.getProperty("browser"); // e.g., chrome, firefox

            switch (browser.toLowerCase()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
                    throw new RuntimeException("Unsupported browser: " + browser);
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
```

---

### 🔁 Usage in Test Classes:

```java
public class LoginTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = DriverUtility.getDriver();
        driver.get("https://www.amazon.com");
    }

    @AfterMethod
    public void tearDown() {
        DriverUtility.quitDriver();
    }

    @Test
    public void testTitle() {
        Assert.assertEquals(driver.getTitle(), "Amazon.com");
    }
}
```


