package Loop;

public class lcmof2 {

    public int lcm(int a, int b) {
        int ans = 1;

        for (int i = a; i <= a * b; i += a) {
            if (i % b == 0) {
                ans = i;
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        lcmof2 obj = new lcmof2();
        int result = obj.lcm(12, 18);
        System.out.println("LCM = " + result);
    }
}