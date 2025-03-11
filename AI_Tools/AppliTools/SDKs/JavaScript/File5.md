## OTP Values entered

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
  let browser = null; // ✅ Define browser at the start

  try {
    if (process.env.BASELINE_SETUP === "true") {
      // ======= STEP 1: Set Local Figma Images as Baseline =======
      console.log("Setting local Figma images as baseline...");

      await eyes.open(
        "Website Comparison",
        "Sign in enter OTP Values March11th 2325",
        { width: 1920, height: 1080 }
      );

      const loginBaselineImage = path.resolve(
        __dirname,
        "../FigmaImages/enter-otp-values-figma.png"
      );
      await eyes.check(
        "Figma Baseline - Enter OTP Values Screen",
        Target.image(loginBaselineImage)
      );

      console.log("✅ Baseline enter OTP image set!");

      const otpBaselineImage = path.resolve(
        __dirname,
        "../FigmaImages/registration-pending-figma.png"
      );
      await eyes.check(
        "Figma Baseline - Registration Pending Screen",
        Target.image(otpBaselineImage)
      );
      await eyes.close();

      console.log("✅ Baseline Registration Pending image set!");
      console.log(
        "✅ Both baselines are set! Now comment this section and run Step 2."
      );
    } else {
      browser = await puppeteer.launch({
        headless: false,
        args: ["--start-maximized"], // ✅ Keep the browser maximized
      });

      const page = await browser.newPage();

      // ✅ Set the viewport to 1920x1080 explicitly
      await page.setViewport({ width: 1920, height: 1080 });

      console.log("✅ Browser is maximized & viewport set to 1920x1080.");

      // Navigate to the login page
      await page.goto("http://10.20.50.3:8097/", {
        waitUntil: "networkidle2",
        timeout: 60000,
      });

      // ✅ Wait for splash screen to disappear
      await new Promise((resolve) => setTimeout(resolve, 6000));

      // Enter phone number
      console.log("Entering phone number...");
      await page.type('input[type="tel"]', "9973541934", { delay: 100 });

      // ✅ Wait for "Get OTP" button to be enabled
      await page.waitForFunction(
        () => {
          const button = document.querySelector('button[title="GET OTP"]');
          return button && !button.disabled;
        },
        { timeout: 10000 }
      );

      console.log("✅ 'Get OTP' button is now enabled!");

      // ✅ Open Applitools Eyes for Login Screen
      await eyes.open(
        "Website Comparison",
        "Sign in enter OTP Values March11th 2325",
        { width: 1920, height: 1080 }
      );

      // ✅ Click the "Get OTP" button
      await page.click('button[title="GET OTP"]');
      console.log("✅ 'Get OTP' button clicked!");

      // ✅ Wait for OTP screen to load
      await page.waitForSelector("input.input-field", {
        visible: true,
        timeout: 15000,
      });
      await new Promise((resolve) => setTimeout(resolve, 6000));

      const otp = "123456"; // Example OTP
      const otpFields = await page.$$(".input-field"); // Select all OTP input fields

      for (let i = 0; i < otp.length; i++) {
        await otpFields[i].type(otp[i], { delay: 100 }); // Type each digit with a small delay
      }

      const otpEnterScreenshot = path.resolve(
              __dirname,
              "../WebsiteImages/otp-verification-enter-screen.png"
            );
      await page.screenshot({ path: otpEnterScreenshot, fullPage: true });

      // ✅ Run visual comparison for OTP Entered Verification Screen
      await eyes.check(
        "Website OTP Entered Verification Screen",
        Target.image(otpEnterScreenshot)
      );

      // ✅ Close session for OTP Verification Screen
      await eyes.close();
      console.log("✅ OTP with values Verification Screen comparison done!");

      console.log("✅ Comparison completed! Check Applitools dashboard.");
    }
  } catch (error) {
    console.error("Error:", error);
  } finally {
    await eyes.abortIfNotClosed();
    if (browser) {
      await browser.close(); // ✅ Always closes the browser
    }
  }
})();
```