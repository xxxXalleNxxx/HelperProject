package ru.arapov.helperproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.arapov.helperproject.models.Course;
import ru.arapov.helperproject.models.User;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course, Integer> {

    Optional<Course> findById(Integer id);
}
