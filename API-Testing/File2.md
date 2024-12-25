# Postman

Collection of classes is called package
Collection of package is called project
here - 
Collection of request here is called collection


In API testing, the terms **parameters** and **query parameters** refer to distinct ways of passing data to an API endpoint. Here's the difference between them:

### **Parameters**:
- **General Concept**: Parameters are a broader category that refers to any input data passed to an API to customize its behavior.
- **Types**: Parameters can be classified into multiple types, including:
  1. **Path Parameters**: Part of the endpoint URL, used to specify resources.
     - Example: `/users/{userId}` where `{userId}` is replaced by a specific ID like `/users/123`.
  2. **Query Parameters**: Appended to the URL after a `?` and used to pass additional information.
     - Example: `/users?age=25&city=NY`.
  3. **Header Parameters**: Sent in the HTTP header, often used for authentication or content type.
     - Example: `Authorization: Bearer <token>`.
  4. **Body Parameters**: Sent in the body of the request, commonly used with `POST`, `PUT`, or `PATCH` requests.
     - Example (JSON body): `{"name": "John", "age": 25}`.

---

### **Query Parameters**:
- **Specific Concept**: A subset of parameters specifically appended to the URL in a key-value format, following a `?`.
- **Purpose**: Typically used for filtering, sorting, or pagination in GET requests.
- **Syntax**: `?key1=value1&key2=value2`.
  - `?`: Starts the query parameter section.
  - `&`: Separates multiple key-value pairs.
- **Example**:
  - URL: `/products?category=books&sort=price_asc&page=2`.
  - Query Parameters: 
    - `category=books`
    - `sort=price_asc`
    - `page=2`

---

### Key Differences:
| Aspect                | Parameters                               | Query Parameters                          |
|-----------------------|------------------------------------------|-------------------------------------------|
| **Definition**         | General term for any input data to APIs.| Subset of parameters passed in the URL.   |
| **Usage**              | Includes path, query, header, and body. | Specifically used for GET request data.   |
| **Location**           | Depends on the parameter type.          | Part of the URL, after a `?`.             |
| **HTTP Method**        | Any method (`GET`, `POST`, etc.).        | Mostly used with `GET`.                   |
| **Format Example**     | `/users/{userId}` (path) or JSON body.   | `/users?name=John&age=30`.                |

By understanding the difference, testers can effectively validate APIs for their behavior with various parameter types, ensuring they meet the expected requirements.