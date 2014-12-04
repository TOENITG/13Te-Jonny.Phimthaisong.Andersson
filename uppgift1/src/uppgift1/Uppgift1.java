

package uppgift1;

import java.util.*;
public class Uppgift1 {

    
    public static void main(String[] args) {
        
        Scanner user_input = new Scanner( System.in );
        
        System.out.println("Question 1: Is cancer bad?");
        //The system ask person question first. *Nodding*
        String answer1;
        answer1 = user_input.next();
        //The user answer question 1
        System.out.println("Your answer is " + answer1.toLowerCase( ));
        //The system make all big letter to small letters
        if (answer1.equals("yes")){
            System.out.println("That is Correct");
        }
        else{
            System.out.println("That is wong");
        }
    }
    
}