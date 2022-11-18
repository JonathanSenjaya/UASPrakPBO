/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UasPrakPBO.Model;

/**
 *
 * @author acer
 */
public class User {
    int userId;
    String userName;
    String userPassword;
    String userEmail;
    String userGender;
    CategoryUser userCategory;
    int userFollowers;

    public User(int userId, String userName, String userPassword, String userEmail, String userGender, CategoryUser userCategory, int userFollowers) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userGender = userGender;
        this.userCategory = userCategory;
        this.userFollowers = userFollowers;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public CategoryUser getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(CategoryUser userCategory) {
        this.userCategory = userCategory;
    }

    public int getUserFollowers() {
        return userFollowers;
    }

    public void setUserFollowers(int userFollowers) {
        this.userFollowers = userFollowers;
    }
}
