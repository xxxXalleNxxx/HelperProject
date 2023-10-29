package ru.arapov.helperproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.arapov.helperproject.models.Course;

import java.util.Optional;

@Repository
public interface CourseRepository  extends JpaRepository<Course, Integer> {

    @Override
    Optional<Course> findById(Integer integer);
}
