package Flow_control;
import java.util.Scanner;

public class else_if {
        public static void main(String[] args) {
            // Write the if, else if, else statements below
            Scanner in = new Scanner(System.in);
            int number = in.nextInt();
            if (number > 100){
                System.out.println("Big");
            } else if (number < 10){
                System.out.println("Small");
            }else{
                System.out.println("Number");
            }
        }
}

