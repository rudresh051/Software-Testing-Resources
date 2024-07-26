# Outline
* Testability
* Model based testing
* Test design based on criteria

## Testability
### Observability and Controllability
* Two terms related to testability.
* **Observability** deals with
How easy it is to observe the behavior of a program in terms  
of its outputs, effects on the environment and other hardware  
and software components.

* **Controllability** deals with  
How easy it is to provide a program with the needed inputs, in  
terms of values, operations, and behaviors.

## Model for detecting faults through observing failures
* RIPR model: Four conditions necessary for a failure to be observed
are:  
    * Reachability: The location(s) in the program that contain the 
    fault must be reached.
    * Infection: The state of the program must be incorrect.
    * Propagation: The infected state must cause some output or final state of the   
    program to be incorrect.
    * Reveal: The tester must observe part of the incorrect portion of the program state.


Consider the code segment below:  
input x, y;  
if (x < 10){
z = x+1;  
if (y < z)  
---error ---;
} 

* Reachability: True, any value of x can reach the first if
statement. x < 10 will reach the second if statement.

* Infection: x != 10 will test the first if statement. y < x+1 will
test the second if statement.

* Propagation: x < 10 and y < z will result in reaching the
error statement.

## Model based testing
* Model based testing involves working with a model of the
software artifact and deriving test cases from the model.
* The model could be based on
    * A formal, mathlematical notation (like finite state machines,
graphs, logical formulas etc.),
    * A language that supports several entities for modelling (like
UML, SysML, Simulink, Stateflow etc.). It may or may not  
have formal semantics.
* A model could not only be for code, but also for requirements,
design etc.
* Testing with models for requirements and design helps in early
detection of errors.

### Model based testing : Process
![MBT-Process](image-1.png)

The main use of models is in test case design

## Model based testing - Classical definition
* Typically, models that represent a software artifact represents  
the artifact or its abstraction.
* The model captures all the behaviors of the artifact.
* There are typically no models for source code with this view.  
In fact, source can be automatically generated from design  
models if they are well done.

## Model based testing - Coverage criteria
* We consider models for defining coverage criteria and then,
design test cases.
* The focus is on extracting models from software artifacts.
    * Graphs can be extracte% from source code (control flow graph,  
data flow graph, call graph etc.), from design elements (as  
finite state machines, state charts etc.).
    * Logical predicates occur as labels of all decision statements in  
code, as guards in finite state machines, as conditions in  
requirements etc.
* **Criteria** basically define requirements for test case de
the corresponding model.

## Four different models/structures to work with criteria
* **Graphs:** Graphs define control flow and/or data flow in code
and design.
* **Logical expressions:** Their truth/falsity dictate the control  
flow in the code. They also define conditions in requirements  
and guards in design.
* **Sets:** Characterize input domains for black-box testing.
* **Grammars:** Syntax of programming languages is represented
by grammars.

## Criteria on models - Example
* Consider the following decision statement in a piece of code:
if < 5 flag
== true)
* The program can take two paths based on whether the
decision is true or false.
* This is a coverage criterion called **predicate coverage.**
* The **test requirement** is to achieve predicate coverage.
* Two sample test cases will achieve/satisfy this test
requirement:
    * x=3 and flag=true,
    * x=7 and flag=true.

## Test coverage criteria
* **Test requirement:** A specific element of a software artifact
that a test case must meet/satisfy or cover.
* **Coverage Criterion:** A rule or collection of rules that impose  
(test) requirements on a set of test cases.
* Given a set of test requirements TR for a coverage criterion
C, a set of test cases T **satisfies** C iff  
For every test requirement tr ∈ R, there is at least one test
t in T such that t satisfies tr.
* A particular coverage criteria may or may not be satisfiable.
* Coverage criteria that cannot be satisfied are called **infeasible.**

## Two ways of using coverage criteria
Coverage criteria are used in two ways:
* **Generator:** IGenerate test cases to satisfy the coverage
criterion.
* **Recognizer:** Generate test cases externally and check if they
have met the coverage criterion.
* The problems of generating for and recognizing coverage
criteria are both equally difficult, in fact, undecidable in many
cases.
* We will look at several problems in generating test cases for
satisfying coverage criteria for several different artifacts in this
course.

## Criteria subsumption
* Coverage criteria are compared to each other by means of
subsumption.
* A coveragé criterion Cl **subsumes** C2 if and only if (iff) **every**
test case that satisfies criterion Cl also satisfies G.
* For e.g., a coverage criterion that states that every statement
in a program be executed once subsumes the criterion that
states that every if statement be executed for being true once
and false once.
* Note: The subsumption relation typically is defined only
amongst criteria that are feasible.

## Coverage criteria - Plan ahead
* Study the mathematical model/structure  
(graphs/logic/sets/syntax) and define various coverage  
criteria over them, study their properties, subsumption etc.
* Study various software artifacts that can be modeled using the  
various models/structures (code/design/requirements) and  
see how to apply the coverage criteria on them.