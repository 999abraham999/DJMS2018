/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Product {
    Long Id;
    Long codeProduct;
    String nameProduct;
    Boolean activeProduct;
    Double priceUnitProcut;
    Date registerDateProduct;

    public Product() {
    }

    public Product(Long Id, Long codeProduct, String nameProduct, Boolean activeProduct, Double priceUnitProcut, Date registerDateProduct) {
        this.Id = Id;
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.activeProduct = activeProduct;
        this.priceUnitProcut = priceUnitProcut;
        this.registerDateProduct = registerDateProduct;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Long getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(Long codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Boolean getActiveProduct() {
        return activeProduct;
    }

    public void setActiveProduct(Boolean activeProduct) {
        this.activeProduct = activeProduct;
    }

    public Double getPriceUnitProcut() {
        return priceUnitProcut;
    }

    public void setPriceUnitProcut(Double priceUnitProcut) {
        this.priceUnitProcut = priceUnitProcut;
    }

    public Date getRegisterDateProduct() {
        return registerDateProduct;
    }

    public void setRegisterDateProduct(Date registerDateProduct) {
        this.registerDateProduct = registerDateProduct;
    }

    @Override
    public String toString() {
        return "Product{" + "Id=" + Id + ", codeProduct=" + codeProduct + ", nameProduct=" + nameProduct + ", activeProduct=" + activeProduct + ", priceUnitProcut=" + priceUnitProcut + ", registerDateProduct=" + registerDateProduct + '}';
    }
    
    
}
