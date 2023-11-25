package Method_overloading;
class Type_Promotion {
    void f(int x) {
        System.out.println("Inside The integer");
    }
    void f(double x) {
        System.out.println("Inside The double");
    }
}
public class Automatic_Type_Promotion {
    public static void main(String[] args) {
       Type_Promotion ob = new Type_Promotion();
       int x = 10;
       double d = 10.1;
       short s = 10;
       byte b = 12;
       float fl = 13.3f;
       ob.f(x);
       ob.f(d);
       ob.f(s);
       ob.f(b);
       ob.f(fl);
    }
}
