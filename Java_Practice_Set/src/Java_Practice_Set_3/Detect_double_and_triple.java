package Java_Practice_Set_3;
import java.util.Scanner;
public class Detect_double_and_triple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myString = "This string contains   double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
    }
}
