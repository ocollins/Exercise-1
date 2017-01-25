package edu.matc.persistence;

import edu.matc.entity.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.*;

/**
 * Access users in the user table.
 *
 * @author pwaite
 */
public class UserData {
    private final Logger logger = Logger.getLogger(this.getClass());

    public List<User> getAllUsers(String lastName) {

        List<User> users = new ArrayList<User>();
        Database database = Database.getInstance();
        Connection connection = null;
        String sql = null;
        logger.info("Testing log messages. My first log message. Hope it works!!");

        if (lastName.isEmpty()) {
            sql = "SELECT * FROM users";
        } else{
            sql = "SELECT * FROM users WHERE last_name = '" + lastName + "'";
        }

        try {
            database.connect();
            connection = database.getConnection();
            Statement selectStatement = connection.createStatement();
            ResultSet results = selectStatement.executeQuery(sql);
            while (results.next()) {
                User employee = createUserFromResults(results);
                users.add(employee);
            }
            database.disconnect();
        } catch (SQLException e) {
            logger.info("SearchUser.getAllUsers()...SQL Exception: " + e);
        } catch (Exception e) {
            logger.info("SearchUser.getAllUsers()...Exception: " + e);
        }
        return users;
    }



    private User createUserFromResults(ResultSet results) throws SQLException {
        User user = new User();
        user.setUserid(results.getString("id"));
        user.setFirstName(results.getString("first_name"));
        System.out.println(user.getFirstName());
        user.setLastName(results.getString("last_name"));
        user.setDateOfBirth(results.getString("date_of_birth"));
        user.setUserFound(true);
        user.setAge();

        return user;
    }

}