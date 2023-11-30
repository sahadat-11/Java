package Java_Practice_Set;
import java.util.Scanner;
public class Kg_to_Meter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kg = sc.nextInt();
        double miles = 1.0 * kg * 0.689;
        System.out.println(miles);
    }
}
