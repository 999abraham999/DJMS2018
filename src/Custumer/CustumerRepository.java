/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Custumer;

import ConnectionDB.ConnectionSQLite;
import Entity.Custumer;
import Entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class CustumerRepository {

    public CustumerRepository() {
    }
    
       ConnectionSQLite connectionSQLite = new ConnectionSQLite();
       
           public void Save(Custumer custumer) {
        String sqlQuery = "INSERT INTO Custumer(nameCustumer, lastNameCustumer, addressCustumer, ageCustumer, registerDateCustumer, emailCustumer) VALUES(?,?,?,?,?,?)";

        try (Connection conn = ConnectionSQLite.ConnectDB();
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery)) {
            custumer.getPerson().setRegisterDate(new Date());
            java.sql.Date sqlDate = new java.sql.Date(custumer.getPerson().getRegisterDate().getTime());

            pstmt.setString(1, custumer.getPerson().getName());
            pstmt.setString(2, custumer.getPerson().getLastName());
            pstmt.setString(3, custumer.getPerson().getAddress());
            pstmt.setDate(4, sqlDate);
            pstmt.setDate(5, sqlDate);
            pstmt.setString(6, custumer.getEmailAddress());
            
            pstmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la conexion" + e);
        }
    }

    public List<Product> findAll(String active, String name) {
        List<Product> listProduct = new ArrayList<Product>();
        String ActiveProduct = active;
        String nameProduct = name;
        Product product;
        String sqlQuery = "SELECT id, codeProduct, nameProduct, activeProduct, priceUnitProduct, registerDateProduct FROM Product"
                + " WHERE activeProduct = "+ActiveProduct+" AND \n" +
" nameProduct LIKE '%"+nameProduct+"%'";

        try (Connection conn = ConnectionSQLite.ConnectDB();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sqlQuery)) {
            while (rs.next()) {
                product = new Product();
                product.setId(rs.getLong("id"));
                product.setCodeProduct(rs.getString("codeProduct"));
                product.setNameProduct(rs.getString("nameProduct"));
                product.setActiveProduct(rs.getBoolean("activeProduct"));
                product.setPriceUnitProcut(rs.getDouble("priceUnitProduct"));
                product.setRegisterDateProduct(rs.getDate("registerDateProduct"));
                listProduct.add(product);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la conexion" + e);
        }
        return listProduct;
    }
}
