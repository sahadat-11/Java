package precedence_associativity;

public class precendece {
    public static void main(String[] args) {
        // Precedence & Associativity

//        int p = 6*5-34/2;
//        /*
//        Highest precedence goes to * and /. They are then evaluated on the basis
//        of left to right associativity
//            =30-34/2
//            =30-17
//            =13
//         */
//        int q = 60/5-34*2;
//        /*
//            = 12-34*2
//            =12-68
//            =-56
//         */
//
//        System.out.println(p);
//        System.out.println(q);
//
//        // Quick Quiz
//        int x =6;
//        int y = 1;
//        //  int k = x * y/2;
//
//        int b = 0;
//        int c = 0;
//        int a = 10;
//        int k = b*b - (4*a*c)/(2*a);
//        System.out.println(k);
//        int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;
//
//        // precedence rules for arithmetic operators.
//        // (* = / = %) > (+ = -)
//        // prints a+(b/d)
//        System.out.println("a+b/d = " + (a + b / d));
//
//        // if same precedence then associative
//        // rules are followed.
//        // e/f -> b*d -> a+(b*d) -> a+(b*d)-(e/f)
//        System.out.println("a+b*d-e/f = "
//                + (a + b * d - e / f));
        int a = 20, b = 10, c = 0;

        // a=b+++c is compiled as
        // b++ +c
        // a=b+c then b=b+1
        a = b++ + c;
        System.out.println("Value of a(b+c), "
                + " b(b+1), c = " + a + ", " + b
                + ", " + c);

        // a=b+++++c is compiled as
        // b++ ++ +c
        // which gives error.
        // a=b+++++c;
        // System.out.println(b+++++c);
    }
}
