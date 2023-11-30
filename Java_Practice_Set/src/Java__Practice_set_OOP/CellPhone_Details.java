package Java__Practice_set_OOP;
import java.util.Scanner;
class Cell_phone {
    String name;
    void setName(String n) {
        name = n;
    }
    void display_name() {
        System.out.println("Phone name = " +name);
    }
    void ringing() {
        System.out.println("Phone is ringing");
    }
    void vibrating() {
        System.out.println("Phone is Vibrating");
    }
}
public class CellPhone_Details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cell_phone ob = new Cell_phone();
        String Phone_name = sc.next();
        ob.setName(Phone_name);
        ob.display_name();
        ob.ringing();
        ob.vibrating();
    }
}
