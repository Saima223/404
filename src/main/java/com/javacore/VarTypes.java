package com.javacore;

public class VarTypes {
	// Instance variable
    int instanceVar = 10;

    // Static variable
    static int staticVar = 20;

    public void methodExample() {
        // Local variable
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
