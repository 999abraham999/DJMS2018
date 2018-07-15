/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sell;

import ConnectionDB.ConnectionSQLite;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ABRAHAM
 */
public class SellRepository {
    ConnectionSQLite connectionSQLite = new ConnectionSQLite();

    public SellRepository() {
    }
     public void Search(int code){
    String sqlQueryPro = "SELECT codeProduct, nameProduct, priceUnitProduct FROM Product WHERE activeProduct = 1 AND codeProduct = 1"; 
    String sqlQuery = "select * from User where User.user like "+"'"+code+"';";
    try (Connection conn = ConnectionSQLite.ConnectDB();
                PreparedStatement pstmt = conn.prepareStatement(sqlQueryPro)){
                 
            pstmt.executeUpdate();
        } catch (SQLException e) {
         //    JOptionPane.showMessageDialog(null, "Error en la conexion" + e);
        }
    }
}
