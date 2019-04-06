package com.codeclan.example.courseBooker.components;


import com.codeclan.example.courseBooker.models.Booking;
import com.codeclan.example.courseBooker.models.Course;
import com.codeclan.example.courseBooker.models.Customer;
import com.codeclan.example.courseBooker.repositories.bookingRepository.BookingRepository;
import com.codeclan.example.courseBooker.repositories.courseRepository.CourseRepository;
import com.codeclan.example.courseBooker.repositories.customerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;


    public DataLoader(){}


    @Override
    public void run(ApplicationArguments args) {

        Customer customer1 = new Customer("Bill Odie", "Paisley", 50);
        customerRepository.save(customer1);


        Customer customer2 = new Customer("Graham Garden", "Cambuslang", 45);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Tim Brook-Taylor", "Strathaven", 43);
        customerRepository.save(customer3);

        Customer customer4 = new Customer("Theresa May", "London", 60);
        customerRepository.save(customer4);

        Customer customer5 = new Customer("John Major", "London", 60);
        customerRepository.save(customer5);

        Course course1 = new Course("Java is Ace", "Greenock", 4);
        courseRepository.save(course1);

        Course course2 = new Course("Ruby is Cool", "Erskine", 3);
        courseRepository.save(course2);

        Course course3 = new Course("Java Script is Fun", "Erskine", 3);
        courseRepository.save(course3);

        Booking booking1 = new Booking("01-06-2019", customer1, course2);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("01-05-2019", customer2, course2);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("01-04-2019", customer1, course1);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("01-07-2019", customer3, course2);
        bookingRepository.save(booking4);

        Booking booking5 = new Booking("01-06-2019", customer4, course1);
        bookingRepository.save(booking5);

        Booking booking6 = new Booking("01-06-2019", customer5, course2);
        bookingRepository.save(booking6);

    }
}
