package zaur;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component ("personBean")
public class Person {


    @Value("34")
    int age;
    @Value("${person.name}")
    String name;
   //
    Pat pat;
//@PostConstruct
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
    public Person(@Qualifier("catBean") Pat pat) {
//        this.name = this.name;
//        this.age = this.age;
        this.pat = pat;
        System.out.println("person tut!");

    }
}
