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