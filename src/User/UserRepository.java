/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import ConnectionDB.ConnectionSQLite;
import Entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Danny
 */
public class UserRepository {
    public void UserGuarda(User user){
        String sqlQuery = "Insert into User(user, password, type, active) values(?,?,?,?)";
       // String sqlQuery = "Insert into User values ('"+user.getUserName()+"','"+user.getPassword()+"''"+user.getType()+"','"+user.getActive()+"',);";
        try ( final Connection conn = ConnectionSQLite.ConnectDB();
                final PreparedStatement pstmt = conn.prepareStatement(sqlQuery)){
            
       //     pstmt.setInt(0, 2);
            pstmt.setString(1, user.getUserName());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getType());
            pstmt.setBoolean(4, user.getActive());
            pstmt.executeUpdate();
            JOptionPane.showConfirmDialog(null, "asta aqui va bien!!");
            
           // pstmt.executeQuery();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error alv " + e);
        }
    }
    private void Search(User user){
        
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
          //   JOptionPane.showMessageDialog(null, "Error alv " + e);
        }
    }
}
