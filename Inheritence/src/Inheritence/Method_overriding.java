//package Inheritence;
//class person5 {
//    String name;
//    int age;
//    void display() {
//        System.out.println("Name :" + name);
//        System.out.println("Age : " +age);
//    }
//}
//class Teacher5 extends person5 {
//    // name, age, display();
//    String qualification;
//
//
//    @Override
//    void display() {
//        System.out.println("Name :" + name);
//        System.out.println("Age : " +age);
//        System.out.println("Qualification : " +qualification);
//    }
//
//}
//public class Method_overriding {
//    public static void main(String[] args) {
//       Teacher5 ob = new Teacher5();
//       ob.name = "Sahadat";
//       ob.age = 23;
//       ob.qualification = "Bsc";
//       ob.display();
//        System.out.println("\n");
//       person5 ob1 = new person5();
//       ob1.name = "Sharif";
//       ob1.age = 13;
//       ob1.display();// overriding
//    }
//}


////1. Overriding and Access Modifiers
//// A Simple Java program to demonstrate
//// Overriding and Access-Modifiers
//
//class Parent {
//    // private methods are not overridden
//    private void m1()
//    {
//        System.out.println("From parent m1()");
//    }
//
//    protected void m2()
//    {
//        System.out.println("From parent m2()");
//    }
//}
//
//class Child extends Parent {
//    // new m1() method
//    // unique to Child class
//    private void m1()
//    {
//        System.out.println("From child m1()");
//    }
//
//    // overriding method
//    // with more accessibility
//    @Override public void m2()
//    {
//        System.out.println("From child m2()");
//    }
//}
//
//// Driver class
//class Main {
//    public static void main(String[] args)
//    {
//        Parent obj1 = new Parent();
//        obj1.m2();
//        Parent obj2 = new Child();
//        obj2.m2();
//    }
//}


////2. Final methods can not be overridden
//
//// A Java program to demonstrate that
//// final methods cannot be overridden
//
//class Parent {
//    // Can't be overridden
//    final void show() {}
//}
//
//class Child extends Parent {
//    // This would produce error
//    void show() {}
//}
//Output

        //error: show() in Child cannot override show() in Parent
       // void show() {  }
        //overridden method is final


////3. Static methods can not be overridden(Method Overriding vs Method Hiding):
//
//// Java program to show that
//// if the static method is redefined by
//// a derived class, then it is not
//// overriding, it is hiding
//
//class Parent {
//    // Static method in base class
//    // which will be hidden in subclass
//    static void m1()
//    {
//        System.out.println("From parent "
//                + "static m1()");
//    }
//
//    // Non-static method which will
//    // be overridden in derived class
//    void m2()
//    {
//        System.out.println(
//                "From parent "
//                        + "non - static(instance) m2() ");
//    }
//}
//
//class Child extends Parent {
//    // This method hides m1() in Parent
//    static void m1()
//    {
//        System.out.println("From child static m1()");
//    }
//
//    // This method overrides m2() in Parent
//    @Override public void m2()
//    {
//        System.out.println(
//                "From child "
//                        + "non - static(instance) m2() ");
//    }
//}
//
//// Driver class
//class Main {
//    public static void main(String[] args)
//    {
//        Parent obj1 = new Child();
//
//        // As per overriding rules this
//        // should call to class Child static
//        // overridden method. Since static
//        // method can not be overridden, it
//        // calls Parent's m1()
//        obj1.m1();
//
//        // Here overriding works
//        // and Child's m2() is called
//        obj1.m2();
//    }
//}


////4. Private methods can not be overridden
//
//class SuperClass {
//    private void privateMethod()
//    {
//        System.out.println(
//                "This is a private method in SuperClass");
//    }
//
//    public void publicMethod()
//    {
//        System.out.println(
//                "This is a public method in SuperClass");
//        privateMethod();
//    }
//}
//
//class SubClass extends SuperClass {
//    // This is a new method with the same name as the
//    // private method in SuperClass
//    private void privateMethod()
//    {
//        System.out.println(
//                "This is a private method in SubClass");
//    }
//
//    // This method overrides the public method in SuperClass
//    public void publicMethod()
//    {
//        System.out.println(
//                "This is a public method in SubClass");
//        privateMethod(); // calls the private method in
//        // SubClass, not SuperClass
//    }
//}
//
//public class Test {
//    public static void main(String[] args)
//    {
//        SuperClass obj1 = new SuperClass();
//        obj1.publicMethod(); // calls the public method in
//        // SuperClass
//
//        SubClass obj2 = new SubClass();
//        obj2.publicMethod(); // calls the overridden public
//        // method in SubClass
//    }
//}


////5. The overriding method must have the same return type (or subtype)
//
//class SuperClass {
//    public Object method()
//    {
//        System.out.println(
//                "This is the method in SuperClass");
//        return new Object();
//    }
//}
//
//class SubClass extends SuperClass {
//    public String method()
//    {
//        System.out.println(
//                "This is the method in SubClass");
//        return "Hello, World!";
//    }
//}
//
//public class Test {
//    public static void main(String[] args)
//    {
//        SuperClass obj1 = new SuperClass();
//        obj1.method();
//
//        SubClass obj2 = new SubClass();
//        obj2.method();
//    }
//}


////6. Invoking overridden method from sub-class

//// A Java program to demonstrate that overridden
//// method can be called from sub-class
//
//// Base Class
//class Parent {
//    void show() { System.out.println("Parent's show()"); }
//}
//
//// Inherited class
//class Child extends Parent {
//    // This method overrides show() of Parent
//    @Override void show()
//    {
//        super.show();
//        System.out.println("Child's show()");
//    }
//}
//
//// Driver class
//class Main {
//    public static void main(String[] args)
//    {
//        Parent obj = new Child();
//        obj.show();
//    }
//}
//
