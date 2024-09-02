#### Q. Write down test cases for google search


| Test Case                               | Description                                                                                                                                      |
|-----------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------|
| Basic Search Functionality Test         | Verify that users can enter a search query in the search bar and obtain relevant search results.                                               |
| Search Results Accuracy Test            | Ensure that the search results displayed are relevant and accurate to the user's query.                                                         |
| Search Suggestions Test                 | Verify that search suggestions/auto-complete feature provides relevant suggestions as the user types their query.                                 |
| Advanced Search Operators Test          | Test the functionality of advanced search operators (e.g., site:, intitle:, filetype:) to refine search results.                                |
| Search Filters Test                     | Verify that users can use search filters (e.g., time range, location) to narrow down search results according to their preferences.             |
| Image Search Test                       | Ensure that image search functionality retrieves relevant images based on the user's query.                                                    |
| Video Search Test                       | Verify that video search functionality retrieves relevant videos based on the user's query.                                                      |
| News Search Test                        | Test the news search functionality to ensure it provides up-to-date and relevant news articles related to the user's query.                      |
| Maps and Location Search Test           | Verify that users can search for locations and receive accurate maps and location information in search results.                                 |
| Knowledge Graph Test                    | Test the Knowledge Graph feature to ensure it provides relevant information and quick answers to common queries directly in search results.    |
| Voice Search Test                       | Verify that users can perform searches using voice commands and receive accurate results.                                                        |
| Search Result Page Navigation Test      | Ensure that users can navigate through multiple pages of search results using pagination or infinite scroll functionality.                      |
| Cached Pages Test                      | Verify that users can access cached versions of web pages in search results when the original page is unavailable.                               |
| Related Searches Test                   | Test the related searches feature to ensure it provides relevant alternative queries related to the user's original search.                      |
| Instant Answer Test                     | Ensure that instant answer cards (e.g., weather, currency conversion) are displayed for relevant queries directly in search results.           |
| Mobile Search Test                      | Verify that Google Search functions correctly on mobile devices, including responsive design and touch interactions.                          |
| Cross-Browser Compatibility Test        | Test Google Search across different web browsers to ensure compatibility and consistent functionality.                                           |
| Accessibility Test                      | Verify that Google Search is accessible to users with disabilities, including screen readers and keyboard navigation.                           |
| Performance and Load Test               | Test the performance and load handling capabilities of Google Search under various traffic conditions to ensure scalability and responsiveness.|
| Security Test                           | Ensure that Google Search utilizes secure protocols (HTTPS) and protects user privacy and data integrity in search interactions.                |
| Localization Test                       | Test Google Search in different languages and regions to ensure localization and language-specific functionality.                                |
| Advertising and Sponsored Content Test | Verify that sponsored search results and advertisements are clearly labeled and do not interfere with organic search results.                  |


#### Write down test cases for login page with email ID and password
| Test Case                         | Description                                                                                                             |
|-----------------------------------|-------------------------------------------------------------------------------------------------------------------------|
| Empty Fields Validation Test      | Verify that the login form does not allow submission if the email ID and password fields are left blank.                 |
| Invalid Email Format Test         | Test the validation of the email ID field to ensure it only accepts email addresses in a valid format.                  |
| Valid Email Format Test           | Ensure that the login form accepts valid email addresses in the correct format (e.g., example@example.com).             |
| Incorrect Email Test              | Verify that entering an incorrect email ID results in an error message prompting the user to enter a valid email.       |
| Incorrect Password Test           | Verify that entering an incorrect password results in an error message indicating that the password is incorrect.       |
| Successful Login Test             | Test successful login by entering a valid email ID and password combination and verifying that the user is logged in.  |
| Remember Me Functionality Test    | Verify that the "Remember Me" checkbox, if available, retains user login credentials across sessions or browser restarts. |
| Password Visibility Toggle Test   | Test the functionality of the password visibility toggle to ensure that passwords can be shown or hidden as per user preference. |
| Caps Lock Warning Test            | Verify that a warning message is displayed if the Caps Lock key is activated while entering the password.               |
| Forgot Password Link Test         | Ensure that the "Forgot Password" link redirects the user to a password recovery page where they can reset their password. |
| Account Lockout Test               | Test the account lockout functionality by entering incorrect login credentials multiple times and verifying that the account is locked after reaching the maximum allowed attempts. |
| Session Management Test            | Verify that the user session expires after a certain period of inactivity and requires re-authentication to access the login-protected content. |
| Cross-site Scripting (XSS) Test   | Test the login form for vulnerability to XSS attacks by entering malicious scripts into the email ID and password fields. |
| Brute Force Attack Protection Test| Test the system's resilience against brute force attacks by attempting to login with various combinations of email IDs and passwords. |
| Social Login Integration Test     | Verify the integration of social login options (e.g., Google, Facebook) and ensure users can login using their social media accounts. |
| Multi-factor Authentication Test  | Test the functionality of multi-factor authentication (e.g., OTP sent via email or SMS) to ensure additional security measures for login. |
| Error Handling Test               | Test error handling scenarios such as network errors, server errors, or unexpected responses, and ensure appropriate error messages are displayed to the user. |
| Compatibility Test                | Test the login page across different browsers, devices, and screen resolutions to ensure compatibility and consistent user experience. |
| Accessibility Test                | Verify that the login page is accessible to users with disabilities, including screen readers and keyboard navigation.     |
| Performance Test                  | Test the performance of the login page under various load conditions to ensure scalability and responsiveness.            |
| Security Test                     | Ensure that the login page follows security best practices such as encryption of user credentials, secure storage of passwords, and protection against common vulnerabilities. |

Q 3 - How will you determine when to stop testing?

Ans: It can be hard to know when to stop testing. Many modern software applications are so complicated and run in such a relaxed environment that thorough testing is impossible. The following are some regular criteria to consider when considering when to end testing:

Deadlines are very important (release deadlines, testing deadlines, etc.)
Completed test cases with a certain percentage of passing
When the test budget runs out
When the coverage of code, functionality, or requirements arrives at a certain point, it is said to be complete
When the bug rate drops below a specific threshold
When the beta or alpha testing stage is over


## Q. How to do the Manual Regression testing?
Regression testing involves re-running previously executed test cases to ensure that recent changes or updates to the software have not introduced new defects or affected existing functionality. The selection of test scenarios for regression testing can indeed depend on the tester's judgment and understanding of the application's critical functionalities. Here’s a bit more detail:

### Key Points in Regression Testing:

1. **Identify Critical Functionality:**
   - Testers need to determine which functionalities are crucial for the application's core operations. These functionalities are more likely to be impacted by changes and should be included in regression testing.

2. **Impact Analysis:**
   - Assess the changes made to the software (e.g., bug fixes, new features, code refactoring) and analyze which parts of the application might be affected. This helps in selecting relevant test scenarios.

3. **Select Test Scenarios:**
   - Based on the impact analysis, testers select test scenarios that cover:
     - **Core Functionality:** Key features that are critical to the application’s operation.
     - **Integration Points:** Areas where different parts of the application interact.
     - **High-Risk Areas:** Features that are prone to bugs or have been recently changed.
     - **Previous Defects:** Areas where bugs were previously found and fixed to ensure they don't reappear.

4. **Test Case Selection:**
   - For each selected test scenario, specific test cases are chosen to ensure thorough coverage. This can include both positive and negative test cases.

5. **Automation Considerations:**
   - If possible, automating regression test cases can save time and ensure consistency. Automated test cases can be rerun efficiently whenever changes are made.

### Summary
Regression testing involves a strategic approach to selecting and running test cases based on the criticality of functionalities, recent changes, and the potential impact of those changes. Testers use their judgment to ensure that the most important and affected areas of the application are thoroughly tested to maintain software quality.

## Which type of Testing to do in regression testing?
In regression testing, the primary focus is usually on **functional testing** rather than **UI/UX testing**. Here's why:

### Focus of Regression Testing:
1. **Functional Testing:**
   - **Purpose:** The main goal of regression testing is to ensure that existing functionalities still work as expected after changes have been made to the codebase (e.g., bug fixes, enhancements, or new features).
   - **Scope:** Test cases in regression testing typically focus on the core functionality, business logic, data processing, and system integration. These are areas where changes in the code are more likely to introduce defects.
   - **Examples:** Verifying that a login process still works, ensuring that data is correctly processed after a form submission, or checking that a calculation or algorithm still returns the correct results.

2. **UI/UX Testing:**
   - **Purpose:** UI/UX testing focuses on the look, feel, and usability of the application. It includes aspects like layout, responsiveness, visual elements, and user interaction flow.
   - **Scope:** While UI/UX is crucial for user satisfaction, it is less likely to be the primary focus in regression testing unless the recent changes directly affect the UI (e.g., a redesign or changes in the front-end code).
   - **Examples:** Ensuring that buttons are correctly aligned, verifying that navigation menus are intuitive, or checking that the application is responsive on different devices.

### Exceptions:
- **When UI/UX is Affected by Changes:** If the code changes are likely to impact the user interface or user experience (e.g., updating a front-end framework, changing UI components, or implementing a new design), then UI/UX aspects may be included in regression testing.
- **Visual Regression Testing:** Some teams include visual regression testing as part of their regression testing suite, where automated tools capture screenshots and compare them pixel-by-pixel to detect any unintended visual changes.

### Summary
Regression testing primarily focuses on **functional aspects** of the application to ensure that recent changes have not broken existing functionality. **UI/UX testing** is generally not the main focus unless the changes directly impact the user interface or experience.

## 