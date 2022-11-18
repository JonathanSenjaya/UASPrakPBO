/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UasPrakPBO.Controller;

import UasPrakPBO.Database.DatabaseHandler;
import UasPrakPBO.Model.User;
import UasPrakPBO.Model.CategoryUser;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class UserController {
    public void mencariUser(String username, String password) {
        DatabaseHandler conn = new DatabaseHandler();
        conn.connect();
        try {
            java.sql.Statement stat = conn.con.createStatement();
            ResultSet result = stat.executeQuery("SELECT * FROM user WHERE user_username='" + username + "' AND user_password='" +password +"'");
            if (result.next()) {
                JOptionPane.showMessageDialog(null, "Login Success, WELCOME " +username);
            } else {
                JOptionPane.showMessageDialog(null, "User not found.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error occured when connecting to database.");
        }
        conn.disconnect();
    }
    
    public void insertDB(User user) {
        DatabaseHandler conn = new DatabaseHandler();
        conn.connect();
        try {
            PreparedStatement stat = conn.con.prepareStatement("INSERT INTO user(user_name, user_password, user_email, user_gender, user_category, user_followers) VALUES (?,?,?,?,?,?)");
            stat.setString(1, user.getUserName());
            stat.setString(2, user.getUserPassword());
            stat.setString(3, user.getUserEmail());
            stat.setString(4, user.getUserGender());
            stat.setString(5, user.getUserCategory().getCaregoryName());
            stat.setInt(6, user.getUserFollowers());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Register Success");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error!!");
            System.out.println(e);
        }
        conn.disconnect();
    }
}
