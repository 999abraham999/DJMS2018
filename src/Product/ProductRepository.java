/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import Entity.Product;
import ConnectionDB.ConnectionSQLite;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ABRAHAM
 */
public class ProductRepository {

    ConnectionSQLite connectionSQLite = new ConnectionSQLite();

    public ProductRepository() {
    }

    public void Save(Product producto) {
        String sqlQuery = "INSERT INTO Product(codeProduct, nameProduct, activeProduct, priceUnitProduct, registerDateProduct) VALUES(?,?,?,?,?)";

        try (Connection conn = ConnectionSQLite.ConnectDB();
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery)) {
            java.sql.Date sqlDate = new java.sql.Date(producto.getRegisterDateProduct().getTime());

            pstmt.setString(1, producto.getCodeProduct());
            pstmt.setString(2, producto.getNameProduct());
            pstmt.setBoolean(3, producto.getActiveProduct());
            pstmt.setDouble(4, producto.getPriceUnitProcut());
            pstmt.setDate(5, sqlDate);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la conexion" + e);
        }
    }

    public List<Product> findAllProduct(String active, String name) {
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
