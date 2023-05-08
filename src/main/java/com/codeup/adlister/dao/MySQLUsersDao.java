package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;
import com.codeup.adlister.util.Config;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLUsersDao implements Users{
    private Connection connection;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getURL(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }



    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
        public Long insert(User user) {
            try {
                String sql = "INSERT INTO users(username, email, password) VALUES(?, ?, ?)";
                PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

                stmt.setString(1,user.getUsername());
                stmt.setString(2,user.getEmail());
                stmt.setString(3, user.getPassword());
                stmt.executeUpdate();

                ResultSet rs = stmt.getGeneratedKeys();
                rs.next();
                return rs.getLong(1);
            } catch (SQLException e) {
                throw new RuntimeException("Error creating a new ad.", e);
            }
        }

//    public static void main(String[] args) {
//        Config config = new Config();
//        MySQLUsersDao mySQLUsersDao = new MySQLUsersDao(config);
//        User user = new User("test", "email", "password");
//        mySQLUsersDao.insert(user);
//    }
    }


