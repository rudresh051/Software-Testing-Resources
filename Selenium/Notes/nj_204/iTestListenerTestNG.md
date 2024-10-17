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