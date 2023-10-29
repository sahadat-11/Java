package Recursion;
// Class 1
// Helper class
class recursive {
    public int recur(int n) {
        if(n <= 1) return 1;
        return n * recur(n - 1);
    }
}

// Class 2
// Main class
public class Recursion {
    static int fact(int n) { // general
        int res = 1;
        for(int i = 1; i <= n; i++) {
            res *= i;
        }
        return  res;
    }
    static int factorial(int n) {
        if(n <= 1) return  1;
        return n * factorial(n - 1);
    }
    public int rec(int n) {
        if(n <= 1) return 1;
        return n * rec(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(factorial(6));

        Recursion obj = new Recursion();
        System.out.println(obj.rec(4));

        recursive obj2 = new recursive();
        System.out.println(obj2.recur(8));

    }
}
