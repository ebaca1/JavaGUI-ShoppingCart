/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bacaericproject;

import java.util.ArrayList;

/**
 *
 * @author Eric Baca
 */
public class BacaEricProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        Items myItems = new Items();
        
        run(myItems);
        
    }
    
    
    public static void run(Items myItems) {
        
        //Items myItems = null;
        Selection mySelectionFrame = new Selection(myItems);
        mySelectionFrame.setVisible(true);
        
        //to fill the arraylist with the available items
        myItems.addEntry("Fuel Pump", 325.50, false, 0.0);
        myItems.addEntry("Catalytic Converter", 250.25, false, 0.0);
        myItems.addEntry("Carburetor", 460.00, false, 0.0);
        myItems.addEntry("Big Brake Kit", 1275.00, false, 0.0);
        myItems.addEntry("Front Bumper", 275.00, false, 0.0);
        myItems.addEntry("Eric's Emporium T-Shirt", 34.50, false, 0.0);
        myItems.addEntry("Eric's Emportium Adjustable Cap", 20.00, false, 0.0);

    }
}
