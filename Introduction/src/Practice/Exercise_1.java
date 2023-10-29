package Practice;
import java.util.Scanner;
public class Exercise_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first subject:");
        float a = sc.nextFloat();
        System.out.println("Enter the second subject:");
        float b = sc.nextFloat();
        System.out.println("Enter the third subject:");
        float c = sc.nextFloat();
        System.out.println("Enter the fourth subject:");
        float d = sc.nextFloat();
        System.out.println("Enter the fifth subject:");
        float e = sc.nextFloat();
        float total = a + b + c + d + e;
        float ans = (total / 500.0f) * 100; // float type cast
        System.out.println(ans);
    }
}
//Write a program to calculate the percentage of a given student in the CBSE board
// exam. His marks from 5 subjects must be taken as input from the keyboard.
// (Marks are out of 100)