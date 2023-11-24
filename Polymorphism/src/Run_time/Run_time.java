package Run_time;
class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class Run_time {
    public static void main(String[] args) {
//        Phone obj = new Phone(); //superclass reference variable refers to the object of the superclass.
//        obj.showTime();
//        obj.on();
//
//        SmartPhone obj2 = new SmartPhone(); //subclass reference variable refers to the object of the subclass.
//        obj2.showTime();
//        obj2.on();

          Phone obj3 = new SmartPhone(); //superclass reference variable refers to the object of the subclass.
        // SmartPhone obj2 = new Phone(); // Not allowed
          obj3.on();
          obj3.showTime();
          //obj3.music(); // not allow becauese music is super class method
    }
}

        //In the above code, we've created two classes: Phone & SmartPhone.
        //The Phone is the parent class and the SmartPhone is the child class.
        //The method on() of the parent class is overridden inside the child class.
       // Inside the main() method, we've created an object obj of the Smartphone() class by taking the reference of the Phone() class.
       // When obj.on() will be executed, it will call the on() method of the SmartPhone() class because the reference variable obj is pointing towards the object of class SmartPhone().