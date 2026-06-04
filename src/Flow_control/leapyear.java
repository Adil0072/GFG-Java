package Flow_control;
//Back-end complete function Template for Java
import java.util.*;

public class leapyear {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        // code here
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}