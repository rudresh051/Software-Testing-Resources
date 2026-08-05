## Test scenarios
Test scenarios are high level documentation of test cases or high level documentation of the functionalities
whith are to be tested.  

Points to remember while writing test scenarios:  

* Think from an end-user perspective. Just like when writing test cases, it is crucial to write meaningful and
successful test sc arios from a user's point of view.  

* Ensure test scenarios are reusable, reproducible, and specific. Make sure test scenarios cover specific
user stories in detail, can be tested independently, and include key information.

### Test scenario example
Here are some of the most common test scenarios that serve as a foundation for deriving test cases.  

Test Scenario l: Test the login functionality  
Test Scenario 2: Test the forgot password functionality  
Test Scenario 3: Create a new account  
Test Scenario 4: Check the payment functionality  

lets say, to test the login functionality, we have several components such as kername, password, logn button, cancel,
forgot password, also we need to check for GUI(is logn functionality user friendly, is color formation good, any spelling
mistake, anv alignment issues). We need to pick a component and derive multiple test cases for that.

## Test cases
Test cases are detailed description of Test scenarios.  
Test scenario description(it can be considered as a Test case) for a login page:  
Below example, we choose one example Username text field   
Similarly we can write test cases for password, login, cancel button etc

Assume customer requirement is given for Username text field:  

Username text field should accept 5 to 15 characters(combination of alphabets, numbers and@are allowed only)  

Positive Test ses/Test scenario description for username text field:
1) To verify if a username text field accepts combination of upper case alphabets, number and@
2) Toverify if a username text field accepts combination of lowercase Elphabets, numbers and@


#### Negative Test cases for username text field
1. To verify if a username text field accepts combination Of upper case alphabets, number and $
2. To verify if a username text field accepts combination Of lowercase alphabets, numbers, space and @
3. To verify if a username text field accepts combination of lowercase alphabets and numbers-
4. To verify if a username text field accepts combination of uppercase alphabets and numbers.

## Components in test case template
Test case ID  
Test scenario  
Test scenarios description/Test case  
Preconditions
Test steps  
Test data  
Expected Result  
Actual Result  
Status  
Comments  

### Key Differences between Smoke and sanity testing
Smoke Testing
1. It is a high level Testing(Testing is done on a high level)
2. Testing is done on unstable builds or new builds
3. Testing can be done by both Develop rs and Testers
4. Only positive testing can be done
5. As soon as we get a new build, we do Smoke Testing

Sanity Testing
1. It is a deep and narrow testing
2. Testing is done on stable builds
3. Testing will be done only by Testers
4. Both positive an negative testing can be done
5. Sanity Testing will be done when a bug fixed and old build is given to us.

### What is Retesting?
When a Tester finds a bug, he will inform to Developer, developer will fix the bug and give back to tester.
Tester needs to check if this bug is really fixed or not. This process is called as Retesting.  

Or  

Process of checking if the developer has really fixed the bug or not is called Retesting.

