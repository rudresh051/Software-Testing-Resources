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

## JMeter Distributed Load Testing on AWS EC2-Setup Hands on Configuration

![alt text](image-355.png)

Search the following in JMeter.properties file

* remote_hosts file
* server.rmi.ssl.disable

* Navigate back to each slave machine run the following command `jmeter-server`

![alt text](image-356.png)

It will create the remote object  

![alt text](image-357.png)

Now we need to enable the ports  

![alt text](image-358.png)

![alt text](image-359.png)

* Now we need to disable the firewalls in Master and slave

![alt text](image-360.png)

* To Check firewall status
  * `netsh advfirewall show allprofiles`
* To disable firewall
  * `netsh advfirewall set allprofiles state off`
* To Test connection
  * `Test-NetConnection <slave-private-ip> -Port 1099`
  * ex `Test-NetConnection 172.31.31.109 -Port 1099`
  * ex `Test-NetConnection 172.31.28.185 -Port 1099` 
* To Enable telnet
  * `dism /online/enable-feature/featurename:TelnetClient`
* To test telnet connection(Master to Slave):
  * telnet <slave-private-ip> <port>
  * `telnet 172.31.31.109 1099`
  * `telnet 172.31.28.185 1099`



![alt text](image-361.png)

run the following command in powershell of master

![alt text](image-362.png)

![alt text](image-363.png)

you can also enable telnet  

![alt text](image-364.png)

check in master for the slave machine and if blank screen is coming after executing example such as `telnet 172.31.31.109 1099` then telnet connectivity is successful

![alt text](image-365.png)

## JMeter Distribute Load Testing on AWS EC2-Running Tests Hands on

Now create a sample test plan on Master

Go to Run >> Remote stert
you will see your two slave machines ip addresses

![alt text](image-366.png)

you can click on start remote all to start on both machines

It wil show the test started and finished on both slave machines

Let us see how we can run using command line because for load testing in real scenarios we will be using command line  

`jmeter -n -t "<FilePathwithFileName>" -r`

![alt text](image-367.png)

* To Run on selected hosts
  * `jmeter -n -t test_plan.jmx -R <slave1_ip>`
* To run test generate result file and HTML report
  * `jmeter -n -t Test.jmx -r -l results.csv -e -o html.report`

change the inbound rules if you are not getting tidying up message

Master - ![alt text](image-369.png)

![alt text](image-368.png)

change the outbound rules also

![alt text](image-370.png)


![alt text](image-371.png)


you can also generate the report  

`jmeter -n -t "Sample Test Plan.jmx" -r -l result.csv -e -o html-report`

![alt text](image-372.png)

result.csv file  

![alt text](image-373.png)

you can also run the test on only one slave machine  

![alt text](image-374.png)

## Automating Distributed Performance Test run using shell-script hands on

> because everytime you have to remove the old report and .csv file

![alt text](image-375.png)

![alt text](image-376.png)

install git bash and run

![alt text](image-377.png)

## AWS Cleanup after JMeter Distributed Testing - Remove EC2, AMIs & More Hands on

Terminate 

![alt text](image-378.png)

Deregister AMI

![alt text](image-379.png)

Delete Associated Snapshots  

![alt text](image-380.png)

Also delete the key-pair

![alt text](image-381.png)

delete the security groups  

![alt text](image-382.png)

you can check the dashboard and instances are terminated  

![alt text](image-384.png)

![alt text](image-383.png)




