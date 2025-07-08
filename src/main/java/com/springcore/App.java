package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        // Load Spring context using Java configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        // Get student beans from context
        Student student1 = context.getBean("student1", Student.class);
        Student student2 = context.getBean("student2", Student.class);
        
        System.out.println(student1);
        System.out.println(student2);
        
        // Close context
        ((AnnotationConfigApplicationContext) context).close();
    }
}