# Reqres API

https://reqres.in/

List users
Request - /api/users?page=2
Single user - /api/users/2
Single user not found - /api/users/23
List <Resource> - /api/unknown
Single <Resource> - /single/resource


An **access token** is a credential used to authenticate and authorize a client application or user to access specific resources in an API. It is typically issued by an **authentication server** after the client successfully authenticates and is often used in API testing to simulate real-world scenarios involving secure data exchange.

### **Key Features of an Access Token:**
1. **Authentication**: Verifies the identity of the client or user.
2. **Authorization**: Defines what resources or actions the token holder is permitted to access.
3. **Expiration**: Tokens are often short-lived to enhance security.
4. **Format**: Commonly encoded as a JWT (JSON Web Token), which contains:
   - Header: Metadata about the token, like the signing algorithm.
   - Payload: Claims about the user or client (e.g., permissions, roles, user ID).
   - Signature: Ensures the token's integrity and authenticity.

---

### **How an Access Token Works in API Testing**

1. **Obtain the Token**:
   - In API testing, you start by making an authentication request (e.g., a POST request to a `/login` or `/token` endpoint).
   - Pass valid credentials (username, password, or API keys) in the request body or headers.
   - The server returns an access token if the credentials are valid.

2. **Use the Token**:
   - Include the token in subsequent API requests, usually in the HTTP **Authorization header**:
     ```
     Authorization: Bearer <access_token>
     ```
   - The server validates the token and determines whether the client has the necessary permissions.

3. **Validate Responses**:
   - Verify that API requests with a valid token return the expected data or perform the correct action.
   - Ensure requests with an invalid, expired, or missing token result in proper error codes (e.g., `401 Unauthorized` or `403 Forbidden`).

4. **Token Expiry and Refresh**:
   - Simulate expired tokens to confirm the API rejects them.
   - Test the **refresh token flow**, where a new access token is issued without re-authenticating the user.

---

### **API Testing Scenarios for Access Tokens**

1. **Successful Authentication**:
   - Verify that valid credentials return an access token.

2. **Failed Authentication**:
   - Ensure invalid credentials or missing parameters do not return an access token.

3. **Authorization**:
   - Test API endpoints with valid and invalid tokens to check resource access permissions.

4. **Token Expiry**:
   - Confirm APIs reject expired tokens with the correct error messages.

5. **Token Revocation**:
   - Test scenarios where a token is revoked (e.g., user logs out) and verify it no longer works.

6. **Refresh Tokens**:
   - Validate the issuance of a new token using a refresh token.

---

### **Tools for API Testing with Access Tokens**

- **Postman**: Allows you to set up token retrieval and reuse it for subsequent requests.
- **JMeter**: Use scripts to simulate authentication and include tokens in requests.
- **Automation Frameworks** (e.g., Selenium, RestAssured): Automate token-based API testing by programmatically obtaining and using access tokens.

By including access token tests in your API testing suite, you ensure robust security and proper functioning of authentication and authorization mechanisms.

## Data driven testing using Postman