package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeepLearningWebsite {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.deeplearning.ai/courses/");
        driver.manage().window().maximize();

        try {
            Thread.sleep(3000); // Wait for the page to load
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        int lastHeight = ((Number) js.executeScript("return document.body.scrollHeight")).intValue();

        while (true) {
            // Scroll down to bottom
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

            // Wait for loading (adjust sleep time if needed)
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Calculate new scroll height
            int newHeight = ((Number) js.executeScript("return document.body.scrollHeight")).intValue();

            // If height hasn't changed, we reached the bottom
            if (newHeight == lastHeight) {
                break;
            }

            lastHeight = newHeight;
        }


        List<WebElement> courses = driver.findElements(By.cssSelector("article[data-testid='course-card']"));

        for (WebElement course : courses) {
            String type = "";
            String title = "";
            String description = "";
            String instructor = "";
            String url = "";
            
            // Get the anchor tag inside the article
            WebElement anchor = course.findElement(By.cssSelector("a.dlai-gtm-course-card"));

            // Course URL (relative, so we append base URL)
            try {
                url =  anchor.getAttribute("href");
            } catch (Exception e) {
                url = "N/A";
            }

            // Course Type
            try {
                WebElement typeElement = course.findElement(By.cssSelector("div.flex.mb-2.gap-x-2 > span"));
                type = typeElement.getText();
            } catch (Exception e) {
                type = "N/A";
            }

            // Course Title
            try {
                WebElement titleElement = course.findElement(By.cssSelector("h3"));
                title = titleElement.getText();
            } catch (Exception e) {
                title = "N/A";
            }

            // Description
            try {
                WebElement descElement = course.findElement(By.cssSelector("p.text-slate-500.line-clamp-3"));
                description = descElement.getText();
            } catch (Exception e) {
                description = "N/A";
            }

            // Instructor (Optional)
            try {
                WebElement instructorElement = course.findElement(By.cssSelector("span.text-neutral-500.text-sm.line-clamp-1"));
                instructor = instructorElement.getText();
            } catch (Exception e) {
                instructor = "N/A";
            }

            // Print together
            System.out.println("Course Type : " + type);
            System.out.println("Title       : " + title);
            System.out.println("Description : " + description);
            System.out.println("Instructor  : " + instructor);
            System.out.println("Course URL  : " + url);
            System.out.println("--------------------------------------------------");
        }


        driver.quit();
    }
}

