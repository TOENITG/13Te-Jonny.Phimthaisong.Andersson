

package uppgift1;

import java.util.*;
public class Uppgift1 {

    
    public static void main(String[] args) {
        
        Scanner user_input = new Scanner( System.in );
        
        System.out.println("Question 1: Is cancer bad?");
        //The system ask person question first.
        String answer1;
        String answer2;
        String answer3;
        int points;
        points = 0;
        answer1 = user_input.next();
        //The user answer question 1
        answer1 = answer1.toLowerCase();
        System.out.println("Your answer is " + answer1);
        //The system make all big letter to small letters
        if (answer1.equals("yes")){
            System.out.println("That is Correct");
            points = points + 1;
            //Sysstem tells the player it was the right answer and give "it" +1 point
        }
        else{
            System.out.println("That is wong");
            System.out.println("The answer is Yes");
            points = points - 1;
            //System tells the player it was the wrong answer and give "it" -1 point
        }
        System.out.println("Your score is " + points);
        //Tells the player its score
        
        System.out.println("Question 2: What diameter is on a .50Cal bullet?");
        //The system ask person question 2. *Nodding*
        answer2 = user_input.next();
        //The user answer question 2
        answer2 = answer2.toLowerCase();
        //The system make all big letter to small letters
        System.out.println("Your answer is " + answer2);
        //The system make all big letter to small letters
        if (answer2.equals("12.7mm")){
            System.out.println("That is Correct");
            points = points + 1;
            //Sysstem tells the player it was the right answer and give "it" +1 point
        }
        else{
            System.out.println("That is wong");
            System.out.println("The answer is 12.7mm");
            points = points - 1;
            //System tells the player it was the wrong answer and give "it" -1 point
        }
        System.out.println("Your score is " + points);
        //Tells the player score
        
        System.out.println("Question 3: Is this C#, C++ or Java?");
        //The system ask person question 3. *Nodding*
        answer3 = user_input.next();
        //The user answer question 3
        answer3 = answer3.toLowerCase();
        //The system make all big letter to small letters
        System.out.println("Your answer is " + answer3);
        //The system make all big letter to small letters
        if (answer3.equals("java")){
            System.out.println("That is Correct");
            points = points + 1;
            //Sysstem tells the player it was the right answer and give "it" +1 point
        }
        else{
            System.out.println("That is wong");
            System.out.println("The answer is Java");
            points = points - 1;
            //System tells the player it was the wrong answer and give "it" -1 point
        }
        System.out.println("Your score is " + points);
        //Tells the player score
    }
    
}