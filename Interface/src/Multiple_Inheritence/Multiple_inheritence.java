// Declare the interfaces
interface Walkable {
    void walk();
}

interface Swimmable {
    void swim();
}

// Implement the interfaces in a class
class Duck implements Walkable, Swimmable {
    public void walk()
    {
        System.out.println("Duck is walking.");
    }

    public void swim()
    {
        System.out.println("Duck is swimming.");
    }
}

// Use the class to call the methods from the interfaces
class Main {
    public static void main(String[] args)
    {
        Duck duck = new Duck();
        duck.walk();
        duck.swim();
    }
}





// Interface for the first behavior
interface FirstInterface {
    void firstMethod();

    // You can also have variables in interfaces (implicitly public, static, and final)
    int FIRST_CONSTANT = 10; // static so we access it in main method
}

// Interface for the second behavior
interface SecondInterface {
    void secondMethod();

    int SECOND_CONSTANT = 20; // static so we access it in main method
}

// Class implementing both interfaces
class MultipleInheritanceClass implements FirstInterface, SecondInterface {
    // Implementing methods from the first interface
    public void firstMethod() {
        System.out.println("Implementing firstMethod");
    }

    // Implementing methods from the second interface
    public void secondMethod() {
        System.out.println("Implementing secondMethod");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the class implementing both interfaces
        MultipleInheritanceClass myObject = new MultipleInheritanceClass();

        // Call methods from the first interface
        myObject.firstMethod();
        System.out.println("First constant: " + FirstInterface.FIRST_CONSTANT);

        // Call methods from the second interface
        myObject.secondMethod();
        System.out.println("Second constant: " + SecondInterface.SECOND_CONSTANT);
    }
}
