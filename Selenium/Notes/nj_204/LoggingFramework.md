# What is Logging

Logging means some way to indicate the **state of the system**  
at runtime. The log messages have to provide the required  
information to understand what the **application does**
**internally during runtime.**

## What is Log4j

Log4j **logging framework** which is written in **Java**. It is an **open-source logging API for java.**

## 📌 Basic Log4j2 Configuration (log4j2.xml)

Place this file inside src/main/resources.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="INFO">
    <Appenders>
        <!-- Console Appender -->
        <Console name="Console" target="SYSTEM_OUT">
            <PatternLayout>
                <Pattern>%d{yyyy-MM-dd HH:mm:ss} [%t] %-5level %c{1} - %msg%n</Pattern>
            </PatternLayout>
        </Console>

        <!-- File Appender for Logs -->
        <File name="FileLogger" fileName="logs/test-automation.log" append="true">
            <PatternLayout>
                <Pattern>%d{yyyy-MM-dd HH:mm:ss} [%t] %-5level %c{1} - %msg%n</Pattern>
            </PatternLayout>
        </File>

        <!-- Rolling File Appender (Creates new log files after reaching a certain size) -->
        <RollingFile name="RollingFileLogger" fileName="logs/rolling-logs.log"
                     filePattern="logs/rolling-logs-%d{yyyy-MM-dd}.log.gz">
            <PatternLayout>
                <Pattern>%d{yyyy-MM-dd HH:mm:ss} [%t] %-5level %c{1} - %msg%n</Pattern>
            </PatternLayout>
            <Policies>
                <SizeBasedTriggeringPolicy size="10MB"/>
            </Policies>
        </RollingFile>
    </Appenders>

    <Loggers>
        <!-- Root Logger (Logs everything from INFO and above) -->
        <Root level="INFO">
            <AppenderRef ref="Console"/>
            <AppenderRef ref="FileLogger"/>
            <AppenderRef ref="RollingFileLogger"/>
        </Root>

        <!-- Specific Logger for Selenium Tests -->
        <Logger name="seleniumtest" level="DEBUG" additivity="false">
            <AppenderRef ref="FileLogger"/>
        </Logger>

        <!-- Specific Logger for Framework Utilities -->
        <Logger name="com.kritikal.framework" level="DEBUG" additivity="false">
            <AppenderRef ref="RollingFileLogger"/>
        </Logger>
    </Loggers>
</Configuration>
```

## Dependencies

```java
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
