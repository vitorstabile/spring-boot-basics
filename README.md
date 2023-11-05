<h1 align="center"> Spring Boot </h1>

# Content

1. [Chapter 1: Introducing Spring Boot](#chapter1)
    - [Chapter 1 - Part 1: What is Spring Framework?](#chapter1part1)
    - [Chapter 1 - Part 2: What is Spring Boot?](#chapter1part2)
    - [Chapter 1 - Part 3: Spring Boot vs Spring](#chapter1part3)
    - [Chapter 1 - Part 4: What's the Most Important Goal of Spring Boot?](#chapter1part4)
2. [Chapter 2: Knowing Spring Boot](#chapter2)
    - [Chapter 2 - Part 1: Framework Architecture](#chapter2part1)
    - [Chapter 2 - Part 2: First Project](#chapter2part2)
    - [Chapter 2 - Part 3: Building a simple REST API](#chapter2part3)
    - [Chapter 2 - Part 4: Exploring Spring Boot Starter Projects](#chapter2part4)
    - [Chapter 2 - Part 5: Exploring Spring Boot Auto Configuration](#chapter2part5)
    - [Chapter 2 - Part 6: Exploring Spring Boot Dev Tools](#chapter2part6)
    - [Chapter 2 - Part 7: Profiles in SpringBoot](#chapter2part7)
    - [Chapter 2 - Part 8: ConfigurationProperties in SpringBoot](#chapter2part8)
    - [Chapter 2 - Part 9: Embedded Servers in SpringBoot](#chapter2part9)
    - [Chapter 2 - Part 10: Actuator in SpringBoot](#chapter2part10)
    - [Chapter 2 - Part 11: Understanding Spring Boot - Spring - Spring MVC](#chapter2part11)

## <a name="chapter1"></a>Chapter 1: Introducing Spring Boot
  
#### <a name="chapter1part1"></a>Chapter 1 - Part 1: What is Spring Framework?

Java Spring Framework (Spring Framework) is a popular, open source, enterprise-level framework for creating standalone, production-grade applications that run on the Java Virtual Machine (JVM).

Spring Framework is so popular because offers a dependency injection feature that lets objects define their own dependencies that the Spring container later injects into them. This enables developers to create modular applications consisting of loosely coupled components that are ideal for microservices and distributed network applications.

Spring Framework also offers built-in support for typical tasks that an application needs to perform, such as data binding, type conversion, validation, exception handling, resource and event management, internationalization, and more. It integrates with various Java EE technologies such as RMI (Remote Method Invocation), AMQP (Advanced Message Queuing Protocol), Java Web Services, and others. In sum, Spring Framework provides developers with all the tools and features the need to create loosely coupled, cross-platform Java EE applications that run in any environment.

#### <a name="chapter1part2"></a>Chapter 1 - Part 2: What is Spring Boot?

Java Spring Boot (Spring Boot) is an open source Java-based framework used to create a microservices with Spring Framework. It is developed by Pivotal Team and is used to build stand-alone and production ready spring applications.

It is a project built on top of the Spring framework that provides an efficient way to set up and run applications.

As capable and comprehensive as Spring Framework is, it still requires significant time and knowledge to configure, set up, and deploy Spring applications. Spring Boot mitigates this effort with three important capabilities.

Spring Boot consists of the Spring Framework and Embedded Servers. Because it uses convention over configuration software design, it does not require XML configuration.

<br>

<div align="center"><img src="img/spring_boot-w639-h147.png" width=639 height=147><br><sub>Fig 1 - Spring Boot - (<a href='https://www.educative.io/answers/what-is-spring-boot'>Work by Educative</a>) </sub></div>

<br>

- Advantages of Spring Boot
  - Autoconfiguration
  - An opinionated approach to configuration
  - The ability to create standalone applications
  - Creates stand-alone Spring applications that only need to be started using Java -jar
  - Provides features for production such as health checks and externalized configuration
  - Provides a CLI tool for developing and testing your application
  - Rapidly increases productivity
  - Reduces development time
  - Easy to learn and build spring applications

**Autoconfiguration**

Autoconfiguration means that applications are initialized with pre-set dependencies that you don't have to configure manually. As Java Spring Boot comes with built-in autoconfiguration capabilities, it automatically configures both the underlying Spring Framework and third-party packages based on your settings (and based on best practices, which helps avoid errors). Even though you can override these defaults once the initialization is complete, Java Spring Boot's autoconfiguration feature enables you to start developing your Spring-based applications fast and reduces the possibility of human errors.

**Opinionated approach**

Spring Boot uses an opinionated approach to adding and configuring starter dependencies, based on the needs of your project. Following its own judgment, Spring Boot chooses which packages to install and which default values to use, rather than requiring you to make all those decisions yourself and set up everything manually.

You can define the needs of your project during the initialization process, during which you choose among multiple starter dependencies—called Spring Starters—that cover typical use cases. You run Spring Boot Initializr by filling out a simple web form, without any coding.

For example, the ‘Spring Web’ starter dependency allows you to build Spring-based web applications with minimal configuration by adding all the necessary dependencies—such as the Apache Tomcat web server—to your project. ‘Spring Security’ is another popular starter dependency that automatically adds authentication and access-control features to your application.

Spring Boot includes over 50 Spring Starters, and many more third-party starters are available.

**Standalone applications**

Spring Boot helps developers create applications that just run. Specifically, it lets you create standalone applications that run on their own, without relying on an external web server, by embedding a web server such as Tomcat or Netty into your app during the initialization process. As a result, you can launch your application on any platform by simply hitting the Run command. (You can opt out of this feature to build applications without an embedded Web server.)

#### <a name="chapter1part3"></a>Chapter 1 - Part 3: Spring Boot vs Spring?

Again, the biggest advantages of using Spring Boot versus Spring Framework alone are ease of use and faster development. In theory, this comes at the expense of the greater flexibility you get from working directly with Spring Framework.

But, in practice, unless you need or want to implement a very unique configuration, using Spring Booth is worth the tradeoff. You still are able to use Spring Framework’s very popular annotation system that lets you easily inject extra dependencies (not covered by Spring Starters) into your application. And, you still get access to all Spring Framework features, including easy event handling, validation, data binding, type conversion, and built-in security and testing capabilities. Bottom line, if your project’s scope is covered by even just one Spring Starter, Spring Boot can significantly streamline development.

#### <a name="chapter1part4"></a>Chapter 1 - Part 4: What's the Most Important Goal of Spring Boot?

- Help you build PRODUCTION-READY apps QUICKLY
  - Build QUICKLY
    - Spring Initializr - Easy Create Spring Boot Projects in https://start.spring.io/
    - Spring Boot Starter Projects - Quickly define dependencies for your projects
    - Spring Boot Auto Configuration - Automatically provide configuration based in the define dependencies wich are in the class path
    - Spring Boot DevTools - Help make application changes without having to manually restart the server 
  - Be PRODUCTION-READY
    - Logging
    - Different Configuration for Different Environments
      - Profiles, ConfigurationProperties
    - Monitoring (Spring Boot Actuator)

## <a name="chapter2"></a>Chapter 2: Knowing Spring Boot
  
#### <a name="chapter2part1"></a>Chapter 2 - Part 1: Framework Architecture

Since 2003, the Spring ecosystem has grown a lot, which developer's point of view is good, as it increases the range of options to use, and he doesn't need to implement it himself. E.g: to add an authentication in the application, we can use Spring Security; to authenticate with Facebook or Google, we can use Spring Social; already if there is a need to create many processes with scheduled time, we have Spring Batch.

However, this growth of Spring has brought some problems: with many modules came many dependencies, and the configuration is no longer as simple as before.

Spring Boot, in addition to boosting development for microservices, it also helps with configuration by importing and automatically configuring all dependencies such as we will see in the next chapters. Sometimes he is confused with a simple framework, but actually it's a concept whole new way of creating web applications.

In the concept of Java Web Container, we have the Spring framework controlling its business rules packaged in a JAR, which must comply with the standards (servlet, filter, directory WEB-INF etc.)

<br>

<div align="center"><img src="img/java_web_architecture-w344-h283.png" width=344 height=283><br><sub>Fig 2 - Java Web Architecture - (<a href='https://www.casadocodigo.com.br/products/livro-spring-boot'>Work by Fernando Boaglio</a>) </sub></div>

<br>

In the new concept, we have Spring Boot in full control providing the web server and controlling its rules of business.

<br>

<div align="center"><img src="img/java_web_architecture2-w344-h283.png" width=344 height=283><br><sub>Fig 3 - Spring Boot Architecture - (<a href='https://www.casadocodigo.com.br/products/livro-spring-boot'>Work by Fernando Boaglio</a>) </sub></div>

<br>

The Spring Framework contains a lot of features, which are well-organized in about twenty modules. These modules can be grouped together based on their primary features into Core Container, Data Access/Integration, Web, AOP (Aspect Oriented Programming), Instrumentation and Test. These groups are shown in the diagram below.

<br>

<div align="center"><img src="img/spring_framework_modules-w577-h446.png" width=577 height=466><br><sub>Fig 4 - Spring Framework Modules - (<a href='https://docs.spring.io/spring-framework/docs/3.0.0.M4/reference/html/ch01s02.html'>Work by Spring Docs</a>) </sub></div>

<br>

For more information, access this [link](https://docs.spring.io/spring-framework/docs/3.0.0.M4/reference/html/ch01s02.html)

Spring boot architecture is a module in the spring framework, where application with minimal programming efforts can be developed and is of production-grade and even be stand-alone in nature.

Using spring boot there is no complex XML configuration and it makes easier for developers in getting started with the application. 

<br>

<div align="center"><img src="img/spring_boot_architecture-w898-h482.png" width=898 height=482><br><sub>Fig 5 - Spring Boot Architecture - (<a href='https://www.educba.com/spring-boot-architecture/'>Work by Educba</a>) </sub></div>

<br>

Also, one thing which needs to be kept in mind is that the configuration of a spring boot application is developed using annotation. Annotation is nothing but a form of metadata that helps in providing data about the program without being a part of the program.

The first component is the Spring Boot starter component which handles the dependency management. Using this component one can resolve the problem as this provides a set of dependencies made exclusively for programmers’ convenience. 

For example, if one needs to include all dependencies required for security, they can use spring-boot-starter-security as the artifact-id. The required dependencies are mentioned in pom.xml.

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId> spring-boot-starter-security</artifactId>
</dependency>
```

Next in line is the auto-configuration using @EnableAutoConfiguration or @SpringBootApplication and these annotations help in automatically configuring the spring boot application being developed. For example, if there is the presence of the MySQL database in the classes defined in the application, then this autoconfiguration will configure an in-memory database.

Now that we are done with all our configuration how does the code knows where does the spring boot application starts? To have an entry point in our code for the spring boot application we use the annotation @SpringBootApplication. Now one must be wondering that we use @SpringBootApplication for auto-configuration, then how come it is used for starting point as well. So, to answer this, @SpringBootApplication does more than just auto-configuring. It autoconfigures, locates the starting point of spring boot application and @ComponentScan annotation.

There are some of the modules of the Spring Boot

<br>

<div align="center"><img src="img/spring_boot_modules-w764-h601.png" width=764 height=601><br><sub>Fig 6 - Spring Boot Modules - (<a href='https://www.w3schools.blog/spring-boot-architecture-diagram-components'>Work by W3Schools</a>) </sub></div>

<br>

- **Spring Boot Starters:** Main concept behind spring boot starters is to reduce the dependencies definitions and to simplify the project build dependencies. For example : if we are creating spring application than we have to define following dependencies in pom.xml file –

  - Spring core Jar file
  - Spring Web Jar file
  - Spring Web MVC Jar file
  - Servlet Jar file
    - **Spring Boot Starters:** provides the facility to add only one jar file spring-boot-starter-web instead of adding 4 jar files.

- **Spring Boot AutoConfigurator:** Main concept behind Spring Boot AutoConfigurator is to minimizing the programmer’s effort to define lots of XML configuration. It will take care of all these XML configurations and annotations.

- **Spring Boot CLI:** It is Spring Boot software which is used to run and test Spring Boot applications from command prompt. CLI refers to command line arguments. To execute a spring application, spring boot CLI uses Spring Boot Starter and Spring Boot AutoConfigurate components to resolve all dependencies.

- **Spring Boot Actuator:** Spring boot actuator is a tool which provides HTTP endpoints. We can manage our production application using these HTTP endpoints.

#### <a name="chapter2part2"></a>Chapter 2 - Part 2: First Project

Go to [Spring Initializr](https://start.spring.io/) and select the following:

- **Project**
   - Maven Project
- **Language**
   - Java
- **Spring Boot Version**
   - For Java Version 8 -> Spring Boot 2.x
   - For Java Version 17 -> Spring Boot 3.x
- **Packaging**
   - Jar
- **Java**
   - For Spring Boot 2.x -> Java Version 8
   - For Spring Boot 3.x -> Java Version 8
- **Dependencies**
   - Spring Web -> To Construct Rest APIs

<br>

<div align="center"><img src="img/springbootconfig-w1677-h836.png" width=1677 height=836><br><sub>Spring Boot Download - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

Unzip the project (learn-spring-boot) to a folder of your preference (Ex: learnspringboot), and open the project using your IDE of preference. In this case, we will use the IntelliJ.

<br>

<div align="center"><img src="img/openproject-w326-h239.png" width=326 height=239><br><sub>Spring Boot Project Open in IntelliJ - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

IntelliJ will load the dependencies automatically when detecting a Maven Project. After all dependencies is download, try to run the LearnSpringBootApplication

<br>

<div align="center"><img src="img/runproject-w918-h608.png" width=918 height=608><br><sub>Run Spring Boot - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

If everything is Ok, this logs will show up and the application will start at localhost:8080

<br>

<div align="center"><img src="img/logspringboot-w1809-h452.png" width=1809 height=452><br><sub>Spring Boot Logs - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

#### <a name="chapter2part3"></a>Chapter 2 - Part 3: Building a simple REST API

Let's building a simple Rest API. The goal is build endpoint, that when I perform a GET in the resource /employees, will return a list of employees of my company.

Let's Create a class EmployeeController, that will be our Rest Controller


```java
package com.vitorproject.springboot.learnspringboot.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class EmployeeController {

    public List<Employee> getAllEmployees() {
        return Arrays.asList(
                new Employee(1, "John", "IT"),
                new Employee(2, "Mike", "HR")
        );
    }
}
```

Now, we will create a Data Transfer Object, that will be our Employee

```java
package com.vitorproject.springboot.learnspringboot.dto;

public class Employee {

    private Long id;

    private String name;

    private String department;

    public Employee() {
    }

    public Employee(Long id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
```

Now, we have to map this URL in the controller

```java
@RestController
public class EmployeeController {

    @RequestMapping("/employees")
    public List<Employee> getAllEmployees() {
        return Arrays.asList(
                new Employee(1L, "John", "IT"),
                new Employee(2L, "Mike", "HR")
        );
    }
}
```

If we access http://localhost:8080/employees, we will get the array of json objects

```
[{"id":1,"name":"John","department":"IT"},{"id":2,"name":"Mike","department":"HR"}]
```

#### <a name="chapter2part4"></a>Chapter 2 - Part 4: Exploring Spring Boot Starter Projects

- I need a lot of frameworks to build application features:
  - Build a REST API: I need Spring, Spring MVC, Tomcat, JSON conversion...
  - Write Unit Tests: I need Spring Test, JUnit, Mockito, ...

- How can I group them and make it easy to build applications?
  - Starters: Convenient dependency descriptors for diff. features
 ```
  <dependency>
    <groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
  </dependency>
```
If we open the pom xml of the spring-boot-starter-web, we will find this dependencies

```
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter</artifactId>
      <version>3.1.4</version>
      <scope>compile</scope>
    </dependency>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-json</artifactId>
      <version>3.1.4</version>
      <scope>compile</scope>
    </dependency>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-tomcat</artifactId>
      <version>3.1.4</version>
      <scope>compile</scope>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-web</artifactId>
      <version>6.0.12</version>
      <scope>compile</scope>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-webmvc</artifactId>
      <version>6.0.12</version>
      <scope>compile</scope>
    </dependency>
```
 
- Spring Boot provides variety of starter projects:
  - Web Application & REST API - Spring Boot Starter Web (spring-webmvc, spring-web, spring-boot-starter-tomcat, spring-boot-starter-json)
  - Unit Tests - Spring Boot Starter Test
  - Talk to database using JPA - Spring Boot Starter Data JPA
  - Talk to database using JDBC - Spring Boot Starter JDBC
  - Secure your web application or REST API - Spring Boot Starter Security

- (REMEMBER) Starters: Define all application dependencies

#### <a name="chapter2part5"></a>Chapter 2 - Part 5: Exploring Spring Boot Auto Configuration

- I need lot of configuration to build Spring app:
  - Component Scan, DispatcherServlet, Data Sources, JSON Conversion, ...

- How can I simplify this?
  - Auto Configuration: Automated configuration for your app
    - Decided based on:
      - Which frameworks are in the Class Path?
      - What is the existing configuration (Annotations etc)?

- Example: Spring Boot Starter Web
  - Dispatcher Servlet (DispatcherServletAutoConfiguration)
  - Embedded Servlet Container - Tomcat is the default (EmbeddedWebServerFactoryCustomizerAutoConfiguration)
  - Default Error Pages (ErrorMvcAutoConfiguration)
  - Bean<->JSON (JacksonHttpMessageConvertersConfiguration)

#### <a name="chapter2part6"></a>Chapter 2 - Part 6: Exploring Spring Boot Dev Tools

- Increase developer productivity
- Why do you need to restart the server manually for every code change?

The dependency is:

```
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

If we make a change in the code, the result will automatically validated.

- Remember: For pom.xml dependency changes, you will need to restart server manually

#### <a name="chapter2part7"></a>Chapter 2 - Part 7: Profiles in SpringBoot

- Applications have different environments: Dev, QA, Stage, Prod, ...

- Different environments need different configuration:
  - Different Databases
  - Different Web Services
 
- How can you provide different configuration for different environments?
  - Profiles: Environment specific configuration
 
- How can you define externalized configuration for your application?
  - ConfigurationProperites: Define externalized configuration

#### <a name="chapter2part8"></a>Chapter 2 - Part 8: ConfigurationProperties in SpringBoot

#### <a name="chapter2part9"></a>Chapter 2 - Part 9: Embedded Servers in SpringBoot

- How do you deploy your application?
  - Step 1 : Install Java
  - Step 2 : Install Web/Application Server
    - Tomcat/WebSphere/WebLogic etc
  - Step 3 : Deploy the application WAR (Web ARchive)
    - This is the OLD WAR Approach
    - Complex to setup!
   
- Embedded Server - Simpler alternative
  - Step 1 : Install Java
  - Step 2 : Run JAR file
  - Make JAR not WAR (Credit: Josh Long!)
  - Embedded Server Examples:
    - spring-boot-starter-tomcat
    - spring-boot-starter-jetty
    - spring-boot-starter-undertow 

#### <a name="chapter2part10"></a>Chapter 2 - Part 10: Actuator in SpringBoot

- Monitor and manage your application in your production

- Provides a number of endpoints:
  - beans - Complete list of Spring beans in your app
  - health - Application health information
  - metrics - Application metrics
  - mappings - Details around Request Mappings

#### <a name="chapter2part11"></a>Chapter 2 - Part 11: Understanding Spring Boot - Spring - Spring MVC

- Spring Boot vs Spring MVC vs Spring: What's in it?
  - Spring Framework: Dependency Injection
    - @Component, @Autowired, Component Scan etc..
    - Just Dependency Injection is NOT sufficient (You need other frameworks to build apps)
      - Spring Modules and Spring Projects: Extend Spring Eco System
        - Provide good integration with other frameworks (Hibernate/JPA, JUnit & Mockito for Unit Testing)

- Spring MVC (Spring Module): Simplify building web apps and REST API
  - Building web applications with Struts was very complex
  - @Controller, @RestController, @RequestMapping("/courses")
 

- Spring Boot (Spring Project): Build PRODUCTION-READY apps QUICKLY
  - Starter Projects - Make it easy to build variety of applications
  - Auto configuration - Eliminate configuration to setup Spring, Spring MVC and other frameworks!
  - Enable non functional requirements (NFRs):
    - Actuator: Enables Advanced Monitoring of applications
    - Embedded Server: No need for separate application servers!
    - Logging and Error Handling
    - Profiles and ConfigurationProperties
