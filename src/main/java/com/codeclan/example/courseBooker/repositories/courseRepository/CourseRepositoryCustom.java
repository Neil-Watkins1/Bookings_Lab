package com.codeclan.example.courseBooker.repositories.courseRepository;

import com.codeclan.example.courseBooker.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> findAllCoursesByCustomerId(Long customerId);
}
