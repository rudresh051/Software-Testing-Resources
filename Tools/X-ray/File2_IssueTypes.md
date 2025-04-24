In **Xray for Jira**, *issue types* are the core building blocks used to represent different testing artifacts. Xray introduces **its own custom issue types** on top of Jira’s default ones to support the **entire testing lifecycle** — from writing test cases to managing test runs and tracking results.

---

### 🧪 Xray Issue Types Overview

| **Issue Type**   | **Purpose**                                                                 |
|------------------|------------------------------------------------------------------------------|
| **Test**         | Represents a single test case. Can be manual, automated, or generic.        |
| **Pre-Condition**| Defines conditions that must be met before a Test runs.                     |
| **Test Set**     | A logical grouping of multiple Test issues.                                 |
| **Test Plan**    | Organizes Test Executions with a testing strategy or campaign in mind.      |
| **Test Execution**| Records the actual execution of Tests — run results, status, defects, etc. |
| **Test Repository** | (Optional, depending on config) Used to organize tests in folders.       |

---

### 🔍 Quick Definitions

- **Test**  
  This is your main test case artifact. It can include steps, expected results, and links to requirements.

- **Pre-Condition**  
  Think of this like test setup steps. If multiple tests need a login state, create a "Logged In" pre-condition.

- **Test Set**  
  Like a playlist of tests — helpful to reuse in multiple executions.

- **Test Plan**  
  You use this to plan a round of testing. It tracks overall test coverage, progress, and results.

- **Test Execution**  
  Represents a specific execution of one or more Tests — with status like Passed/Failed, execution dates, evidence, etc.

---

### 🎯 Example Flow

Let’s say you want to test the **Amazon login page**:

1. Create a **Test**: “Verify valid login”
2. Add a **Pre-Condition**: “User account exists”
3. Group tests in a **Test Set**: “Login Functionality”
4. Create a **Test Plan**: “Sprint 5 Regression”
5. Add a **Test Execution**: Record actual test run from Jenkins or manual test

