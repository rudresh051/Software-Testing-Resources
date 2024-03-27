# Selenium WebDriver - Scrolling a web page

To scroll a web page, we have to use the scrollBy method of JavaScript.   
For executing the JavaScript method we will use JavaScript executor.   
The scrollBy method takes two parameters one each for horizontal and  
vertical scroll in terms of pixels.

```
JavascriptExecutor js = (JavascriptExecutor)driver;  
js.executeScript("scrollBy(0, 4500)");  
```