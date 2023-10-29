public class array_literals {
    public static void main(String[] args) {
        //int[] Array = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        //int[] Array = { 1,2,3,4,5,6,7,8,9,10 }; // same as above
        int Array [] = { 1,2,3,4,5,6,7,8,9,10 }; // same as above
        for(int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
    }
}
