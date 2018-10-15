/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kassa;

/**
 *
 * @author kajat
 */
public class Product{
    
    public String name;
    public double price;
    public int count;
    
    public Product (String productName, double productPrice, int productCount){
        name = productName;
        price = productPrice;
        count = productCount;
        
    }
}
