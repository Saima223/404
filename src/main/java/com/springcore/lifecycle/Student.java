package com.springcore.lifecycle;

public class Student {
    private String name;
    private int age;
    
    // Default constructor
    public Student() {
        System.out.println("1. Student object created (Constructor called)");
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
        System.out.println("2. Name property set: " + name);
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
        System.out.println("3. Age property set: " + age);
    }
    
    // Custom initialization method
    public void initStudent() {
        System.out.println("4. INIT METHOD: Student initialization complete");
        System.out.println("   Student " + name + " is ready!");
    }
    
    // Custom destruction method
    public void cleanupStudent() {
        System.out.println("5. DESTROY METHOD: Cleaning up student resources");
        System.out.println("   Student " + name + " resources cleaned up");
    }
    
    // Business method
    public void study() {
        System.out.println(name + " is studying...");
    }
}