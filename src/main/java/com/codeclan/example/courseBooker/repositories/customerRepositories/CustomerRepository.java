package com.codeclan.example.courseBooker.repositories.customerRepositories;

import com.codeclan.example.courseBooker.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {

}
