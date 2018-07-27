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
        String urlAbrahamDesktop = "jdbc:sqlite:D://proyectos/GitHub/Database/DJMI_DB.sqlite";
        String urlAbraham = "jdbc:sqlite:F://gitHub/db_DJMS/DJMI_DB.sqlite";
        String urlDany = "jdbc:sqlite:C://database sqlite/DJMI_DB.sqlite";
         Connection conn = null;
        try {
            conn = DriverManager.getConnection(urlAbrahamDesktop);
            System.out.println("Connected to Database");
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la puta qe te pario: " + e);
        }
    return conn;
    }
}
