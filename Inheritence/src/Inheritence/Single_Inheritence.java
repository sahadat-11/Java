package Inheritence;
class parent3 {

}
class child3 extends parent3 {
    public void display() {
        System.out.println("this is child class");
    }
}
public class Single_Inheritence {
    public static void main(String[] args) {
        child3 ob = new child3();
        ob.display();
    }
}
