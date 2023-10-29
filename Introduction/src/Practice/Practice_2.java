//package Practice;
//import java.util.Scanner;
//public class Practice_2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        float cgpa = (a + b + c) / 30; // return int value for add three int value;
//        System.out.println(cgpa);
//    }
//}
////Write a program to calculate CGPA using marks of three subjects (out of 100)

package Practice;
import java.util.Scanner;
public class Practice_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float cgpa = (a + b + c) / 30.0f; // float type cast;
        System.out.println(cgpa);
    }
}
//Write a program to calculate CGPA using marks of three subjects (out of 100)
