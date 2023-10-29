package If_else;

public class If_else {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        if (a) {
            System.out.println("a is true");
        } else {
            System.out.println("a is false");
        }

        if (b) {
            System.out.println("b is true");
        } else {
            System.out.println("b is false");
        }

        String str = "GeeksforGeeks";
        int i = 4;

        // if block
        if (i == 4) {
            i++; // i is increment
            System.out.println(str);
        }

        // Executed by default
        System.out.println("i = " + i);
         i = 10;

        if (i < 15)
            System.out.println("10 is less than 15");
        i = 20;

        // condition 1
        if (i == 10)
            System.out.println("i is 10\n");

            // condition 2
        else if (i == 15)
            System.out.println("i is 15\n");

            // condition 3
        else if (i == 20)
            System.out.println("i is 20\n");

        else
            System.out.println("i is not present\n");

        System.out.println("Outside if-else-if");
    }
}
