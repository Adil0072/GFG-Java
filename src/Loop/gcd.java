package Loop;

public class gcd {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 28;

        int result = gcd(a, b);

        System.out.println("GCD = " + result);
    }
}

//import java.math.BigInteger;
//
//public class Main {
//    public static void main(String[] args) {
//        int a = 20;
//        int b = 28;
//
//        BigInteger num1 = BigInteger.valueOf(a);
//        BigInteger num2 = BigInteger.valueOf(b);
//
//        BigInteger gcd = num1.gcd(num2);
//
//        System.out.println("GCD = " + gcd);
//    }
//}