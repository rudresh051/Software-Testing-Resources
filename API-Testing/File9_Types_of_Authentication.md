# Authentication Types

## Basic Authentication
<!-- https://www.postman.com/postman/published-postman-templates/documentation/ae2ja6x/postman-echo?ctx=documentation
 -->

 ```text
GET Basic Auth
https://postman-echo.com/basic-auth
This endpoint simulates a basic-auth protected endpoint.
The endpoint accepts a default username and password and returns a status code of 200 ok only if the same is provided.
Otherwise it will return a status code 401 unauthorized.

Username: postman 
To use this endpoint, send a request with the header Authorization: Basic cG9zdG1hbjpwYXNzd29yZA==.
The cryptic latter half of the header value is a base64 encoded concatenation of the default username and password.
Using Postman, to send this request, you can simply fill in the username and password in the "Authorization" tab and Postman will do the rest for you.

To know more about basic authentication, refer to the Basic Access Authentication wikipedia article.
The article on authentication helpers elaborates how to use the same within the Postman app.
 ```

![alt text](image-18.png)

## Basic and Digest Auth

![alt text](image-19.png)