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
            //The strings are for keeping track of what the user put in
        String DD = SocNumber.substring(4,6);
        String MM = SocNumber.substring(2,4);
        String YY = SocNumber.substring(0,2);
            switch (MM) {
                case "01":
                    MM = "January";
                    break;
                case "02":
                    MM = "February";
                    break;
                case "03":
                    MM = "Mars";
                    break;
                case "04":
                    MM = "April";
                    break;
                case "05":
                    MM = "Maj";
                    break;
                case "06":
                    MM = "Juni";
                    break;
                case "07":
                    MM = "Juli";
                    break;
                case "08":
                    MM = "Agusti";
                    break;
                case "09":
                    MM = "September";
                    break;
                case "10":
                    MM = "Oktober";
                    break;
                case "11":
                    MM = "November";
                    break;
                case "12":
                    MM = "December";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "YOU BROKE THE RULE! GOD DAMMIT! YOU BROKE IT!", "THE RULE!", JOptionPane.WARNING_MESSAGE);
                    System.exit(0);
                    break;
                        //This switch is looking for what month you are born
                        //Next time use DateFormatSybols().getMonths() [sting-1];
            }
                JOptionPane.showMessageDialog( null, "Välkommen " + Name + ", " + "då du fyller den "+ YY + " " + DD + " " + MM + " " + "kommer vi koma till dig, " + Adress + " " + "och fira dig. Detta är ett automatiskt meddelande.", "Done" ,JOptionPane.PLAIN_MESSAGE);
                    //This part is the output the program makes
    }
    
}
