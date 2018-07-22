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
    String type;
    Boolean active;

    public User() {
    }

    public User(int Id, String userName, String password, String type, Boolean active) {
        this.Id = Id;
        this.userName = userName;
        this.password = password;
        this.type = type;
        this.active = active;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "User{" + "Id=" + Id + ", userName=" + userName + ", password=" + password + ", type=" + type + ", active=" + active + '}';
    }



    
    
    
    
}
