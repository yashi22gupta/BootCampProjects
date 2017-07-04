
package springQ3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainClass {

    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config5.xml");
        SpringClass1 springClass1 = applicationContext.getBean(SpringClass1.class);
        springClass1.throwException();
    }
}


