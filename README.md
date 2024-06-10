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
3. [Chapter 3: JPA and Hibernate with Spring Boot](#chapter3)
    - [Chapter 3 - Part 1: Config a New Spring Boot Project with JPA and Hibernate](#chapter3part1)
    - [Chapter 3 - Part 2: JDBC vs Spring JDBC](#chapter3part2)
    - [Chapter 3 - Part 3: Manipulate Data Using Spring JDBC](#chapter3part3)
    - [Chapter 3 - Part 4: JPA vs Spring JPA](#chapter3part4)
    - [Chapter 3 - Part 5: Manipulate Data Using JPA](#chapter3part5)
    - [Chapter 3 - Part 6: Manipulate Data Using Spring JPA](#chapter3part6)
    - [Chapter 3 - Part 7: Hibernate vs JPA](#chapter3part7)
4. [Chapter 4: Create RESTful API with Spring Boot](#chapter4)
    - [Chapter 4 - Part 1: Config a New Spring Boot Project](#chapter4part1)
	- [Chapter 4 - Part 2: The Domain Model of Order Application and Architecture of the API](#chapter4part2)
	- [Chapter 4 - Part 3: Create the User Entity](#chapter4part3)
	- [Chapter 4 - Part 4: Create a resource to test](#chapter4part4)
	- [Chapter 4 - Part 5: Set up the H2 database to Test](#chapter4part5)
	- [Chapter 4 - Part 6: Create the JPA Mapping in Entity](#chapter4part6)
	- [Chapter 4 - Part 7: Create the User Repository Layer and a Configuration class to Test](#chapter4part7)
	- [Chapter 4 - Part 8: Create the User Service Layer](#chapter4part8)
	- [Chapter 4 - Part 9: Create the resource to return a user by Id](#chapter4part9)
	- [Chapter 4 - Part 10: Create the association Order Many-to-One (User and Order)](#chapter4part10)
	- [Chapter 4 - Part 11: Create the Repository, Service and Resource Order](#chapter4part11)
	- [Chapter 4 - Part 12: Create the Status Enum](#chapter4part12)
	- [Chapter 4 - Part 13: Create the Category Repository, Service and resource](#chapter4part13)
	- [Chapter 4 - Part 14: Create the Product Repository, Service and resource](#chapter4part14)
	- [Chapter 4 - Part 15: Many-to-Many relation and JoinTable (Category and Product)](#chapter4part15)
	- [Chapter 4 - Part 16: Many-to-Many relation with extra data (Product and Order)](#chapter4part16)
	- [Chapter 4 - Part 17: Create the Payment Entity and Relation One-to-one with Order](#chapter4part17)
	- [Chapter 4 - Part 18: Create the subTotal() and total() methods](#chapter4part18)
	- [Chapter 4 - Part 19: Insert a User](#chapter4part19)
	- [Chapter 4 - Part 20: Delete a User](#chapter4part20)
	- [Chapter 4 - Part 21: Update a User](#chapter4part21)
	- [Chapter 4 - Part 22: Exception Handler - findById](#chapter4part22)
	- [Chapter 4 - Part 23: Exception Handler - delete](#chapter4part23)
	- [Chapter 4 - Part 24: Exception Handler - update](#chapter4part24)
5. [Chapter 5: Spring Security with Spring Boot](#chapter5)
    - [Chapter 5 - Part 1: Security Fundamentals](#chapter5part1)
    - [Chapter 5 - Part 2: Important Security Principles](#chapter5part2)
    - [Chapter 5 - Part 3: How Spring Security Works](#chapter5part3)
    - [Chapter 5 - Part 4: Config a New Spring Boot Project with Spring Security](#chapter5part4)
    - [Chapter 5 - Part 5: Form Authentication](#chapter5part5)
    - [Chapter 5 - Part 6: Basic Authentication](#chapter5part6)
    - [Chapter 5 - Part 7: Cross Site Request Forgery - CSRF](#chapter5part7)
    - [Chapter 5 - Part 8: Cross-Origin Resource Sharing - CORS](#chapter5part8)
    - [Chapter 5 - Part 9: Storing User Credentials in Memory](#chapter5part9)
    - [Chapter 5 - Part 10: Storing User Credentials using JDBC](#chapter5part10)

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
 
Let's say qe have two enviroments, in this case, a dev and prod enviroment. One of the differences about the enviroment in dev and in prod is the debbugind level. In dev we want a trace log level and in prod we want a info log level.

```
dev
logging.level.org.springframework=trace
prod
logging.level.org.springframework=info
```

To make this, go to your **application.properties** in your spring boot project in src/main/resources and make a two copies of this files, and rename like the following:

```
application-dev.properties

application-prod.properties
```

In **application.properties** put this level of log:

```
logging.level.org.springframework=debug
```

In **application-dev.properties** put this level of log:

```
logging.level.org.springframework=trace
```

In **application-prod.properties** put this level of log:

```
logging.level.org.springframework=info
```

<br>

<div align="center"><img src="img/profilepringboot-w1302-h525.png" width=1302 height=525><br><sub>Spring Boot Profiles in application.properties - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

By default, Spring Boot use as default the application.properties. If you run now the application, all debug levels will be showing. To specific a active profile, go to your **application.properties** and put this

```
logging.level.org.springframework=debug
spring.profiles.active=prod
```

Now, the active profile is prod, and the log level will be using is info



#### <a name="chapter2part8"></a>Chapter 2 - Part 8: ConfigurationProperties in SpringBoot

Let's see now, how can you set complex configurations.

Let's say you have a currency service and you wantt to configure differente services to this currency service like, url, username and key.

```
currency-service.url=
currency-service.username=
currency-service.key=
```

Create a class with name CurrencyServiceConfiguration

```
public class CurrencyServiceConfiguration {

}
```

Now, add a Annotation called @ConfigurationProperties. To detect the currency-service prefix, add prefix after the annotation and add the Annotation component, to this class be a bean manage by spring

```
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "currency-service")
@Component
public class CurrencyServiceConfiguration {

    private String url;
    private String username;
    private String key;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
```

Now, make the getters and setters for this class.

Go to your **application.properties** and add this

```
logging.level.org.springframework=debug
spring.profiles.active=prod

currency-service.url=http://default.learnspringboot.com
currency-service.username=defaultusername
currency-service.key=defaultkey
```

Now, let's see if this is working. Le'ts create a Controller to see if this values is mapping

```
package com.vitorproject.springboot.learnspringboot.controller;

import com.vitorproject.springboot.learnspringboot.CurrencyServiceConfiguration;
import com.vitorproject.springboot.learnspringboot.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConfigurationController {

    @Autowired
    CurrencyServiceConfiguration configuration;

    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration getConfiguration() {
        return configuration;
    }
}
```

Go to localhost:8080/currency-configuration and you will see that the values is mapped from application.properties

<br>

<div align="center"><img src="img/configurationpropertiespringboot-w611-h269.png" width=611 height=269><br><sub>Values Mapped fromapplication.properties - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>


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
   
To see this in action, install Maven in your machine

Open a terminal, and where your project is, put this command

```
mvn clean install
```

If the build was success, you will receive this in final terminal

```
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  11.566 s
[INFO] Finished at: 2023-11-05T19:07:26Z
[INFO] ------------------------------------------------------------------------
```

Now, go to the location where the .jar file was create, in this case, in the target folder. The file was created as learn-spring-boot-0.0.1-SNAPSHOT.jar

Now, open the terminal where the jar file and put the command

```
java -jar learn-spring-boot-0.0.1-SNAPSHOT.jar
```

Now, the application is running

<br>

<div align="center"><img src="img/embbedserverpringboot-w1839-h408.png" width=1839 height=408><br><sub>Application Running via Terminal - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>


#### <a name="chapter2part10"></a>Chapter 2 - Part 10: Actuator in SpringBoot

- Monitor and manage your application in your production

- Provides a number of endpoints:
  - beans - Complete list of Spring beans in your app
  - health - Application health information
  - metrics - Application metrics
  - mappings - Details around Request Mappings
 
Add this dependency in your pom.xml

```
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```

If you run your application, you will see that one endpoint is exposed

```
 Exposing 1 endpoint(s) beneath base path '/actuator'
```

Let's access this endpoint -> http://localhost:8080/actuator

You will enter in a page with this

```
{"_links":{"self":{"href":"http://localhost:8080/actuator","templated":false},"health":{"href":"http://localhost:8080/actuator/health","templated":false},"health-path":{"href":"http://localhost:8080/actuator/health/{*path}","templated":true}}}
```

If you enter in the health, you will see that the status of your application is up

```
{"status":"UP"}
```

Now, go to your **application.properties** and put this line

```
management.endpoints.web.exposure.include=*
```

Now, if you enter in the actuator endpoint -> http://localhost:8080/actuator you will see a lot of endpoint to enter

```
{"_links":{"self":{"href":"http://localhost:8080/actuator","templated":false},"beans":{"href":"http://localhost:8080/actuator/beans","templated":false},"caches-cache":{"href":"http://localhost:8080/actuator/caches/{cache}","templated":true},"caches":{"href":"http://localhost:8080/actuator/caches","templated":false},"health":{"href":"http://localhost:8080/actuator/health","templated":false},"health-path":{"href":"http://localhost:8080/actuator/health/{*path}","templated":true},"info":{"href":"http://localhost:8080/actuator/info","templated":false},"conditions":{"href":"http://localhost:8080/actuator/conditions","templated":false},"configprops":{"href":"http://localhost:8080/actuator/configprops","templated":false},"configprops-prefix":{"href":"http://localhost:8080/actuator/configprops/{prefix}","templated":true},"env":{"href":"http://localhost:8080/actuator/env","templated":false},"env-toMatch":{"href":"http://localhost:8080/actuator/env/{toMatch}","templated":true},"loggers":{"href":"http://localhost:8080/actuator/loggers","templated":false},"loggers-name":{"href":"http://localhost:8080/actuator/loggers/{name}","templated":true},"heapdump":{"href":"http://localhost:8080/actuator/heapdump","templated":false},"threaddump":{"href":"http://localhost:8080/actuator/threaddump","templated":false},"metrics-requiredMetricName":{"href":"http://localhost:8080/actuator/metrics/{requiredMetricName}","templated":true},"metrics":{"href":"http://localhost:8080/actuator/metrics","templated":false},"scheduledtasks":{"href":"http://localhost:8080/actuator/scheduledtasks","templated":false},"mappings":{"href":"http://localhost:8080/actuator/mappings","templated":false}}}
```

In this endpoits, there is a lot of metrics about your application.

If you enter in http://localhost:8080/actuator/beans, you will see all the beans that is autoconfigurated for example

If you enter in http://localhost:8080/actuator/metrics, you can see how many properties that can be monitoted in yout application. For example, if you use http://localhost:8080/actuator/metrics/http.server.requests, you will se all requests was made in your application.



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

## <a name="chapter3"></a>Chapter 3: JPA and Hibernate with Spring Boot
  
#### <a name="chapter3part1"></a>Chapter 3 - Part 1: Config a New Spring Boot Project with JPA and Hibernate

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
   - Spring Data JDBC -> Persist Data in SQL Stores with plain JDBC using Spring Data
   - Spring Data JPA -> Persist Data in SQL Stores with Java Persistence API using Spring Data and Hibernate
   - H2 Datanase -> Provides a fast in-memory database
   
<br>

<div align="center"><img src="img/springbootconfigjpa-w1590-h698.png" width=1590 height=698><br><sub>Spring Initialzr Config - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

When we launch the application, a log about the data source will appear, showing the Data Source H2 url access in the connection pool.
   
<br>

<div align="center"><img src="img/h2initializing-w1251-h81.png" width=1251 height=81><br><sub>Data Source H2 url access - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

The URL to access the H2 is this: ```url=jdbc:h2:mem:99fb1e7a-4755-4187-823c-766f7c27bd7b user=SA```
   
The way we can enable to access this database is going in ```application.properties``` and config a property

```
spring.h2.console.enabled=true
```

Mow, in the logs, we will see this log comming:

```
2023-12-02T15:51:55.520Z  INFO 16180 --- [           main] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:4df97811-a12d-44d6-bc11-c439e67a0fa0'
```

Now, we can access the H2 Database console throw the URL

```
https://localhost:8080/h2-console
```

<br>

<div align="center"><img src="img/h2access-w504-h372.png" width=504 height=372><br><sub>H2 Access URL - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

We need to put the correct URL in the field ```JDBC URL```, because each time we initialize the application, the URL will change

<br>

<div align="center"><img src="img/h2newurl-w1324-h161.png" width=1324 height=161><br><sub>H2 URL Generate - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

<div align="center"><img src="img/h2testconnection-w500-h502.png" width=500 height=502><br><sub>H2 Test Connection - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

To configure a static url, we can go in ```application.properties``` and add this Configuration

```
spring.datasource.url=jdbc:h2:mem:testdb
```

<br>

<div align="center"><img src="img/h2accessurlstatic-w463-h367.png" width=463 height=367><br><sub>H2 Test Connection Static URL - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

If we enter in the Database, there is no tables to consult. We can create a schema, that will create tables every time the application will launch


Go to src/main/resources and create a file with name ```schema.sql``` with this Content

```sql
create table course
(
    id bigint not null,
    name varchar(255) not null,
    author varchar(255) not null,
    primary key (id)
);
```

<br>

<div align="center"><img src="img/schemasql-w1061-h327.png" width=1061 height=327><br><sub>Schema SQL - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

Now, if we enter in H2 Console, we will see the table

<br>

<div align="center"><img src="img/coursetable-w723-h246.png" width=723 height=246><br><sub>H2 With courses Tables - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

#### <a name="chapter3part2"></a>Chapter 3 - Part 2: JDBC vs Spring JDBC

- JDBC
  - Write a lot of SQL queries! (delete from todo where id=?)
  - And write a lot of Java code
  
- Spring JDBC
  - Write a lot of SQL queries (delete from todo where id=?)
  - BUT lesser Java code
  
***JDBC example***

```java
public void deleteTodo(int id) {
	PreparedStatement st = null;
	try {
		st = db.conn.prepareStatement("delete from todo where id=?");
		st.setInt(1, id);
		st.execute();
	} catch (SQLException e) {
		logger.fatal("Query Failed : ", e);
	} finally {
		if (st != null) {
			try {st.close();}
			catch (SQLException e) {}
		}
	}
}
```

***Spring JDBC example***

```java
public void deleteTodo(int id) {
	jdbcTemplate.update("delete from todo where id=?", id);
}
```

#### <a name="chapter3part3"></a>Chapter 3 - Part 3: Manipulate Data Using Spring JDBC

We will first, inserting data using Spring JDBC in a Hardcode way.

First, create a class ```CourseJdbcRepository.java```, and create this class.

```java
@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY =
            """
                insert into course (id, name, author)
                values (1, 'Learn AWS', 'in28minutes');
            """;

    public void insert() {
        springJdbcTemplate.update(INSERT_QUERY);
    }
}
```

To make this class as a component managed by spring, we can use the annotation ```@Repository```, to tell spring this class is a component with specific representation, in this case a repository with will deal with data base operations.

Now, to execute this query when the Spring Application starts, we need to create a CommanLine Runner

```java
@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.insert();
    }
}
```

<br>

<div align="center"><img src="img/inserthardcodesql-w535-h362.png" width=535 height=362><br><sub>Insert Data in Hardcode - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

Now, let's make a more dinamic way. We will insert a Object of type Course. Let's create the Class

```java
public class Course {

    private long id;
    private String name;
    private String author;

    public Course(){

    }

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
```

Now, our repository needs a adjustment in the query, because we will pass the values dinamicaly

```java
@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY =
            """
                insert into course (id, name, author)
                values (?, ?, ?);
            """;

    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY,
                course.getId(), course.getName(), course.getAuthor());
    }
}
```

Our class Command Line will receive new courses

```java
@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn Python", "in28minutes"));
        repository.insert(new Course(2, "Learn Java", "in28minutes"));
        repository.insert(new Course(3, "Learn C++", "in28minutes"));
```

<br>

<div align="center"><img src="img/newcoursesinsert-w495-h368.png" width=495 height=368><br><sub>Insert Data in Spring JDBC - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

Now, create a method delete

```java
@Repository
public class CourseJdbcRepository {

// same code

private static String DELETE_QUERY =
            """
                delete from course
                 where id = ?;
            """;
			
public void deleteById(long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }
```

```java

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn Python", "in28minutes"));
        repository.insert(new Course(2, "Learn Java", "in28minutes"));
        repository.insert(new Course(3, "Learn C++", "in28minutes"));
        
        repository.deleteById(1);
    }
}
```

Now, create a method select

When we make a Select, we need to map the result of select to a bean

For this, we need to use queryForObject(). We need to take the resultSet, map to a bean

```java
@Repository
public class CourseJdbcRepository {

// same code

 private static String SELECT_QUERY =
            """
                select * from course
                 where id = ?;
            """;
			
public Course findById(long id) {
        //ResultSet -> Bean => Row Mapper =>
        return springJdbcTemplate.queryForObject(SELECT_QUERY,
                new BeanPropertyRowMapper<>(Course.class), id);

    }
```

Add A toString method in the class

```java 
public class Course {

    //same code

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
```

Add in the CommanLine the select

```java
@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Initiate JDBC Transactions");

        repository.insert(new Course(1, "Learn Python", "in28minutes"));
        repository.insert(new Course(2, "Learn Java", "in28minutes"));
        repository.insert(new Course(3, "Learn C++", "in28minutes"));

        repository.deleteById(1);

        Course course2 = repository.findById(2);
        Course course3 = repository.findById(3);

        System.out.println(course2);
        System.out.println(course3);
        System.out.println("Finished JDBC Transactions");
    }
}
```

The result in the console

```
Initiate JDBC Transactions
Course{id=2, name='Learn Java', author='in28minutes'}
Course{id=3, name='Learn C++', author='in28minutes'}
Finished JDBC Transactions
```

#### <a name="chapter3part4"></a>Chapter 3 - Part 4: JPA vs Spring JPA

- JPA
  - Do NOT worry about queries
  - Just Map Entities to Tables!
  
- Spring JPA
  - Let's make JPA even more simple!
  - I will take care of everything!
  
***JPA example***

```java
@Repository
public class PersonJpaRepository {

	@PersistenceContext
	EntityManager entityManager;
	
	public Person findById(int id) {
		return entityManager.find(Person.class, id);
	}
	
	public Person update(Person person) {
		return entityManager.merge(person);
	}

	public Person insert(Person person) {
		return entityManager.merge(person);
	}

	public void deleteById(int id) {........}
```

***Spring JPA example***

```java
public interface TodoRepository extends JpaRepository<Todo, Integer>{}
```

#### <a name="chapter3part5"></a>Chapter 3 - Part 5: Manipulate Data Using JPA

When we make use of JPA, we will mapping our entity direct to the database. 

First, our course will receive the annotation ```@Entity```.This annotaion marks the class as a persistent entity. It signals to the JPA provider that the class should be treated as a table in the database.

The annotaion ```@Id``` will make the field as a primary key when receive the anootation. In our case, will be the id field of the class Course

The annotation ```@Column``` will map the field of our class Course, to the column of our database. In the example, our table have the colums ```name``` and ```author```, and we will put the annotation ```@Column``` in the corresponding attributes of our class
Because of the match of names of the table and the attributes of the class, the annotation ```@Column``` is not necessary.

```java
package com.vitorproject.springboot.learnjpaandhibernate.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    private long id;
	
    @Column(name="name")
    private String name;
	
    @Column(name="author")
    private String author;

//same code
```

Now, let's create our repository Class, that will be responsible to make the operations in the data base

The annotation ```@Repository``` tell spring this will be a Repository class and the annotation ```@Transactional``` will tell spring, this class will make transactions from app to database

We will import the ```EntityManager``` class, that will allow a lot of operations. To make a insert in a database, we will use the merge.

We will use the annotation ```@PersistenceContext``` to autowired the EntityManager in the class, but we can use ```@Autowired``` too

```java
@Repository
@Transactional
public class CourseJpaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course) {
        entityManager.merge(course);
    }

}
```

Now, let's make a findById and remove by id. The remove, is more complicate because, first, we need to find the course by Id and then, execute a remove passing the object.

```java
@Repository
public class CourseJpaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    // same code

    public Course findById(long id) {
        return entityManager.find(Course.class, id);
    }

    public void deleteById(long id) {
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }
}
```

Now, let's create our commandLine Runner

```java
@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Initiate JPA Transactions");
        repository.insert(new Course(4, "Learn Go", "in28minutes"));
        repository.insert(new Course(5, "Learn Rust", "in28minutes"));
        repository.insert(new Course(6, "Learn C#", "in28minutes"));

        repository.deleteById(4);

        Course course2 = repository.findById(5);
        Course course3 = repository.findById(6);

        System.out.println(course2);
        System.out.println(course3);
        System.out.println("Finished JPA Transactions");
    }
}
```

```
Initiate JDBC Transactions
Course{id=2, name='Learn Java', author='in28minutes'}
Course{id=3, name='Learn C++', author='in28minutes'}
Finished JDBC Transactions
Initiate JPA Transactions
Course{id=5, name='Learn Rust', author='in28minutes'}
Course{id=6, name='Learn C#', author='in28minutes'}
Finished JPA Transactions
```

if we want to see the sql that is executing in JPA, add this properti in ```application.properties``` class

```
spring.jpa.show-sql=true
```

now, we can see the sql being executed

```
Initiate JDBC Transactions
Course{id=2, name='Learn Java', author='in28minutes'}
Course{id=3, name='Learn C++', author='in28minutes'}
Finished JDBC Transactions
Initiate JPA Transactions
Hibernate: select c1_0.id,c1_0.author,c1_0.name from course c1_0 where c1_0.id=?
Hibernate: insert into course (author,name,id) values (?,?,?)
Hibernate: select c1_0.id,c1_0.author,c1_0.name from course c1_0 where c1_0.id=?
Hibernate: insert into course (author,name,id) values (?,?,?)
Hibernate: select c1_0.id,c1_0.author,c1_0.name from course c1_0 where c1_0.id=?
Hibernate: insert into course (author,name,id) values (?,?,?)
Hibernate: select c1_0.id,c1_0.author,c1_0.name from course c1_0 where c1_0.id=?
Hibernate: delete from course where id=?
Hibernate: select c1_0.id,c1_0.author,c1_0.name from course c1_0 where c1_0.id=?
Hibernate: select c1_0.id,c1_0.author,c1_0.name from course c1_0 where c1_0.id=?
Course{id=5, name='Learn Rust', author='in28minutes'}
Course{id=6, name='Learn C#', author='in28minutes'}
Finished JPA Transactions
```

#### <a name="chapter3part6"></a>Chapter 3 - Part 6: Manipulate Data Using Spring JPA

Let's make use of Spring JPA. We already make a map of the attributes in the class entity

```java
package com.vitorproject.springboot.learnjpaandhibernate.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    private long id;
	
    @Column(name="name")
    private String name;
	
    @Column(name="author")
    private String author;

//same code
```

Create a interface that will extends the ```JpaRepository```. Now,In the extend attribute, you have to pass the class that you want to map, in this case, the Course, and the type of primary key of this entity, in this case, the Long

```java

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

}

```

Now, let's create the command liner Runner

```java
@Component
public class CourseSpringJpaCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Initiate Spring JPA Transactions");
        repository.save(new Course(7, "Learn PHP", "in28minutes"));
        repository.save(new Course(8, "Learn Javascript", "in28minutes"));
        repository.save(new Course(9, "Learn Lua", "in28minutes"));

        repository.deleteById(7l);

        System.out.println(repository.findById(8l));
        System.out.println(repository.findById(9l));
        System.out.println("Finished Spring JPA Transactions");
    }
}
```

The Logs

```
Initiate Spring JPA Transactions
Hibernate: select c1_0.id,c1_0.author,c1_0.name from course c1_0 where c1_0.id=?
Hibernate: insert into course (author,name,id) values (?,?,?)
Hibernate: select c1_0.id,c1_0.author,c1_0.name from course c1_0 where c1_0.id=?
Hibernate: insert into course (author,name,id) values (?,?,?)
Hibernate: select c1_0.id,c1_0.author,c1_0.name from course c1_0 where c1_0.id=?
Hibernate: insert into course (author,name,id) values (?,?,?)
Hibernate: select c1_0.id,c1_0.author,c1_0.name from course c1_0 where c1_0.id=?
Hibernate: delete from course where id=?
Hibernate: select c1_0.id,c1_0.author,c1_0.name from course c1_0 where c1_0.id=?
Optional[Course{id=8, name='Learn Javascript', author='in28minutes'}]
Hibernate: select c1_0.id,c1_0.author,c1_0.name from course c1_0 where c1_0.id=?
Optional[Course{id=9, name='Learn Lua', author='in28minutes'}]
Finished Spring JPA Transactions
```

Let's make more operations. Let's find all entities and count all entities we have

```java
System.out.println(repository.findAll());
System.out.println(repository.count());
```

Logs

```
New Commands
[Course{id=2, name='Learn Java', author='in28minutes'}, Course{id=3, name='Learn C++', author='in28minutes'}, Course{id=5, name='Learn Rust', author='in28minutes'}, Course{id=6, name='Learn C#', author='in28minutes'}, Course{id=8, name='Learn Javascript', author='in28minutes'}, Course{id=9, name='Learn Lua', author='in28minutes'}]
6
```

We can create custom methods in Jpa Repository. Let's create a method to find by author and by name.

```java
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

    List<Course> findByAuthor(String author);

    Course findByName(String name);

}
```

OBS: Important. The name of the method must be relationated with the name of the field in the entity. If we put, findByCourseName, this will cause a error

In the next example, the Spring Data JPA automatically generates the corresponding SQL queries based on the method names and parameter names, making complex querying scenarios more accessible without the need for writing native SQL queries.

```java
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;
    private String author;
    private int publicationYear;
    private String genre;

    // Getters and setters
}

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthorAndPublicationYearAndGenre(String author, int publicationYear, String genre);
	
    List<Book> findByAuthorAndGenreAndPublicationYear(String author, String genre, int publicationYear);
    
    List<Book> findByAuthorAndGenre(String author, String genre);
}

```

To create your custom query, you need to use Custom Query Methods

```java
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE CONCAT(u.firstName, ' ', u.lastName) LIKE %:keyword%")
    List<User> findUsersByFullNameKeyword(@Param("keyword") String keyword);
}
```

For more, [Creating Repository Interfaces with JPA](https://medium.com/@bubu.tripathy/best-practices-creating-repository-interfaces-with-jpa-d904bee64397) 

```Java
@Component
public class CourseSpringJpaCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {

        //same code
		
        System.out.println(repository.findByAuthor("in28minutes"));
        System.out.println(repository.findByAuthor(""));

        System.out.println(repository.findByName("Learn C#"));
    }
}
```	

```
[Course{id=2, name='Learn Java', author='in28minutes'}, Course{id=3, name='Learn C++', author='in28minutes'}, Course{id=5, name='Learn Rust', author='in28minutes'}, Course{id=6, name='Learn C#', author='in28minutes'}, Course{id=8, name='Learn Javascript', author='in28minutes'}, Course{id=9, name='Learn Lua', author='in28minutes'}]
[]
Course{id=6, name='Learn C#', author='in28minutes'}
```

#### <a name="chapter3part7"></a>Chapter 3 - Part 7: Hibernate vs JPA

- JPA defines the specification. It is an API.
  - How do you define entities?
  - How do you map attributes?
  - Who manages the entities?
- Hibernate is one of the popular implementations of JPA
- Using Hibernate directly would result in a lock in to Hibernate
  - There are other JPA implementations (Toplink, for example)
 
## <a name="chapter4"></a>Chapter 4:  Create RESTful API with Spring Boot
  
#### <a name="chapter4part1"></a>Chapter 4 - Part 1: Config a New Spring Boot Project

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
   - For Spring Boot 3.x -> Java Version 17,21
- **Dependencies**
   - Spring Web -> To Construct Rest APIs
   
   
Download the project, and open use your IDE.

After all dependencies is downloaded and loaded, execute the Spring Boot Application and check if the logs is ok.

<br>

<div align="center"><img src="img/orderapplicationstarted-w1833-h712.png" width=1833 height=712><br><sub>Order Application Running - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>
   
#### <a name="chapter4part2"></a>Chapter 4 - Part 2: The Domain Model of Order Application and Architecture of the API

**This is the Domain model of the application.**
   
<br>

<div align="center"><img src="img/domainmodel-w1055-h409.png" width=1055 height=409><br><sub>Domain Model Order Application - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

**The Architecture of our API will follow a Layer Architecture.**

<br>

<div align="center"><img src="img/apiarchitecture-w915-h551.png" width=551 height=409><br><sub>Layer API Architecture - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>


#### <a name="chapter4part3"></a>Chapter 4 - Part 3: Create the User Entity

The first entity we will create, is the User entity. To do, we first need to create a package named entities, with the name of the entitie as User.

Now, to create a Entitie, we need to follow this checklist

**Basic entity checklist:** 
  - Basic attributes - All the attributes that is listed in the domain model
  - Associations (instantiate collections) - If have Associations, create them
  - Constructors - The basic constructor
  - Getters & Setters (collections: only get) - The getters and setters methods
  - hashCode & equals - To override the equals methods
  - Serializable - To implement the interface Serilizable to do opperations to transform the entitie in bytes to traffegate over internet and save the object in files
  
  
 ```java
 package com.ecommerce.order.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String email;

    private String phone;

    private String password;

    public User() {

    }

    public User(Long id, String name, String email, String phone, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(getId(), user.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
```

#### <a name="chapter4part4"></a>Chapter 4 - Part 4: Create a resource to test

After we created our entity, is necessary to create a way to test if the class is correted implemented. Let's create a resource class UserResource, to test our requisition


```java
package com.ecommerce.order.resources;

import com.ecommerce.order.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User
                (1000L, "John", "john@gmail.com", "999999", "123456");

        return ResponseEntity.ok().body(user);
    }

}
```

In this resource, we will use the annotation ```@RestController``` to configure this class as a Rest Controller. The annotation ```@RequestMapping(value = "/users")```, is the path to access the user resource.
The ```@GetMapping```, is used to configure this method as a Get method. The ResponseEntity class, is used to create and deal with Http operations over the Method.

Let's start the application, and access by http://localhost:8080/users

The output will be the json Object

```
{"id":1000,"name":"John","email":"john@gmail.com","phone":"999999","password":"123456"}
```

#### <a name="chapter4part5"></a>Chapter 4 - Part 5: Set up the H2 database to Test

To set up your H2 databse, put this dependecies in our pom.xml file

```
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<dependency>
	<groupId>com.h2database</groupId>
	<artifactId>h2</artifactId>
	<scope>runtime</scope>
</dependency>
```

Now, we need to put in our ```application.properties``` the profile of our application. In this case, we will use as test

```
spring.profiles.active=test
spring.jpa.open-in-view=true
```

Now, let's create a ```application-test.properties``` to put our H2 config

```
# DATASOURCE 
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

# H2 CLIENT 
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# JPA, SQL 
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.defer-datasource-initialization=true
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

Now, let's test our H2 Database

Enter in http://localhost:8080/h2-console and enter in connect

#### <a name="chapter4part6"></a>Chapter 4 - Part 6: Create the JPA Mapping in Entity

When a Entity will be mapped to JPA, we need to put in the class the Annotation ```@Entity```. This will configure the class as a entity to be mapped in a Database.
When we will import this annotation, there is two import types: ```jakarta.persistence``` and ```org.hibernate.annotations```. The Jakarta, or Javax is the especification of JPA and Hibernate is the implementation of JPA.
Always have preference to the especification, not the implementation, in this case, use Jakarta, or Javax.

The ```@Table(name = "tb_user")``` will tell wich table this entity is to be mapped

The ```@Id``` in the Id field is the Primary Key of the table.

The ```@GeneratedValue(strategy = GenerationType.IDENTITY)``` in the Id field, generate automatic a Id to auto complete in the table


```java
package com.ecommerce.order.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;


import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String phone;

    private String password;
	
	// same code

}
```

If we run the program and go to the H2 console, we will see the user table created

<br>

<div align="center"><img src="img/usertable-w1044-h551.png" width=1044 height=551><br><sub>User Table - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

#### <a name="chapter4part7"></a>Chapter 4 - Part 7: Create the User Repository Layer and a Configuration class to Test

First, we need to create a Package called Repositories that will be responsible to do operations with the entity User in the database. To do, we need to create a interface UserRepository.

```java
package com.ecommerce.order.repositories;

import com.ecommerce.order.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends package com.ecommerce.order.repositories;

import com.ecommerce.order.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}<User, Long> {

}
```

The interface ```UserRepository``` must extend the ```JpaRepository``` interface, and as a parameter, we need to put the entity that will be mapped in the database, in this case, the ```User``` class and the type of the Id of this class, in this case, must be a Long

Now, let's create a test class, to be able to test if this Repository is mapping the user in the table user.

First, we need to create a Configuration class, that in the start up of the project, this will be executated. We can do this using the ```Configuration``` annotation. 

Antoher way why we use ```Configuration```, is when you utilize a 3rd party library (most of the time we do) and we need to have that library as a singleton, 
then we declare it as bean using ```@Bean``` inside our ```@Configuration```, because we can't annotate a 3rd party library using ```@Component``` right?

In this class, we will use the ```@Profile("test")``` annotation, telling to spring, when the profile in ```application.properties``` is in test, this will be executed

```java
package com.ecommerce.order.config;

import com.ecommerce.order.entities.User;
import com.ecommerce.order.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository repository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        repository.saveAll(Arrays.asList(u1,u2));
    }
}
```

To execute this save every time the application will start, we need to implement the interface ```CommandLineRunner```

Now, we need to Inject the ```UserRepository```, because we will make use of the layer Repositorie and the operation.

To test, save two objects of User and save them in the data base using the method saveAll.

After this, we will have the two objects in the Database

<br>

<div align="center"><img src="img/usertablewithtwoobjects-w860-h439.png" width=860 height=439><br><sub>User Table with two objects - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

#### <a name="chapter4part8"></a>Chapter 4 - Part 8: Create the User Service Layer

Now, let's create the service layer that will be responsible to executa the bussiness logic of the Application. 
This Layer will have a dependencie of the Repository Layer, so, we need to inject the Repository layer in this Service Layer

First, use the annotation ```@Service``` to tell spring this will be managed by Spring.

Now, use the ```@Autowired``` to inject the repository in this layer and create a method to return a List of users

```java
package com.ecommerce.order.services;

import com.ecommerce.order.entities.User;
import com.ecommerce.order.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

}
```

Now, we need to modify our Resource layer, to use the service layer and return a list of users

```java
package com.ecommerce.order.resources;

import com.ecommerce.order.entities.User;
import com.ecommerce.order.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

}
```

#### <a name="chapter4part9"></a>Chapter 4 - Part 9: Create the resource to return a user by Id

Now, let's implement another method to return a User by Id.

In the service layer, create this method

```java
package com.ecommerce.order.services;

import com.ecommerce.order.entities.User;
import com.ecommerce.order.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

	@Autowired
    private UserRepository repository;

	// same code
	
	public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

}
```

The Optional class in Java 8 is a container object which is used to contain a value that might or might not be present. 
It was introduced as a way to help reduce the number of NullPointerExceptions that occur in Java code.

One of the key benefits of using Optional is that it forces you to handle the case where the value is absent. 
This means that you are less likely to miss important checks in your code and reduces the risk of NullPointerException. 
If a value is not present, you can either provide a default value or throw an exception.

Now, let's implement in the Resource class

We need to put another ```@GetMapping``` annotation, but now, we need to pass a id in the resource. To do, we need to use this annotation with ``` @GetMapping(value = "/{id}")```
Now, we need to use the annotation ```@PathVariable``` in the method input, to tell Spring this Id will come from the resource url


```java
package com.ecommerce.order.resources;

import com.ecommerce.order.entities.User;
import com.ecommerce.order.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	//same code

	@Autowired
    private UserService service;

	@GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}

```

To test, make a curl using http://localhost:8080/users/1

to output will Be

```
{"id":1,"name":"Maria Brown","email":"maria@gmail.com","phone":"988888888","password":"123456"}
```

#### <a name="chapter4part10"></a>Chapter 4 - Part 10: Create the association Order Many-to-One (User and Order)

Now, let's create the entity order.

```java
package com.ecommerce.order.entities;

import java.io.Serializable;
import java.time.Instant;

public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Instant moment;


    private User user;

    public Order(){

    }

    public Order(Long id, Instant moment, User user) {
        this.id = id;
        this.moment = moment;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;

        return getId().equals(order.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
```

Now, let's put the tables annotation. Because a Order have a association with the entity User, we need to use the annotation in the attribut user ```@ManyToOne```.
When we retrieve the user associated with the order, we need to make a join, so, we need to use the annotation ```@JoinColumn(name = "client_id")``` with the value of the foreign key that will be used to make the join

```java
package com.ecommerce.order.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.GenerationType;

import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Instant moment;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
	
	//same code

}
```

Now, we need to do the same thing in the User. 

We need to create the Order association and put the annotation ```@OneToMany(mappedBy = "user")```

We need to use the annotation ```@OneToMany(mappedBy = "user")``` and pass what class will be mapped, in this case, will be order

```java

package com.ecommerce.order.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GenerationType;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_user")
public class User implements Serializable {

	//same code

	@OneToMany(mappedBy = "user")
    private List<Order> orders = new ArrayList<>();
	
	//same code
	
	public List<Order> getOrders() {
        return orders;
    }
	
	//same code
}

```

#### <a name="chapter4part11"></a>Chapter 4 - Part 11: Create the Repository, Service and Resource Order

Let's create the order Repository

```java
package com.ecommerce.order.repositories;

import com.ecommerce.order.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
```

Now, create the order Service

```java
package com.ecommerce.order.services;

import com.ecommerce.order.entities.Order;
import com.ecommerce.order.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }

}
```

Now, create the order Resource

```java
package com.ecommerce.order.resources;

import com.ecommerce.order.entities.Order;
import com.ecommerce.order.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderService service;

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
```

Now, create let's seed the order table

```java
package com.ecommerce.order.config;

import com.ecommerce.order.entities.Order;
import com.ecommerce.order.entities.User;
import com.ecommerce.order.repositories.OrderRepository;
import com.ecommerce.order.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1,u2));

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);

        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

    }
}
```

If we call a order, http://localhost:8080/orders/1 , will create a loop, because a order have a user, this user have a order, this order have a user and so on.

This will case a ```java.lang.StackOverflowError:```

```
{"id":1,"moment":"2019-06-20T19:53:07Z",
"user":{"id":1,"name":"Maria Brown","email":"maria@gmail.com","phone":"988888888","password":"123456",
"orders":[{"id":1,"moment":"2019-06-20T19:53:07Z","user":{"id":1,"name":"Maria Brown","email":"maria@gmail.com","phone":"988888888","password":"123456",
"orders":[{"id":1,"moment":"2019-06-20T19:53:07Z","user":{"id":1,"name":"Maria Brown","email":"maria@gmail.com","phone":"988888888","password":"123456",
"orders":[{"id":1,"moment":"2019-06-20T19:53:07Z","user":{"id":1,"name":"Maria Brown","email":"maria@gmail.com","phone":"988888888","password":"123456",
"orders":[{"id":1,"moment":"2019-06-20T19:53:07Z","user":{"id":1,"name":"Maria Brown","email":"maria@gmail.com","phone":"988888888","password":"123456",
"orders":[{"id":1,"moment":"2019-06-20T19:53:07Z","user":{"id":1,"name":"Maria Brown","email":"maria@gmail.com","phone":"988888888","password":"123456",
"orders":[{"id":1,"moment":"2019-06-20T19:53:07Z","user":{"id":1,"name":"Maria Brown","email":"maria@gmail.com","phone":"988888888","password":"123456",
"orders":[{"id":1,"moment":"2019-06-20T19:53:07Z","user":{"id":1,"name":"Maria 
```

To avoid this, we need to use a annotation in one of the Relation of the entities, in this case is ```@JsonIgnore```

```java
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_user")
public class User implements Serializable {

	// same code

	@JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Order> orders = new ArrayList<>();
	
	// same code

}

```

Now, if we make the call http://localhost:8080/orders/1, we will Have

```
{"id":1,"moment":"2019-06-20T19:53:07Z","user":{"id":1,"name":"Maria Brown","email":"maria@gmail.com","phone":"988888888","password":"123456"}}
```

If we make http://localhost:8080/users/1, we will Have

```
{"id":1,"name":"Maria Brown","email":"maria@gmail.com","phone":"988888888","password":"123456"}
```

When we have a association Many to one (Orders to a client), the JPA will load the association, but if we have One to Many, the JPA by default will not loaded because can cause a stack over flow error, and use the Lazy load
oparation

If we put the JsonIgnore annotation in the orders Entity

```java
import com.fasterxml.jackson.annotation.JsonIgnore


@Entity
@Table(name = "tb_order")
public class Order implements Serializable {


	// same code
	
	@JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
	
	// same code
}
```

Now, if we make the call http://localhost:8080/orders/1, we will Have

```
{"id":1,"moment":"2019-06-20T19:53:07Z"}
```

If we make http://localhost:8080/users/1, we will Have

```
{"id":1,"name":"Maria Brown","email":"maria@gmail.com","phone":"988888888","password":"123456","orders":[{"id":1,"moment":"2019-06-20T19:53:07Z"},{"id":3,"moment":"2019-07-22T15:21:22Z"}]}
```

Another important is this config in the ```application.properties```

```
spring.jpa.open-in-view=true
```

This is used to create a serialization of the entity in the end of the life cicle when we call them

Now, let's format the moment attribute of the order, in the GMT time zone



```java
import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "tb_order")
public class Order implements Serializable {


	// same code
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant moment;
	
	// same code
}
```

#### <a name="chapter4part12"></a>Chapter 4 - Part 12: Create the Status Enum

Let's create the Enums package with the Enum OrderStatus


```java
package com.ecommerce.order.entities.enums;

public enum OrderStatus {

    WAITING_PAYMENT,
    PAID,
    SHIPPED,
    DELIVERED,
    CANCELED;
}
```

Now, let's modify the entity class Order to add the Enum


```java

import com.ecommerce.order.entities.enums.OrderStatus;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {

	// same code
	
	private OrderStatus orderStatus;
	
	public Order(Long id, Instant moment, User user, OrderStatus orderStatus) {
        this.id = id;
        this.moment = moment;
        this.user = user;
        this.orderStatus = orderStatus;
    }
	
	public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
	
	//same code
	
}
```

Now, let's modify the TestConfig class

```java

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1, OrderStatus.PAID);
    Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2, OrderStatus.WAITING_PAYMENT);
    Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1, OrderStatus.WAITING_PAYMENT);


}
```

Now, if we go to the table, the values of the status of the order is numbers. This occurred because the enums by default is add as numbers
To avoid this, we need to implement a way to set the status based in the number that is in the Table


```java
package com.ecommerce.order.entities.enums;

public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OrderStatus valueOf(int code) {
        for (OrderStatus value : OrderStatus.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus Code");
    }
}
```

Now, we need to modify the order Class


```java

import com.ecommerce.order.entities.enums.OrderStatus;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {

		// same code
	
	private Integer orderStatus;
	
	public Order(Long id, Instant moment, User user, OrderStatus orderStatus) {
        this.id = id;
        this.moment = moment;
        this.user = user;
        setOrderStatus(orderStatus);
    }
	
    public OrderStatus getOrderStatus() {
        return OrderStatus.valueOf(orderStatus);
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        if(orderStatus != null) {
            this.orderStatus = orderStatus.getCode();
        }
    }
	
	//same code
	
```

#### <a name="chapter4part13"></a>Chapter 4 - Part 13: Create the Category Repository, Service and resource

Category Entity

```java
package com.ecommerce.order.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

import java.io.Serializable;

@Entity
@Table(name = "tb_category")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Category() {
    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category category)) return false;

        return getId().equals(category.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
```

Category Repository

```java
package com.ecommerce.order.repositories;

import com.ecommerce.order.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
```

Category service

```java
package com.ecommerce.order.services;

import com.ecommerce.order.entities.Category;
import com.ecommerce.order.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }

}
```

Category resource

```java
package com.ecommerce.order.resources;

import com.ecommerce.order.entities.Category;
import com.ecommerce.order.entities.Order;
import com.ecommerce.order.services.CategoryService;
import com.ecommerce.order.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
```

Create the test Class

```java
import com.ecommerce.order.entities.Category;

import com.ecommerce.order.repositories.CategoryRepository;

	@Configuration
	@Profile("test")
	public class TestConfig implements CommandLineRunner {
	
		@Autowired
		private CategoryRepository categoryRepository;
	
		Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
	
}
```
	
#### <a name="chapter4part14"></a>Chapter 4 - Part 14: Create the Product Repository, Service and resource

Product Entity

Because Product and Category have a relation, we have to implement this in the both sides. Let's implements a Set collection, because a product can't have duplicate categories.

Because we will not implement the mapping of relation with Category and Product like the we did with Order and User, we need to use the annotation
```@Transient```

@Transient annotation in Hibernate is used to mark a property or field in an entity class as transient. 
This means that the field or property marked as transient should be excluded when the data persists in the database. 
Wherever an entity is mapped to a database table, by default all the non-transient fields and properties are persisted. 
There are certain fields or properties in an entity that should be ignored during the data persistence process such as the data which is being calculated for displaying, temporary variables, and other data which is relevant only within the application logic but is not required in the database. 

```java
package com.ecommerce.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imgUrl;

	@Transient
    private Set<Category> categories = new HashSet<>();

    public Product() {

    }

    public Product(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;

        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
```

Category relation with Product

```java
@Entity
@Table(name = "tb_category")
public class Category implements Serializable {

	// same code
	
	@Transient
	private Set<Product> products = new HashSet<>();
	
	// same code
	
	public Set<Product> getProducts() {
        return products;
    }
```

Product Repository

```java

package com.ecommerce.order.repositories;

import com.ecommerce.order.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
```

Product service

```java
@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

}
```

Product Resource

```java
@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
```

Create the test Class

```java
import com.ecommerce.order.entities.Product;

import com.ecommerce.order.repositories.ProductRepository;

	@Configuration
	@Profile("test")
	public class TestConfig implements CommandLineRunner {
	
		@Autowired
		private ProductRepository productRepository;
	
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

        productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
	
}
```

#### <a name="chapter4part15"></a>Chapter 4 - Part 15: Many-to-Many relation and JoinTable (Category and Product)

Product and Category have a association Many-to-Many. For example, a product computer can be in the category of Computers and Eletronics, and the category eletronics can have Computer and Radio.

 In the database with need a association table to associate the PK of Category with the PK of products.
 
 With JPA, we can make this association using JoinTable.
 
 We first need to choose one class of the association, in this case, or Product or Category.
 
 Let's remove the ```@Transient``` annotation, in the association class and use this annotations
 
  - @ManyToMany: The type of association with category
  - @JoinTable(name = "tb_product_category", : The name of the table that will have the association
  - @JoinTable(joinColumns = @JoinColumn(name = "product_id"), : The name of the column that will have the assocation with the category
  - @JoinTable(inverseJoinColumns = @JoinColumn(name = "category_id"): The name of the column for the other side that will have the assocation with the product
 
 ```java
 
 @Entity
@Table(name = "tb_product")
public class Product implements Serializable {

	//same code
	
	@ManyToMany
    @JoinTable(name = "tb_product_category",
               joinColumns = @JoinColumn(name = "product_id"),
               inverseJoinColumns = @JoinColumn(name = "category_id"))
	private Set<Category> categories = new HashSet<>();
	
	//same code

```

Now, in the class category, we have to reference this relation that we did in Product. We have to use the ```@ManyToMany``` annotation and pass what is the name of the attribute that we are making the relation.

OBS: Don't forget to use the ```@JsonIgnore```

```java

@Entity
@Table(name = "tb_category")
public class Category implements Serializable {

	@JsonIgnore
	@ManyToMany(mappedBy = "categories")
    private Set<Product> products = new HashSet<>();

```

Now, let's make this association in our testa class. First, we create the association using the operations and we save using the repository class

```java
import com.ecommerce.order.entities.Product;

import com.ecommerce.order.repositories.ProductRepository;

	@Configuration
	@Profile("test")
	public class TestConfig implements CommandLineRunner {
	
	p1.getCategories().add(cat2);
	p2.getCategories().add(cat1);
	p2.getCategories().add(cat3);
	p3.getCategories().add(cat3);
	p4.getCategories().add(cat3);
	p5.getCategories().add(cat2);

	productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
	
}

```

If we make a GET to http://localhost:8080/products/2

we will have a product with two categories

```
{"id":2,"name":"Smart TV","description":"Nulla eu imperdiet purus. Maecenas ante.","price":2190.0,"imgUrl":"","categories":[{"id":1,"name":"Electronics"},{"id":3,"name":"Computers"}]}
```

In the H2 table, the table ```tb_product_category``` was created with the relations that we put in the Test class


<br>

<div align="center"><img src="img/manytomany-w882-h546.png" width=882 height=546><br><sub>Many to Many - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

#### <a name="chapter4part16"></a>Chapter 4 - Part 16: Many-to-Many relation with extra data (Product and Order)

In the relation with Category and Product, we just have a relation with the two entities, but, if we have a relation with two entites but this relation generate a extra data, like we have in the relation
with Product and Order, we need to create a entity OrderItem


First, let's create the OrderItemPK, that will have the reference of the Order and the Product.

Because we don't have a primary key that can represent two itens in the object paradigma like in the relational paradigma, we need to create a OrderItemPK.

In this class, we will receive a Order and a Product to make the relation Order and Item, and the class OrderItem will receive the OrderItemPK as a id.

The ```@Embeddable``` annotation is used to mark a class as being embeddable, meaning its properties can be included in another class as a value type.

In the attributes Order and Item, we need to make the relation ```@ManyToOne```

```java
package com.ecommerce.order.entities.pk;

import com.ecommerce.order.entities.Order;
import com.ecommerce.order.entities.Product;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class OrderItemPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItemPK that)) return false;

        if (getOrder() != null ? !getOrder().equals(that.getOrder()) : that.getOrder() != null) return false;
        return getProduct() != null ? getProduct().equals(that.getProduct()) : that.getProduct() == null;
    }

    @Override
    public int hashCode() {
        int result = getOrder() != null ? getOrder().hashCode() : 0;
        result = 31 * result + (getProduct() != null ? getProduct().hashCode() : 0);
        return result;
    }
}
```

Now, let,s create the class OrderItem that will use the reference of the OrderItemPK

```java

package com.ecommerce.order.entities;

import com.ecommerce.order.entities.pk.OrderItemPK;

import java.io.Serializable;
import java.util.Objects;

public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    private OrderItemPK id;

    private Integer quantity;

    private Double price;

    public OrderItem(){

    }

    public OrderItem(Integer quantity, Double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItem orderItem)) return false;

        if (!Objects.equals(id, orderItem.id)) return false;
        if (getQuantity() != null ? !getQuantity().equals(orderItem.getQuantity()) : orderItem.getQuantity() != null)
            return false;
        return getPrice() != null ? getPrice().equals(orderItem.getPrice()) : orderItem.getPrice() == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (getQuantity() != null ? getQuantity().hashCode() : 0);
        result = 31 * result + (getPrice() != null ? getPrice().hashCode() : 0);
        return result;
    }
}
```

We not created the Order and Product getters and setters and not add them in the constructor. This is because we need to use the OrderItemPK id methods set and get to set the id of this products in the PK


```java

public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;
	
	//same code
	
	public OrderItem(Order order, Product product, Integer quantity, Double price) {
        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }

    public Order getOrder() {
        return id.getOrder();
    }

    public void setOrder(Order order) {
        id.setOrder(order);
    }

    public Product getProduct() {
        return id.getProduct();
    }

    public void setProduct(Product product) {
        id.setProduct(product);
    }
	
	//same code

}

```

Now, let's make the annotations.

The ```@EmbeddedId``` annotation is applied to a persistent field or property of an entity class or mapped superclass to denote a composite primary key that is an embeddable class. 
The embeddable class must be annotated as Embeddable.

```java

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {

	@EmbeddedId
    private OrderItemPK id = new OrderItemPK();

```

Now, we need to make the relation of the order with product

First, let's make the relation in Order class. Because we will make the relation with table ```tb_order_item```, we need to make the relation ```@OneToMany``` with the ```id.order``` where the id is the OrderItemPK


```java
@Entity
@Table(name = "tb_order")
public class Order implements Serializable {

	// same code

	@OneToMany(mappedBy = "id.order")
    private Set<OrderItem> items = new HashSet<>();
	
	//same code
	
	public Set<OrderItem> getItems() {
        return items;
    }

```

Now, let's create the order item repository

```java

package com.ecommerce.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}

```

To avoid ciclical reference, we need to use the ```@JsonIgnore``` in the getOrder() because is what using to get a order

```java

public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;
	
	//same code
	
	@JsonIgnore
    public Order getOrder() {
        return id.getOrder();
    }
	
	//same code

}

```

Now, let's test and make the seed in the database


```java

import com.ecommerce.order.entities.Product;

import com.ecommerce.order.repositories.ProductRepository;

	@Configuration
	@Profile("test")
	public class TestConfig implements CommandLineRunner {
	
	@Autowired
    private OrderItemRepository orderItemRepository;
	
	OrderItem oi1 = new OrderItem(o1, p1, 2, p1.getPrice());
	OrderItem oi2 = new OrderItem(o1, p3, 1, p3.getPrice());
	OrderItem oi3 = new OrderItem(o2, p3, 2, p3.getPrice());
	OrderItem oi4 = new OrderItem(o3, p5, 2, p5.getPrice());

	orderItemRepository.saveAll(Arrays.asList(oi1, oi2, oi3, oi4));
	
}

```

Now, make a get http://localhost:8080/orders/1

```
{
    "id": 1,
    "moment": "2019-06-20T19:53:07Z",
    "user": {
        "id": 1,
        "name": "Maria Brown",
        "email": "maria@gmail.com",
        "phone": "988888888",
        "password": "123456"
    },
    "orderStatus": "PAID",
    "items": [{
            "quantity": 1,
            "price": 1250.0,
            "product": {
                "id": 3,
                "name": "Macbook Pro",
                "description": "Nam eleifend maximus tortor, at mollis.",
                "price": 1250.0,
                "imgUrl": "",
                "categories": [{
                        "id": 3,
                        "name": "Computers"
                    }
                ]
            }
        }, {
            "quantity": 2,
            "price": 90.5,
            "product": {
                "id": 1,
                "name": "The Lord of the Rings",
                "description": "Lorem ipsum dolor sit amet, consectetur.",
                "price": 90.5,
                "imgUrl": "",
                "categories": [{
                        "id": 2,
                        "name": "Books"
                    }
                ]
            }
        }
    ]
}
```

Now, let's create the relation with the Product and OrderItem.

```java

@Entity
@Table(name = "tb_product")
public class Product implements Serializable {

	//same code

	@JsonIgnore
    @OneToMany(mappedBy = "id.product")
    private Set<OrderItem> items = new HashSet<>();
	
	
    public Set<Order> getOrders() {
        Set<Order> set = new HashSet<>();
        for (OrderItem x : items) {
            set.add(x.getOrder());
        }
        return set;
    }
	
	// same code

}

```

when we make a get http://localhost:8080/products/3

```
{
    "id": 3,
    "name": "Macbook Pro",
    "description": "Nam eleifend maximus tortor, at mollis.",
    "price": 1250.0,
    "imgUrl": "",
    "categories": [{
            "id": 3,
            "name": "Computers"
        }
    ],
    "orders": [{
            "id": 1,
            "moment": "2019-06-20T19:53:07Z",
            "user": {
                "id": 1,
                "name": "Maria Brown",
                "email": "maria@gmail.com",
                "phone": "988888888",
                "password": "123456"
            },
            "orderStatus": "PAID",
            "items": [{
                    "quantity": 1,
                    "price": 1250.0
                }, {
                    "quantity": 2,
                    "price": 90.5
                }
            ]
        }, {
            "id": 2,
            "moment": "2019-07-21T03:42:10Z",
            "user": {
                "id": 2,
                "name": "Alex Green",
                "email": "alex@gmail.com",
                "phone": "977777777",
                "password": "123456"
            },
            "orderStatus": "WAITING_PAYMENT",
            "items": [{
                    "quantity": 2,
                    "price": 1250.0
                }
            ]
        }
    ]
}
```

If we remove the ```@JsonIgnore``` at getProduct() in OrderItem and put in getOrders() in Product, we have this when we call http://localhost:8080/orders/1


```

{
    "id": 1,
    "moment": "2019-06-20T19:53:07Z",
    "user": {
        "id": 1,
        "name": "Maria Brown",
        "email": "maria@gmail.com",
        "phone": "988888888",
        "password": "123456"
    },
    "orderStatus": "PAID",
    "items": [{
            "quantity": 1,
            "price": 1250.0,
            "product": {
                "id": 3,
                "name": "Macbook Pro",
                "description": "Nam eleifend maximus tortor, at mollis.",
                "price": 1250.0,
                "imgUrl": "",
                "categories": [{
                        "id": 3,
                        "name": "Computers"
                    }
                ]
            }
        }, {
            "quantity": 2,
            "price": 90.5,
            "product": {
                "id": 1,
                "name": "The Lord of the Rings",
                "description": "Lorem ipsum dolor sit amet, consectetur.",
                "price": 90.5,
                "imgUrl": "",
                "categories": [{
                        "id": 2,
                        "name": "Books"
                    }
                ]
            }
        }
    ]
}

```

#### <a name="chapter4part17"></a>Chapter 4 - Part 17: Create the Payment Entity and Relation One-to-one with Order

First, lets create the association Payment in Order class. Because the Payment and Order will have the same Id, we can use a annotation
with ```@OneToOne``` with ```cascade = CascadeType.ALL```. If the Order have id 5, the Payment will have the id 5.

```java

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {

	//same code

	@OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
	private Payment payment;
	
	
	// same code
	
	public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

	//same code
}

```

Now, let's create the Payment Entity. Because the order can enter in the BD without a payment associated with him, we can make use of annotation ```@OneToOne``` and ```MapsId``` to map the Id of the order.

@MapsId annotation in Hibernate is used to obtain a one-to-one relationship between two entities by mapping the primary key of one entity to the foreign key of another entity.  
This annotation is used when we have to use a shared primary key between two entities. 


```java

package com.ecommerce.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_payment")
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Instant moment;

	@JsonIgnore
    @OneToOne
    @MapsId
    private Order order;

    public Payment() {

    }

    public Payment(Long id, Instant moment, Order order) {
        this.id = id;
        this.moment = moment;
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment payment)) return false;

        return getId() != null ? getId().equals(payment.getId()) : payment.getId() == null;
    }
    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }
}

```

Now, let's test this. Let's associate a Payment to a order. First, create the payment, after associate the Payment to a order, and after, save again in the database.

```java

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Override
    public void run(String... args) throws Exception {
	
	//same code
	
	Payment pay1 = new Payment(null, Instant.parse("2019-06-20T21:53:07Z"), o1);
	o1.setPayment(pay1);

	orderRepository.save(o1);
	
	}

}

```

#### <a name="chapter4part18"></a>Chapter 4 - Part 18: Create the subTotal() and total() methods

Let's create the method subTotal() to OrderItem;


```java

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {

	//same code
	
	 public Double getSubTotal(){
        Double subTotal = quantity*price;

        return subTotal;
    }
	
	//same code

}


```

Now, let's make the Total() to Order

```java

public Double getTotal() {
        Double sum = 0.0;
        for (OrderItem item : items) {
            sum += item.getSubTotal();
        }
        return sum;
    }

```

Now, if we make a http://localhost:8080/orders/1, we will have the total and subtotal

```
{
    "id": 1,
    "moment": "2019-06-20T19:53:07Z",
    "user": {
        "id": 1,
        "name": "Maria Brown",
        "email": "maria@gmail.com",
        "phone": "988888888",
        "password": "123456"
    },
    "orderStatus": "PAID",
    "items": [{
            "quantity": 1,
            "price": 1250.0,
            "product": {
                "id": 3,
                "name": "Macbook Pro",
                "description": "Nam eleifend maximus tortor, at mollis.",
                "price": 1250.0,
                "imgUrl": "",
                "categories": [{
                        "id": 3,
                        "name": "Computers"
                    }
                ]
            },
            "subTotal": 1250.0
        }, {
            "quantity": 2,
            "price": 90.5,
            "product": {
                "id": 1,
                "name": "The Lord of the Rings",
                "description": "Lorem ipsum dolor sit amet, consectetur.",
                "price": 90.5,
                "imgUrl": "",
                "categories": [{
                        "id": 2,
                        "name": "Books"
                    }
                ]
            },
            "subTotal": 181.0
        }
    ],
    "payment": {
        "id": 1,
        "moment": "2019-06-20T21:53:07Z"
    },
    "total": 1431.0
}
```

#### <a name="chapter4part19"></a>Chapter 4 - Part 19: Insert a User

Now, let's insert a user. First, we need to modify our UserService class to insert a user

```java
@Service
public class UserService {

	//same code

	public User insert(User obj){
        return repository.save(obj);
    }

}
```

Now, let's modify our User Resource


```java

@RestController
@RequestMapping(value = "/users")
public class UserResource {

//same code


	@PostMapping
    public ResponseEntity<User> insert(@RequestBody User obj) {
        service.insert(obj);
        return ResponseEntity.ok().body(obj);
    }

}

```

If we make ```curl --location 'http://localhost:8080/users' --header 'Content-Type: application/json' --data-raw '{   "name":"Bob Brown","email":"bob@gmail.com","phone":"977557755","password":"123456"}'````

We will receive a 200 Ok. But, to create, we have to receive a 201. For this, we need to create a uri.

Let's modify the resource response


```java

@RestController
@RequestMapping(value = "/users")
public class UserResource {

//same code


	@PostMapping
    public ResponseEntity<User> insert(@RequestBody User obj) {
        service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

}

```

#### <a name="chapter4part20"></a>Chapter 4 - Part 20: Delete a User

Now, let's delete a user. For this test, we will delete a user that not have Orders associate with him.
If we try to delete a user that have orders associate with him, this will cause a ConstraintViolatException because we have orders associate in the database


For this, first, let's modigy or UserService

```java
@Service
public class UserService {

	//same code

	public void deleteById(Long id){
        repository.deleteById(id);
    }

}
```

Now, let's modify our User Resource. Because the Delete method in some cases don't have a return, we can say in our method that ResponseEntity will return a Void


```java

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	//same code


	@DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}

```

This Curl will return a 204 No Content ```curl --location --request DELETE 'http://localhost:8080/users/3'```

#### <a name="chapter4part21"></a>Chapter 4 - Part 21: Update a User

Now, let's update a a user.

In ther User Service, we need to create a method that will receive a id and a obj User. The Id have the responsability to get the user in the database, and the obj will be what we will update


```java

@Service
public class UserService {

	//same code

	public User updateUser(Long id, User obj){
        User entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());

    }

}

```

Now, let's create the resource

```java

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	//same code


	@PutMapping(value = "/{id}")
    public ResponseEntity<User> updateUserById(@PathVariable Long id, @RequestBody User obj) {
        obj = service.updateUser(id,obj);
        return ResponseEntity.ok().body(obj);
    }

}

```

Now, let's test

First, make a POST of the user ```curl --location 'http://localhost:8080/users' --header 'Content-Type: application/json' --data-raw '{   "name":"Bob Brown","email":"bob@gmail.com","phone":"977557755","password":"123456"}'```

Now, make a update of this user with id 3 ```curl --location --request PUT 'http://localhost:8080/users/3' --header 'Content-Type: application/json' --data-raw '{   "name":"Alex Brown","email":"alex@gmail.com","phone":"977557755"}'```

This will return this body

```
{
    "id": 3,
    "name": "Alex Brown",
    "email": "alex@gmail.com",
    "phone": "977557755",
    "password": "123456"
}
```

Now, check with the Get if the user was updated in the database ```curl --location 'http://localhost:8080/users/3'```

```

{
    "id": 3,
    "name": "Alex Brown",
    "email": "alex@gmail.com",
    "phone": "977557755",
    "password": "123456"
}
```

#### <a name="chapter4part22"></a>Chapter 4 - Part 22: Exception Handler - findById

When we try to make a GET in a user that not exist in a Database ```curl --location 'http://localhost:8080/users/7'```, we will receive this reponse

```
{
    "timestamp": "2024-01-21T13:58:15.863+00:00",
    "status": 500,
    "error": "Internal Server Error",
    "path": "/users/7"
}
```

This is not a appropriate response in this case, because a 500 HTTP Status is a Server Error. We need to return a 404 HTTP Status. Let's create a Exception Handler for this cases.

Let's create a exception class in the Service Packge, because the error 500 is rising in the service layer. Let's analyse the logs of error

```
java.util.NoSuchElementException: No value present
	at java.base/java.util.Optional.get(Optional.java:143) ~[na:na]
	at com.ecommerce.order.services.UserService.findById(UserService.java:23) ~[classes/:na]
	at com.ecommerce.order.resources.UserResource.findById(UserResource.java:29) ~[classes/:na]
```

In the stack, the optional raise a error comming from the UserService layer that was propagate to the UserResource

Let's create in the service package a package called Exception and create a ResourceNotFoundException class.

Because of this class in not a compile error and this kind of error we are not oblight to handle, this class will extende a RuntimeException.

This class will have a constructor, that when this exception raise, will show a message

```java
package com.ecommerce.order.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }

}
```

Now, let's create a Standard Error class. Let's create a Canonical Error standard in case of errors

Let's create a class with this fields

```
{
    "timestamp": "2024-01-21T13:58:15.863+00:00",
    "status": 500,
    "error": "Internal Server Error",
    "path": "/users/7"
}
```

Because the class that deal with resourcers and send errors to response, let's create this in the Resource Exception.


```java

package com.ecommerce.order.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable {

    private static final long serialVersionUID = 1L;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant timestamp;

    private Integer status;

    private String error;

    private String message;

    private String path;

    public StandardError() {

    }

    public StandardError(Instant timestamp, Integer status, String error, String message, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}

```

Now, let's create a ResourceExceptionHandler, that we will handler manualy the exception in the resource. 

For this, we can make the use of the annotation ```@ControllerAdvice``` that will intercept the esceptions that will occur.

Let's create a resourceNotFound() method, that will receive the custom Exception ResourceNotFoundException, and a HttpServletRequest that will be the request that occur.

After, this method needs to use the annotation ```@ExceptionHandler(ResourceNotFoundException.class)``` because every exception that occur with ResourceNotFoundException, will pass to the method resourceNotFound()

```java
package com.ecommerce.order.resources.exceptions;

import com.ecommerce.order.services.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
        String error = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

}
```

Now, let's update the UserService. For this, let's use a method of Optional to, if the obj not exist, throw a exception.

After, we create a new ResourceNotFoundException(id) that with this Id, this call the Constructor with the message

```java

@Service
public class UserService {

	// same code
	
	public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }
	
	// same code

}

```

Now, let's test ```curl --location 'http://localhost:8080/users/7'```

```

{
    "timestamp": "2024-01-21T14:33:52Z",
    "status": 404,
    "error": "Resource not found",
    "message": "Resource not found. Id 7",
    "path": "/users/7"
}

```

If we check the application, this will not raise the exception


#### <a name="chapter4part23"></a>Chapter 4 - Part 23: Exception Handler - delete

Now, let's test a delete with a user that not exist. ```curl --location --request DELETE 'http://localhost:8080/users/7'```

This not generate a exception in the Postman even in the program. Let's capture this exception using a try-catch in the delete method of UserService

```java

@Service
public class UserService {

	// same code
	
	public void deleteById(Long id){
        try {
            repository.deleteById(id);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
	
	// same code

}

```

If we check, the exception raise a ```EmptyResultDataAccessException```, so let's modify


```java

@Service
public class UserService {

	// same code
	
	public void deleteById(Long id){
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        }

    }
	
	// same code

}

```

Now, let's try to delete a user that have orders. let's make the same thing

```java

public void deleteById(Long id){
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

```

If we check the logs of the application, we will have this exception


```DataIntegrityViolationException```

Now, let's create a custom Exception


```java

package com.ecommerce.order.services.exceptions;

public class DatabaseException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    public DatabaseException(String msg) {
        super(msg);
    }

}
```

Now let,s modify our service classdelete method


```java

 public void deleteById(Long id){
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }

    }
```

Now, let's create our personalize exception resource


```java



@ControllerAdvice
public class ResourceExceptionHandler {

    //same code

    @ExceptionHandler(DatabaseException.class)
    public ResponseEntity<StandardError> resourceNotFound(DatabaseException e, HttpServletRequest request) {
        String error = "Database error";
        HttpStatus status = HttpStatus.BAD_REQUEST;
        StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
	
	//same code

}

```


Now, if we try to delete a user we will have


```

{
    "timestamp": "2024-01-21T15:09:33Z",
    "status": 400,
    "error": "Database error",
    "message": "could not execute statement [Referential integrity constraint violation: \"FK2P4N9CIUI39792TK5QDPCXQ1W: PUBLIC.TB_ORDER FOREIGN KEY(USER_ID) REFERENCES PUBLIC.TB_USER(ID) (CAST(1 AS BIGINT))\"; SQL statement:\ndelete from tb_user where id=? [23503-224]] [delete from tb_user where id=?]; SQL [delete from tb_user where id=?]; constraint [\"FK2P4N9CIUI39792TK5QDPCXQ1W: PUBLIC.TB_ORDER FOREIGN KEY(USER_ID) REFERENCES PUBLIC.TB_USER(ID) (CAST(1 AS BIGINT))\"; SQL statement:\ndelete from tb_user where id=? [23503-224]]",
    "path": "/users/1"
}

```

#### <a name="chapter4part24"></a>Chapter 4 - Part 24: Exception Handler - update

Let's try to update a user that not exist. In the Service, let's make the same thing


```java

 public User updateUser(Long id, User obj){
        try {
            User entity = repository.getReferenceById(id);
            updateData(entity, obj);
            return repository.save(entity);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ResourceNotFoundException(id);
        }
        
    }

```

This will raise a ```EntityNotFoundException```

let's modify

```java

 public User updateUser(Long id, User obj){
        try {
            User entity = repository.getReferenceById(id);
            updateData(entity, obj);
            return repository.save(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }

    }
	
```


## <a name="chapter5"></a>Chapter 5: Spring Security with Spring Boot
  
#### <a name="chapter5part1"></a>Chapter 5 - Part 1: Security Fundamentals

- In any ***system***:
  - You have ***resources***
    - A REST API, A Web Application, A Database, A resource in the cloud, ...
  - You have ***identities***:
    - Identities need to access to resources and perform actions
      - For example: Execute a REST API call, Read/modify data in a database
  - Key Questions:
    - How to ***identify users***?
    - How to configure resources they can access & actions that are allowed?
	  
- ***Authentication*** (is it the right user?)
  - UserId/password (What do you remember?)
    - Ex: userId and Password of a LinkedIn Account, Gmail
  - Biometrics (What do you possess?)
    - Ex: When you log into your gmail, a SMS is send to your mobile phone. A fingerprint is used to log in some accounts
  - Can be done with both: UserId and Biometrics (Logging into a account and needs to confirm in a mobile phone)
  
- ***Authorization*** (do they have the right access?)
  - User XYZ can only read data
  - User ABC can read and update data
  
  Ex: To board in a flight, you have a Passport with a Id, that authenticate that is you, and with your board pass, you have the authorization to flight in that plane

#### <a name="chapter5part2"></a>Chapter 5 - Part 2: Important Security Principles

- A chain is only as strong as its WEAKEST link
  - Small security flaw makes an app with robust architecture vulnerable

- ***6 Principles*** Of Building Secure Systems

  - ***1***: Trust Nothing
    - Validate every request
	- Validate piece of data or information that comes into the system
	
  - ***2***: Assign Least Privileges
    - Start the design of the system with security requirements in mind
	- Have a clear picture of the user roles and accesses
	- Assign Minimum Possible Privileges at all levels
	  - Application
	  - Infrastructure (database + server + ..)
	  
  - ***3***: Have Complete Mediation
    - How were Medieval Fort's protected?
	  - Everyone had to pass through one main gate
	- Apply a well-implemented security filter. Test the role and access of each user.
	
  - ***4***: Have Defense In Depth
    - Multiple levels of security
	  - Transport, Network, Infrastructure
	  - Operating System, Application, ..
	  
  - ***5***: Have Economy Of Mechanism
    - Security architecture should be simple
	- Simple systems are easier to protect
	  
  - ***6***: Ensure Openness Of Design
    - Easier to identify and fix security flaws
	- Opposite of the misplaced idea of "Security Through Obscurity"

#### <a name="chapter5part3"></a>Chapter 5 - Part 3: How Spring Security Works

  - Security is the NO 1 priority for enterprises today!
  - What is the most popular security project in the Spring eco-system?
    - Spring Security: Protect your web applications, REST API and microservices
	- Spring Security can be difficult to get started
	  - Filter Chain
	  - Authentication managers
	  - Authentication providers
	- BUT it provides a very flexible security system!
	  - By default, everything is protected!
	  - A chain of filters ensure proper authentication and authorization
	  
   ***How does Spring MVC Work?***
   
<br>

<div align="center"><img src="img/springmvc-w852-h178.png" width=852 height=178><br><sub>Dispatcher Server in Spring MVC - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

When we are building a REST Api in Spring, we are making use of Spring MVC in the background. When we make a request in a API builded in Spring Boot, the request is first handler in the Dispatcher Servlet. The Dispatcher Servlet will looking to the URL, the request method and will route to the appropriate controller. DispatcherServlet acts as a friend controller and intercepts all the requests and routes to the right controller.

  - DispatcherServlet acts as the front controller
    - Intercepts all requests
	- Routes to the Right Controller

   
<br>

<div align="center"><img src="img/springsecurity-w1144-h182.png" width=1144 height=182><br><sub>Dispatcher Server in Spring Security - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

Springs security adds one more layer. All request is intercepted by the spring Security. There is a filter chain that you can configure and will intercept all the requests that comming in. Only when Spring Security checks all authentication and authorization, the request is send do DispatcherServlet and futher to the right controller.

  - Spring security intercepts all requests

  - Follows following security principle
    - ***3***: Have Complete Mediation

  - Spring security executes a series of filters
    - Also called Spring Security Filter Chain
	
***What Spring Security Does?***

  - Spring Security executes a series of filters
  
    - Filters provide these features:
	  - ***Authentication***: Is it a valid user? (Ex: BasicAuthenticationFilter)
	  - ***Authorization***: Does the user have right access?(Ex: AuthorizationFilter)
	  - ***Other Features***:
	    - Cross-Origin Resource Sharing (CORS) - CorsFilter
		  - Should you allow AJAX calls from other domains?
		- Cross Site Request Forgery (CSRF) - CsrfFilter
		  - A malicious website making use of previous authentication on your website
		  - Default: CSRF protection enabled for update requests - POST, PUT etc..
		- Login Page, Logout Page
		  - LogoutFilter, DefaultLoginPageGeneratingFilter, DefaultLogoutPageGeneratingFilter
		- Translating exceptions into proper Http Responses (ExceptionTranslationFilter)
	
	- ***Order of filters*** is important (typical order shown below)
	  - 1: Basic Check Filters - CORS, CSRF, ..
	  - 2: Authentication Filters
	  - 3: Authorization Filters
	  
***Default Spring Security Configuration***

  - Everything is authenticated
    - You can customize it further
	
  - ***Form authentication*** is enabled (with default form
and logout features)

  - ***Basic authentication*** is enabled
  
  - ***Test user*** is created
    - Credentials printed in log (Username is ***user***)
	
  - ***CSRF protection*** is enabled
  
  - ***CORS requests*** are denied
  
  - ***X-Frame-Options*** is set to 0 (Frames are disabled)
	
	
	
	
#### <a name="chapter5part4"></a>Chapter 5 - Part 4: Config a New Spring Boot Project with Spring Security

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
   - For Spring Boot 3.x -> Java Version 17,21
- **Dependencies**
   - Spring Web -> To Construct Rest APIs
   - Spring Security -> Framework to Authentication and Access control
   
#### <a name="chapter5part5"></a>Chapter 5 - Part 5: Form Authentication
   
Let's create a simple RestController


```java
@RestController
public class HelloWorldResource {

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World";
    }
}
```

Start the program and when we try to access http://localhost:8080/hello-world, we will be redirect to http://localhost:8080/login and you will see this login page

<br>

<div align="center"><img src="img/loginpage-w1318-h625.png" width=1318 height=625><br><sub>Login Page - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

Even if we put in the URL a now existing resource, Ex: http://localhost:8080/no-existing, the SPring Security will redirect us to the login page.

The ***Form Based Authentication***

  - Used by most web applications
  - Uses a Session Cookie
    - JSESSIONID: E2E693A57F6F7E4AC112A1BF4D40890A
	- When you login, a session cookie is created
    - Every request you made in the website, this cookie will be sent along with the request
  - Spring security enables form based authentication ***by default***
  - Provides a default ***Login Page***
  - Provides a default ***Logout Page***
  - Provides a ***/logout*** URL
  - You can add a change password page
    - (http.passwordManagement(Customizer.withDefaults()))

To test, you can go to the logs in Spring Boot Application and search for the line

```
Using generated security password: 131476e7-49d9-411a-9738-f87850c817a
```

Paste the password in the password field, and use ```user``` as user name

If youy inspect the web page, and enter in Network, you will that a session cookie was created

<br>

<div align="center"><img src="img/cookie-w535-h725.png" width=535 height=725><br><sub>Seesion Cookie - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

If you tap http://localhost:8080/logout, a logout page will appear

<br>

<div align="center"><img src="img/logout-w732-h336.png" width=732 height=336><br><sub>Logout - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

To configure a user and password, go to ```application.properties``` and put this

```
spring.security.user.name=userexample
spring.security.user.password=1234
```

#### <a name="chapter5part6"></a>Chapter 5 - Part 6: Basic Authentication

  - Most basic option for Securing REST API
    - BUT has many flaws
	- NOT recommended for production use
	
  - Base 64 encoded username and password is sent as request header
    - Authorization: Basic aW4yOG1pbnV0ZXM6ZHVtbXk=
	- (DISADVANTAGE) Easy Decoding
	
  - Basic Auth Authorization Header:
    - Does NOT contain authorization information (user access, roles,..)
	- Does NOT have Expiry Date
	
	In the example, we are using the user name as ```userexample``` and password as ```1234```
	
	If we transform this in base 64, and make a GET call to the application, let's see what happennig.
	
	The curl command
	
	```
	curl --header "Authorization:Basic dXNlcmV4YW1wbGU6MTIzNA==" http://localhost:8080/hello-world
	
	Response
	Hello World
	```

#### <a name="chapter5part7"></a>Chapter 5 - Part 7: Cross Site Request Forgery - CSRF

Let's imagine you will login in your bank account

  - **Flow 1**: You are logged-in to your bank website
    - A cookie Cookie-A is saved in the your web browser
	
  - **Flow 2**: You go to a malicious website without logging out from your bank account
  
  - **Flow 3**: The Malicious website executes a bank transfer without your knowledge using Cookie-A (The Cookie-A have your credentials)
    - This thing is called  Cross Site Request Forgery - CSRF
	
  - How can you protect from CSRF?
    - **Option 1**: Synchronizer token pattern
	  - A token created for each request. To make a GET in the page and etc...
	  - To make an update (POST, PUT, ..), you need a CSRF token from the previous request
	  
	- **Option 2**: SameSite cookie (Set-Cookie: SameSite=Strict)
	  - application.properties
	    - server.servlet.session.cookie.same-site=strict
	  - Depends on browser support

Let's make a test, using the same url to make a GET and a POST. We have this resource

```java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoResource {

    private Logger logger = LoggerFactory.getLogger(getClass());
    private static final List<Todo> TODOS_LIST = List.of(
            new Todo("John", "HR"),
            new Todo("Mike", "IT"));

    @GetMapping("/todos")
    public List<Todo> retrieveAllTodos() {
        return TODOS_LIST;
    }

    @GetMapping("/users/{username}/todos")
    public Todo retrieveTodosForSpecificUser(@PathVariable String username) {
        Todo todoByUser = new Todo(null, null);
        for (Todo todo : TODOS_LIST) {
            String user = todo.username();
            if (user.equals(username)) {
                todoByUser = todo;
            }
        }
        return todoByUser;
    }

    @PostMapping("/users/{username}/todos")
    public void createTodoForSpecificUser (@PathVariable String username, @RequestBody Todo todo) {
        logger.info("Create {} for {}", todo, username);
    }
}

record Todo (String username, String description) {}
```

Now, let's make a GET request in Postman, in the URL http://localhost:8080/users/:username/todos

<br>

<div align="center"><img src="img/csrf1-w859-h586.png" width=859 height=586><br><sub>CSRF in Action - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

If we try to make the same request, now, in a POST method in the URL http://localhost:8080/users/:username/todos, we will get a 401


<br>

<div align="center"><img src="img/csrf2-w873-h694.png" width=873 height=694><br><sub>CSRF in Action - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

This is because, Spring Security by default, implement the CSRF Token, and to any update, this token is necessary.

If we make go to the page http://localhost:8080/hello-world and put the username and password, and after, go to logout page http://localhost:8080/logout and inspect the page, in the html, we will see that is a method post that have the input name csrf with the value of token


```html
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<meta name="description" content="">
		<meta name="author" content="">
		<title>Confirm Log Out?</title>
		<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
		<link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" integrity="sha384-oOE/3m0LUMPub4kaC09mrdEhIc+e3exm4xOGxAmuFXhBNF4hcg/6MiAXAf5p0P56" crossorigin="anonymous">
	</head>
	<body>
		<div class="container">
		  <form class="form-signin" method="post" action="/logout">
			<h2 class="form-signin-heading">Are you sure you want to log out?</h2>
				<input name="_csrf" type="hidden" value="BHbfT6F9HJndahC7GsEq6My2oYUE_JNlhsCUxZanz2S2AMXjMUW6e5FEJPjwDHHeLewe0P_SjLwzn6VItvGn9KbE-FyBNfCB">
			<button class="btn btn-lg btn-primary btn-block" type="submit">Log Out</button>
		  </form>
		</div>
	</body>
</html>
```

By default, when you are building a web application, the Web Security is Active and in the Spring MVC or Thymeleaf, the csrf token is included by default

How can we make this is REST API?

First, Let's create a method to get the token

```java
@RestController
public class SpringSecurityPlayResource {

    @GetMapping("/csrf-token")
    public CsrfToken retrieveCsrfToken(HttpServletRequest request){

        return (CsrfToken) request.getAttribute("_csrf");
    }
}
```

Now, let's make a request to get the token. Make a call to the URL http://localhost:8080/csrf-token with your authentication

<br>

<div align="center"><img src="img/getCsrfToken-w880-h594.png" width=880 height=594><br><sub>Get CSRF Token - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

With the token, let's put in the header, and try to make the POST http://localhost:8080/users/:username/todos

<br>

<div align="center"><img src="img/postWithCsrfToken-w884-h669.png" width=884 height=669><br><sub>Authorization with CSRF Token - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

Was possible to make the post now, because we are using the CSRF Token

Now, how to disable this CSRF token? In some scenarios, you want to disable the CSRF Token, because you have a Stateless API.

If we go to the class ```SpringBootWebSecurityConfiguration.class``` we will see a method called ```SecurityFilterChain```

```java
 @Bean
 @Order(2147483642)
 SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
            http.authorizeHttpRequests((requests) -> {
                ((AuthorizeHttpRequestsConfigurer.AuthorizedUrl)requests.anyRequest()).authenticated();
            });
            http.formLogin(Customizer.withDefaults());
            http.httpBasic(Customizer.withDefaults());
            return (SecurityFilterChain)http.build();
        }
```

We want to disable the CSRF, because he is executing as a filter chain. In the logs, we can see a log as ```o.s.s.web.DefaultSecurityFilterChain``` that is the filter chain that is executed.

If we look to CSRF is this big log, we will see this Filter ```org.springframework.security.web.csrf.CsrfFilter@7f323b3a``` that is executing

Let's create a Basic Auth Configuration class, and copy the method SecurityFilterChain

```java
@Configuration
public class BasicAuthSecurityConfiguration {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(auth -> {
           auth.anyRequest().authenticated();
        });
        http.sessionManagement(
                session -> session.sessionCreationPolicy(
                        SessionCreationPolicy.STATELESS
                )
        );
        http.httpBasic();
        http.csrf().disable();
        return http.build();
    }
}
```

Let's Analyse

in this Part

```
http.authorizeHttpRequests(auth -> {
           auth.anyRequest().authenticated();
        });
```

We are saying that any request should be authenticated()

In this Part

```
http.sessionManagement(
                session -> session.sessionCreationPolicy(
                        SessionCreationPolicy.STATELESS
                )
        );
```

Here, we are disable the sessionManagement, and telling that the session is Stateless. There no more login and logout

In this part

```
http.httpBasic();
http.csrf().disable();
return http.build();
```

The authentication is basic, and we are disabling the csrf. In the end the http security will be return

If we search for ```CsrfFilter```, will not appear in the Logs. Now, if we make the Post Request without the X-CSRF-TOKEN, we will be able to make

<br>

<div align="center"><img src="img/disablecsrf-w870-h660.png" width=870 height=660><br><sub>Disable CSRF Token - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

Because we disable the ``` http.formLogin()```, if we go to http://localhost:8080/hello-world, will be show to us, the basic auth Login

<br>

<div align="center"><img src="img/basicloginpage-w984-h556.png" width=984 height=556><br><sub>Disable formLogin - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

If we try to make a http://localhost:8080/logout, we will get a 404, because we disable the session

#### <a name="chapter5part8"></a>Chapter 5 - Part 8: Cross-Origin Resource Sharing - CORS

```java
@Configuration
public class BasicAuthSecurityConfiguration {

	@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedMethods("*")
                        .allowedOrigins("http://localhost:3000");

            }
        };
    }
}
```

  - Browsers do NOT allow AJAX calls to resources outside current origin
  - Cross-Origin Resource Sharing (CORS): Specification that allows you to configure which cross-domain requests are allowed
    - Global Configuration
	  - Configure addCorsMappings callback method in WebMvcConfigurer
	- Local Configuration
	  - @CrossOrigin - Allow from all origins
	  - @CrossOrigin(origins = "https://www.in28minutes.com") - Allow from specific origin

#### <a name="chapter5part9"></a>Chapter 5 - Part 9: Storing User Credentials in Memory

User credentials can be stored in:
  -  **In Memory** - For test purposes. Not recommended for production.
  -  **Database** - You can use JDBC/JPA to access the credentials.
  -   **LDAP** - Lightweight Directory Access Protocol
    - Open protocol for directory services and authentication

Go to the ```application.properties``` and delete the user and password configured.

Create this method in ```BasicAuthSecurityConfiguration.class```. This method is used to configure user credentials, roles and etc...

```java
@Configuration
public class BasicAuthSecurityConfiguration {

//same code

@Bean
public UserDetailsService userDetailService() {

	var user = User.withUsername("userexample")
		.password("{noop}1234")
		.roles("USER")
		.build();

	var admin = User.withUsername("admin")
		.password("{noop}1234")
		.roles("USER")
		.build();

	return new InMemoryUserDetailsManager(user, admin);
   }

}
```

We have to put a ```{noop}``` in the password, because we will not use encryption in passwords

Now, if we make a POST request in postman, using the configurations of user and password

<br>

<div align="center"><img src="img/credentialsmemory-w1487-h625.png" width=1487 height=625><br><sub>Storing User Credentials in Memory - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>

#### <a name="chapter5part10"></a>Chapter 5 - Part 10: Storing User Credentials using JDBC
