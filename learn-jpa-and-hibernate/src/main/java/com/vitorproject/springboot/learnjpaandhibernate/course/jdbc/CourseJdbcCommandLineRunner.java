package com.vitorproject.springboot.learnjpaandhibernate.course.jdbc;

import com.vitorproject.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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

        Course course2 = repository.findById(2);
        Course course3 = repository.findById(3);

        System.out.println(course2);
        System.out.println(course3);
    }
}
