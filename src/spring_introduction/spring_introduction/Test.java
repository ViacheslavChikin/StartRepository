package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.Dog;
import spring_introduction.Pat;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Person person = context.getBean("person", Person.class);
        Cat cat = context.getBean("cat", Cat.class);
        cat.say();
        context.close();
    }
}
