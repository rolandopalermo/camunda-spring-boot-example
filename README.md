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

### Camunda Spin Sample
Camunda Spin is a library for simple XML and JSON processing on the JVM (Java Virtual Machine), targeting Java and JVM-based scripting languages such as Groovy, JRuby, Jython, JavaScript and Java Expression Language.
[https://docs.camunda.org/manual/7.8/reference/spin/](https://docs.camunda.org/manual/7.8/reference/spin/)

For this sample, we are going to make a call to the rest service:
```
https://restcountries.eu/rest/v2/currency/{currency}
```
And we will return the name of the country.