package Java__Practice_set_OOP;
import java.util.Scanner;
class Employee {
    int salary;
    String name;
    void setName(String n) {
        name = n;
    }
    void setSalary(int taka) {
        salary = taka;
    }
    String getName() {
        return  name;
    }
    int getSalary() {
        return  salary;
    }
}
public class Employee_Details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee ob = new Employee();
        String name = sc.next();
        int salary = sc.nextInt();
        ob.setName(name);
        ob.setSalary(salary);
        System.out.println(ob.getName());
        System.out.println(ob.getSalary());
    }
}
