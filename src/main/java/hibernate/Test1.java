package hibernate;


import hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.List;
import java.util.Properties;


public class Test1 {
    public static void main(String[] args) {

//        SessionFactory sessionFactory =  new  Configuration()
//                .configure()
//                .buildSessionFactory();
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
//
 //       Session session = factory.getCurrentSession();
//        Employee employee = new Employee("Cfif", "Gtnhjd", "ше", 2000);
//        session.beginTransaction();
//        session.save(employee);
//        session.getTransaction().commit();

    //    factory.close();
        List<Employee> employees;
        try (Session session1 = factory.openSession()) {
            employees = session1.createQuery("from Employee", Employee.class).list();
        }
        for (Employee employee1 : employees) {
            System.out.println(employee1);
        }
    }
}
