# Best Practices
* How to maintain test cases across different projects
    * How to maintain Regression Suites



## ✅ Best Practices for Maintaining Test Cases in Jira

### 1. **Organize with a Structure**

* Use **Folders / Components / Labels** to categorize tests (e.g., *Login*, *Checkout*, *Reports*).
* Maintain a **clear naming convention**:
  Example → `TC-Login-Valid-Credentials` instead of `TC1`.
* Group test cases by **features/modules** so they’re easy to find.

---

### 2. **Keep Test Cases Reusable**

* Avoid duplicating the same steps in multiple cases.
* Use **shared steps or parameterization** (Xray supports parameterized tests, Zephyr has reusable steps in Scale).
* Write test cases at the right level of detail — not too vague, not too granular.

---

### 3. **Traceability**

* Link test cases to **requirements (stories, epics)** in Jira.
* Link executed tests to **defects** so you can see what failed and why.
* Run **traceability reports** regularly to check coverage gaps.

---

### 4. **Version Control / Maintenance**

* Update test cases when the functionality changes.
* Mark old ones as **obsolete/deprecated** instead of deleting, for history.
* Review & clean test cases every sprint or release cycle.

---

### 5. **Test Cycles & Execution**

* Create **Test Cycles / Test Plans** aligned with sprints or releases.
* Avoid mixing unrelated tests into one cycle.
* Track execution progress daily during a sprint.

---

### 6. **Ownership & Collaboration**

* Assign **default owners** (per component or feature) so responsibility is clear.
* Encourage testers to **review each other’s test cases** before finalizing.
* Developers can also review for technical accuracy.

---

### 7. **Standardization**

* Define a **test case template** (fields like Preconditions, Steps, Expected Results, Priority, Labels).
* Use consistent **status values** (Pass, Fail, Blocked, Not Run).
* Agree on priority/severity definitions as a team.

---

### 8. **Automation Integration**

* Link automated test results back into Jira (via Jenkins, Selenium, Cypress, etc.).
* Mark which test cases are **manual vs automated**.
* Regularly update the mapping to keep automation coverage visible.

---

### 9. **Reporting & Metrics**

* Use dashboards to monitor:

  * Test coverage per feature
  * Pass/Fail trends
  * Defects linked to failed tests
* Share reports with stakeholders for transparency.

---

### 10. **Review & Retire**

* At the end of each release, **review test cases**:

  * Remove duplicates
  * Merge overlapping ones
  * Archive old, irrelevant cases
* This keeps your test repository lean and efficient.

---

👉 In short:
Keep your test cases **organized, traceable, reusable, and reviewed regularly**. Treat your test suite like source code — it needs versioning, cleanup, and maintenance.