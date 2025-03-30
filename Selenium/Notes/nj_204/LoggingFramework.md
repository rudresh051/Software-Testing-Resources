# What is Logging

Logging means some way to indicate the **state of the system**  
at runtime. The log messages have to provide the required  
information to understand what the **application does**
**internally during runtime.**

## What is Log4j

Log4j **logging framework** which is written in **Java**. It is an **open-source logging API for java.**


## Dependencies - 

```jav
<dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-core</artifactId>
            <version>2.24.3</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api -->
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-api</artifactId>
    <version>2.24.3</version>
</dependency>
```

## How to use

Import Log4j2 in your test classes and use it like this:

```java
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LessonTest {
    private static final Logger log = LogManager.getLogger(LessonTest.class);

    @Test
    public void navigateToLessonPage() {
        log.info("🔹 Starting navigateToLessonPage test");
        lessonPage.clickUnitPageLessonOneOption();
        log.debug("Clicked on lesson option");

        String text = lessonPage.unitPageLessonOneOption.getText();
        log.info("Lesson Text Retrieved: " + text);
        
        Assert.assertEquals(text, "Lesson 1: The Great War");
        log.info("✅ Assertion Passed!");
    }
}
```


## 📌 Final Steps

Ensure log4j2.xml is in src/main/resources/.

Create a logs/ folder in the project root to store log files.

Run your tests and check:

Console logs.

logs/test-automation.log file.

logs/rolling-logs-YYYY-MM-DD.log.gz file.
