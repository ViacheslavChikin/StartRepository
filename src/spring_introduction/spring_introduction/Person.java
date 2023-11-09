package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    int Age;
    String name;
    Pat pat;

@Autowired
    public Person(Pat pat) {
        this.pat = pat;
    System.out.println("person tut!");
    }
}
