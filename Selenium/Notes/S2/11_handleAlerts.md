# Selenium WebDriver - Handling Alerts
Selenium WebDriver provides three methods to accept and reject depending on the Alert types.

1. **void dismiss()**
This method is used to click on the "cancel" button of the alert
```
driver.switchTo().alert().dismiss();
```
2. **void accept()**
This method is used to click on the "Ok" button of the alert.
```
dirver.switchTo().alert.accept();
```
3. **String getText()**
This method is used to capture the alert message
```
driver.switchTo.alert().getText();
```
4. **void sendKeys(String stringToSend)**
This method is used to send some data to the alert box.
```
driver.switchTo.alert().sendKeys("Text");
```