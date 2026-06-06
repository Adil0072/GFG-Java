package Loop;
import java.util.Scanner;

public class countNum {
    public static int countDigits(int n) {
        if (n == 0) {
            return 1;
        }

        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(countDigits(n));

        in.close();
    }
}