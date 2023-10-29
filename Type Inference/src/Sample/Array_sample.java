package Sample;

public class Array_sample {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        for (var x : arr)  System.out.println(x + "\n");
        int var = 1; // it is user defined variable
        System.out.println(var);
        var k = var; // it is possible;
        System.out.println(k);
        var x = -var;
        System.out.println(x);
        var arr1 = new int[5]; // it is valid
        arr1[0] = 2;
        System.out.println(arr1[0]);
        for(var i = 0; i < 5; i++) {
            arr1[i] = i + 1;
        }
        //for (var x : arr1)  System.out.println(x + "\n");// wrong because x is already declare;
        for (var u : arr1)  System.out.println(u + "\n");// now valid

        //var myarray = {1,2 ,3 ,4};// it is wrong
       // for(var y : myarray) System.out.println(y);
    }
}
