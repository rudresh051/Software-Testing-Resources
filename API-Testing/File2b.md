# API Response Validations and Different types of Assertions

> Response Validations

* Status code
* Headers
* Cookies
* Response Time
* Response body

We need to Test above.  
We need to add Assertion(Validation)  
Library provided by Postman => pm  
Postman Assertion function interanlly use JavaScript

Normal function  
Arrow Function

* Chai Assertion Library

```javascript
pm.test("Test Name", function(){
        // assertion;
    })
```

```javascript
pm.test("Test Name", ()=>{
    // assertion;

})
```
![alt text](image-9.png)