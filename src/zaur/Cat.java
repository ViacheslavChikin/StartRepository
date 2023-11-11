package zaur;

import org.springframework.stereotype.Component;

@Component ("catBean")
public class Cat implements Pat{
    @Override
    public void say() {
        System.out.println("Мяу");
    }
}
