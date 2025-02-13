# Introduction to Visual Testing

## What is Visual Testing?

* A quality assurance activity aimed to verify GUI (graphical user interface)  
appears correctly to the user, this goes beyond traditional functional testing  
that we do, where we actually test functionality.
* Check characteristics (layout, color, shape, size, position, hide, overlap)  
of each elements on webpage

## Why it is important?

* Visual perfection can mean the difference between one of your customers loving or hating your  
product **(Company Brand)**.  
Example(As per survey):  
**38%** of people **will stop engaging** with a website if the content or layout are unattractive.  
**57%** of internet users say they **won't recommend a business** with a poorly designed website on
mobile.
* It affects the user experience

## Why can’t functional test cover visual issues?

* Test scripts will soon balloon in size due to checkpoint bloat.
* Traditional checkpoints (Visibility, Upper-left x, y coordinates, Height, Width, Background color).  

Example -  

`
10 visual elements * 5 assertion per element = 50 lines of assertion code
`

![alt text](image.png)

## Why visual testing should be Automated?

The Test Matrix is too big to cover manually.

* Web browsers
* Devices
* Operating systems
* Screen resolutions
* Responsive design
* L10n

### Test Matrix to cover Manually

* 5 operating systems: Windows, MacOS, Android, iOS, Chrome.
* 5 popular browsers: Chrome, Firefox, Internet Explorer (Windows only) Microsoft Edge
(Windows Only), and Safari (Mac only).
* 2 screen orientations for mobile devices: portrait and landscape.
* 10 standard mobile device display resolutions and 18 standard desktop/laptop display  
resolutions from XGA to 4G.

Total  

`
21*(20+18) = 21*38 = 798 Unique Screen Configurations to test(One web page excluding L10n Testing)
`

![alt text](image-1.png)

## Why Applitools Eyes?

* Al powered visual testing and monitoring tool
* Support various test tools/frameworks and languages(https://applitools.com/tutorials)
    * Selenium, Cypress, Appium, Perfecto, Coded IJI
    * Java, C#, JS, Python, php, Ruby
* Less code to write, less code to maintain
* Handles dynamic content
* Handles shifting content
* Ultrafast cross browser/device testing, validating all screens in seconds
* Automate PDFs
* Available on private and public cloud
* Integrates with your toolchain
    * Automation tools, Collaboration tools, CI/CD and more
* Build custom Visual Reports

* https://applitools.com/tutorials/sdks/selenium-java/quickstart


## How does it work?

![alt text](image-2.png)

Applitool Working - 

![alt text](image-3.png)

