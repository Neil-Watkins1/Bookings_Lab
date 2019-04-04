package com.codeclan.example.courseBooker.repositories.courseRepository;

import com.codeclan.example.courseBooker.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findCourseByRating(int rating);
}
