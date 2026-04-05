## How to do Remote and Distributed Testing in JMeter

1. **Why Remote(Distributed) testing is required?**
   1. **To simulate load from different geographic locations to get more realistic performance parameters such as response time**
    > All the users will not be accessing the application from the same location.  
   2. JMeter client may not be able to handle heavy user load due to infrastructure or hardware limitations
2. **Architecture of Remote(Distributed) Testing in JMeter**
   1. Works based on Master-Slave Mechanism
   2. Master distributes requests across worker Nodes(Slave machines)
3. **Pre-Requisites**
   1. Master and slave machines must have Java installed(Preferably same version of Java)
   2. Master and Slave machines must have same version JMeter installed
   3. Master and Slave machines must be connected to each other in same subnet
4. **Required Configurations**
   1. Go to JMeter -> bin folder -> Open jmeter.properties file -> Add Remote Hosts IP under Remote Host section(ex: remote_hosts = ip address1, ip address2). Save and close the file
   2. Restart the JMeter -> Go to Run -> Remote Start -> Select the Remote Host to run the test
   3. Go to JMeter -> bin folder -> Run the file : create-rmi-keystore.sh (On windows double click, on MAC open terminal and go to the file path and use command : sh create-rmi-keystore.sh.), provide answers to questions displayed. Then rmi_keystore.jks file will be created.
   4. Copy above rmi_keystore.jks file to JMeter -> bin folder in all remote host machines.
   5. Go to JMeter -> bin folder and start the JMeter server using jmeter-server file.(Double click on windows, on MAC open terminal go to the file path and run command - sh jmeter-server.sh)
5. Execution using Command Line
   1. Windows
   2. `jmeter -n -t "path to jmx file" -l "path to result file.csv" -R "IP_of_Remote_Host"`


Note - Number of threads provided in test plan will be run each remote host


![alt text](image-79.png)


Search for "remote host" in JMeter.properties file located in bin folder of JMeter

![alt text](image-80.png)


change the remote_hosts and give local IPv4 address of your laptop

![alt text](image-82.png)

and then restart JMeter and navigate to run . you will find remote start option available

![alt text](image-81.png)


Now double click the following file and open using bash  

![alt text](image-83.png)

rmi_keystore.jks file would be generated  

![alt text](image-84.png)

>copy these files to Jmeter bin folder in all remote host machine.  
>Now I am using my local machine only as a remote host.  
>That is why I do not need to copy it anywhere.
> And it is already in the jmeter bin folder.  
> If when you are using a multiple machines in real time, you will be using multiple machines.  
> I do not have multiple machines right now.  
> But in reality we will be using multiple machine that time.  
> You need to copy this file to your multiple machines within the Jmeter bin folder.  
> To make this, uh, remote or distributed testing work, uh, since I am using my local system as remote system, I do not need to copy it again.  


now double click on jmeter-server.bat file  

![alt text](image-85.png)

run a simple using remote run for www.blazedemo.com
you will see the server terminal showing starting and ending timings

![alt text](image-87.png)


![alt text](image-86.png)

```
Starting the test on host 192.168.88.6 @ 2026 Apr 5 11:44:09 IST (1775369649805)
Finished the test on host 192.168.88.6 @ 2026 Apr 5 11:44:12 IST (1775369652004)
```

change back to this (but why?)

![alt text](image-88.png)

## How to use HTTP Authorization Manager for Basic Authentication


https://the-internet.herokuapp.com/basic_auth

![alt text](image-90.png)

if you run first without authorization manager you will get 401 - unauthorized

![alt text](image-91.png)

after adding authorization  

![alt text](image-89.png)

you will run successfully  

![alt text](image-92.png)

## How to send Email and do Performance testing of Email(SMTP) server using JMeter

![alt text](image-93.png)

Add the SMTP Sampler

![alt text](image-94.png)

![alt text](image-95.png)

Now generate the app password - 

Click on user profile picture => Click on Manage your Google Account => Search "App Password" using search bar.  
Then generate App Password & Notedown

![alt text](image-97.png)

delete the app password after use.

![alt text](image-96.png)