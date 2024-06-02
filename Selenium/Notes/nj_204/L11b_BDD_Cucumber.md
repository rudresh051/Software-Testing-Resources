# Introduction to BDD-Cucumber
Approach to Develop, Test, maintain, Deliver the software.

BDD - Behavioral Driven Development.

Other approaches:
TDD - Test Driven Development.

## What is BDD?
BDD is a way for software teams to work that closes the gap between **business
people** and **technical people** by:
* Encouraging collaboration across roles to build shared understanding of
the problem to be solved
* Working in rapid, small iterations to increase feedback and the flow of
value
* Producing system documentation that is automatically checked against
the system's behaviour

We do this by focusing collaborative work around concrete, real-world examples that  
illustrate how we want the system to behave. We use those examples to guide us  
from concept through to implementation, in a process of continuous collaboration.  


## What is Cucumber?
0k, now that you know that BDD is about discovery, collaboration and examples  
(and not testing), let's take a look at Cucumber.

Cucumber reads executable specifications written in plain text and validates that the
software does what those specifications say. The specifications consists of multiple examples,  
or scenarios.  

For example:
Scenario: Breaker guesses a word  
Given the Maker has chosen a word

When the Breaker makes a guess

Then the Maker is asked to score.

Each scenario is a list of steps for Cucumber to work through. Cucumber verifies that the software confirms with the specification and generates a report indication ✔️ success or ❌ failure for each scenario.







