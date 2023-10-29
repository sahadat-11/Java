package Method;
public class Object_creation {
    int sum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        // method invocation using object creation
       Object_creation obj = new Object_creation();
       int c = obj.sum(4, 6);
        System.out.println(c);
    }
}
