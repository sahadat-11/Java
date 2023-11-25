package Abstract_Method;

// Abstract class
abstract class Sunstar {
    abstract void printInfo();
}

// Abstraction performed using extends
class Employee extends Sunstar {
    void printInfo()
    {
        String name = "avinash";
        int age = 21;
        float salary = 222.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
public class Basic2 {
    public static void main(String[] args) {
        Employee s = new Employee();
        s.printInfo();
    }
}

// Java Program to implement Abstract Class
// having constructor, data member, and methods
abstract class Subject {
    Subject() {
        System.out.println("Learning Subject");
    }

    abstract void syllabus();

    void Learn(){
        System.out.println("Preparing Right Now!");
    }
}

class IT extends Subject {
    void syllabus(){
        System.out.println("C , Java , C++");
    }
}

class GFG {
    public static void main(String[] args) {
        Subject x = new IT();

        x.syllabus();
        x.Learn();
    }
}
