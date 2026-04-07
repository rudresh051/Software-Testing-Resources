# Regular Expression

**Definition -**  
A regular expression(regex) is a sequence of characters that define a search pattern, mainly for use in pattern matching with strings.

**Uses** - Validating input, searching, and replacing the text

2. **Basic Syntax/Literal Characters**

Website - regex101.com

Literal characters - Match themselves

e.g. `abc` matches "abc"  

![alt text](image-110.png)

3. **Special Charcters**

Dot(`.`) - Matches any single charcter except newline

example - `a.c` matches "abc", "adc", "a_c" etc

![alt text](image-111.png)

4. **Character Classes**

* **Square brackets** `[]` matches **any one** of the enclosed characters
  * Example - `[abc]` matches "a" , "b" or "c".

![alt text](image-112.png)

![alt text](image-113.png)

* **Range** - Inside square brackets to specify a range of characters.
  * Example - `[a-z]` matches any lowercase letter

![alt text](image-114.png)

![alt text](image-115.png)

5. **Predefined Character Classes**

* `\d` - Matches any digit (0-9)
* `\w` - Matches any word character(alphanumeric plus underscore)
* `\s` - Matches any whitespace character (space, tab, newline)

![alt text](image-116.png)

![alt text](image-117.png)

![alt text](image-118.png)

6. **Quantifiers**

* Asterisk - `*` Matches 0 or more of the preceding element.
  * Example - `a*` matches "", "aa" etc
* Plus - `+` Matches 1 or more of the preceding element.
  * Example - `a+` matches "a", "aa" etc
* Question Mark - `?` Matches 0 or 1 of the preceding element
  * Example - `a?` matches "" or "a"


![alt text](image-119.png)

![alt text](image-120.png)

7. **Exact Quantifiers**

* Curly Braces - `{}` Matches a specific number of times
  * Example - `a{2}` matches "aa"
  * Range `a{2,4}` matches "aa", "aaa" or "aaaa"


![alt text](image-121.png)

below example for 2 or more

![alt text](image-122.png)


8. **Anchors**

* **Caret** - `^` Matches the start of a string
  * Example - `^a` matches "a" at the start of the string
* **Dollar** - `$` Matches the end of a string
  * Example - `a$` matches "a" at the end of the string

![alt text](image-123.png)

![alt text](image-124.png)

9. **Grouping and Alteration**

* **Parentheses** - `()` Groups patterns together
  * Example - `(abc)+` matches "abc", "abcabc" etc
* **Pipe** - `|` Alteration (OR Operator)
  * Example - `a|b`  matches "a" or "b"

![alt text](image-125.png)

![alt text](image-126.png)

![alt text](image-127.png)