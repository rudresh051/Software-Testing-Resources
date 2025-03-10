## login + OTP verification

```
"use strict";
const {
  Eyes,
  Target,
  Configuration,
  BatchInfo,
} = require("@applitools/eyes-images");
const puppeteer = require("puppeteer");
const path = require("path");

(async () => {
  const eyes = new Eyes();
  const configuration = new Configuration();
  configuration.setBatch(new BatchInfo("Login Screen Test"));
  eyes.setConfiguration(configuration);

  try {
    if (process.env.BASELINE_SETUP === "true") {
      // ======= STEP 1: Set Local Figma Images as Baseline =======
      console.log("Setting local Figma images as baseline...");

      await eyes.open(
        "Website Comparison",
        "Login Screen Baseline Get OTP 2025March10th_2337",
        { width: 1920, height: 1080 }
      );

      const loginBaselineImage = path.resolve(__dirname, "../FigmaImages/signin-tab-figma.png");
      await eyes.check("Figma Baseline - Login Screen", Target.image(loginBaselineImage));
      // await eyes.close();

      console.log("✅ Baseline login image set!");

      // await eyes.open(
      //   "Website Comparison",
      //   "OTP Verification Screen Baseline 2025March7th_2232",
      //   { width: 1920, height: 1080 }
      // );

      const otpBaselineImage = path.resolve(__dirname, "../FigmaImages/signin-otp-figma.png");
      await eyes.check("Figma Baseline - OTP Verification Screen", Target.image(otpBaselineImage));
      await eyes.close();

      console.log("✅ Baseline OTP verification image set!");
      console.log("✅ Both baselines are set! Now comment this section and run Step 2.");
    } else {
      const browser = await puppeteer.launch({
        headless: false,
        args: ["--start-maximized"] // ✅ Keep the browser maximized
      });
  
      const page = await browser.newPage();
  
      // ✅ Set the viewport to 1920x1080 explicitly
      await page.setViewport({ width: 1920, height: 1080 });
  
      console.log("✅ Browser is maximized & viewport set to 1920x1080.");
  
      // Navigate to the login page
      await page.goto("http://10.20.50.3:8097/", { waitUntil: "networkidle2", timeout: 60000 });
  
      // ✅ Wait for splash screen to disappear
      await new Promise(resolve => setTimeout(resolve, 6000));
  
      // Enter phone number
      console.log("Entering phone number...");
      await page.type('input[type="tel"]', "9973541934", { delay: 100 });
  
      // ✅ Wait for "Get OTP" button to be enabled
      await page.waitForFunction(() => {
        const button = document.querySelector('button[title="GET OTP"]');
        return button && !button.disabled;
      }, { timeout: 10000 });
  
      console.log("✅ 'Get OTP' button is now enabled!");
  
      // ✅ Take screenshot of login screen before clicking "Get OTP"
      console.log("✅ Capturing login screen before clicking 'Get OTP'...");
      const loginScreenshot = path.resolve(__dirname, "../WebsiteImages/login-screen.png");
      await page.screenshot({ path: loginScreenshot, fullPage: true });
  
      // ✅ Open Applitools Eyes for Login Screen
      await eyes.open(
        "Website Comparison",
        "Login Screen Baseline 2025March10th_2232",
        { width: 1920, height: 1080 }
      );
  
      // ✅ Run visual comparison for Login Screen
      await eyes.check("Website Login Screen", Target.image(loginScreenshot));
  
      // ✅ Close session for Login Screen
      // await eyes.close();
      console.log("✅ Login Screen comparison done!");
  
      // ✅ Click the "Get OTP" button
      await page.click('button[title="GET OTP"]');
      console.log("✅ 'Get OTP' button clicked!");
  
      // ✅ Wait for OTP screen to load
      await page.waitForSelector('input.input-field', { visible: true, timeout: 15000 });
  
      // ✅ Take screenshot of OTP verification page
      console.log("✅ Capturing OTP verification screen...");
      const otpScreenshot = path.resolve(__dirname, "../WebsiteImages/otp-verification-screen.png");
      await page.screenshot({ path: otpScreenshot, fullPage: true });
  
      // ✅ Open Applitools Eyes for OTP Verification Screen
      // await eyes.open(
      //   "Website Comparison",
      //   "OTP Verification Screen Baseline 2025March7th_2232",
      //   { width: 1920, height: 1080 }
      // );
  
      // ✅ Run visual comparison for OTP Verification Screen
      await eyes.check("Website OTP Verification Screen", Target.image(otpScreenshot));
  
      // ✅ Close session for OTP Verification Screen
      await eyes.close();
      console.log("✅ OTP Verification Screen comparison done!");
  
      // Close browser
      await browser.close();
      console.log("✅ Comparison completed! Check Applitools dashboard.");
          
    }
  } catch (error) {
    console.error("Error:", error);
  } finally {
    await eyes.abortIfNotClosed();
  }
})();
```