### White box Testing Techniques
Testing each and every line of the code is called as White box testing.  

Or

Looking into the source code and checking whether each and evry line of the code
is working as expected or not is called as White box testing.  

Developer will do White box testing.   
It is also called as Open box/Transparent testing.

#### 6 types of White box testing  

1) **Path Testing** - Here Developers will write the flowchart and test each and test
each and every individuål paths, this is called as Path Testing. They check
entry and exit of every Path of module.  

2) **Conditional Testing/Branch coverage** - Here Developers will test the code
for logical conditions, that is for both 'True' and 'false' conditions. This is
conditional testing.(lf-else conditions is checked)  

3) **Loop Testing**- Here developer will test the loop and ensure that loop is
repeating for all the defined number of cycles. This is called as Loop Testing.
In Loop testing, developer will make sure terminating conditions are working
properly or not(while, do while, for)  

4) **Unit Testing**- Customer has give the requirement, developers will write main
program for the requirement and write the corresponding test program in the same
language and run the test program against main program, where in test program
will automatically test the main program and give the result as pass or fail. This is
called as Unit Testing. (Focus is done on smallest element of software).  

    Junit is a tool used for Unit Testing commonly.

5) **Testing the code from memory(size) point of view** -   
By changing the logic of
the code, memory can be improved, logic varies from person to person. Suppose
if there same code or duplicate code, then user defined code is used.  

    Example - let's say, one developer writes a code and file size is upto 500 kb,
    another developer writes a similar code with similar logic and file size is upto 250 kb.  

    Here we use tool called as **rational purifier** to test for these large codes(variables
    and functions).

6. **Testing from performance point of view -** 
The application could be slow
because of these reasons - for conditional cases, we use or & and frequently, not
using nested if statements instead of switch case or when logic is used.  

    Here, we use a tool called **'Rational Quantify'**, which resolves these issues
    automatically(when we execute the codes, we get outcome in the form of thick
    and thin lines, thick lines means codes which are time consuming, thin lines
    means codes which are not time consuming)

#### Advantages of WBT  
1. It is done in SDLC even without GUI  
2. Hidden errors the code can be identified  
3. Testing is more thorough  
#### Disadvantages of WBT
1. Expensive and complex  
2. Too much time consuming for big applications

### Experienced based Testing techniques
In this technique, test cases are derived from Testers skill and intuitive. Their
experience with applications and technologies will play a key role.  
Why Experienced based testing techniques:
1) When requirements are not available
2) Requirements are complex to understand
3) Less time to understand the requirement

### Types of Experience based testing
In this technique , test cases are derived from testers skill and intuitive. Their experience with applicaitons and technologies will play a key role

Why Experienced based testing techniques:  
* When requiements are not available  
* Requirements are complex to understand  
* Less time to understand the requirement  

1. **Error Guessing** - Here, Tester guesses the error entering data against given
requirement.  

2. **Checklist based Testing** - Here Testers created a checklist for creating different
functionalities and use cases for testing.  

3. **Exploratory Testing** - Here, Testers explore the application, navigate through
different functionalities and tries to find defects.  

    It is very important to have experienced Tester who have a similar experience of
    the project to be worked on, otherwise it may lead to lot of defects.

### Graybox Testing Techniques
Graybox testing is a combination of whitebox and blackbox testing.  
This testing technique to test a software product or application with partial
knowledge of internal structure of the application.  
The purpose of greybox testing is to search and identify the defects due to
improper code structure or improper use of applications.

**Types/techniques in Graybox testing**  
1. **Matrix Testing** - In matrix testing techniques, business and technical risks which
are defined by the developers in software programs are examined. 

Developers define all the variables that exist in the program.  


Values are stored in the variables through which it will travel inside the program,
now this should be as per requirement, otherwise it will reduce the speed of the
software and readability of program. With Matrix Testing, we can remove unused
or uninitialized variables by identifying used variables.

2. **Pattern Testing:**  

**Pattern Testing is done on those softwares that developed copying the
patterns of other softwares. In these softwares there is high probability of
getting similar kind of defects. With Pattern testing we can analyze reasons
of failure easily.**

To perform testing, previous defects are analyzed.  
Pattern testing determines the cause of the failure by looking into code.

**Orthogonal Array Testing -**   
This testing is preferred when maximum coverage is
required.  
This testing is done to cover maximum code with less test cases.  
GUI also functions by less test cases.
Test process becomes more efficient.  
It makes analysis less complex and simple.

**Regression Testing:**  
To ensure that any new changes made is not affecting old features. Here some
techniques used are retest risky use case, retest within a firewall.

### Web Security Testing
1. URL manipulation
2. Session Expiry
3. Cookies based
    * Session based - It will be stored in browser.
    * Persistent based - It will be stored in computer hardware
4. SQL injection