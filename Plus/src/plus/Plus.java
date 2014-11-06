
package plus;
import java.util.*;

public class Plus {
    
    public static void main(String[] args) {

        System.out.println("Number:");
        double number = input();

        System.out.println("Next Number:");
        number = number + input();

        System.out.println("Addition:" + number);

        System.out.println("Next Number:");
        number = number - input();

        System.out.println("Subtraktion:" + number);

        System.out.println("Next Number:");
        number = number * input();

        System.out.println("Multiplikation:" + number);

        System.out.println("Next Number:");
        number = number / input();

        System.out.println("Division:" + number);
    }
    static double input() {
        double number = 0;
        Scanner userinput = new Scanner(System.in);
        boolean error;
        do {

            try{
                number = Double.parseDouble(userinput.nextLine());
                error = true;
            }
            catch (NumberFormatException e){
                System.out.println("That was not a number");
                error = false;
            }
        }
        while (error == false);
        return number;
    }
}