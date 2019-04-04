package com.codeclan.example.courseBooker.repositories.customerRepositories;

import com.codeclan.example.courseBooker.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> findAllCustomersByCourseId(Long courseId);
}
