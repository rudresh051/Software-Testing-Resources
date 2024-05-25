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
@AfterMethod : Exectures after each test method
@BeforeClass : Executes once before the test class.
@AfterClass : Executes once after the test class.
@BeforeTest : Executes before a test(a group of classes)

The @BeforeTest annotation is used to designate a method that should run before any test method belonging to a <test> tag in the XML suite file.

@AfterTest : Executes after a test (a group of classes).

@dataprovider - It helps us to run a single testcase with Multiple sets of data.  
