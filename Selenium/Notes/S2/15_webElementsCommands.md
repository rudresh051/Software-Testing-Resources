# Selenium WebDriver - WebElement Commands

## What is Web Element?
The term web element refers to a HTML element.
e.g. p tag, anchor tag

### Clear Command
```
clear():void
```
Command:  
`element.clear()`

### Sendkeys Command
Method:  
`sendKeys(CharSequence?KeysToSend):void;`

Command:
`element.sendKeys("text");`

### Click Command
Method:  
`click():void;`  

Command:  
`element.click()` 

### IsDisplayed Command
Method:  
```
isDisplayed():boolean
```
Command:  
```
element.isDisplayed();
```
### IsEnabled Command
Method:  
```
isEnabled():boolean
```
Command:
```
element.isEnabled();
```

### IsSelected Command
Method:  
```
isSelected():boolean
```
Command:
```
element.isSelected();
```
### Submit Command
Method:  
```
submit():void
```

Command:  
```
element.submit();
```
### GetText Command
```
getText():String
```
Command:  
`element.getText();`

### GetTagName Command
Method:  
getTagName():String  

Command:  
`element.getTagName();`
### getCssValue Command
Method:  
getCssValue():String    

Command:  
`element.getCssValue();`

### getAttribute Command
Method:  
`getAttribute(String Name):String`  
Command  
`element.getAttribute();`

### getSize Command
Method:  
getSize():Dimension  

Command:  
`element.getSize();`
### getLocation Command
Method:  
`getLocation():Point`  

Command:  
`element.getLocation();`