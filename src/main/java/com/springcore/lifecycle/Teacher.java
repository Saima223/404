package com.springcore.lifecycle;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;

public class Teacher implements InitializingBean, DisposableBean {
    
    private String name;
    private String subject;
    
    public Teacher() {
        System.out.println("1. Teacher object created (Constructor called)");
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
        System.out.println("2. Name set: " + name);
    }
    
    public String getSubject() {
        return subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
        System.out.println("3. Subject set: " + subject);
    }
    
    // InitializingBean interface method
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("4. AFTER PROPERTIES SET: Teacher initialization complete");
        System.out.println("   Teacher " + name + " ready to teach " + subject);
    }
    
    // DisposableBean interface method
    @Override
    public void destroy() throws Exception {
        System.out.println("5. DESTROY: Teacher cleanup");
        System.out.println("   " + name + " finished teaching");
    }
    
    // Business method
    public void teach() {
        System.out.println(name + " is teaching " + subject);
    }
}