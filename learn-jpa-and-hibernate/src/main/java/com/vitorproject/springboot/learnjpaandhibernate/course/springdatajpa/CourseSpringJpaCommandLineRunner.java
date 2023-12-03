package com.vitorproject.springboot.learnjpaandhibernate.course.springdatajpa;

import com.vitorproject.springboot.learnjpaandhibernate.course.Course;
import com.vitorproject.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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


        System.out.println("New Commands");
        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findByAuthor("in28minutes"));
        System.out.println(repository.findByAuthor(""));

        System.out.println(repository.findByName("Learn C#"));
    }
}
