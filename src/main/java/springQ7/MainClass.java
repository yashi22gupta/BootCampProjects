
package springQ7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config7.xml");
        SpringClass1 springClass1 = applicationContext.getBean(SpringClass1.class);
        springClass1.display();
    }
}


