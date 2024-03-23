# Select in Selenium WebDriver
The 'Select' class in Selenium WebDriver is used for selecting and deselecting option in a dropdown.  
The objects of Select type can be initialized by passing the dropdown webElement as parameter to its constructor

```
WebElement testDropDown = driver.findElement(By.id("testingDropdown"));
Select dropdown = new Select(testDropDown);
```

## How to select an option from drop-down menu?
WebDriver provides three ways to select an option from the drop-down menu.
1. **selectByIndex** - It is used to select an option based on its index, beginning with 0.
```
dropdown.selectByIndex(5);
```
2. **selectByValue** -  It is used to select an option based on its 'value' attribute
```
dropdown.selectByValue("Database");
```
3. **selectByVisibleText** - It is used to select an option based on the text over the option.
```
dropdown.selectByVisibleText("Database Testing");
```
