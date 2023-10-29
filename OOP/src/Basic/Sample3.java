package Basic;
import java.util.Scanner;
class Person {
    String name;
    int salary;
    public void set(String ss, int t) {
        name = ss;
        salary = t;
    }
    public void printdata() {
        System.out.println("name = " + name);
        System.out.println("salary = " + salary);
    }
}
public class Sample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println("Set the Information for 1st person");
        String s = sc.next();
        int taka = sc.nextInt();
        p1.set(s, taka);

        System.out.println("Print the Information for 1st person");
        p1.printdata();

        System.out.println("Set the Information for 2nd person");
        s = sc.next();
        taka = sc.nextInt();
        p2.set(s, taka);

        System.out.println("Print the Information for 2nd person");
        p2.printdata();
    }
}
