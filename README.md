## Environment:
- Java version: 1.8
- Maven version: 3.*
- Spring Boot version: 2.2.1.RELEASE

## Read-Only Files:
- src/test/*

## Requirements:
JMS works by sending messages to a message destination which are then taken by message receiver. Scheduling can be used to make certain code run at the specified time period. This project deals with sending and receiving messages at scheduled time. 
The skeleton classes for sending and receiving messages are already there in project.
 
You need to do following stuff: 

* Enable scheduling in the application
* Enable JMS messaging in the application

`ScheduledMessageSender.java`:
* modify `sendingInfoMessage` method and make it to send message `info` toAddress `info@example.com` at each 5 sec 

For example:
```
message = MessageObject("info","info@example.com")
send it at every 5 seconds
```
* modify `sendingTestMessage` method and make it to send message `test` toAddress `test@example.com` at each 8 sec 

For example:
```
message = MessageObject("test","test@example.com")
send it at every 8 seconds
```

`ScheduledMessageReceiver.java`:
- If message is sent to address `test@example.com`, just throw `Exception` and exception handler has already been provided
- If message is sent to address `info@example.com`, just dump it to console

Your task is to complete the given project as per the above requirements so that it passes all the test cases when running the provided unit tests.

## Commands
- run: 
```bash
mvn clean package; java -jar target/SchedulingApi-1.0.jar
```
- install: 
```bash
mvn clean install
```
- test: 
```bash
mvn clean test
```
