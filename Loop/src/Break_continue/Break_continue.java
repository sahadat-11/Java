package Break_continue;

public class Break_continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // Terminate the loop when i is 5
            if (i == 5)
                break;
            System.out.println("i: " + i);
        }
        System.out.println("Out of Loop");

        for(int i=7;i>0;i--){
            if(i==3){
                continue;//continue skips the rest statement
            }
            System.out.println(i);
        }
    }
}
