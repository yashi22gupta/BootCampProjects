package springTX_Q4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springQ4.SpringClass1;
import springTX_Q1.UserAccount;

/**
 * Created by yashi on 05-07-2017.
 */
public class MainClass {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config-tx4.xml");

        TransferAmount transferAmount = applicationContext.getBean(TransferAmount.class);

        transferAmount.transfer("Yashi","Shubham",10000.00);

    }
}

