import java.util.Scanner;
public class for_each_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i = 0; i < 10; i++) {
            if(sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        for(int x : arr) {
            System.out.println(x);
        }
        for(int x : arr) {
            x *= 10; // not effect
        }
        for(int x : arr) {
            System.out.println(x);
        }
    }
}
