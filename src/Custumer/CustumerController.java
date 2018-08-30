/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Custumer;

import Entity.Custumer;

/**
 *
 * @author Usuario
 */
public class CustumerController {
    CustumerRepository custumerRepository = new CustumerRepository();
    
    public CustumerController() {
    }
    
    public void findAll(){

    }
    
    public void saveCustumer(Custumer custumer){
        custumerRepository.Save(custumer);
    }
}
