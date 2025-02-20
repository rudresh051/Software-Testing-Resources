# Comparing Screenshots in JavaScript with Applitools

## Sample Test

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
        configuration.setBatch(new BatchInfo('Demo batch'))

        // Set the configuration to eyes
        eyes.setConfiguration(configuration);
    })

    it('Images test', async () => {
        await eyes.open('Applitools site', 'Screenshot test!', {width: 800, height: 600})

        await eyes.check('URL', Target.image('https://i.ibb.co/bJgzfb3/applitools.png'))
        
        const imageBuffer = await fetch('https://i.ibb.co/bJgzfb3/applitools.png').then(resp => resp.buffer())
        await eyes.check('Buffer', Target.image(imageBuffer))

        await eyes.check('file path', Target.image(path.resolve(__dirname, 'applitools.png')))

        await eyes.check('base 64 string', Target.image(imageBuffer.toString('base64')))

        await eyes.close()
    })
    
    afterEach(async () => {
        await eyes.abortIfNotClosed();
    })
})
```