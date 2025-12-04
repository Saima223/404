package week1;

public class Variabletype {
	// Instance variable :declared within a class but out side a method
    int instanceVar = 10;

    // Static variable  
    static int staticVar = 20;

    public void methodExample() {
        // Local variable : declared within a method 
        int localVar = 5;
        System.out.println("Local Variable: " + localVar); //and accessible only within that scope
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        Variabletype obj = new Variabletype();
        obj.methodExample();
    }


}
