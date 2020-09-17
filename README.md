# Camunda Spring-Boot Demo Sample

## Setup

### Create MySQL Database
```mysql
CREATE DATABASE `camunda-sample`;
```

### Create Schema
Run the [schema.sql](https://github.com/rolandopalermo/camunda-spring-boot-example/blob/master/src/main/resources/schema.sql) file

### Run Application
```
mvn spring-boot:run
```

## Samples

### Java Delegate Sample
Delegation Code allows you to execute external Java code, scripts or evaluate expressions when certain events occur during process execution.
[https://docs.camunda.org/manual/7.8/reference/bpmn20/tasks/service-task/](https://docs.camunda.org/manual/7.8/reference/bpmn20/tasks/service-task/)
```
http://localhost:8080/api/delegate-sample/{name}
```