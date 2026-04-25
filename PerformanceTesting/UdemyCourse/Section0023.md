# Question and Answer

## How to read large JSON payload(request body) from external file

![alt text](image-474.png)

![alt text](image-473.png)

![alt text](image-475.png)

```txt
If the body is huge, then it is recommended to use the JSON file to read the data rather than copying

the data directly here
```

Example - `${__FileToString(/path/to/data/file/fileName.json,,)}`
Syntax - ` ${__FileToString(<file path>,<encoding>,<variable>)}`

## Understand Hold Load for and Design Load Test

![alt text](image-476.png)

> The purpose of "Hold Load" is to keep the pressure/Load on the system steady for a specific amount of time.
> Analogy - Suppose let us say you want to test a bridge.Whether 100 cars can pass through a bridge in one minute, but you want to test that for one hour in one minute. All 100 cars will pass through the bridge, but you don't want to stop the testing. After one minute. You want to test for one hours whether the bridge can sustain the continuous traffic.

![alt text](image-477.png)

![alt text](image-478.png)

## How to Co-relate Session ID or Login Token



