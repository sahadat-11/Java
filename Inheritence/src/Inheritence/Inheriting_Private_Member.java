//package Inheritence;
//class Person2 {
//    String name;//default
//    int age;//default
//}
//class Teacher extends Person2 {
//    // name, age
//    void display() {
//        System.out.println("Name : " +name);
//        System.out.println("Age : " +age);
//    }
//}
//public class Inheriting_Private_Member {
//    public static void main(String[] args) {
//        Teacher t1 = new Teacher();
//        t1.name = "Sahadat";
//        t1.age = 30;
//        t1.display();
//    }
//}



//package Inheritence;
//class Person2 {
//   private String name; // cannot access;
//    private int age; // cannot access
//}
//class Teacher extends Person2 {
//    // name, age
//    void display() {
//        System.out.println("Name : " +name);
//        System.out.println("Age : " +age);
//    }
//}
//public class Inheriting_Private_Member {
//    public static void main(String[] args) {
//        Teacher t1 = new Teacher();
//        t1.name = "Sahadat";
//        t1.age = 30;
//        t1.display();
//    }
//}



package Inheritence;
class Person2 {
    private String name;
    private int age;
    public void setname(String name) {
        this.name = name;
    }
    public String getname() {
        return  name;
    }

    public void setage(int age) {
        this.age = age;
    }
    public int getage() {
        return  age;
    }
}
class Teacher extends Person2 {
    //setstring, setage, getname, getage;
    private String qualification;
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    public String getQualification() {
        return qualification;
    }
    public void display() {
        System.out.println(getname());
        System.out.println(getage());
        System.out.println(getQualification());
    }
}
public class Inheriting_Private_Member {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setname("Sahadat");
        t1.setage(30);
        t1.setQualification("Bsc");
        System.out.println(t1.getname());
        System.out.println(t1.getage());
        System.out.println(t1.getQualification());
        t1.display();// same as above three line
    }
}
