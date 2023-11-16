package zaur;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("applicationContext2.xml");
        Person person = context.getBean("personBean", Person.class);

        person.pat.say();
        System.out.println(person.getAge());
        System.out.println(person.name);

        context.close();
    }
}
