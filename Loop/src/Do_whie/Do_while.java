package Do_whie;

public class Do_while {
    public static void main(String[] args) {
        int i = 0;
        do {

            // Body of loop that will execute minimum
            // 1 time for sure no matter what
            System.out.println("Print statement");
            i++;
        }

        // Checking condition
        // Note: It is being checked after
        // minimum 1 iteration
        while (i < 0);

        i = 1;

        // Do-while loop
        do {

            // Body of do-while loop
            // Print statement
            System.out.println("Hello World");

            // Update expression
            i++;
        }

        // Test expression
        while (i < 6);
    }
}
