package com.springcore.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springcore.lifecycle.Student;

public class SimpleLifecycleTest {
    
    public static void main(String[] args) {
        System.out.println("========== Starting Spring Container ==========");
        
        // Create Spring container
        ClassPathXmlApplicationContext context = 
            new ClassPathXmlApplicationContext("applicationContext.xml");
        
        System.out.println("\n========== Container Started ==========");
        
        // Get the bean from container
        Student student = context.getBean("student", Student.class);
        
        System.out.println("\n========== Using the Bean ==========");
        // Use the bean
        student.study();
        
        System.out.println("\n========== Shutting Down Container ==========");
        // Close container - this triggers destroy methods
        context.close();
        
        System.out.println("========== Done ==========");
    }
}