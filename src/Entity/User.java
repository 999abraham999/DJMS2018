/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Danny
 */
public class User {
    int Id;
    String userName;
    String password;

    public User() {
    }

    public User(int Id, String userName, String password) {
        this.Id = Id;
        this.userName = userName;
        this.password = password;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "Id=" + Id + ", userName=" + userName + ", password=" + password + '}';
    }
    
    
    
}
