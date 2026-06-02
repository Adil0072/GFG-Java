package Operator;
import java.util.Scanner;

public class Bitwise {
    public static void solve() {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        // Perform all the operations and print in a single line
        int d = 0;
        int e = c ^ b;
        int f = a & b;
        int g = c | (0);
        e = ~e;

        System.out.print(d + " " + e + " " + f + " " + g);
    }
    public static void main(String[] args) {
        solve();
    }
}

