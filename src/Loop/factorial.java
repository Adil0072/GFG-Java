package Loop;

public class factorial {
        // Function to calculate factorial of a number.
        int facto(int n) {
            // code here
            int fact = 1;
            for (int i = 1; i <= n; i++){
                fact = fact * i;
            }
            return fact;
        }

    static void main(String[] args) {
        factorial obj = new factorial();
        int result = obj.facto(5);
        System.out.println("Factorial = " + result);
    }
}


