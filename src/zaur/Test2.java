package zaur;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context;
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pat pat = context.getBean("myPet", Pat.class);
        pat.say();
        context.close();
    }
}
