package hibernate;

import hibernate.entity.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;


public class Test1 {
    public static void main(String[] args) {

//        SessionFactory sessionFactory =  new Configuration()
//                .configure()
//                .buildSessionFactory();
       SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
               .addAnnotatedClass(Employee.class)
               .buildSessionFactory();

    }
}
