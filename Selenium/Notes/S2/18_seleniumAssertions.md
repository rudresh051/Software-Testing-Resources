# Assertions
Assertion determines the state of the application whether it   
is the same what we are expecting or not. If the assertion fails,   
then the test case is failed and stops the execution.

There are two types of Assertion
1. Hard Assertion
2. Soft Assertion

## Hard Assertion
Hard Assertion is an assertion that throws the AssertException when the test case is failed.
In the case of Hard Assertion, you can handle the error by using a catch block like a java exception

A Hard Assertion contains the following methods:

* AssertEquals
* AssertNotEquals
* AssertTrue
* AssertFalse
* AssertNull
* AssertNotNull

# AssertFalse()
Assertion verifies the boolean value returned by a condition.  
If the boolean value is false, then assertion passes the test case,  
and if the boolean value is true, then assertion aborts the test   
case by an exception.
```
Assert.AssertFalse(condition)
```

# AssertTrue()
Assertion verifies the boolean value returned by a condition. If the boolean value is   
true, then assertion passes the test case, and if the boolean value is false, then   
assertion aborts the test case by an exception

```
Assert.AssertTrue(condition);  
```