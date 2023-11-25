package Pass_object_to_method;
class Test {
    int a, b;
    Test(int i, int j) {
        a = i;
        b = j;
    }
    void Change(Test ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}
public class Pass_by_Referrence {
    public static void main(String[] args) {
        Test ob = new Test(10, 15);
        System.out.println("Before change : a = " +ob.a + " b = " +ob.b );
        ob.Change(ob);
        System.out.println("after change : a = " +ob.a + " b = " +ob.b );
    }
}
