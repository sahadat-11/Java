package One_dimension;
//import java.util.Scanner;
public class One_dimension2 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //float arr1[] = {2.33, 23.42, 54.3};// this is invalid;
        float arr1[] = {2.33f, 23.42f, 54.3f};
        System.out.println(arr1.length);
        for(int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        for(float u : arr1) {
            System.out.println(u);
        }
//        for(auto u : arr1) {
//            System.out.println(u); // not support auto
//        }

    }
}
