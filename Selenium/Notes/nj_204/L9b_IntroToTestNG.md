# Introduction to TestNG annotations

(Test Next Generation) is a testing framework for Java that is widely used in  
Selenium automation testing. It provides powerful features for test configuration  
parallel execution, grouping, and reporting.

# Installation steps of TestNG:
Go To Eclipse window
Click on help option-> Eclipse Marketplace
1. Write in find edit box and click on go button-
2. Find TestNG for eclipse division and click on install button
3. Click on confirm button and I accept the terms and conditions and click on
finish

To use TestNG with Selenium, you need to add the library to your project- If  
you're using Maven, add the following dependency to your pom.xml file. 

# TestNG Annotations:
TestNG uses annotations to define the behaviour of test methods.  
Some commonly used annotations in Selenium automation are:

@Test : Marks a method as a test method.  
@BeforeMethod : Executes before each test method  
@AfterMethod : Executes after each test method  
@BeforeClass : Executes once before the test class.  
@AfterClass : Executes once after the test class.  
@BeforeTest : Executes before a test(a group of classes)  

The @BeforeTest annotation is used to designate a method that should run before any   
test method belonging to a <test> tag in the XML suite file.  

@AfterTest : Executes after a test (a group of classes).

@dataprovider - It helps us to run a single testcase with Multiple sets of data.  

## Difference between JUnit and TestNG

JUnit and TestNG are both popular testing frameworks for Java, and they share similarities in   
terms of functionality, but they also have some differences. Here's a comparison between JUnit and TestNG

* **Annoation Support**
JUnit - JUnit 4 uses annotations such as @Test, @Before, @After, etc.

TestNG - TestNG provides a broader set of annoations, including @Test, @BeforeMethod, @AfterMethod,   
@BeforeClass, @AfterClass, @BeforeTest, @AfterTest, etc.  
TestNG's annotations offeer more fine-grained control over test-execution.

* **Parameterization** - 
JUnit supports parameterized tests using the @Parameterized annotaion.  

TestNG : TestNG has built-in support for parameterization using the @DataProvider  
annotation, making it easier to run tests with different sets of data.

**Dependencies:**
JUnit - JUnit does not have built-in support for test dependencies. Developers often  
use @Before and @After annotations for setup and teardown.

TestNG - TestNG provides a dependsOnMethods attribute that allows you to specify 

**Groups and Prioritization**  
Junit - JUnit doesn't have built-in support for test groups or prioritization.  
Developers often use naming conventions or custom runners for grouping.

TestNG - TestNG allows you to group tests using attribute in annotations. It also supports   
test prioritization using the priority attribute.

**Parallel Execution:**
JUnit does not prope native support for parallel execution. Developers often  
rely on external tools for parallel test execution.

Parallel Execution - Execution of Multiple test scripts at once wrt different browsers/platforms.  

TestNG has built-in support for parallel test execution at various levels
(methods, classes, suites), making it easy to parallelize test runs.

**Suite Configuration:**  
JUnit relies on test suite classes or test runners for suite-level configuration.

TestNG allows you to define suite-level configurations in XML files,
providing more flexibility in setting up test environments.

**Listeners**
Junit has limited support for test listeners.

TestNG provides a rich set of listeners that allow you to customise test execution and report generation.

**Reporting**
JUnit's reporting capabilites are basic, and developers often us additional tools for more detailed reports. 

TestNG generates detailed HTML reports by default, providing comprehensive information about test results. 

In Summary, while both JUnit and TestNG are powerful testing frameworks, TestNG oftern offers more   
features out of the box and provides additional capabilites for test configuration, parameterization,   
and parallel execution.










