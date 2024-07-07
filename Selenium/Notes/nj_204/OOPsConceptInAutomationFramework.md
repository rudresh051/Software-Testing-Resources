Link - https://www.youtube.com/watch?v=oj6ooN8YTLI

1. **Abstraction**  
* Abstraction is the methodology of hiding the implementation of internal details   
and showing the functionality to the users.

* In the Page Object Model design pattern, we write locators( such as id, name,   
xpath etc.,) and the methods in a Page Class. We utilize these locators in tests   
but we can't see the implementation of the methods. Literally we hide the implementations   
of the locators from the tests.

* Example code demo

2. **Interface**
* An interface in Java looks similar to a class. But methods declared in interface are by default abstract.
* Basic statement we all know in Selenium is  
`WebDriver driver = new ChromeDriver()`
* Example code

3. **Inheritance**
* The mechanism in Java by which one class acquires the properties(instance variables) and functionalities   
of another class is known as Inheritance.
* We create a Base Class in the Automation Framework to initialize WebDriver interface, WebDriver waits,    
Property files, Excels, etc., in the Base Class. We extend the Base Class in other classes such as Tests   
and Utility Class.

4. **Polymorphism**
Combination of overloading and overriding is known as Polymorphism. We will see   
both overloading and overriding below.  

* **Method Overloading** - We use Implicit wait in Selenium.
Implicit wait is an example of overloading. In Implicit wait we use different time   
stamps such as SECONDS, MINUTES, HOURS etc.

* **Method Overriding** - Declaring a method in child class which is already present in the   
parent class is called Method Overriding. Examples are get and navigate methods of different drivers in Selenium.

5. **Encapsulation**
* Encapsulation is a mechanism of binding code and data (variables) together in a single unit.

* In POM classes, we declare the data members using @FindBy and initialization of data members   
will be done using Constructor to utilize those in methods.