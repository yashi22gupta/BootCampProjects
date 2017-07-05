package springTX_Q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yashi on 04-07-2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config-tx1.xml");
        AccountService accountService = applicationContext.getBean(AccountService.class);

        List<UserAccount> userAccounts = new ArrayList<>();
        userAccounts.add(new UserAccount("Yashi",52000.50));
        userAccounts.add(new UserAccount("Shubham",60000.00));

       /* accountService.addEntry(userAccounts.get(0));
        accountService.addEntry(userAccounts.get(1));*/

    /*    accountService.updateEntry(userAccounts.get(0).getName(),userAccounts.get(0).getBalance());*/
       /*accountService.deleteEntry(userAccounts.get(0));*/

       accountService.getUserEntry("Shubham");

    }
}
