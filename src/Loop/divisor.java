package Loop;
import java.util.ArrayList;

public class divisor {
        public ArrayList<Integer> getDivisors(int n) {
            ArrayList<Integer> divisor = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    divisor.add(i);
                }
            }

            return divisor;
        }

        public static void main(String[] args) {
            divisor obj = new divisor();

            int n = 12;
            ArrayList<Integer> result = obj.getDivisors(n);

            System.out.println("Divisors of " + n + " are: " + result);
        }
}