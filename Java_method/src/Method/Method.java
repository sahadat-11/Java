package Method;

public class Method {
    //int sum(int a, int b) // built error
    static int sum(int a, int b) { // method class er vitore kono function call
        // korle static dite hobe; na hoi vaire object create korte hobe;
        int sum = a + b;
        return  sum;
    }
    int summation(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        int a = 3, b = 4;
        int c = sum(a, b);
        System.out.println(c);

        // method invocation using object creation
        Method obj = new Method();
        int d = obj.summation(4, 6);
        System.out.println(d);
    }
}
