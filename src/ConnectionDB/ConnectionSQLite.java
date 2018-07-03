/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectionDB;
 
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ABRAHAM
 */
public class ConnectionSQLite {
    Connection conn = null;
    
    public static Connection ConnectDB(){
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:DJMI_DB.sqlite");
            JOptionPane.showMessageDialog(null, "Connected");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la conexion");
        }
    return null;
    }
}
