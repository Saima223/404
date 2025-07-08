package com.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    
    @Bean
    public Student student1() {
        return new Student(101, "John Doe", "123 Main Street");
    }
    
    @Bean
    public Student student2() {
        Student student = new Student();
        student.setStudentId(102);
        student.setStudentName("Jane Smith");
        student.setStudentAddress("456 Oak Avenue");
        return student;
    }
}