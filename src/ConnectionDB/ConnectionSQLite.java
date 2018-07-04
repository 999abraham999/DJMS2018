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

    public ConnectionSQLite() {
    }
    
    public static Connection ConnectDB(){
        String url = "jdbc:sqlite:F://gitHub/db_DJMS/DJMI_DB.sqlite";
         Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Connected to Database");
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la conexion" + e);
        }
    return conn;
    }
}
