package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
=======
>>>>>>> 13ce7fca293c9759809b4d7f8d6e4153a3867338
import org.springframework.stereotype.Component;

@Component
public class Person {
<<<<<<< HEAD

    @Value("34")
    int age;
    @Value("${person.name}")
    String name;
   //
    Pat pat;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Pat getPat() {
        return pat;
    }

    @Autowired
    public Person(Pat pat) {
//        this.name = this.name;
//        this.age = this.age;
        this.pat = pat;
        System.out.println("person tut!");
=======
    int Age;
    String name;
    Pat pat;

@Autowired
    public Person(Pat pat) {
        this.pat = pat;
    System.out.println("person tut!");
>>>>>>> 13ce7fca293c9759809b4d7f8d6e4153a3867338
    }
}
