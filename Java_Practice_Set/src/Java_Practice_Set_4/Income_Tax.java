package Java_Practice_Set_4;
import java.util.Scanner;
public class Income_Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double taka = sc.nextDouble();
        if(taka >= 2.5 && taka < 5) {
            double tax = 5 / 100 * taka;
            System.out.println(tax);
        }
        if(taka >= 5 && taka < 10) {
            double tax = 1.0 * 20 / 100 * taka;
            System.out.println(tax);
        }
        if(taka >= 10) {
            double tax = 30 / 100 * taka;
            System.out.println(tax);
        }
        else {
            System.out.println("NO tax");
        }
    }
}
