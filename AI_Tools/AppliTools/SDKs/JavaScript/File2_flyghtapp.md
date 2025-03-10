# flyght app

## Capture cloud hosted image

```java
'use strict'

const {Eyes, Target, Configuration, BatchInfo} = require('@applitools/eyes-images')
const fetch = require('node-fetch')
const path = require('path')

describe('Eyes-Images', () => {
    let eyes 

    beforeEach(() => {
        eyes = new Eyes()

        // Initialize the eyes configuration
        const configuration = new Configuration();

        // You can get your api key from the Applitools dashboard
        // configuration.setApiKey('APPLITOOLS_API_KEY')

        // Set new batch
        configuration.setBatch(new BatchInfo('Login test'))

        // Set the configuration to eyes
        eyes.setConfiguration(configuration);
    })

    it('Images test', async () => {
        await eyes.open('flyght app', 'Login test 21Feb 2326', {width: 800, height: 600})

        await eyes.check('file path', Target.image(path.resolve(__dirname, 'splash.png')))


        await eyes.close()
    })
    
    afterEach(async () => {
        await eyes.abortIfNotClosed();
    })
})
```


## Using puppeteer

```java
'use strict'
const { Eyes, Target, Configuration, BatchInfo } = require('@applitools/eyes-images');
const fetch = require('node-fetch');
const fs = require('fs');
const path = require('path');
const puppeteer = require('puppeteer');

(async () => {
    const eyes = new Eyes();

    // Initialize Applitools configuration
    const configuration = new Configuration();
    configuration.setBatch(new BatchInfo('Website vs Local Image Test'));
    eyes.setConfiguration(configuration);

    try {
        // Open a browser using Puppeteer
        const browser = await puppeteer.launch();
        const page = await browser.newPage();

        // Navigate to the target website
        await page.goto('http://10.20.50.3:8097/', { waitUntil: 'networkidle2' });

        // Capture a screenshot of the first screen
        const screenshotPath = path.resolve(__dirname, 'website-screenshot.png');
        await page.screenshot({ path: screenshotPath });

        // Close the browser
        await browser.close();

        // Start Applitools session
        await eyes.open('Website Comparison', 'First Screen vs Local Image', { width: 800, height: 600 });

        // Compare website screenshot
        await eyes.check('Website First Screen', Target.image(screenshotPath));

        // Compare with the local image
        const localImagePath = path.resolve(__dirname, 'splash.png');
        await eyes.check('Local Image', Target.image(localImagePath));

        // Close Applitools session
        await eyes.close();
    } catch (error) {
        console.error('Error:', error);
    } finally {
        await eyes.abortIfNotClosed();
    }
})();
```


## flyght app two times execution

```java
'use strict'
const { Eyes, Target, Configuration, BatchInfo } = require('@applitools/eyes-images');
const puppeteer = require('puppeteer');
const path = require('path');

(async () => {
    const eyes = new Eyes();

    // Initialize Applitools configuration
    const configuration = new Configuration();
    configuration.setBatch(new BatchInfo('Website vs Local Image Test'));
    eyes.setConfiguration(configuration);

    try {
        // ------------- STEP 1: Set Local Image as Baseline -------------
        // console.log("Uploading local image as baseline...");
        // await eyes.open('Website Comparison', 'First Screen Baseline', { width: 800, height: 600 });

        // const localImagePath = path.resolve(__dirname, 'splash.png');
        // await eyes.check('Baseline Image', Target.image(localImagePath));

        // await eyes.close();

        console.log("Baseline set! Now capturing website screenshot...");

        // ------------- STEP 2: Capture Website Screenshot & Compare -------------
        const browser = await puppeteer.launch();
        const page = await browser.newPage();
        await page.goto('http://10.20.50.3:8097/', { waitUntil: 'networkidle2' });

        const screenshotPath = path.resolve(__dirname, 'website-screenshot.png');
        await page.screenshot({ path: screenshotPath });

        await browser.close();

        console.log("Website screenshot captured. Running comparison...");

        await eyes.open('Website Comparison', 'First Screen Baseline', { width: 800, height: 600 });
        await eyes.check('Website First Screen', Target.image(screenshotPath));

        await eyes.close();

        console.log("Comparison completed. Check Applitools dashboard for results.");
    } catch (error) {
        console.error('Error:', error);
    } finally {
        await eyes.abortIfNotClosed();
    }
})();
```



## flyght splash screen app comparsion - Working

```java
'use strict'
const { Eyes, Target, Configuration, BatchInfo } = require('@applitools/eyes-images');
const puppeteer = require('puppeteer');
const path = require('path');

(async () => {
    const eyes = new Eyes();

    // Initialize Applitools configuration
    const configuration = new Configuration();
    configuration.setBatch(new BatchInfo('Website vs Local Image Test new'));
    eyes.setConfiguration(configuration);

    try {
        // ------------- STEP 1: Set Local Image as Baseline -------------
        // console.log("Uploading local image as baseline...");
        // await eyes.open('Website Comparison', 'First Screen Baseline new', { width: 1920, height: 1080 });
        // const localImagePath = path.resolve(__dirname, 'splash.png');
        // await eyes.check('Baseline Image', Target.image(localImagePath));
        // await eyes.close();
        // console.log("Baseline set! Now capturing website screenshot...");

        // ------------- STEP 2: Capture Website Screenshot & Compare -------------
        const browser = await puppeteer.launch();
        const page = await browser.newPage();
        // ✅ Set viewport to match the baseline
        await page.setViewport({ width: 1920, height: 1080 });
        await page.goto('http://10.20.50.3:8097/', { waitUntil: 'networkidle2' });
        const screenshotPath = path.resolve(__dirname, 'website-screenshot.png');
        await page.screenshot({ path: screenshotPath });
        await browser.close();
        console.log("Website screenshot captured. Running comparison...");
        await eyes.open('Website Comparison', 'First Screen Baseline new', { width: 1920, height: 1080 });
        await eyes.check('Website First Screen', Target.image(screenshotPath));
        await eyes.close();
        console.log("Comparison completed. Check Applitools dashboard for results.");


    } catch (error) {
        console.error('Error:', error);
    } finally {
        await eyes.abortIfNotClosed();
    }
})();
```


## comparing screenshot using Selenium java

```
package com.applitools.example;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.TestResultsSummary;
import com.applitools.eyes.selenium.Configuration;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.fluent.Target;
import com.applitools.eyes.visualgrid.services.RunnerOptions;
import com.applitools.eyes.visualgrid.services.VisualGridRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Paths;
import java.time.Duration;

public class WebsiteLocalImageComparison {

    private final static BatchInfo BATCH = new BatchInfo("Website vs Local Image Test");

    public static void main(String[] args) {
        VisualGridRunner runner = new VisualGridRunner(new RunnerOptions().testConcurrency(1));
        Eyes eyes = new Eyes(runner);
        WebDriver driver = null;

        try {
            // ✅ Step 1: Configure Applitools
            Configuration config = new Configuration();
            config.setApiKey(System.getenv("APPLITOOLS_API_KEY"));
            config.setBatch(BATCH);
            eyes.setConfiguration(config);

            // ✅ Step 2: Launch Selenium WebDriver
            ChromeOptions options = new ChromeOptions().addArguments("--headless=new");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // ✅ Step 3: Open the website and capture a screenshot
            driver.get("http://10.20.50.3:8097/");
            eyes.open(driver, "Website Comparison", "Live Website Screenshot");
            eyes.check("Website Screenshot", Target.window().fully());
            eyes.closeAsync();

            // ✅ Step 4: Compare with local image
            String localImagePath = Paths.get("splash.png").toAbsolutePath().toString();
            eyes.open("Website Comparison", "Local Image Baseline");
            eyes.check("Local Image", Target.image(localImagePath));
            eyes.closeAsync();

            System.out.println("Comparison completed. Check Applitools dashboard for results.");

        } catch (Exception e) {
            e.printStackTrace();
            eyes.abortAsync();
        } finally {
            if (driver != null) driver.quit();
            TestResultsSummary allTestResults = runner.getAllTestResults();
            System.out.println(allTestResults);
            System.exit(0);
        }
    }
}
```

## Login screen validation

```javascript

'use strict';
const { Eyes, Target, Configuration, BatchInfo } = require('@applitools/eyes-images');
const puppeteer = require('puppeteer');
const path = require('path');

(async () => {
    const eyes = new Eyes();
    const configuration = new Configuration();
    configuration.setBatch(new BatchInfo('Login Screen Test'));
    eyes.setConfiguration(configuration);

    try {
        // ======= STEP 1: Set Local Figma Image as Baseline (Uncomment for first run) =======
        // console.log("Setting local Figma image as baseline...");
        // await eyes.open('Website Comparison', 'Login Screen Baseline', { width: 1920, height: 1080 });
        // const localImagePath = path.resolve(__dirname, 'login-figma.png'); // Path to local Figma image
        // await eyes.check('Baseline Login Screen', Target.image(localImagePath));
        // await eyes.close();
        // console.log("✅ Baseline login image set! Now comment this section and run Step 2.");
        
        // ======= STEP 2: Capture Website Screenshot & Compare (Uncomment after Step 1) =======
        console.log("Launching browser to capture login screen...");
        const browser = await puppeteer.launch();
        const page = await browser.newPage();
        await page.setViewport({ width: 1920, height: 1080 });

        await page.goto('http://10.20.50.3:8097/', { waitUntil: 'networkidle2' });

        // ✅ Wait for splash screen to disappear before capturing login screen
        await page.waitForTimeout(6000);

        const loginScreenshot = path.resolve(__dirname, 'login-screen.png');
        await page.screenshot({ path: loginScreenshot });

        console.log("✅ Login screen captured! Running visual comparison...");
        await eyes.open('Website Comparison', 'Login Screen Test', { width: 1920, height: 1080 });
        await eyes.check('Login Screen', Target.image(loginScreenshot));
        await eyes.close();

        await browser.close();
        console.log("✅ Comparison completed! Check Applitools dashboard.");

    } catch (error) {
        console.error('Error:', error);
    } finally {
        await eyes.abortIfNotClosed();
    }
})();

```

## Login screen working code

```javascript
'use strict';
const { Eyes, Target, Configuration, BatchInfo } = require('@applitools/eyes-images');
const puppeteer = require('puppeteer');
const path = require('path');

(async () => {
    const eyes = new Eyes();
    const configuration = new Configuration();
    configuration.setBatch(new BatchInfo('Login Screen Test'));
    eyes.setConfiguration(configuration);

    try {
        // ======= STEP 1: Set Local Figma Image as Baseline (Uncomment for first run) =======
        // console.log("Setting local Figma image as baseline...");
        // await eyes.open('Website Comparison', 'Login Screen Baseline', { width: 1920, height: 1080 });
        // const localImagePath = path.resolve(__dirname, 'login-figma.png'); // Path to local Figma image
        // await eyes.check('Baseline Login Screen', Target.image(localImagePath));
        // await eyes.close();
        // console.log("✅ Baseline login image set! Now comment this section and run Step 2.");
        
        // ======= STEP 2: Capture Website Screenshot & Compare (Uncomment after Step 1) =======
        console.log("Launching browser to capture login screen...");
        const browser = await puppeteer.launch();
        const page = await browser.newPage();
        await page.setViewport({ width: 1920, height: 1080 });
        await page.goto('http://10.20.50.3:8097/', { waitUntil: 'networkidle2' });
        // ✅ Wait for splash screen to disappear before capturing login screen
        // await page.waitForTimeout(6000);
        await new Promise(resolve => setTimeout(resolve, 6000));
        const loginScreenshot = path.resolve(__dirname, 'login-screen.png');
        await page.screenshot({ path: loginScreenshot });
        console.log("✅ Login screen captured! Running visual comparison...");
        await eyes.open('Website Comparison', 'Login Screen Test', { width: 1920, height: 1080 });
        await eyes.check('Login Screen', Target.image(loginScreenshot));
        await eyes.close();
        await browser.close();
        console.log("✅ Comparison completed! Check Applitools dashboard.");

    } catch (error) {
        console.error('Error:', error);
    } finally {
        await eyes.abortIfNotClosed();
    }
})();
```

## Get OTP activated login screen
```
'use strict';
const { Eyes, Target, Configuration, BatchInfo } = require('@applitools/eyes-images');
const puppeteer = require('puppeteer');
const path = require('path');

(async () => {
    const eyes = new Eyes();
    const configuration = new Configuration();
    configuration.setBatch(new BatchInfo('Login Screen Test'));
    eyes.setConfiguration(configuration);

    try {
        // ======= STEP 1: Set Local Figma Image as Baseline (Uncomment for first run) =======
        // console.log("Setting local Figma image as baseline...");
        // await eyes.open('Website Comparison', 'Login Screen Baseline Get OTP 28th Feb', { width: 1920, height: 1080 });
        // const localImagePath = path.resolve(__dirname, 'login-otp-figma.png'); // Path to local Figma image
        // await eyes.check('Figma Baseline Login Screen', Target.image(localImagePath));
        // await eyes.close();
        // console.log("✅ Baseline login image set! Now comment this section and run Step 2.");

        // ======= STEP 2: Capture Website Screenshot & Compare =======
        console.log("Launching browser to capture login screen...");
        const browser = await puppeteer.launch({ headless: false }); // Set to false for debugging
        const page = await browser.newPage();
        await page.setViewport({ width: 1920, height: 1080 });
        await page.goto('http://10.20.50.3:8097/', { waitUntil: 'networkidle2' });
        // ✅ Wait for splash screen to disappear before interacting
        await new Promise(resolve => setTimeout(resolve, 6000));
        // Enter phone number
        console.log("Entering phone number...");
        await page.type('input[type="tel"]', '8123423432', { delay: 100 });
        // Wait for the "Get OTP" button to be activated
        console.log("Waiting for 'Get OTP' button to be enabled...");
        await page.waitForSelector('button:enabled', { timeout: 5000 });
        // Take a screenshot after entering phone number
        console.log("✅ Capturing login screen after entering phone number...");
        const loginScreenshot = path.resolve(__dirname, 'login-screen.png');
        await page.screenshot({ path: loginScreenshot });
        // Run visual comparison
        await eyes.open('Website Comparison', 'Login Screen Baseline Get OTP 28th Feb', { width: 1920, height: 1080 });
        await eyes.check('Website Login Screen After Phone Input', Target.image(loginScreenshot));
        await eyes.close();
        await browser.close();
        console.log("✅ Comparison completed! Check Applitools dashboard.");

    } catch (error) {
        console.error('Error:', error);
    } finally {
        await eyes.abortIfNotClosed();
    }
})();

```