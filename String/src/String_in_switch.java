public class String_in_switch {
    public static void main(String[] args) {
        // Custom input string
        String str = "two";

        // Switch statement over above string
        switch (str) {

            // Case 1
            case "one":

                // Print statement corresponding case
                System.out.println("one");

                // break keyword terminates the
                // code execution here itself
                break;

            // Case 2
            case "two":

                // Print statement corresponding case
                System.out.println("two");
                break;

            // Case 3
            case "three":

                // Print statement corresponding case
                System.out.println("three");
                break;

            // Case 4
            // Default case
            default:

                // Print statement corresponding case
                System.out.println("no match");
        }

        // 2nd
        str = "";

        // Switch statement over above string
        switch (str) {

            // Case 1
            case "one":

                // Print statement corresponding case
                System.out.println("one");

                // break keyword terminates the
                // code execution here itself
                break;

            // Case 2
            case "two":

                // Print statement corresponding case
                System.out.println("two");
                break;

            // Case 3
            case "three":

                // Print statement corresponding case
                System.out.println("three");
                break;

            // Case 4
            // Default case
            default:

                // Print statement corresponding case
                System.out.println("no match");
        }
    }
}
