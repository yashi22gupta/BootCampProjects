package springTX_Q1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by yashi on 05-07-2017.
 */
public class AccountService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void addEntry(UserAccount userAccount)
    {
        String sql = "INSERT INTO userAccount (name,balance)VALUES(?,?)";
        jdbcTemplate.update(sql, new Object[]{userAccount.getName(),userAccount.getBalance()});
    }

    public void updateEntry(UserAccount userAccount)
    {
        String sql = "Update userAccount set balance = ? where name = ?";
        jdbcTemplate.update(sql, new Object[]{70000.00,userAccount.getName()});
    }

    public void deleteEntry(UserAccount userAccount)
    {
        String sql = "Delete from userAccount where name=?";
         jdbcTemplate.update(sql,userAccount.getName());
    }


    public void getUserEntry(String name)
    {
        String sql = "SELECT * FROM userAccount WHERE name = ?";

        /*List<UserAccount> listUserAccount = jdbcTemplate.query(sql,new Object[] {name},new RowMapper<UserAccount>() {

            public UserAccount mapRow(ResultSet result, int rowNum) throws SQLException {
                UserAccount UserAccount = new UserAccount(result.getString("name"),result.getDouble("balance"));
                return UserAccount;
            }

        });

        for (UserAccount aUserAccount : listUserAccount) {
            System.out.println(aUserAccount);
        }*/
        UserAccount account = jdbcTemplate.queryForObject(sql, new Object[]{name}, new RowMapper<UserAccount>() {
            @Override
            public UserAccount mapRow(ResultSet rs, int rowNum) throws SQLException {
                UserAccount userAccount = new UserAccount(rs.getString("name"), rs.getDouble("balance"));
                return userAccount;

            }
        });

        System.out.println(account);

    }
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
