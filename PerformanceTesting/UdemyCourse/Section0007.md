## How to do Remote and Distributed Testing in JMeter

1. Why Remote(Distributed) testing is required?
   1. To simulate load from different geographic locations to get more realistic performance parameters such as response time
   2. JMeter client may not be able to handle heavy user load due to infrastructure or hardware limitations
2. Architecture of Remote(Distributed) Testing in JMeter
   1. Works based on Master-Slave Mechanism
   2. Master distributes requests across worker Nodes(Slave machines)


![alt text](image-78.png)