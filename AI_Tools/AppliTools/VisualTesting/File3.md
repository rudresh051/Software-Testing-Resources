# Match Level

In Applitools, **Match Level** refers to the visual comparison strategy used to determine how two images (baseline vs. checkpoint) are compared during visual testing. Applitools provides different match levels to handle various scenarios and needs. Here’s a breakdown of the most commonly used match levels:

### 1. **Exact Match**  
   - **Description**: Compares every pixel exactly. Even the slightest difference (e.g., anti-aliasing, font rendering) will cause the test to fail.
   - **Use Case**: Best for static content or scenarios where no changes are expected.

---

### 2. **Strict Match (Default)**  
   - **Description**: Detects even small visual differences but allows for minor rendering inconsistencies, such as anti-aliasing.
   - **Use Case**: General-purpose testing. Ideal for pixel-perfect web and UI testing when slight variances are expected but should be flagged.

---

### 3. **Content Match**  
   - **Description**: Ignores minor visual differences and focuses on content and layout. For instance, small color or style changes are not considered a failure, but layout shifts or missing content are flagged.
   - **Use Case**: Useful when testing text-heavy pages or content with minor design changes (e.g., changing font styles).

---

### 4. **Layout Match**  
   - **Description**: Ignores content differences and focuses on the overall structure. Only significant layout changes (e.g., element positions) are flagged.
   - **Use Case**: Ideal for responsive design testing or when content changes are frequent but layout consistency is essential.

---

### 5. **Ignore Colors**  
   - **Description**: Matches the structure of the page without considering color differences.
   - **Use Case**: Useful for testing websites where color changes are expected (e.g., dark/light themes).

---

### **Choosing the Right Match Level**  
You can choose the appropriate match level based on the context and stability of the UI you are testing. For example:  
- **New product launches**: Start with **Strict Match**.  
- **Dynamic content or minor changes**: Consider **Content Match** or **Layout Match**.

To apply a specific match level in Applitools, you can configure it using the **`setMatchLevel`** method in your test script. Here’s how you can do it in a Selenium-based Java test:

---

### **1. Setting the Match Level in Applitools**
```java
import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.selenium.Eyes;

public class ApplitoolsTest {
    public static void main(String[] args) {
        // Initialize the Eyes SDK
        Eyes eyes = new Eyes();
        
        // Set your Applitools API key
        eyes.setApiKey("YOUR_API_KEY");

        // Set the Match Level (choose one based on your needs)
        eyes.setMatchLevel(MatchLevel.STRICT); // Default option
        // eyes.setMatchLevel(MatchLevel.CONTENT); // Ignores small visual differences
        // eyes.setMatchLevel(MatchLevel.LAYOUT);  // Ignores content differences, checks structure
        // eyes.setMatchLevel(MatchLevel.EXACT);   // Pixel-perfect comparison
        // eyes.setMatchLevel(MatchLevel.IGNORE_COLORS); // Ignores color differences

        // Continue with your test execution...
    }
}
```

---

### **Explanation**
1. **`eyes.setMatchLevel(MatchLevel.STRICT)`**: This is the default match level, comparing for precise but not pixel-perfect differences.
2. Change to other match levels (`MatchLevel.CONTENT`, `MatchLevel.LAYOUT`, `MatchLevel.EXACT`, `MatchLevel.IGNORE_COLORS`) as needed.

---

### **2. Applying Different Match Levels Per Checkpoint**  
If you want to apply different match levels for different visual checkpoints, you can use `CheckSettings`:

```java
import com.applitools.eyes.selenium.fluent.Target;
import com.applitools.eyes.MatchLevel;

// Example: Apply different match levels per visual checkpoint
eyes.check("Strict Check", Target.window().matchLevel(MatchLevel.STRICT));
eyes.check("Layout Check", Target.window().matchLevel(MatchLevel.LAYOUT));
```

---

### **When to Apply Match Levels**
- **Strict**: Use for static UIs or where precise differences matter.  
- **Layout**: Great for responsive or dynamic UIs where content changes but layout matters.  
- **Content**: Useful for text-based pages where style changes don’t matter.  
- **Exact**: For pixel-perfect comparison when visual fidelity is critical.  
- **Ignore Colors**: When visual differences in color (e.g., theme changes) are not important.



# Practical Demo : Part-2