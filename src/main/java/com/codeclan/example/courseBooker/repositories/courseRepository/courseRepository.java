package com.codeclan.example.courseBooker.repositories.courseRepository;

import com.codeclan.example.courseBooker.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface courseRepository extends JpaRepository<Course, Long> {
}
