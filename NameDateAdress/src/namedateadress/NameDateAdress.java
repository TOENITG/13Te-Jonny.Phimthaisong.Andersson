/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namedateadress;

import javax.swing.JOptionPane;

/**
 *
 * @author jonny.phimthaisongan
 */
public class NameDateAdress {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Namn
         * Person Number
         * Adress
         * Vissa bara födelsedagen och inte 4 sista siffror
         * Välkommen <Namn>, då du fyller den <Del av personnummer som visar födelsedagen> kommer vi komma till dig, <Address> och fira dig. Detta är ett automatiskt meddelande.
         */
        
        String Name = JOptionPane.showInputDialog("Fyll i ditt Namn","Ex: Adrian Andersson");
        String SocNumber = JOptionPane.showInputDialog("Fyll i ditt Personnummer","121212-1212");
        String Adress = JOptionPane.showInputDialog("Fyll i din Adress","Ex: Karlsgatan 30");
        
        String SocNumberDone = SocNumber.substring(0,6);
        JOptionPane.showMessageDialog( null, "Välkommen " + Name + ", " + "då du fyller den " + SocNumberDone + " " + "kommer vi koma till dig," + Adress + " " + "och fira dig. Detta är ett automatiskt meddelande.", "Done" ,JOptionPane.PLAIN_MESSAGE);
    }
    
}
