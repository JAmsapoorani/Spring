package com.springexample.springboot.Course.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    //http://localhost:8080/courses
    @GetMapping("/courses")
            public List<Course> getAllCourses()
            {
        return Arrays.asList(new Course(1,"Leran Microservices","in28minutes"),
                new Course(2,"Leran java","in20minutes"));
    }
}
