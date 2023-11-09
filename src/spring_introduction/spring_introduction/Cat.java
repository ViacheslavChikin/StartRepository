package spring_introduction;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pat{
    @Override
    public void say() {
        System.out.println("Мяу");
    }
}
