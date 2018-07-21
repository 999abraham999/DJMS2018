/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sell;

import ConnectionDB.ConnectionSQLite;
import Entity.Product;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ABRAHAM
 */
public class SellRepository {
    ConnectionSQLite connectionSQLite = new ConnectionSQLite();

    public SellRepository() {
    }
    
     public void SearchProduct(String code){
    String sqlQuery = "SELECT codeProduct, nameProduct, priceUnitProduct FROM Product WHERE activeProduct = 1 AND codeProduct = 1"; 
    ResultSet resultado = null;
    Product product;
      
    try (Connection conn = ConnectionSQLite.ConnectDB();    
            Statement stmt  = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sqlQuery)){
       // product = new Product(0, Long.MIN_VALUE, code, Boolean.TRUE, Double.MIN_NORMAL, registerDateProduct);
        
        } catch (SQLException e) {
         //    JOptionPane.showMessageDialog(null, "Error en la conexion" + e);
        }
    }
}
