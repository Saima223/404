// Declares that this class is part of the 'week1' package (for organization and namespace management)
package week1;

// Defines a public class named 'Main'
public class Main {
    
    // Declares an instance variable 'i' of type int, initialized to 5
    // Each object of the class 'Main' will have its own copy of 'i'
    int i = 5;
    
    // Declares a static variable 'ch' of type char, initialized to 'M'
    // Static means it belongs to the class, not to instances
    static char ch = 'M';
    
    /* Main method: entry point of the Java program
     'public' means accessible from anywhere
     'static' means it can run without creating an instance of the class
     'void' means it returns no value
     'String[] args' is used to receive command-line arguments*/
    public static void main(String[] args) {
        
        // Declares and initializes a local variable 'flower' with the value "lily"
        String flower = "lily";
        
        // Prints the value of the local variable 'flower' to the console
        System.out.println("flower name is " + flower);
        
        // Accesses and prints the static variable 'ch'
        // Static variable can be accessed directly from static methods
        System.out.println("char = " + ch);
        
        // Creates an object of the 'Main' class using the default constructor
        Main object = new Main();
        
        // Accesses and prints the instance variable 'i' using the object
        System.out.println(object.i);
    }
    
}
