package com.in28minutes.sprintboot.learnjpaandhibernate.course;

import com.in28minutes.sprintboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.sprintboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.sprintboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
   // @Autowired
   // private CourseJdbcRepository repository;
    //@Autowired
  //  private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        //Works for jdbc and jpa
        /*
        repository.insert(new Course(1, "Learn AWS", "dwayne"));
        repository.insert(new Course(2, "Learn Fullstack Dev", "dwayne"));
        repository.insert(new Course(3, "Learn DevOps", "dwayne"));

        repository.deleteById(1);

        System.out.println(repository.findById(2));

        System.out.println(repository.findById(3));
        */
        //Works for Spring Data JPA
        repository.save(new Course(1, "Learn AWS", "dwayne"));
        repository.save(new Course(2, "Learn Fullstack Dev", "dwayne"));
        repository.save(new Course(3, "Learn DevOps", "dwayne"));

        repository.deleteById(1l);

        System.out.println(repository.findById(2l));

        System.out.println(repository.findById(3l));

        System.out.println(repository.findAll());

        System.out.println(repository.findByAuthor("dwayne"));
        System.out.println(repository.findByAuthor(""));

        System.out.println(repository.findByName("Learn Fullstack Dev"));

    }
}
