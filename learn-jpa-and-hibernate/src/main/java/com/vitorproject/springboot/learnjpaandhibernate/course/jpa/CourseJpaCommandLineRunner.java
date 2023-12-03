package com.vitorproject.springboot.learnjpaandhibernate.course.jpa;

import com.vitorproject.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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
