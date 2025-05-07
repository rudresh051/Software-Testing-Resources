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
