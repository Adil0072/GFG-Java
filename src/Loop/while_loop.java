package Loop;

import java.util.Scanner;

public class while_loop {
        public static void dec() {
            // code here
            Scanner in =  new Scanner(System.in);
            int x = in.nextInt();
            while (x >= 0){
                System.out.print(x + " ");
                x--;
            }
        }

    static void main() {
        dec();
    }
}
