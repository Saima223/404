package com.javacore;

public class VarTypes {
	// Instance variable: inside a class and outside any method, they are not shared between objs 
    int instanceVar = 10;// each obj have its own version of them(unique)

    // Static variable: belongs to class, dont need any obj (shared)
    static int staticVar = 20;

    public void methodExample() {
        // Local variable: it can be created inside a method and they exist within that scope  
        int localVar = 5;
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        VarTypes obj = new VarTypes();
        obj.methodExample();
    }


}
