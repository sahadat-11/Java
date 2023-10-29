package One_dimension;
import java.util.Scanner;

public class One_dimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[];// declare
        arr = new int[20];// allocate memory
        arr[0] = 2;
        arr[1] = 3;
        for(int i = 0; i < arr.length; i++) System.out.println(arr[i] +" "); // output 2, 3;

        int arr1[] = new int[10]; // declare and allocate
        for(int i = 0; i < 10; i++) {
            arr1[i] = i;
        }
        for(int i = 0; i < 10; i++) {
            System.out.println(arr1[i]);
        }

        int ar[] = {2, 3, 4, 8}; // declare, allocate, and initialize;
        for(int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }

        int arr2[] = new int[20]; // declare and allocate
        // get input from users
        for(int i = 0; i < 5; i++) {
            if(sc.hasNextInt()) {
                arr2[i] = sc.nextInt();
            }
        }
        for(int i = 0; i < 10; i++) {
            System.out.print(arr2[i] +" ");
        }

        float arr3[] = {2.33f, 23.42f, 54.3f};
        System.out.println(arr3.length);
        for(int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        for(float u : arr3) {
            System.out.println(u);
        }
    }
}

