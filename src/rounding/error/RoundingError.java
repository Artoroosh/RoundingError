/*
 * Corbin Nash
 * Started:  06/09/2018 2:41 PM
 * Finished:   /  / 
 * and open the template in the editor.
 */
package rounding.error;

import javax.swing.*;

public class RoundingError {
     public static void main(String[] args) {
        
         String numberString = JOptionPane.showInputDialog("Enter Number");
         Double baseNumber = Double.parseDouble(numberString);
         Double numberSquared = Math.pow(Math.sqrt(baseNumber),2);
         Double Difference = numberSquared - baseNumber;
        
         System.out.println("Base number" + baseNumber);
         System.out.println("Number squared" + numberSquared);
         System.out.println("Difference"+Difference);
     }
    
}
