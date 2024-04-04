# Handling Radio buttons
1. Calculate the number of radio buttons
   
```
e.g.
int a = driver.findElements(By.xpath("//input [@name='group1']")).size();
```
2. Handle the radio buttons by using the index of a particular radio button
```
e.g.
driver.findElements(By.xpath("//input[@name='group1']")).get(2).click();
```