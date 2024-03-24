# Selenium WebDriver - Drag and Drop

## Actions in Selenium WebDriver
For performing complex user interaction like drag and drop, we have an Actions class in Selenium WebDriver.
Using the Actions class, we first build a sequence of composite events and then perform it using Action(an interface which represents a single user-interaction.)  
The different methods of Actions class we will be using here are - 

1. **clickAndHold(WebElement element)** - Clicks a web element at the middle(without releasing)

2. **moveToElement(WebElement element)** - Moves the mouse pointer to the middle of the web element without clicking.

3. **release(WebElement element)** - Releases the left click (which is in pressed state).

4. **build()** - Generates a composite action
