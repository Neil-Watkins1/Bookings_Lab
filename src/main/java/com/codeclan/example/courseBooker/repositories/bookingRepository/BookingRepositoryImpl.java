package com.codeclan.example.courseBooker.repositories.bookingRepository;

import com.codeclan.example.courseBooker.models.Booking;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class BookingRepositoryImpl implements BookingRepositoryCustom{

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Booking> findAllBookingsByDate(String date){
        List<Booking> results = null;
        Session session = entityManager.unwrap(Session.class);
        try{
            Criteria cr = session.createCriteria(Booking.class);
            cr.add(Restrictions.eq("date", date));
            results = cr.list();
        }catch (HibernateException ex){
            ex.printStackTrace();
        }
        finally {
            return results;
        }

    }



}



//    @Transactional
//    public List<Course> findAllCoursesByCustomerId(Long customerId){
//        List<Course> results = null;
//        Session session = entityManager.unwrap(Session.class);
//        try {
//            Criteria cr = session.createCriteria(Course.class);
//            cr.createAlias("bookings", "bookingAlias");
//            cr.createAlias("bookingAlias.customer", "customer");
//            cr.add(Restrictions.eq("customer.id", customerId));
//            results = cr.list();
//        } catch (HibernateException ex){
//            ex.printStackTrace();
//        } finally{
//            return results;
//        }
//    }