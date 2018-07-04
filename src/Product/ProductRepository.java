/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import Entity.Product;
import  ConnectionDB.ConnectionSQLite;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author ABRAHAM
 */
public class ProductRepository {
    ConnectionSQLite connectionSQLite = new ConnectionSQLite();
    public ProductRepository() {
    }
    
    public void Save(Product producto){
        String sqlQuery = "INSERT INTO Product(codeProduct, nameProduct, activeProduct, priceUnitProduct, registerDateProduct) VALUES(?,?,?,?,?)";
      
        try (Connection conn = ConnectionSQLite.ConnectDB();
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery)){
                java.sql.Date sqlDate = new java.sql.Date(producto.getRegisterDateProduct().getTime());
            
            pstmt.setLong(1, producto.getCodeProduct());
            pstmt.setString(2, producto.getNameProduct());
            pstmt.setBoolean(3, producto.getActiveProduct());
            pstmt.setDouble(4, producto.getPriceUnitProcut());
            pstmt.setDate(5, sqlDate);
            pstmt.executeUpdate();
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Error en la conexion" + e);
        }
   
    }
}
