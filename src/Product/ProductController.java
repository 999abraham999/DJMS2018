/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import Entity.Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
 
/**
 *
 * @author ABRAHAM
 */
public class ProductController {
    ProductRepository productRepository = new ProductRepository(); 
    Product product;
    public ProductController() {
    }

    public List<Product> finAllProduct(String active, String name){
        return productRepository.findAllProduct(active, name);
    }
    
    public void SaveProduct(Product product){
        if(validation(product)){
        product.setActiveProduct(true);
        product.setRegisterDateProduct(new Date());
        productRepository.Save(product);
        JOptionPane.showMessageDialog(null, "Se Guardo producto exitosamente!!");
        } else{
            JOptionPane.showMessageDialog(null, "Error de validación");
        }
        
    }

    private Boolean validation(Product pro) {
    return true;
    }
}
