package Java_Practice_Set_4;
import javax.swing.plaf.IconUIResource;
import java.util.Scanner;
public class Pass_Fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int total = first + second + third;
        double take = 1.0 * total / 300 * 100;
        System.out.println(take);
        if(take >= 40 && first >= 33 && second >= 33 && third >= 33) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}
