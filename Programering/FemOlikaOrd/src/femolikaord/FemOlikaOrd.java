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
            //String to remeber the words the user put in
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
            //Every two rows is one word
        System.exit(0);
    }
    
}

/*
Tack!
Kort och enkalt. Det hade blivit mer kompakt om du använt en Array och en for-loop, men det var inte nödvändigt.
Sedan så hade du inte följt instuktionen att lägga filerna i ett och samma projekt. Fy! ;o)

*/