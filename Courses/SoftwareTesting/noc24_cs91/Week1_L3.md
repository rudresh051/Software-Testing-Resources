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