<h1 align="center"> Spring Boot </h1>

# Content

1. [Chapter 1: Introducing Spring Boot](#chapter1)
    - [Chapter 1 - Part 1: What is Spring Framework?](#chapter1part1)
    - [Chapter 1 - Part 2: What is Spring Boot?](#chapter1part1)
    - [Chapter 1 - Part 3: Spring Boot vs Spring](#chapter1part2)
2. [Chapter 2: Knowing Spring Boot](#chapter2)
    - [Chapter 2 - Part 1: Framework Architecture](#chapter2part1)
    - [Chapter 2 - Part 2: Starting Spring Boot](#chapter2part2)
    - [Chapter 2 - Part 3: First Project](#chapter2part3)

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

<div align="center"><img src="img/spring_boot-w639-h147.png" width=639 height=147><br><sub>Fig 1 - Spring Boot - (<a href='[https://www.javatpoint.com/collections-in-java](https://www.educative.io/answers/what-is-spring-boot)'>Work by Educative</a>) </sub></div>

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

## <a name="chapter2"></a>Chapter 2: Knowing Spring Boot
  
#### <a name="chapter2part1"></a>Chapter 2 - Part 1: Framework Architecture

#### <a name="chapter2part2"></a>Chapter 2 - Part 2: Starting Spring Boot

#### <a name="chapter2part3"></a>Chapter 2 - Part 3: First Project
