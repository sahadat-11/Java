// Java Program to demonstrate
// Reference of Final Variable

// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating an object of StringBuilder class
        // Final reference variable
        final StringBuilder sb = new StringBuilder("Geeks");

        // Printing the element in StringBuilder object
        System.out.println(sb);

        // changing internal state of object reference by
        // final reference variable sb
        sb.append("ForGeeks");

        // Again printing the element in StringBuilder
        // object after appending above element in it
        System.out.println(sb);
    }
}
