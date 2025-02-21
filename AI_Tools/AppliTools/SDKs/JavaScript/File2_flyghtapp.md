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