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
        Changing_data_type obj1 = new Changing_data_type();
        int sum1 = obj1.summation(2, 4);
        System.out.println(sum1);

        double sum2 = obj1.summation(2.0f, 4.3f);
        System.out.println(sum2);

        Product2 obj2 = new Product2();
        int pro1 = obj2.multiply(3, 4);
        System.out.println(pro1);

        double pro2 = obj2.multiply(3.3f, 5.4f);
        System.out.println(pro2);
    }
}
