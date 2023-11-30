package Java_Practice_Set_String;
import java.util.Scanner;
public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =  sc.next();
        String revs = " ";
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            revs = ch + revs;
        }
        System.out.println("Reverse String = " +revs);

        // approach 2;
        StringBuilder revs2 = new StringBuilder();
        revs2.append(s);
        revs2.reverse();
        System.out.println("Reverse String = " +revs2);
    }
}
