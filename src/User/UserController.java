/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Entity.Product;
import Entity.User;
import Product.ProductRepository;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Danny
 */
public class UserController {
    UserRepository userRepository = new UserRepository(); 

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public UserController() {    }    
    
    public void SaveUser(User user){
        
            userRepository.UserGuarda(user);
        JOptionPane.showMessageDialog(null, "Se Guardo usuario exitosamente!!");
        }        
}
