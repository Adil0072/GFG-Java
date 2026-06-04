package Operator;
class naturalnumber {
    static int sumOfNaturals(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}
//class Solution {
//    static int sumOfNaturals(int n) {
//        return n * (n + 1) / 2;
//    }
//}