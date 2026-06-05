package Loop;
import java.util.Scanner;

class evenString {
    public static void even() {
        // code here
        Scanner in = new Scanner(System.in);
        String s = in.next();
        for (int i = 0; i < s.length(); i+=2){
            System.out.print(s.charAt(i));
        }
    }

    static void main() {
        even();
    }
}
