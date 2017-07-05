package springTX_Q6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class TransactionService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional (propagation = Propagation.NESTED)
    public void saveTransactions(String sender, String receiver, Double amount) {
        String sql = "INSERT INTO transactionHistory (sender, receiver, amount)VALUES(?,?,?)";
        jdbcTemplate.update(sql, new Object[]{sender,receiver,amount});
    }

}
