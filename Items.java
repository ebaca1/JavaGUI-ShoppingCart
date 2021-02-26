/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bacaericproject;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Eric Baca
 */
public class Items {
    
    private double shippingCost;
    private String shippingDate;
    private double subtotal;
    
    private Items myItems;
    private Items item;
    
    public ArrayList<ItemEntry> itemList;
/*
    Items() {
        Items myItems = new Items();
        Selection mySelectionFrame = new Selection(myItems);
        mySelectionFrame.setVisible(true);
    }
*/

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(String shippingDate) {
        this.shippingDate = shippingDate;
    }
    
    

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }
    
    //gets the specific item
    public ItemEntry getItem(String itemName) {
        ItemEntry entry = null;
        
        for(ItemEntry i: itemList) {
            if (i.getItemName().equals(itemName)) {
            entry = i;
            }
        }
        
        return entry;
    }
    
    public void addItemToCart(String itemName) {
        ItemEntry item = getItem(itemName);
            item.setAddToCart(true);
    }
    
    //generates a random tracking number for the confirmation page
    public String generateTrackingNumber() {
        String randChars = "ABCDEFGHIJ0123456789";
        StringBuilder trackingNumber = new StringBuilder();
        Random rand = new Random();
        
        while(trackingNumber.length() < 12) {
            int i = (int) (rand.nextFloat() * randChars.length());
            trackingNumber.append(randChars.charAt(i));
        }
        String trackingNum = trackingNumber.toString();
        return trackingNum;
    }

    
    /*
    Items item1 = new Items("Fuel Pump", 325.50, false);
    Items item2 = new Items("Catalytic Converter", 250.25, false);
    Items item3 = new Items("Carburetor", 460.00, false);
    Items item4 = new Items("Big Brake Kit", 1275.00, false);
    Items item5 = new Items("Front Bumper", 275.00, false);
    Items item6 = new Items("Eric's Emporium T-Shirt", 34.50, false);
    Items item7 = new Items("Eric's Emportium Adjustable Cap", 20.00, false);
    */
    
    /*
    public Items(String itemName, double itemPrice, boolean addToCart) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.addToCart = addToCart;
        
        //itemList = new ArrayList<Items>();
        //itemList.add(item1);
        //itemList.add(item2);
        //itemList.add(item3);
        //itemList.add(item4);
        //itemList.add(item5);
        //itemList.add(item6);
        //itemList.add(item7);
        
        
    }
    */
    
    
    
    /*
    public Items() {
        
    }
    */
    /*
    public static void run() {
        Items myItems = new Items("", 0.0, false);
        Selection mySelectionFrame = new Selection(myItems);
        mySelectionFrame.setVisible(true);
    }
    */

    public Items() {
        itemList = new ArrayList<ItemEntry>();
    }
    //used to add an entry to the arraylist
    public void addEntry(String itemName, double itemPrice, boolean addToCart, double itemQuantity) {
        ItemEntry entry = new ItemEntry(itemName, itemPrice, addToCart, itemQuantity);
        itemList.add(entry);
    }
}


