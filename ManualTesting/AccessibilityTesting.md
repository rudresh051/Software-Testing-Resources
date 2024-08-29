# 508 Compliance Testing for PDFs

## Tools and Resources

### 1. WCAG Quick Reference (W3C)
- **Link:** [WCAG 2.1 Quick Reference](https://www.w3.org/WAI/WCAG21/quickref/?versions=2.0&showtechniques=123#qr-media-equiv-captions)
- **Purpose:** Provides technical guidance and techniques for meeting the WCAG (Web Content Accessibility Guidelines) standards.
- **Application to PDFs:** Use it to find techniques related to text alternatives, logical structure, language settings, and more, applicable to PDFs.

### 2. Section508.gov Testing Tools
- **Link:** [Section 508 Testing Tools](https://www.section508.gov/test/web-software/)
- **Purpose:** A comprehensive list of tools for testing web and software products for 508 compliance.
- **PDF-Specific Tools:**
  - **Adobe Acrobat Pro DC:** Built-in accessibility checker for PDFs.
  - **PAC (PDF Accessibility Checker):** Tool specifically designed to check PDF files for accessibility issues.
  - **CommonLook PDF Validator:** Powerful tool for testing PDF accessibility.
  - **PAVE (PDF Accessibility Validation Engine):** Web-based tool for checking and improving PDF accessibility.

### 3. ANDI (Accessible Name & Description Inspector)
- **Link:** [Install ANDI](https://www.ssa.gov/accessibility/andi/help/install.html)
- **Purpose:** An open-source bookmarklet that audits web content for 508 compliance by inspecting accessible names and descriptions.
- **Application to PDFs:**
  - **For PDFs in Web Browsers:** ANDI can be used if the PDF is displayed within a web browser (e.g., embedded in a viewer).
  - **For Standalone PDFs:** Use PDF-specific tools like Adobe Acrobat's Accessibility Checker or PAC for auditing.

## Steps to Test a Downloaded PDF for Accessibility

1. **Open the PDF in Adobe Acrobat Pro DC:**
   - Navigate to **Tools > Accessibility** and select **Full Check** to run the accessibility checker.
   - Review the generated report to identify accessibility issues.

2. **Use PDF Accessibility Checker (PAC):**
   - Download and install PAC if Adobe Acrobat is not available.
   - Run PAC to evaluate the PDF’s compliance with PDF/UA (ISO 14289) and WCAG standards.

3. **Check with CommonLook or PAVE:**
   - Use these tools to validate the accessibility of your PDF and get detailed feedback on fixing issues.

4. **Apply WCAG Guidelines:**
   - Refer to the WCAG Quick Reference for specific techniques to address issues identified during the tests.

## Screen Reader Testing
- **Screen Readers:** Test the PDF with screen readers like JAWS, NVDA, or VoiceOver to ensure it is read correctly.
- **Tab Order and Reading Order:** Ensure that the reading order is logical and the tab order is intuitive.

