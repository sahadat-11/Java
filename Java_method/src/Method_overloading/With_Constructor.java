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
        Myclass2 obj3 = new Myclass2("sahadat hossain ", 12);
        System.out.println(obj3.name + obj3.id);
        // obj3 ta holo same package er different class;
        // so we can access it
    }

//    package com.company;
//
//    class MyMainEmployee{
//        private int id;
//        private String name;
//
//        public MyMainEmployee(){
//            id = 0;
//            name = "Your-Name-Here";
//        }
//        public MyMainEmployee(String myName, int myId){
//            id = myId;
//            name = myName;
//        }
//        public MyMainEmployee(String myName){
//            id = 1;
//            name = myName;
//        }
//        public String getName(){
//            return name;
//        }
//        public void setName(String n){
//            this.name = n;
//        }
//        public void setId(int i){
//            this.id = i;
//        }
//        public int getId(){
//            return id;
//        }
//    }
//
//    public class cwh_42_constructors {
//        public static void main(String[] args) {
//            //MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry", 12);
//            MyMainEmployee harry = new MyMainEmployee();
//            //harry.setName("CodeWithHarry");
//            //harry.setId(34);
//            System.out.println(harry.getId());
//            System.out.println(harry.getName());
//        }
//    }

}


// Java program to illustrate
// Constructor Overloading
class Box {
    double width, height, depth;

    // constructor used when all dimensions
    // specified
    Box(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimensions
    // specified
    Box() { width = height = depth = 0; }

    // constructor used when cube is created
    Box(double len) { width = height = depth = len; }

    // compute and return volume
    double volume() { return width * height * depth; }
}

// Driver code
public class Test {
    public static void main(String args[])
    {
        // create boxes using the various
        // constructors
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        // get volume of cube
        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
    }
}
