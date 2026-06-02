package Operator;
import java.util.Scanner;

public class Formula {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            // code here
            int sum = ((a + b) / c) + d;
            System.out.println(sum);
        }
}

