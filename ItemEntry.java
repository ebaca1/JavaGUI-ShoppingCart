/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bacaericproject;

/**
 *
 * @author Eric Baca
 */
public class ItemEntry {
    
    //this class allows the program to keep track of individial 
    //item quantities and prices for calculation purposes
    
    private String itemName;
    private double itemPrice;
    private boolean addToCart;
    private double itemQuantity;

    public ItemEntry(String itemName, double itemPrice, boolean addToCart, double itemQuantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.addToCart = addToCart;
        this.itemQuantity = itemQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public boolean isAddToCart() {
        return addToCart;
    }

    public void setAddToCart(boolean addToCart) {
        this.addToCart = addToCart;
    }

    public double getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(double itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
    
    
    
    
}
