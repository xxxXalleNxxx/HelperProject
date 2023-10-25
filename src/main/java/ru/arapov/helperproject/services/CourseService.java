package ru.arapov.helperproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.arapov.helperproject.models.Course;
import ru.arapov.helperproject.repositories.CourseRepository;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository repository;

    public Course saveCourse(Course course) {
        return repository.save(course);
    }

    public List<Course> addCourses(List<Course> courses) {
        return repository.saveAll(courses);
    }

    public List<Course> getCourses() {
        return repository.findAll();
    }

    public Course getCourseById(int id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteCourse(int id) {
        repository.deleteById(id);
        return "course removed !\n id: " + id;
    }


}
