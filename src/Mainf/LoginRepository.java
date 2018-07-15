/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mainf;

import ConnectionDB.ConnectionSQLite;
import Entity.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Danny
 */
public class LoginRepository {
    ConnectionSQLite connectionSQLite = new ConnectionSQLite();
    public LoginRepository() {
    }
    
    public void Search(User user){
    String sqlQuery = "select * from User where User.user like "+"'"+user.getUserName()+"';";
    ResultSet resultado =null;
    String us="";
    String pass = "";
    try (Connection conn = ConnectionSQLite.ConnectDB();
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery)){
                resultado = pstmt.executeQuery();
                
            us = resultado.getString("user");
            pass = resultado.getString("password");
            if(user.getUserName().equals(us)&& user.getPassword().equals(pass)){
            JOptionPane.showMessageDialog(null,"Bienvenido sr. "+us);} 
            else{
                JOptionPane.showMessageDialog(null,"User or password incorrectos");
            }
            pstmt.executeUpdate();
            
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Error alv" + e);
        }
    }
}
