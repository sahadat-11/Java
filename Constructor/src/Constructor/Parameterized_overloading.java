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
