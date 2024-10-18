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

# ITestListener has following Methods

1. OnStart - OnStart method is called when any Test starts
2. onTestSuccess - onTestSuccess method is called on the success of any Test.
3. onTestFailure - onTestFailure method is called on the failure of any Test.
4. onTestSkipped - onTestSkipped method is called on skipped of any Test.
5. onTestFailedButWithinSuccessPercentage - method is called each time Test fails but is within success percentage
6. onFinish - onFinish method is called after all Tests are executed

Listeners.java
```
package sampleDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("This is test scenario :" + result.getAttribute(null));
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
}

```