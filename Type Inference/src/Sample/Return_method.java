package Sample;
class func {
    int A() {
        //return  34;
        var x = 34;
        return  x;
    }
}
public class Return_method {
    int ret()
    {
        return 10;
    }
    public static void main(String[] args) {
        var x = new Return_method().ret();
        System.out.println(x);
        var y = new func().A();
        System.out.println(y);
    }
}
