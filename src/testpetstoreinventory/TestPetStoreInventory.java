/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpetstoreinventory;

import java.text.DecimalFormat;

/**
 *
 * @author mkenneweg
 */
public class TestPetStoreInventory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat f = new DecimalFormat("$#0.00");
        
        PetStoreInventory item1 = new PetStoreInventory("Jack Russell puppies", "Dogs", 4, 359.95);
        PetStoreInventory item2 = new PetStoreInventory("Catnip", "Kitty Accessories", 40, 4.95);
        PetStoreInventory item3 = new PetStoreInventory("Parrot", "Birds", 2, 524.95);
        
        
        System.out.println("       Description     Department    Units on Hand        Price       Total Value");
        System.out.println("=================================================================================");
        System.out.println("  Item 1     " + item1.getDescription() + "\t\t" + item1.getDepartment() +
        	"\t\t\t" + item1.getUnitsOnHand() +
        	 "\t\t\t\t" + f.format(item1.getPrice()) + "\t\t\t" + f.format(item1.calcTotalValue()));
        
        System.out.println("  Item 2     " + item2.getDescription() + "\t\t" + item2.getDepartment() +
        	"\t\t\t"  + item2.getUnitsOnHand() +
        	 "\t\t\t\t" + f.format(item2.getPrice()) + "\t\t\t" + f.format(item2.calcTotalValue()));
        	 
        System.out.println("  Item 3     " + item3.getDescription() + "\t\t" + item3.getDepartment() +
        	"\t\t\t"+ item3.getUnitsOnHand() +
        	 "\t\t\t\t" + f.format(item3.getPrice()) + "\t\t\t" + f.format(item3.calcTotalValue()));
        	 
        	 
        item1.setDescription("Siamese kittens");
        item1.setDepartment("Cats");
        item2.setUnitsOnHand(17);
        item3.setPrice(179.95);
        
        System.out.println("\n\n");
        
        System.out.println("       Description     Department    Units on Hand        Price       Total Value");
        System.out.println("=================================================================================");
        System.out.println("  Item 1     " + item1.getDescription() + "\t\t" + item1.getDepartment() +
        	"\t\t\t" + item1.getUnitsOnHand() +
        	 "\t\t\t\t" + f.format(item1.getPrice()) + "\t\t\t" + f.format(item1.calcTotalValue()));
        
        System.out.println("  Item 2     " + item2.getDescription() + "\t\t" + item2.getDepartment() +
        	"\t\t\t"  + item2.getUnitsOnHand() +
        	 "\t\t\t\t" + f.format(item2.getPrice()) + "\t\t\t" + f.format(item2.calcTotalValue()));
        	 
        System.out.println("  Item 3     " + item3.getDescription() + "\t\t" + item3.getDepartment() +
        	"\t\t\t"+ item3.getUnitsOnHand() +
        	 "\t\t\t\t" + f.format(item3.getPrice()) + "\t\t\t" + f.format(item3.calcTotalValue()));
      
    }
    
}
