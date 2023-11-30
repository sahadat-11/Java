package Java_Practice_Set;
import java.util.Scanner;
public class Calculate_Cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int total = first + second + third;
        double cg = (1.0 * 4 * total) / 300;
        System.out.println(cg);
    }
}
