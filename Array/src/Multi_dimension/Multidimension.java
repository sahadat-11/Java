package Multi_dimension;
import java.util.Scanner;
public class Multidimension {
    public static void main(String[] args) {

        int arr[][];
        arr = new int[10][10];
        arr[0][0] = 2;
        System.out.println("arr[0][0] = " + arr[0][0]);


        int row = 3;
        int col = 3;
        int arr2[][] = new int[row][col];
        int value = 1;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                arr2[i][j] = value;
                value++;
            }
        }

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(arr2[i][j] +" ");
            }
            System.out.println();
        }

        int[][] arr4 = { { 1, 2 }, { 3, 4 } };
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(arr4[i][j] +" ");
            }
            System.out.println();
        }

        // input from users;
        int arr3[][] = new int[3][4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr3.length; i++) {
            for(int j = 0; j < arr3[i].length; j++) {
                if(sc.hasNextInt()) {
                    arr3[i][j] = sc.nextInt();
                }
            }
        }
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(arr3[i][j] +" ");;
            }
            System.out.println();
        }

    }
}
