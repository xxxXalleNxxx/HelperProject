package ru.arapov.helperproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.arapov.helperproject.models.Course;
import ru.arapov.helperproject.services.CourseService;
import java.util.List;


@RestController
public class CourseController {

    @Autowired
    CourseService service;

    @PostMapping("/addCourse")
    public Course addCourse(@RequestBody Course course) {
        return service.saveCourse(course);
    }

    @GetMapping("/courses")
    public List<Course> findAllCourses() {
        return service.getCourses();
    }

    @GetMapping("/courseById/{id}")
    public Course findCourseById(@PathVariable int id) {
        return service.getCourseById(id);
    }

    @GetMapping("/deleteCourse/{id}")
    public String deleteCourse(@PathVariable int id) {
        return service.deleteCourse(id);
    }

}

