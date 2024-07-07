1. **Abstraction**  
* Abstraction is the methodology of hiding the implementation of internal details   
and showing the functionality to the users.

* In the Page Object Model design pattern, we write locators( such as id, name,   
xpath etc.,) and the methods in a Page Class. We utilize these locators in tests   
but we can't see the implementation of the methods. Literally we hide the implementations   
of the locators from the tests.

2. **Interface**
* An interface in Java looks similar to a class. But methods declared in interface are by default abstract.
* Basic statement we all know in Selenium is  
`WebDriver driver = new ChromeDriver()`