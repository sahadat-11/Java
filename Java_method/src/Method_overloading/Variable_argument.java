package Method_overloading;
public class Variable_argument {
    static int summation(int a, int b) {
        return  a + b;
    }
    static int summation(int a, int b, int c) {
        return  a + b + c;
    }
    static int summation(int a, int b, int c, int d) {
        return  a + b + c + d;
    }

    static  int sum(int ...arr) {
        int total = 0;
        for(int i : arr) {
            total += i;
        }
        return  total;
    }
    public static void main(String[] args) {
        int sum1 = summation(3, 45);
        System.out.println(sum1);

        int sum2 = summation(3, 4, 5);
        System.out.println(sum2);

        int sum3 = summation(3, 4, 5, 6);
        System.out.println(sum3);
        // we use different function for different number of parameters;
        // it is called function overloading;
        // we solved this problem using variable argument

        System.out.println(sum(3, 4));
        System.out.println(sum(4, 5, 6));
        System.out.println(sum(3, 4, 5,6 ));
    }
}
