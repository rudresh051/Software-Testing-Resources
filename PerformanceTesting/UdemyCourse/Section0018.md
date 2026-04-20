# BeanShell scripting in JMeter

## Introduction to BeanShell Scripting in JMeter

Overview  

* Beanshell is a lightweight scripting language that supports Java syntax
* In JMeter, Beanshell scripting allows users to customize test plans with dynamic behavior and complex logic that isn't achievable through JMeter's default components

## Beanshell Components in JMeter

1. **Beanshell Sampler** - Executes Beanshell script during test execution
2. **Beanshell PreProcessor** - Runs script before a sampler request is made 
3. **Beanshell PostProcessor** - Runs script after a sampler request is mode 
4. **Beanshell Assertion** - Validates the sampler response using a script
5. **Beanshell Timer** - Introduces a delay using a script
6. **Beanshell Listener** - Processes the results using a script

## Commonly used variables in JMeter Beanshell scripts
➤log: For logging messages.
➤vars: For accessing JMeter variables.
➤props: For accessing JMeter properties.
➤ctx: For accessing the JMeter context.
➤prev: For accessing the previous sampler result.

## Guideline for Using Beanshell Scripting

![alt text](image-323.png)

## BeanShell Pre-Processor(Use Case 1-Set variable value in JMeter)

```java
import java.util.Date;
import java.text.SimpleDateFormat;
Date date = new Date();
SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-YYYY");

String formattedDate = formatter.format(date);
vars.put("currentDate",formattedDate);
```

![alt text](image-324.png)

> So in this way, this is one of the use case where we are storing the value of the variable using the Beanshell preprocessor. And we can use the variable whereever necessary


