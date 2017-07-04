package springQ5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        SpringClass1 springClass1 = applicationContext.getBean(SpringClass1.class);
        springClass1.display();
        springClass1.display1(5);
    }
}