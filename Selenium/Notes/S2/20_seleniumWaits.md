# What is selenium waits
Waits in Selenium is one of the important pieces of code that executes a test case.   
It runs on certain commands called scripts that make a page load through it.  
Selenium waits makes the pages less vigorous and reliable.
This ensures you don't mess up and get ended into failed scripts while performing   
automation testing with it.

# Why do you need Waits in Selenium?
Today, most of the modern application's front-end is built on either Ajax or JavaScript etc   
which takes some time for loading elements on the webpage.

Hence in such a case, Selenium throws an "ElementNotVisibleException" message when you tend   
to locate an element present in your script which is still not loaded on the web page.

# Types of Waits in Selenium
1. Implicit Waits
2. Explicit Waits

# Difference between Implicit and Explicit
1. Implicit Wait applies to all the elements in the script, while Explicit wait is applicable   
only for those values which are to be defined by the user.
2. Implicit Wait needs specifying "ExpectedConditions" on the located element, while Explicit   
Wait doesn't need to be specified with this condition
3. Implicit Wait needs time frame specification in terms of methods like element visibility,   
clickable element, and the elements that are to be selected. In contrast, Explicit Wait is dynamic   
and needs no such specifications.

# Fluent Wait
Fluent Wait is quite similar to explicit wait. 
In Fluent wait, you can perform wait for action for an element it might take to be clickable or visible.
The differential factors that Fluent offers are as follows:
1. The pooling frequency
```
The pooling frequency in case of Explicit is 500 milliseconds. But, using Fluent Wait,   
this pooling frequency can be changed to any value based upon your need. 
```
2. Ignore Exception
While pooling, if an element is not found, you can ignore some expectations like 'NoSuchElement'.