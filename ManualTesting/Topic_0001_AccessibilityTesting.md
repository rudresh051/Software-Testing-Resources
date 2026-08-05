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


# Accessibility Testing: Key Test Cases

## 1. Perceivable

### 1.1 Alternative Text for Images
- **Test Case Summary:** Verify that all images have descriptive alternative text (alt text).
- **Expected Output:** All images have alt text that accurately describes the content, making it accessible to screen readers.

### 1.2 Captions and Transcripts for Media
- **Test Case Summary:** Ensure that any video content has captions and any audio content has a transcript.
- **Expected Output:** Video content includes captions, and audio content is accompanied by a transcript within the PDF or webpage.

### 1.3 Document Structure with Headings
- **Test Case Summary:** Check that the document includes headings, lists, and other semantic elements to communicate structure.
- **Expected Output:** The document has a clear and logical structure with correctly tagged headings and lists.

### 1.4 Sufficient Color Contrast
- **Test Case Summary:** Ensure there is sufficient contrast between text and background colors.
- **Expected Output:** Text has sufficient contrast with the background, meeting the minimum ratio of 4.5:1 for normal text.

## 2. Operable

### 2.1 Keyboard Accessibility for All Controls
- **Test Case Summary:** Verify that all menus, links, buttons, and other interactive controls are operable using a keyboard.
- **Expected Output:** All interactive elements can be accessed and operated using only the keyboard.

### 2.2 Visible Focus Indicator
- **Test Case Summary:** Ensure there is a visible focus indicator when navigating using a keyboard.
- **Expected Output:** A visible focus indicator (e.g., outline or highlight) appears as users navigate through interactive elements with the keyboard.

### 2.3 Avoidance of Flashing or Flickering Content
- **Test Case Summary:** Ensure that the content does not include flashing or flickering elements that could cause seizures.
- **Expected Output:** The content is free from flashing or flickering elements, ensuring it does not pose a seizure risk to users.

### 2.4 Control for Auto-Scrolling or Auto-Updating Content
- **Test Case Summary:** Check that auto-scrolling or auto-updating features have accessible controls for pausing or advancing.
- **Expected Output:** Users can pause or advance auto-scrolling or auto-updating content using accessible controls.

## 3. Understandable

### 3.1 Language Definition
- **Test Case Summary:** Verify that the document's language or parts of a multilingual document are correctly defined.
- **Expected Output:** The document's primary language is specified, and any sections in other languages are tagged appropriately.

### 3.2 Consistent Navigation
- **Test Case Summary:** Ensure that navigation elements are consistent throughout the document.
- **Expected Output:** Navigation elements are consistent across the entire document, allowing predictable navigation.

### 3.3 Accessible Error and Verification Messages
- **Test Case Summary:** Verify that forms provide clear, accessible error and verification messages.
- **Expected Output:** Form fields provide descriptive error messages and verification prompts that are accessible to assistive technologies.

## 4. Robust

### 4.1 Valid HTML Code (for Web-Linked Content)
- **Test Case Summary:** Verify that any web-linked content is coded using valid HTML.
- **Expected Output:** The associated web content uses valid HTML, ensuring compatibility with all user agents and assistive technologies.

### 4.2 ARIA Markup for Rich Interfaces
- **Test Case Summary:** Ensure that rich interfaces (e.g., modal windows, dropdown menus) include proper ARIA markup.
- **Expected Output:** Rich interfaces are properly tagged with ARIA markup to ensure compatibility and accessibility for assistive technologies.


