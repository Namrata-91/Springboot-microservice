# Spring Boot MicroServices 
Microservices are the small services that work together.
Microservice Architecture is a Service Oriented Architecture.
In microservices world, a web serive or a microservice is the unit of component. This unit of component delivers a complete Business functionality
 and could rely on other microservices to fullfil that. 
These microservices are build separately and deployed separately unlike monoliths in which components can be built separately but are deployed together.

## Implementing Microservices with Eureka Naming Server

__Netflix Eureka Naming Server:Service Registration and Discovery__

It provides the REST interface to the outside for communicating with it. A microservice after coming up, register itself as a discovery client. 
The Eureka server also has another software module called Eureka Client. Eureka client interacts with the Eureka server for service discovery. 
The Eureka client also balances the client requests.

This repository is an example of how to get Microservices going using Spring Boot, Spring Cloud frameworks.

__Example URLs__
Application | URL 
--- | --- |
Eureka | http://localhost:8761/ | 
RoomMicroServices | http://localhost:8082/rooms, http://localhost:8082/rooms/1| 
room-reservation-service | http://localhost:8122/room-reservation | 

