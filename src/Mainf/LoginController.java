/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mainf;

import Entity.Product;
import Entity.User;
import Product.ProductRepository;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Danny
 */
public class LoginController {
    LoginRepository loginRepository = new LoginRepository(); 

    public LoginController(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }
    public LoginController() {    }    
    
    public void SearchUser(User user){
        String us = user.getUserName();
        String pass = user.getPassword();
        
        if(us.isEmpty() || pass.isEmpty()){
        
        JOptionPane.showMessageDialog(null, "user or password wrong!!");
        }
        else{
            loginRepository.Search(user);
        }
            
        
        
        /*if(validation(user)){
        product.setActiveProduct(true);
        product.setRegisterDateProduct(new Date());
        productRepository.Save(product);
        } else{
            JOptionPane.showMessageDialog(null, "Error de validación");
        }*/
        
    }

    /*private Boolean validation(User us) {
        if (us.getCodeProduct().SIZE > 9 && pro.getPriceUnitProcut() > 0) {
            return true;
        } else
            return false;
    }*/
}
