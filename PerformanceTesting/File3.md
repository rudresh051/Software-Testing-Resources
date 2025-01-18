# Installation
https://jmeter.apache.org/download_jmeter.cgi

* Download the binary zip file

![alt text](image.png)

* unzip >> Navigate to bin folder >> double click on Jmeter batch file


## Steps
* Right click the test >> Add >> Non-Test Elements >> HTTPS Test Script recorder >> click

![alt text](image-1.png)

Click on "Add suggested excludes"
![alt text](image-2.png)

Click on start button

Add the certificaties in firefox browser
* settings >> search >> type certificates >> click on view certificates >> import >> navigate to apache folder bin and select `ApacheJMeterTemporaryRootCA.crt` >> click open >> click ok and again ok

![alt text](image-3.png)

* search network >> settings

![alt text](image-4.png)

* select Manual proxy configuration
* for `HTTP Proxy` enter 127.0.0.1
* enter port as 8888 as in Jmeter
* select the checkbox `also use this proxy for HTTPS` 

![alt text](image-5.png)

* Now go to Jmeter
* click on start
* enter the url blazedemo.com >>  purchase flight >> enter the details
* stop recording

* create thread group
![alt text](image-6.png)

* cut and paste the .php files in thread group
![alt text](image-7.png)

* Add Listener

![alt text](image-8.png)