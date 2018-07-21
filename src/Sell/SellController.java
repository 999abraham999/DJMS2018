/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sell;

/**
 *
 * @author ABRAHAM
 */
public class SellController {
    SellRepository sellRepository = new SellRepository();

    public SellController() {
    }

    public SellController(SellRepository sellRepository) {
        this.sellRepository = sellRepository;
    }
    
    
    public  void SearchCodeProduct(String code) {
        sellRepository.SearchProduct(code);
    }
    
}
