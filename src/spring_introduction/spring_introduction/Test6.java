package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.Annotation;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("person", Person.class);
        person.pat.say();
        System.out.println(person.getName());


    }
}
