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
4. [Chapter 4: Spring Security with Spring Boot](#chapter4)
	- [Chapter 4 - Part 1: Security Fundamentals](#chapter4part1)

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

## <a name="chapter4"></a>Chapter 4: Spring Security with Spring Boot
  
#### <a name="chapter4part1"></a>Chapter 4 - Part 1: Security Fundamentals


