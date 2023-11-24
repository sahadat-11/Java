package Basic;

import javax.xml.namespace.QName;

class Employee {
    int id; // Attribute 1
    String name;// Attribute 2

    public void printdetails() {
        System.out.println("my id = " +id);
        System.out.println("my name = " + name);
    }
    public void set(String s, int n) {
        name = s;
        id = n;
    }
}
public class Sample {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee person = new Employee();

        // setting attributes
        person.name = "sahadat";
        person.id = 10;

        // print
        System.out.println(person.name);
        System.out.println(person.id);

        // function call
        person.printdetails();

        // setter;
        person.set("sharif", 3453252);

        // getter
        person.printdetails();
    }
}
