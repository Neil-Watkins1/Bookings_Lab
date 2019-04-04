package com.codeclan.example.courseBooker.controllers;

import com.codeclan.example.courseBooker.models.Customer;
import com.codeclan.example.courseBooker.repositories.customerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;


    @GetMapping
    public List<Customer> getAllCustomers(){ return customerRepository.findAll();}
}
