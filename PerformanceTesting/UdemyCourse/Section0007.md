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
   1. 


![alt text](image-79.png)

