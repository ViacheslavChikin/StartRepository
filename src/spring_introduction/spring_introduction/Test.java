package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.Dog;
import spring_introduction.Pat;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Person person = context.getBean("person", Person.class);
<<<<<<< HEAD
        person.pat.say();
    System.out.println(person.getAge());
        System.out.println(person.name);
=======
        Cat cat = context.getBean("cat", Cat.class);
        cat.say();
>>>>>>> 13ce7fca293c9759809b4d7f8d6e4153a3867338
        context.close();
    }
}
