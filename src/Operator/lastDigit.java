package Operator;

import java.util.*;

class lastDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        //Math.abs() converts it to positive
        System.out.println(Math.abs(n % 10));
    }
}