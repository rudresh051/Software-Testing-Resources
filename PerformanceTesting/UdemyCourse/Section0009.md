## Distributed Load Testing on AWS Cloud using JMeter

![alt text](image-252.png)

**Target** - Application under test  

> You need to get the IP address and Port number for that particular machine
> You need to allow the incoming TCP traffic from worker nodes
> You need to work with your IT security and IT admin team to ensure that these worker nodes can communicate with this target application via a given port number.


> There can be multiple slave machines

* Controller Node/Master nodes
  * Distribute the test plan to worker nodes

> They should be in the same subnet

## Things to do (Prerequisites) for JMeter Distributed Testing

![alt text](image-253.png)

1. **Open ports/Disable firewall**
   1. Outbound TCP ports - 1099-60000
   2. Inbound TCP Ports - 1099 - 60000
2. HTTP Inbound port 443
3. Disable Anti-virus on Master & Slaves
4. Stable Master-Slave network connctivity


## JMeter Distributed Load Testing on AWS EC2 - Hands on System Setup

* Login into aws account
* Launch instance Master, rdp client, generate password and decrypt it
* Connect to it
* In the master ec2 machine , Install JDK and JMeter
* Use the concept of AMI and launch similar machine i.e. slave or worker nodes
* It will take 15 mintues for image to comeup and your ec2 machine will shutdown as image is getting created

![alt text](image-351.png)


* Select the image and launch using the ami
* Select the same master password for easier login and same security group
![alt text](image-352.png)


wait for the machine to start  

![alt text](image-353.png)

wait for all other 2 slave machines created ready for use, then connect to master

download rdp client for slave1 and slave2 also

![alt text](image-354.png)