package com.datorium.Datorium.API.Repo;

import com.datorium.Datorium.API.DTOs.User;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserRepo {

    private ArrayList<User> users = new ArrayList<>();//Mocked db

    public void add(User user) {
        String url = "jdbc:sqlite:my.db";
        try (var conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                var statement = conn.createStatement();
                statement.execute("INSERT INTO people (name) VALUES ('" + user.name + "')");
                //INSERT INTO people (name) VALUES ('');DROP TABLE people;--')
                            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
                    }
    }

    public ArrayList<User> get(){
        String url = "jdbc:sqlite:my.db";
        var resultList = new ArrayList<User>();
        try (var conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                var statement = conn.createStatement();
                ResultSet result = statement.executeQuery("SELECT id, name FROM people");
                //INSERT INTO people (name) VALUES ('');DROP TABLE people;--')

                while (result.next()) { // going through abstract box
                    User user = new User(); // create new user
                    user.id = result.getInt("id");
                    user.name = result.getString("name");
                    resultList.add(user); // add user to the box
                } // while loop stops when there is no next element
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return resultList;
    }

    public void update(User user){
        String url = "jdbc:sqlite:my.db";
        try (var conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                var statement = conn.createStatement();
                statement.execute("UPDATE people SET name = '" + user.name + "' WHERE id = " + user.id);
                //INSERT INTO people (name) VALUES ('');DROP TABLE people;--')
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }


    }

  // REFACTORING
    // UpdateUserDTO contains userId
    // User class only contains name
    // Need to add the userId to User class
        // 1. Add int userId to the User class
}     // 2. Replace UpdateUserDTO usage by User class
        // 3. Delete UpdateUserDTO
        // 4. Remove the unnecessary ids that came from UpdateUserDTO
        // 5. Update the Get method with userId
