package Basic;
class Student {
    String name;
    int id;
    public void set(String s, int i) {
        name = s;
        id = i;
    }
    public void printdata() {
        System.out.println(name);
        System.out.println(id);
    }
}
public class Sample2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println("Set the Information for 1st Student");
        s1.set("Shadat", 34);

        System.out.println("Print the information for 1st Student");
        s1.printdata();

        System.out.println("Set the Information for 2nd Student");
        s2.set("Riham", 44);

        System.out.println("Print the information for 2nd Student");;
        s2.printdata();
    }
}
