// Java Program to demonstrate that function overloading
// fails if only return types are different

// filename Main.java
public
class Main {
    public
    int foo() { return 10; }
    public
    char foo() { return 'a'; }
    // compiler error as it is a new declaration of fun()
    public
    static void main(String args[]) {}
}
// not possible
//It is not sufficient for two methods to differ only in
//their return types.

package Method_overloading;
// Class 1
// Helper class
class Product2 {
    public int multiply(int a, int b) {
        return  a * b;
    }

    public double multiply(double a, double b) {
        return  a * b;
    }
}

// Class 2
// Main class
public class Changing_data_type {
    int summation(int a, int b) {
        return  a + b;
    }
    double summation(double a, double b) {
        return  a + b;
    }
    public static void main(String[] args) {
        Method_overloading.Changing_data_type obj1 = new Method_overloading.Changing_data_type();
        int sum1 = obj1.summation(2, 4);
        System.out.println(sum1);

        double sum2 = obj1.summation(2.0f, 4.3f);
        System.out.println(sum2);

        Method_overloading.Product2 obj2 = new Method_overloading.Product2();
        int pro1 = obj2.multiply(3, 4);
        System.out.println(pro1);

        double pro2 = obj2.multiply(3.3f, 5.4f);
        System.out.println(pro2);
    }
}
//possible because all data type are change;
//overloaded methods may differ in their
//return types, too

