package Basic;

public class Data_type {
    public static void main(String[] args) {
        char a = 's';
        int n = 2;
        float f = 2.6f;
        double d = 3.442d;
        boolean bol = true;
        //long l = 3636266666666;//by default it is integer so it is overflow
        long l  = 3352636352522622L;
        byte b = 4;
        //short s = 43647474744848;//by default it is integer so it is overflow
        short s = 436;
        String str = "sahadat";
        System.out.println("char: " + a);
        System.out.println("integer: " + n);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("long: " + l);
        System.out.println(str);
    }
}
