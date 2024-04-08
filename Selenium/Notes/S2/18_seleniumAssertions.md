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

# AssertEquals()
AssertEquals() is a method used to compare the actual and expected results.   
If both the actual and expected results are same, then the assertion pass with no exception   
and the test case is marked as "passed". If both the actual and expected results are not the   
same, then the assertion fails with an exception and the test case is marked as "failed".    
Syntax of an AssertEquals() method is given below:

```
Assert.assertEquals(actual,expected);  
```

# AssertNotEquals()
It is opposite to the function of AssertNotEquals() method. AssertNotEquals() is a   
method used to compare the actual and expected results. If both the actual and expected   
results are not the same, then the assertion pass with no exception and the test case   
is marked as "passed". If both the actual and expected results are same, then the assertion     
fails with an exception and the test case is marked as "failed".   
Syntax of an AssertNotEquals() method is given below:

```
AssertNotEquals(actual,expected,message);  
```

# Assert Null
AssertNull() is a method that verifies whether the object is null or not.  
If an object is null, then assertion passes the test case, and the test case is marked as "passed",   
and if an object is not null, then assertion aborts the test case and the test case is marked as "failed"

`Assert.assertNull(object);`

# AssertNotNull()
AssertNotNull() is a method that verifies whether the object is null or not.  
If an object is not null, then assertion passes the test case and test case is marked as "passed", and if an object is null, then assertion aborts the test case and case is marked as "failed".
`Assert.assertNotNull(object);`