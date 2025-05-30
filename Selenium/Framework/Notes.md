# 📋 **General Approach for Organizing Test Automation Code**

| **Code Aspect**               | **Where to Put It?**                                                                                                                               | **Purpose / Notes**                                                               |
| ----------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| **UI Locators & Elements**    | In **Page Objects / UI Classes**                                                                                                                   | Encapsulate all element locators so tests don’t directly access UI details.       |
| **UI Actions / Methods**      | In **Page Objects / UI Classes**                                                                                                                   | Define reusable actions (click, type, select) abstracted from tests.              |
| **Core Business Logic**       | In **Page Objects or Service Classes**                                                                                                             | Encapsulate complex interactions or API calls separate from tests.                |
| **Test Scenarios / Flows**    | In **Test Classes / Test Suites**                                                                                                                  | Implement the actual test steps, invoking page methods in order.                  |
| **Assertions / Validations**  | In **Test Classes / Test Suites**                                                                                                                  | Verify expected outcomes, results, or UI states after actions.                    |
| **Test Setup & Teardown**     | In **Test Base / Setup Classes**                                                                                                                   | Initialize drivers, config, cleanup, and environment before/after tests.          |
| **Reporting Logic**           | In **Test Classes or Reporting Utilities**                                                                                                         | Log test steps, generate reports (ExtentReports, Allure, etc.).                   |
| **Logging (Log4j, etc.)**     | - In **Page Objects**: Log UI actions and element interactions<br> - In **Test Classes**: Log test flow, assertions, and test start/end            | Separate detailed UI logs from high-level test execution logs.                    |
| **Exception Handling**        | - In **Page Objects**: Handle UI interaction failures (timeouts, element not found)<br> - In **Tests**: Handle unexpected test failures gracefully | Keep UI reliability and test stability in mind separately.                        |
| **Configuration & Constants** | In **Config Files or Utility Classes**                                                                                                             | Centralize URLs, credentials, timeouts, reusable constants.                       |
| **Utility Functions**         | In **Utility Classes / Helpers**                                                                                                                   | Common helper methods used across pages and tests (e.g., waits, date formatting). |

---

### 🔑 Key Principles

* **Separation of Concerns:** Keep UI details away from test logic; tests should focus on **what** to test, not **how** UI is handled.
* **Reusability:** Page Objects and Utilities should be generic enough to be used across multiple tests.
* **Maintainability:** Changes in UI affect only Page Objects, minimizing test rewrites.
* **Clarity:** Tests are readable sequences of actions + assertions, easy to understand by non-developers.
* **Logging & Reporting:** Use detailed logs for debugging (in page objects) and summarized test-level logs and reports (in tests).

---

### Example Workflow in General Terms

| Step                    | Responsible Component          | Description                                   |
| ----------------------- | ------------------------------ | --------------------------------------------- |
| Initialize test context | Test Base / Setup Classes      | Set up browser, test data, configurations.    |
| Navigate to page        | Test Class calling Page Object | Call page object method to load the page.     |
| Perform actions         | Page Object                    | Call reusable methods like `enterUsername()`. |
| Validate results        | Test Class                     | Use assertions to verify outcomes.            |
| Log events              | Both (Page & Test Classes)     | Log UI interactions and test progress.        |
| Generate reports        | Reporting Utility              | Produce readable test execution summaries.    |
| Cleanup after tests     | Test Base / Teardown Methods   | Close browsers, release resources.            |

