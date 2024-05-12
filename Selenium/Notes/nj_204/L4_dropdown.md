# Select in Selenium WebDriver
How to Handle Dropdowns?

The 'Select' class in Selenium WebDriver is used for selecting and deselecting option in a dropdown.   
The objcts of Select type can be initialized by passing the dropdown webElement as parameter to its   
constructor.


WebElement DropDown = driver.findElement(By.id("testingDropdown"));
Select sel = new Select(DropDown);

WebDriver provides three ways to select an option from the drop-down menu.
1. selectByIndex - It is used to select an option based on its  
index, beginning with 0.
`sel.selectByIndex(5)`

2. selectByValue - It is used to select an option based on its 'value' attribute  
`sel.selectByValue("Database");`

3. selectByVisibleText - It is used to select an option based on text over the option.  
`sel.selectByVisibleText("Database Testing");`


```
package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rudre\\Downloads\\chromeDriver124-8May\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		//The objects of Select type can be initialized by the 
		// dropdown webElement as parameter to its constructor
		
		// Create a object of select class
		Select sel = new Select(dropdown);
//		sel.selectByIndex(1);
//		sel.selectByIndex(2);
//		sel.selectByIndex(3);
		
//		for(int i=0;i<=3;i++) {
//			sel.selectByIndex(i);
//			Thread.sleep(1000);

//		}
//		
//		Select by Value Method
//		sel.selectByValue("option1");
//		sel.selectByValue("option2");
//		sel.selectByValue("option3");
		
//		Select by Visible text
		sel.selectByVisibleText("Option1");
		
		Thread.sleep(1000); // Not recommended to use in your frameworks
		sel.selectByVisibleText("Option2");
		Thread.sleep(1000);
		sel.selectByVisibleText("Option3");
		driver.close();
		
	}

}

```