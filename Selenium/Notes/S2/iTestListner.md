In TestNG, an **ItestListener** is an interface that allows you to listen to and act upon various events that occur during the execution of test methods. By implementing this interface, you can customize the behavior of your test framework based on the lifecycle of tests, such as when they start, succeed, fail, or are skipped.

### Key Methods in `ItestListener` Interface

Here are some of the key methods provided by the `ItestListener` interface:

1. **`onTestStart(ITestResult result)`**: This method is invoked when a test method starts. You can use this to perform any setup or logging before the test begins.

2. **`onTestSuccess(ITestResult result)`**: This method is called when a test method successfully completes. You can use it to log success information or perform post-test actions.

3. **`onTestFailure(ITestResult result)`**: This method is triggered when a test method fails. It is commonly used for capturing screenshots, logging errors, or performing cleanup actions.

4. **`onTestSkipped(ITestResult result)`**: This method is called when a test method is skipped, usually due to a dependency on another test that failed. You can use this method to log the reason for skipping.

5. **`onTestFailedButWithinSuccessPercentage(ITestResult result)`**: This method is invoked when a test method fails but has met the success percentage criteria defined in the `@Test` annotation. It's rarely used but can be helpful in certain scenarios.

6. **`onStart(ITestContext context)`**: This method is called before any test method within a `<test>` tag in the `testng.xml` file starts executing. It can be used for initializing resources that are shared among all test methods.

7. **`onFinish(ITestContext context)`**: This method is invoked after all the test methods in a `<test>` tag have run. It can be used for cleanup or generating reports.

### Example Usage of `ItestListener`

Here’s a simple example of how you might implement `ItestListener` in a TestNG test suite:

```java
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomTestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());
        // Code to capture screenshot
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test Failed but within success percentage: " + result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test Suite Started: " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test Suite Finished: " + context.getName());
    }
}
```

### How to Use the Listener

To use the `CustomTestListener` in your TestNG suite, you can either specify it in the `testng.xml` file:

```xml
<listeners>
    <listener class-name="com.yourpackage.CustomTestListener"/>
</listeners>
```

Or, you can annotate your test class with `@Listeners`:

```java
import org.testng.annotations.Listeners;

@Listeners(CustomTestListener.class)
public class YourTestClass {
    // Your test methods here
}
```

### Use Cases
- **Logging:** Automatically log information about test execution, including start time, end time, and status.
- **Reporting:** Generate custom reports based on test results.
- **Error Handling:** Capture additional information, such as screenshots or logs, when a test fails.
- **Retry Logic:** Implement custom retry logic for failed tests.

`ItestListener` is a powerful way to gain more control and insight into your test execution, making your test framework more robust and informative.