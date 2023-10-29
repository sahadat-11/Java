package Constructor;
class Myclass3 {
    Myclass3(String name) {
        System.out.println(name + "\n");
    }
    Myclass3 (String name, int id){
        System.out.println(name + " " + id + "\n");
    }
}
public class Parameterized_overloading {
    public static void main(String[] args) {
         Myclass3 obj = new Myclass3("sahadat");
         Myclass3 obj2 = new Myclass3("sahadat", 10);
    }
}
