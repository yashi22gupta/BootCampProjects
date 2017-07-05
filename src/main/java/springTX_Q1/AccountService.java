package springTX_Q1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AccountService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void addEntry(UserAccount userAccount)
    {
        String sql = "INSERT INTO userAccount (name,balance)VALUES(?,?)";
        jdbcTemplate.update(sql, new Object[]{userAccount.getName(),userAccount.getBalance()});
    }


    @Transactional(propagation = Propagation.SUPPORTS)
    public void updateEntry(String name,Double amount)
    {
        String sql = "Update userAccount set balance = ? where name = ?";
        jdbcTemplate.update(sql, new Object[]{amount,name});
    }

    public void deleteEntry(UserAccount userAccount)
    {
        String sql = "Delete from userAccount where name=?";
         jdbcTemplate.update(sql,userAccount.getName());
    }

@Transactional(propagation = Propagation.SUPPORTS)
    public UserAccount getUserEntry(String name)
    {
        String sql = "SELECT * FROM userAccount WHERE name = ?";

        UserAccount account = jdbcTemplate.queryForObject(sql, new Object[]{name}, new RowMapper<UserAccount>() {
            @Override
            public UserAccount mapRow(ResultSet rs, int rowNum) throws SQLException {
                UserAccount userAccount = new UserAccount(rs.getString("name"), rs.getDouble("balance"));
                return userAccount;

            }
        });

        System.out.println(account);
        return account;

    }


    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
