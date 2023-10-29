package Basic;
import java.util.Scanner;
public class User_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum = " + sum);
        System.out.println("Enter the float first number");
        float c = sc.nextFloat();
        System.out.println("Enter the second float number");
        float d = sc.nextFloat();
        float sum2 = c + d;
        System.out.println("float sum = " + sum2);
        System.out.println("Enter the name: ");
        //String name = sc.next(); // for only a word;
        String name = sc.nextLine();// for a line
        System.out.println("The name is : " + name);
    }
}
