package Operator;

public class unary {
    public static void main(String[] args) {
        // Interger declared
        int a = 10;
        int b = 10;

        // Using uniary operators
        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));
    }
}
