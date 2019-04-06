package com.codeclan.example.courseBooker.repositories.customerRepositories;

import com.codeclan.example.courseBooker.models.Course;
import com.codeclan.example.courseBooker.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {

List<Customer> findCustomersByAgeGreaterThan(int age);

List<Customer> findCustomersByAgeGreaterThanAndTownLike(int age, String town);

    List<Customer> findCustomersByAgeGreaterThanAndTownLikeAndBookingsCourseTitleLike(int age, String town, String title);

}




