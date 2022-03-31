package com.sample.dao;

import java.util.List;

import com.sample.bean.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDAO {
    public List<Employee> getAll() {

        // 1. configuring hibernate
        Configuration configuration = new Configuration().configure();

        // 2. create sessionfactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // 3. Get Session object
        Session session = sessionFactory.openSession();

        // 4. Start transaction
        Transaction transaction = null;
        List<Employee> listOfEmployees = null;
        try {
            transaction = session.beginTransaction();
            listOfEmployees = session.createQuery("from Employee").getResultList();
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return listOfEmployees;
    }
}
