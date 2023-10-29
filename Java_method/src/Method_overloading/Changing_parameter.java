package Method_overloading;
// Class 1
// Helper class
class Product {
    //int multiply(int a, int b) // it work same;
    public int multiply(int a, int b) {
        return  a * b;
    }
    public int multiply(int a, int b, int c) {
        return  a * b * c;
    }
}

// Class 2
// Main class
public class Changing_parameter {
   //public int summation(int a, int b) same work done
    int summation(int a, int b) {
        return  a + b;
    }
    int summation(int a, int b, int c) {
        return  a + b + c;
    }

    public static void main(String[] args) {
        Changing_parameter obj = new Changing_parameter();
        int sum1 = obj.summation(3, 5);
        System.out.println(sum1);

        int sum2 = obj.summation(4, 6, 7);
        System.out.println(sum2);

        // Creating object of above class inside main()
        // method
        Product obj2 = new Product();

        // Calling method to Multiply 2 numbers
        int pro1 = obj2.multiply(3, 5);
        System.out.println(pro1);

        // Calling method to Multiply 3 numbers
        int pro2 = obj2.multiply(2, 3, 4);
        System.out.println(pro2);
    }
}



