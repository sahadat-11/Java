package stirng_metod;
//import java.util.Scanner;
public class String_method {
    public static void main(String[] args) {
        //Scanner sc = new Scanner();
        String name = "Sahadat Hossain";

        // 	Returns the length of String name
        int value = name.length();
        System.out.println(value);

       // Converts all the characters of the string to the lower case letters.
        System.out.println(name.toLowerCase());
        String lc = name.toLowerCase();
        System.out.println(lc);

        // Converts all the characters of the string to the upper case letters.
        System.out.println(name.toUpperCase());
        String uc = name.toUpperCase();
        System.out.println(uc);

        //a new String after removing all the leading and trailing spaces from the original string.
        name = "  sahadat hossain  ";
        System.out.println(name); // containing space;
        System.out.println(name.trim()); // donot containing space

        //Returns a substring from start to the end.
        name = "sahadat";
        System.out.println(name.substring(3)); // string from 3 to end;

        //Returns a substring from the start index to the end index
        System.out.println(name.substring(3, 5)); // 3 to 5 er ag projonto

        //Returns a new string after replacing one character to another character
        System.out.println(name.replace('a', 'e'));
        System.out.println(name.replace("d", "ier"));

        //Returns true if the name starts with the string
        System.out.println(name.startsWith("sa"));
        System.out.println(name.startsWith("fs"));

        //Returns true if the name ends with the string
        System.out.println(name.endsWith("at"));
        System.out.println(name.endsWith("af"));

        // Returns the character at a given index position.
        System.out.println(name.charAt(4));

        //Returns the index of the first occurrence of the specified character in the given string.
        System.out.println(name.indexOf('d'));
        System.out.println(name.indexOf('a'));

        //	Returns the last index of the specified character from the given string
        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.lastIndexOf('d'));

        //Returns true if the given string is equal to “sahadat” false otherwise [Case sensitive]
        System.out.println(name.equals("sahadat"));
        System.out.println(name.equals("Sahadat"));
        System.out.println(name.equals("sahd"));

        //Returns true if two strings are equal, ignoring the case of characters
        System.out.println(name.equalsIgnoreCase("sahadat"));
        System.out.println(name.equalsIgnoreCase("Sahadat"));
        System.out.println(name.equalsIgnoreCase("sahd"));
    }
}
