# Selenium WebDriver - Browser Commands
Following are the most commonly used browser commands for Selenium WebDriver

1. **Get Command**
This method loads a new web page in the existing browser window. It accepts String as parameter and returns void.
Method :
```
get(String arg0):void
```


```
e.g.
driver.get(URL);

String URL = "URL";
driver.get(URL)
```
2. **Get Title Command**
This method fetches the title of the current web page. It accepts no parameter and returns a String.
```
getTitle():String
```
e.g.
```
driver.getTitle();
String Title = driver.getTitle();
```