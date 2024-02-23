## First Selenium Script:

```
package Day1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class OpenBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Mention the driver and it's path
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromedriver122\\chromedriver-win64\\chromedriver.exe");
		// Open my chrome browser => Syntax
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
```

### Explanation
1. **System.setproperty** - It is used to enter the details of the driver  
(chromedriver, firefoxdriver,edgedriver) in a key value pair of Setproperty(key,value).  
key is the driver detail, value is the location of the driver  

2. **Web driver** is an **Interface**, driver is the reference variable, new is the keyword,  
ChromeDriver() the Constructor, together a new **ChromeDriver()** object is created and  
stored in the reference variable **driver**.  
Here, All the driver methods are just declared in **Webdriver** Interface, and all the driver methods(get,close,quit,findelement etc) are implemented in Implementation class called **ChromeDriver();**