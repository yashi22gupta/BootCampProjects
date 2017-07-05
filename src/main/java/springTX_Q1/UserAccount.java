package springTX_Q1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.activation.DataSource;

/**
 * Created by yashi on 04-07-2017.
 */
public class UserAccount {

    private String name;
    private Double balance;


    UserAccount(String name,Double balance)
    {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Name: "+name+" Balance: "+balance;
    }
}
