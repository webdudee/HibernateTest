package com.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
 

 
public class DemoThird {
 
    public static void main(String[] args) {
 // ЗАМІНА
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
         
        Student student = (Student) session.get(Student.class, 2);
        student.setFirstName("Zet");
        student.setAge(45);
         
        session.update(student);
        session.getTransaction().commit();
         
        session.close();
    }
}