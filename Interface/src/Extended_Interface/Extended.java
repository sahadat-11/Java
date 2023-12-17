class One {
    public void methodOne()
    {

        // Some Functionality
    }
}

class Two extends One {

    public static void main(String args[])
    {
        Two t = new Two();

        // Calls the method one
        // of the above class
        t.methodOne();
    }
}


// Defining an interface
interface One {
    public void methodOne();
}

// Defining the second interface
interface Two {
    public void methodTwo();
}

// Implementing the two interfaces
class Three implements One, Two {
    public void methodOne()
    {

        // Implementation of the method
    }

    public void methodTwo()
    {

        // Implementation of the method
    }
}



// A class can extend a class and can implement any number of interfaces simultaneously.
// Defining the interface
interface One {

    // Abstract method
    void methodOne();
}

// Defining a class
class Two {

    // Defining a method
    public void methodTwo()
    {
    }
}

// Class which extends the class Two
// and implements the interface One
class Three extends Two implements One {

    public void methodOne()
    {

        // Implementation of the method
    }
}



// An interface can extend any number of interfaces at a time.
// Defining the interface One
interface One {
    void methodOne();
}

// Defining the interface Two
interface Two {
    void methodTwo();
}

// Interface extending both the
// defined interfaces
interface Three extends One, Two {
}
