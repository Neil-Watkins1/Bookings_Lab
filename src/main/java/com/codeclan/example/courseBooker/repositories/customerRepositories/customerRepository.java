package com.codeclan.example.courseBooker.repositories.customerRepositories;

import com.codeclan.example.courseBooker.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface customerRepository extends JpaRepository<Customer, Long> {

}
