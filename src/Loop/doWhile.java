package Loop;
import java.util.Scanner;
class doWhile {
    public static void printGeeks() {
        // Code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        do{
            System.out.println("Geeksforgeeks");
            i++;
        }while(i < n);
    }
    static void main() {
        printGeeks();
    }
}
