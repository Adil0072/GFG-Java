package Operator;

public class Logical {
       public String booleanOperations(boolean a, boolean b) {
              return (a && b) + " " + (a || b) + " " + (!a);
       }

       public static void main(String[] args) {
              Logical logic = new Logical();
              System.out.println(logic.booleanOperations(true, false));
       }
}


//package Operator;
//
//public String booleanOperations(boolean a, boolean b) {
//       return (a && b)  + " " + (a || b) + " " + (!a);
//}
//
