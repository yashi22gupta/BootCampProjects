package springTX_Q4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import springTX_Q1.AccountService;
import springTX_Q1.UserAccount;

/**
 * Created by yashi on 05-07-2017.
 */
@Transactional

public class TransferAmount {

    @Autowired
    private
    AccountService accountService;

    public AccountService getAccountService() {
        return accountService;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Transactional(propagation = Propagation.NEVER)
    public void transfer(String senderName, String receiverName, Double amount)
    {
        UserAccount sender= accountService.getUserEntry(senderName);
        UserAccount reciever= accountService.getUserEntry(receiverName);

       if(validate(sender.getBalance(),amount))
       {
           accountService.updateEntry(senderName,sender.getBalance()-amount);
           accountService.updateEntry(receiverName,reciever.getBalance()+amount);
       }

       else
       {
           System.out.println("Insufficient Balance");
       }
    }

    public boolean validate(Double sender_balance,Double amount)
    {
        if(sender_balance>amount)
        return true;

        else return false;
    }

}

