package If_else;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        int day = 5;
        String dayString;

        // Switch statement with int data type
        switch (day) {

            // Case
            case 1:
                dayString = "Monday";
                break;

            // Case
            case 2:
                dayString = "Tuesday";
                break;

            // Case
            case 3:
                dayString = "Wednesday";
                break;

            // Case
            case 4:
                dayString = "Thursday";
                break;

            // Case
            case 5:
                dayString = "Friday";
                break;

            // Case
            case 6:
                dayString = "Saturday";
                break;

            // Case
            case 7:
                dayString = "Sunday";
                break;

            // Default case
            default:
                dayString = "Invalid day";
        }
        System.out.println(dayString);

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String size;

        // switch statement to check size
        switch (number) {

            case 29:
                size = "Small";
                break;

            case 42:
                size = "Medium";
                break;

            // match the value of week
            case 44:
                size = "Large";
                break;

            case 48:
                size = "Extra Large";
                break;

            default:
                size = "Unknown";
                break;

        }
        System.out.println("Size: " + size);
    }
}
