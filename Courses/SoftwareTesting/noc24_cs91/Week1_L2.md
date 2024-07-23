# Software Testing : Terminologies

## Outline
1. Verification, validation and testing.
2. Testing terms.
3. Testing: Classification.
4. Test activities.

## Verification, Validation and Testing
As per IEEE-STD-610,
* **Validation:** The process of evaluating software at the **end of software development** to ensure   
compliance with intended
usage. i.e., checking of the software meets its requirements.
* **Verification:** The process of determining whether the products of a given phase of the software   
development process fulfill the requirements established at the **start of that phase.**

Testing, as we will see in this course, deals mainly with verification.

## Other related areas
* Formal methods/verification: Model checking, theorem
proving, program analysis.
* Modelling and simulation.
* Accreditation.

>> Safety critical. They need to be certified .  

## Software: Faults, failures and errors
* **Fault**-  A static defect in the software. It could be a missing function or a wrong function in code.
* **Failure** - An external incorrect behavior with respect to the requirements or other description of   
the expected behavior. A failure is a manifestation of fault when software is executed.
* **Error** -  An incorrect internal state that is the manifestation Of some fault.

## Historical perspective
* The terms **bug** and **fault** was used by Edison:
"It has been just so in all of my inventions. The first step is an intuition, and comes with a burst,   
then difficulties arise, this thing gives out and [it is] then that bugs, as such little faults and   
difficulties are called, show themselves and months of intense watching, study and labor are requisite."

* The term **error** was used by **Ada Lovelace:**
"An analyzing process must equally have been performed in  
order to furnish the Analytical Engine with the necessary  
operative data; and that herein may also lie a possible source  
of **error.** Granted that the actual mechanism is unerringin its processes, the cards may give it wrong orders

We will use these terms synonmously in this course:  
fault, failure, error. bug. defect  
will all mean the same.

## Test case
* A test case typically involves inputs to the software and expected outputs.
* When test cases are executed and results recorded, if the actual output matches the expected output, the test case is said to have passed. Otherwise, the test case is said to have failed.
* A failed test cases indicates an error.
* A test case also contains other parameters like test case id, traceability details etc.