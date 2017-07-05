package springTX_Q6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config-tx6.xml");

        TransferAmount transferAmount = applicationContext.getBean(TransferAmount.class);

        transferAmount.transfer("yashi","shubham",10000.00);
    }
}

