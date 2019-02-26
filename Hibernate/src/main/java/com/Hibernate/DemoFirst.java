package com.Hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
 
public class DemoFirst {
 
    public static void main(String[] args) {
 //ДОБАВЛЯННЯ
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
         
        Student student = new Student();
        student.setFirstName("Rob");
        student.setAge(26);
         
        session.save(student);
        session.getTransaction().commit();
         
        session.close();
 
    }
}