## Types of Testing
![Types of Software Testing](image-1.png)

## Levels of Testing
1. Unit Testing
2. Integration Testing
3. System of Testing
4. User Acceptance Testing

## Incremental Integration Testing - 
Incrementally adding the module and testing the
data flow between the modules is called as Incremental Integration Testing.
### Types of Incremental Integration Testing
#### Topdown approach - 
Incrementally adding the modules and testing the data
flow between the modules and ensure that the module we are adding is child
of the previous module is called Topdown Incremental Integration Testing.
#### Bottom up approach - 
Incrementally adding the modules and testing the
dataflow between the modules and ensure that the module we are adding is
the parent of previous module is called as Bdttom up approach.
## Non Incremental Integration Testing/Big Bang Method
We go for Non Incremental Integration testing when it is difficult to identify which is parent module and child module , when multiple modules are there, when there is shortage of time.

## Sandwich Testing - 
Combination of Topdown and bottom up incremental
integration testing is called called sandwich Testing.

## System Testing 
It is an end to end testing done by test engineer.  
Why System testing? To check when we navigate through all the features and check whether **end feature** is working as expected or not

## Blackbox testing
It is performed by testers  
**Types - Functional and Non functional**

### Functional Testing 
We test functionality of an application with respect to customer requirements

**Types of functional testing**
1. Component Testing
2. Integration Testing
3. System Testing
4. Smoke Testing
5. Sanity Testing
6. Regression Testing
7. User Acceptance Testing

### Component Testing
Testing each and every component fo an application rigorously or thoroughly according to the customer requiremnt specification is called component testing  
e.g. Text box field, radio button, buttons, hyperlink etc  
**Types of component tesitng**
1. Over Testing/Exhaustive Testing - Here we enter more data
2. Under Testing - Here we enter less data
3. Optimized Testing - Here we enter proper data which makes sense.

**Optimized testing** can be of two types - Positive testing  and Negative testing

**Boundary Value Analysis** - Applicable when there is range of values  
**How to do Boundary Value Analysis** - Applicable when there is range of values  

**Positive Testing** - Entering data according to customer requirements
**Negative Testing** - Entering data against customer requirement

Phrases to use for writing test cases - To verify that or To check that


e.g.1  
```
**Requirement** - It should accept min 10 alphabets and max 20 alphabets
9,10,11 & 19,20,21

In above 9 and 21 are negative testing
and 10,11,19, 29 are postive testing
```
e.g.2
```
Requirements
1. It is a mandatory field
2. It should have a placeholder
3. It should accept min 10 alphabets & max 20 alphabets
4. It should accept only alphabets

Test cases for postive testing
a. To verify that username text field has a asterik symbol
b. To verify that username text field has phaceholder
c. To verify that username that username text field accepts min 10 alphabets
d. To verify that username that username text field accepts min 11 alphabets
e. To verify that username that username text field accepts min 19 alphabets
f. To verify that username that username text field accepts min 20 alphabets
Test cases for Negative testing
a. To verify that username doesnot accept 9 alphabets
b. To verify that username doesnot accpet 21 alphabets
c. To verify that username doesnot accept numbers
d. To verify that username doesnot accept special characters
e. To check that username doesnot accept extra spaces
f. To check that username doesnot accept combination of alphanumeric
g. To check that username doesnot accept combination of alphabets and special characters
h. spaces - leading and trailing and in between spaces
i. empty
j. To check that username doesnot accept other languages
```

e.g.  
```
Mobile number text field
Requirements
1. It should accept numbers (max 13)
2. It should not accept special characters (except + and space)
3. Maximum characters allowed is 14
Charcter includes numbers, + and space
```
Postive testing
1. To verify that it should accept numbers maximumm of 13 digits. e.g. +91 9611000111
2. To verify that it should accept numbers atleast 1 digit
```

```

Positive testing pass
Positive testing fail
Negative testing pass
Negative testing fail

### Smoke Testing or Build verification testing or positive testing
Testing the basic and critical features of an application before doing thorough
Testing is called as Smoke Testing.  

Why Smoke Testing - To check whether build is testable or not.

First day itself while Smoke Testing if we find Blocker or critical defect,  
communicate to developer, so that developer will get sufficient time to fix the  
defect.  

We are doing Smoke testing, indirectly we are ensuring that build is installed  
properly or not. 

It is a High Level testing.

Types of Smoke testing  
Formal Smoke Testing  - we document the bug  
Informal Smoke Tesing - we don't document anything  

### Sanity Testing
Sanity Testing is a deep and narrow Testing. It is usually for done when Tester finds a
bug and developer has fixed it, we do sanity testing to make sure that other features
are working by Testing thoroughly, we test each and every feature and check data
flow and end to end features - this is how we do deep testing.  
Sanity Testing is done for **stable** builds.

### Adhoc testing(Negative, Out of box, random testing)
Testing the application or software randomly without looking into requirements is
called as Adhoc Testing.   
Why Adhoc testing?
1) Chances are there customer/end users might use the software randomly and
they might find defects in order to avoid that, Adhoc testing should be done.
2) The intention is to break the software, so we should do Adhoc testing(To find
maximum defects).

### Regression Testing (Release Candidate Testing)
Testing the old features so that any new changes like adding a feature, modifying
a feature, deleting a feature or fixing a defect might introduce a new defect in old
features, to check that we do Regression testing on the old features.(Here we test
the new changes first and then we test for old features, these old features are
tested by looking into old test cases, which are already used earlier)  
Why Regression Testing - To check if new changes made has introduced any
defect in old features or not.

**Types of Regresssion Testing**  

**Unit Regression Testing** - Testing only the changes made is called as Unit
Regression testing(Here we test only new feature added, because we are sure it
is not affecting old features).  

**Regional Regression Testing** - Testing the changes made and the impacted
modules affected because of this change is called as Regional Regression testing.  
**How do we know which all areas are impacted?**
By doing impact analysis meeting, in this meeting we cross verify with Business
Analyst and check which all areas(modules) are impacted because of this new
change made.  

**Full Regression Testing** - If the new changes made is largely impacting other
modules(more areas), we go for Full Regression Testing.  

By conducting Full Regression Testing, we can save a lot of time.  

Both Manual Testing and Automation Testing can be done for Full Regression testing.

### Acceptance Testing(User Acceptance Testing)  
It is an end to end testing, done by the customers where in they use software for
real time business for some particular period of time and check whether software
can handle all the real time business, scenarios and situations. This is called as
Acceptance Testing.  

Why acceptance testing?
1) To get confidence on the product or software.
2) To ensure that application meets the business requirements.
3) To make sure that software company is not developing wrong features.

**Types of Acceptance Tesing**  

Alpha Testing - Acceptance Testing done in company environment.  

Beta Testing - Acceptance Testing done in customer énvironment.

## Types of Non Functional Testing
Here we check whether it is according to customer expectations  
Types -   
Compatibility Testing  
Usability Testing  
Performance Testing  

### Performance Testing
Testing the stability and response time of an application by applying load is called as Performance testing.  

Why performance testing - To check how is the response time and stability of an
application when load is applied.  

Stability means checking how the many users can software can accept(ability to
withstand designed number of users).  

Response Time means time taken by server to respond to user query

**Types of Performance Testing**  

Load Testing - By applying within limit  

Stress Testing - Applying more load  

Scalability Testing - Applying more load and check where exactly software crashes  

Volume Testing - testing the database of large volume of data  

Soak Testing - Endurance testing by applying load continuously for long time  

It will be mostly done for e-commerce applicatin, client-server application. Not for standalone application

### Compatibility Testing(Cross browser Testing)
Testing the functionality of an application or software for different hardware and
software configurations is called Compatibility Testing.  

Why Compatibility Testing - Tester might have tested software in one platform,
chances are there the users will use the software in different platforms and the
software might not work and this will spread bad name in the market and software
usage will go down, to avoid that we do compatability testing.  

To ensure all the features is consistently working for all platforms, we will do
compatibility testing


