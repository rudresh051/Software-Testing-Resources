# Install the following 

* Install Node  
`npm -node package manager`

> **Check version**  
node -v  
npm -v

* Install json-server  

`npm install -g json-server`

* students.json

```JSON
{
  "students":[
  {
        "id": 1,
        "name": "John Doe",
        "age": 18,
        "grade": "12th",
        "subjects": [
            "Math",
            "Physics",
            "English"
        ]
    },
    {
        "id": 2,
        "name": "Jane Smith",
        "age": 17,
        "grade": "11th",
        "subjects": [
            "Biology",
            "Chemistry",
            "History"
        ]
    },
    {
        "id": 3,
        "name": "David Johnson",
        "age": 16,
        "grade": "10th",
        "subjects": [
            "Computer Science",
            "Spanish",
            "Art"
        ]
       }
    ]
}
```

> Run the following command  
`json-server students.json` in git bash

## What is JSON

JSON (JavaScript Object Notation) is the most commonly used data format in API testing and communication for several reasons:

---

### **1. Simplicity**

- JSON is lightweight and easy to read, write, and understand.
- Its structure uses key-value pairs, making it intuitive for developers.

**Example**:
```json
{
  "name": "John Doe",
  "age": 30,
  "email": "john.doe@example.com"
}
```

---

### **2. Universality**

- JSON is language-agnostic and supported by almost all programming languages.
- Most modern APIs (RESTful APIs in particular) are designed around JSON for compatibility and ease of integration.

---

### **3. Wide Ecosystem Support**

- Tools and libraries for parsing, generating, and validating JSON are available in every major programming language.
  - **Python**: `json` module
  - **JavaScript**: `JSON.parse()` and `JSON.stringify()`
  - **Java**: Libraries like `Jackson` or `Gson`

---

### **4. Compact and Efficient**

- JSON uses a minimalistic syntax that reduces data size compared to XML or other formats, improving performance for API communication.
- Its text-based format ensures it is smaller in size than binary formats like Protocol Buffers (Protobuf) or MessagePack, though these may be faster.

---

### **5. Human-Readable**

- JSON is human-readable, making it easier to debug and test APIs without requiring additional tools to interpret the data.

---

### **6. Seamless with RESTful APIs**

- RESTful APIs widely use JSON as the primary data format for request and response payloads due to its efficiency and integration capabilities.

---

### **7. No Need for Additional Tools**

- Unlike file formats like Excel or HTML, which require specific libraries or parsers, JSON can be handled natively in most programming environments.

---

### **8. Extensibility**

- JSON supports complex nested structures and arrays, making it versatile for representing various data types and relationships.

**Example**: Handling nested data
```json
{
  "user": {
    "id": 123,
    "name": "Jane Doe",
    "contacts": [
      {"type": "email", "value": "jane.doe@example.com"},
      {"type": "phone", "value": "+123456789"}
    ]
  }
}
```

---

### **9. API Standards Adoption**

- Industry standards like **OpenAPI** and tools like **Postman** are built around JSON, streamlining development and testing workflows.

---

### **10. JSON Schema for Validation**

- JSON supports schema definitions for data validation, ensuring API payloads adhere to expected formats.

**Example**: JSON Schema

```json
{
  "type": "object",
  "properties": {
    "name": {"type": "string"},
    "age": {"type": "integer"}
  },
  "required": ["name", "age"]
}
```

---

### **Comparison with Other Formats**

| **Format** | **Advantages**                                | **Disadvantages**                           |
|------------|-----------------------------------------------|---------------------------------------------|
| **JSON**   | Lightweight, readable, widely supported       | Less efficient for large binary data        |
| **XML**    | Extensible, supports metadata via attributes  | Verbose and harder to parse                 |
| **YAML**   | Human-readable, good for configurations       | Less support in APIs, indentation sensitive |
| **Binary (e.g., Protobuf)** | Highly efficient, compact for large data | Requires serialization/deserialization      |

---

### **Conclusion**

JSON's balance of simplicity, flexibility, and ecosystem support makes it the go-to format for most API use cases. While other formats are used for specific scenarios (e.g., file uploads, binary data), JSON's universality ensures it remains the dominant choice.

### **Encryption and Decryption in API Communication**

Encryption and decryption play a crucial role in ensuring the **security** and **confidentiality** of data transmitted between clients and servers. Here's a breakdown of their relevance in APIs, with a focus on JSON:

---

### **1. Why Use Encryption in APIs?**

- **Data Security**: Protect sensitive information (e.g., credentials, personal data).
- **Prevent Eavesdropping**: Avoid interception of data during transmission.
- **Regulatory Compliance**: Meet standards like GDPR, HIPAA, and PCI-DSS.
- **Authentication and Integrity**: Ensure data is from a trusted source and hasn't been tampered with.

---

### **2. Common Encryption Methods**

#### **a. Transport Layer Encryption**

- **TLS/SSL**: Secures the entire communication channel.
  - APIs use HTTPS (HTTP over TLS) to encrypt all data in transit, including JSON payloads.
  - Prevents attackers from eavesdropping on the communication.

#### **b. Payload Encryption**

Encrypting the API request or response payload itself, often in addition to TLS, for an extra layer of security.

- **Symmetric Encryption**:
  - Uses a single key for both encryption and decryption.
  - Common algorithms: AES (Advanced Encryption Standard).
  - Use Case: Encrypting JSON payloads for APIs.
  
- **Asymmetric Encryption**:
  - Uses a public key for encryption and a private key for decryption.
  - Common algorithms: RSA, ECC.
  - Use Case: Securing API tokens or sharing encryption keys.

#### **c. Hashing**

- Ensures data integrity but does not provide confidentiality.
- Common algorithms: SHA-256, SHA-3.
- Use Case: Storing passwords securely or verifying the integrity of a payload.

---

### **3. Encryption with JSON**

While JSON itself is not inherently encrypted, you can encrypt the data within it:

#### **Before Transmission**

1. **Encrypt JSON Payload**:
   - Use symmetric or asymmetric encryption algorithms to secure the JSON.
   - Example (Python):
     ```python
     from cryptography.fernet import Fernet

     # Generate a key
     key = Fernet.generate_key()
     cipher = Fernet(key)

     # Encrypt JSON
     json_data = '{"name": "John Doe", "email": "john@example.com"}'
     encrypted_data = cipher.encrypt(json_data.encode())

     print(encrypted_data)
     ```

2. **Decrypt JSON Payload**:
   - The server decrypts the payload after receiving it using the same key.

---

#### **End-to-End Encryption for Sensitive Data**

- Encrypt fields selectively (e.g., passwords, credit card details).
- Example:
  ```json
  {
    "user_id": 123,
    "encrypted_password": "Q29tcGxleEVuY3J5cHRlZERhdGE="
  }
  ```

---

### **4. Tools for JSON Encryption**

- **JWT (JSON Web Token)**: 
  - Encodes and signs JSON for secure data exchange.
  - Includes a `payload`, a `header`, and a `signature`.
  - Can be encrypted using JWE (JSON Web Encryption).

**Example**:
```json
eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c
```

---

### **5. API Keys and Tokens Encryption**
APIs often use keys or tokens for authentication:

- **OAuth Tokens**: Access tokens are encrypted using symmetric or asymmetric encryption.
- **API Keys**: Often sent in headers, encrypted during transit via HTTPS.

---

### **6. Best Practices**

- **Always Use HTTPS**: Encrypt the transport layer.
- **Minimize Data Exposure**: Encrypt only sensitive data fields when necessary.
- **Use Strong Algorithms**: Opt for AES-256 for symmetric encryption or RSA-2048 for asymmetric encryption.
- **Regularly Rotate Keys**: Prevent vulnerabilities from exposed keys.
- **Validate Integrity**: Use HMAC (Hash-Based Message Authentication Code) to verify data authenticity.

---

### **7. Real-World Application**
#### **Example: Encrypted Payload in an API Request**

- Client encrypts the JSON payload with AES.
- Server decrypts it with the shared key and processes the data.

**Request**:
```json
{
  "encrypted_data": "U2FsdGVkX1+RtMe2+W4="
}
```

**Response**:
```json
{
  "status": "success",
  "message": "Data processed successfully"
}
```

---

### **8. Limitations of Encryption**

- **Performance Overhead**: Encryption increases computational requirements.
- **Key Management Complexity**: Securely sharing and storing keys can be challenging.
- **Does Not Prevent All Attacks**: Encryption doesn't protect against attacks like SQL injection or improper authorization.

---

### **Conclusion**
Encryption and decryption in API communication ensure that sensitive data remains secure during transmission and processing. By combining TLS/SSL with robust encryption algorithms for payloads and adhering to best practices, you can achieve strong API security.

```json
{
    "students":[

        {
            "sid":101,
            "sname":"John",
            "grad":"A"
        },
        {
            "sid":102,
            "sname":"Kim",
            "grad": "B"
        },
        {
            "sid":103,
            "sname":"Scott",
            "grad":"C"
        }
    ]
}
```
to find sname => 
`students[0].sname` => John
`students[2].sname` => Scott

## Capture and Validate JSON path

https://jsonpathfinder.com/
 
https://jsonpath.com