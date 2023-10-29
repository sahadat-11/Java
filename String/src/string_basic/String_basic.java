package string_basic;
import java.util.Scanner;
public class String_basic {
    public static void main(String[] args) {
        // Basic:
        String name;
        name = "sahadat";
        System.out.println("My namne is " +name);

        // array of characters.
        char[] names = {'D', 'i', 'a', 'b', 'l', 'o'};
        String welcomeMsg = new String(names); // important
        System.out.println("Welcome " + welcomeMsg);

        // string declare in various ways;
        String s1 = "Kibria";
        System.out.println(s1);
        String s2 = new String("Sharif");
        System.out.println(s2);

        // assign one string to another string;
        String s3 = new String(s2);
        System.out.println(s3);

        // concanate
        String fname, lname;
        fname = "sahadat";
        lname = " hossain";
        System.out.println(fname + " " + lname);

        //concat() method to concatenate two strings.
        System.out.println(fname.concat(lname));

        //concatenate string with an integer
        int quantity;
        quantity = 12;
        name = " Apples";
        System.out.println(quantity + name);

       // Creating String using new :
        String s = new String("sahadat");
        System.out.println(s);

        // compare two string
        String str1 = "CodeWithHarry";
        String str2 = "CodeWithHarry";
        System.out.println(str1 == str2);

         str1 = "sahadat";
         str2 = "hossain";
        System.out.println(str1 == str2);

        // video code
        // String name = new String("Harry");
        // String name = "Harry";
        // System.out.print("The name is: ");
        // System.out.print(name);
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %8.2f\n", a, b); // 8 gor print korbe
        System.out.format("The value of a is %d and value of b is %f\n", a, b);
        System.out.format("The value of a is %d and value of b is %.2f\n", a, b);// print two floating digit
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String st2 = sc.nextLine();
        System.out.println(st);
        System.out.println(st2);
    }
}

