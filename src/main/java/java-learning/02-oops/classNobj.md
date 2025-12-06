## 📘 Part 1 — Class & Object
#️⃣ 1. Class in Java

A class is a blueprint or template for creating objects.

✔ Key Points

Contains variables, methods, constructors, blocks.

Does not occupy memory until an object is created.

Represents a concept (Car, Student, Employee, etc.)

Example
class Car {
    String color = "Red";
    void drive() {
        System.out.println("Car is driving");
    }
}

#️⃣ 2. Object in Java

An object is an instance of a class.
It has state (variables) and behavior (methods).

✔ How Objects are Created
Car myCar = new Car();
myCar.drive();

✔ Memory Allocation

Objects are stored in the Heap memory.

## 📘 Part 2 — Inheritance & Polymorphism
#️⃣ 3. Inheritance in Java

Inheritance allows a class to acquire properties of another class.

✔ Parent → Child

extends keyword

✔ Types of Inheritance (Java Supports)

Single

Multilevel

Hierarchical

❌ Java does NOT support multiple inheritance using classes.

Example
class Animal {
    void eat() { System.out.println("Eating"); }
}

class Dog extends Animal {
    void bark() { System.out.println("Bark"); }
}

#️⃣ 4. Polymorphism in Java

Polymorphism = many forms.
It allows the same method name to behave differently.

✔ Types

Compile-time Polymorphism → Method Overloading

Runtime Polymorphism → Method Overriding

Example (Runtime)
class Animal {
    void sound() { System.out.println("Animal sound"); }
}

class Dog extends Animal {
    void sound() { System.out.println("Bark"); }
}
