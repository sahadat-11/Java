package Inheritence;
class myclass {
    int a;
    //    myclass(int a) {
//        a = a;// we can not a == a; for this we use this.a = a;
//    }
    myclass(int a) {
        this.a = a;// this is reference
    }
    public int GetA() {
        return  a;
    }
}
public class This_Keyword {
    public static void main(String[] args) {
        myclass ob = new myclass(5);
        System.out.println(ob.GetA());
    }
}
