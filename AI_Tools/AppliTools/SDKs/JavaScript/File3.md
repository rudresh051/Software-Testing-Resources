* click on get otp button

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

      // Open eyes for the first baseline (Login Screen)
      await eyes.open(
        "Website Comparison",
        "Login Screen Baseline Get OTP 2025March7th_2232",
        { width: 1920, height: 1080 }
      );

      const loginBaselineImage = path.resolve(__dirname, "../FigmaImages/signin-tab-figma.png");
      await eyes.check("Figma Baseline - Login Screen", Target.image(loginBaselineImage));
      await eyes.close();

      console.log("✅ Baseline login image set!");

      // Open eyes for the second baseline (OTP Verification Screen)
      await eyes.open(
        "Website Comparison",
        "OTP Verification Screen Baseline 2025March7th_2232",
        { width: 1920, height: 1080 }
      );

      const otpBaselineImage = path.resolve(__dirname, "../FigmaImages/signin-otp-figma.png");
      await eyes.check("Figma Baseline - OTP Verification Screen", Target.image(otpBaselineImage));
      await eyes.close();

      console.log("✅ Baseline OTP verification image set!");

      console.log("✅ Both baselines are set! Now comment this section and run Step 2.");
    } else {
      // ======= STEP 2: Capture Website Screenshot & Compare =======
      console.log("Launching browser to capture login screen...");
      const browser = await puppeteer.launch({ headless: false });
      const page = await browser.newPage();
      await page.setViewport({ width: 1920, height: 1080 });
      // await page.goto("http://10.20.50.3:8097/", { waitUntil: "networkidle2" });
      await page.goto("http://10.20.50.3:8097/", { waitUntil: "networkidle2", timeout: 60000 });


      // ✅ Wait for splash screen to disappear before interacting
      await new Promise((resolve) => setTimeout(resolve, 6000));

      // Enter phone number
      console.log("Entering phone number...");
      await page.type('input[type="tel"]', "8123423432", { delay: 100 });

      // Wait for the "Get OTP" button to be activated
      console.log("Waiting for 'Get OTP' button to be enabled...");
      await page.waitForSelector("button:enabled", { timeout: 5000 });

      // Take a screenshot after entering phone number
      console.log("✅ Capturing login screen after entering phone number...");
      const loginScreenshot = path.resolve(__dirname, "../WebsiteImages/login-screen.png");
      await page.screenshot({ path: loginScreenshot });

      // Run visual comparison for Login Screen
      await eyes.open(
        "Website Comparison",
        "Login Screen Baseline Get OTP 2025March7th_2232",
        { width: 1920, height: 1080 }
      );
      await eyes.check("Website Login Screen After Phone Input", Target.image(loginScreenshot));
      await eyes.close();

      // ======= STEP 3: Click "Get OTP" & Capture OTP Screen =======
      console.log("Clicking 'Get OTP' button...");
      await page.click('button[title="GET OTP"]');

      // Wait for OTP verification page to load
      console.log("Waiting for OTP verification page...");
      await new Promise((resolve) => setTimeout(resolve, 5000));

      // Take a screenshot of the OTP verification page
      console.log("✅ Capturing OTP verification screen...");
      const otpScreenshot = path.resolve(__dirname, "../WebsiteImages/otp-verification-screen.png");
      await page.screenshot({ path: otpScreenshot });

      // Run visual comparison for OTP Verification Screen
      await eyes.open(
        "Website Comparison",
        "OTP Verification Screen Baseline 2025March7th_2232",
        { width: 1920, height: 1080 }
      );
      await eyes.check("Website OTP Verification Screen", Target.image(otpScreenshot));
      await eyes.close();

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