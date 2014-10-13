/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package femolikaord;

import javax.swing.JOptionPane;
/**
 *
 * @author jonny.phimthaisongan
 */
public class FemOlikaOrd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ord1;
        String ord2;
        String ord3;
        String ord4;
        String ord5;
            ord1 = JOptionPane.showInputDialog("Ord Num.1","Ett");
                JOptionPane.showMessageDialog(null, ord1,"Ett Ord", JOptionPane.PLAIN_MESSAGE);
            ord2 = JOptionPane.showInputDialog("Ord Num.2","Två");
                JOptionPane.showMessageDialog(null, ord1 + " " + ord2,"Två Ord", JOptionPane.PLAIN_MESSAGE);
            ord3 = JOptionPane.showInputDialog("Ord Num.3","Tre");
                JOptionPane.showMessageDialog(null, ord1 + " " + ord2 + " " + ord3,"Tre Ord", JOptionPane.PLAIN_MESSAGE);
            ord4 = JOptionPane.showInputDialog("Ord Num.4","Fyra");
                JOptionPane.showMessageDialog(null, ord1 + " " + ord2 + " " + ord3 + " " + ord4,"Fyra Ord", JOptionPane.PLAIN_MESSAGE);
            ord5 = JOptionPane.showInputDialog("Ord Num.5","Fem");
                JOptionPane.showMessageDialog(null, ord1 + " " + ord2 + " " + ord3 + " " + ord4 + " " + ord5,"Fem Ord", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
    }
    
}
