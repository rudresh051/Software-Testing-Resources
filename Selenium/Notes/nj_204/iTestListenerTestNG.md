# Listeners in TestNG

Listener is defined as interface that modifies the default TestNG's behavior

1. IAnnotationTransformer
2. IAnnotationTransformer2
3. IConfigurable
4. IExecutionListener
5. IExecutionListener
6. IHookable
7. IInvokedMethodListener
8. IInvokedMethodListener2
9. IMethodInterceptor
10. IReporter
11. ISuiteListener
12. ITestListener

## TestNG Listeners

1. Create test case
2. Create listener class
3. Create xml file and include both test case & listener class

## 2 ways to implement listener class

* Method 1
class myListner implements ITestListener{

}

* Method 2
class myListener extends TestListenerAdapter{

}

## ITestListener has following Methods

1. OnStart - OnStart method is called when any Test starts
2. onTestSuccess - onTestSuccess method is called on the success of any Test.
3. onTestFailure - onTestFailure method is called on the failure of any Test.
4. onTestSkipped - onTestSkipped method is called on skipped of any Test.
5. onTestFailedButWithinSuccessPercentage - method is called each time Test fails
but is within success percentage
6. onFinish - onFinish method is called after all Tests are executed

## Reporting.java

```java
package SampleDemo;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(SampleDemo.Listeners.class)

public class Reporting {
 @Test
 public void Test_Success() {
  System.out.println("This is my success scenario test");
 }
 
 @Test
 public void Test_Failure() {
  System.out.println("This is my failure scenario test");
  Assert.assertTrue(false);
 }
 
 @Test
 public void Test_Skipped() {
  throw new SkipException("this test is skipped");
 } 
}

```

Listeners.java

```java
package SampleDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

 @Override
 public void onTestStart(ITestResult result) {
  // TODO Auto-generated method stub
  System.out.println("This is test scenario: onTestStart" + result.getName());
  
 }

 @Override
 public void onTestSuccess(ITestResult result) {
  // TODO Auto-generated method stub
  System.out.println("This is test scenario: onTestSuccess" + result.getName());
  
 }

 @Override
 public void onTestFailure(ITestResult result) {
  // TODO Auto-generated method stub
  System.out.println("This is test scenario: onTestFailure" + result.getName());
  
 }

 @Override
 public void onTestSkipped(ITestResult result) {
  // TODO Auto-generated method stub
  System.out.println("This is test scenario: onTestSkipped" + result.getName());
  
 }

 @Override
 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
  // TODO Auto-generated method stub
  System.out.println("This is test scenario: onTestFailedButWithinSuccessPercentage" + result.getName());
  
 }

 @Override
 public void onStart(ITestContext context) {
  // TODO Auto-generated method stub
  System.out.println("This is test scenario: onStart" + context.getName());
  
 }

 @Override
 public void onFinish(ITestContext context) {
  // TODO Auto-generated method stub
  System.out.println("This is test scenario: onFinish" + context.getName());
  
 }
}
```
