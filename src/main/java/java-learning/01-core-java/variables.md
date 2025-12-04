day 1

In Java, **variables** are classified into **three types**, and Java also has a set of **primitive data types**. Here's a complete explanation of each, along with **code examples**.

---

## 🔹 1. Types of Variables in Java

| Type               | Scope                                | Storage                     | Default Value          | Defined in                     |
| ------------------ | ------------------------------------ | --------------------------- | ---------------------- | ------------------------------ |
| **Local**          | Inside methods, constructors, blocks | Stack                       | None (must initialize) | Method or block                |
| **Instance**       | Belongs to an object (non-static)    | Heap                        | Default provided       | Inside class (outside methods) |
| **Static (Class)** | Belongs to class (shared)            | Method area (static memory) | Default provided       | With `static` keyword in class |

### ✅ Code Example:

```java
public class VariableTypesExample {

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
        VariableTypesExample obj = new VariableTypesExample();
        obj.methodExample();
    }
}
```

---

## 🔹 2. Data Types in Java 
A data type defines the type of data a variable can hold. Example: int, float, char, boolean.

Java has **two categories** of data types:

* **Primitive Data Types**
* **Non-Primitive (Reference) Data Types**

### 🟡 A. Primitive Data Types

| Type      | Size    | Description                 | Example Values |
| --------- | ------- | --------------------------- | -------------- |
| `byte`    | 1 byte  | Small integer (-128 to 127) | 100            |
| `short`   | 2 bytes | Larger than byte            | 10000          |
| `int`     | 4 bytes | Default integer type        | 123456         |
| `long`    | 8 bytes | Very large integer          | 9999999999L    |
| `float`   | 4 bytes | Decimal (single precision)  | 3.14f          |
| `double`  | 8 bytes | Decimal (double precision)  | 3.14159        |
| `char`    | 2 bytes | Single Unicode character    | 'A'            |
| `boolean` | 1 bit   | True or false               | true / false   |

### ✅ Code Example:

```java
public class DataTypesExample {
    public static void main(String[] args) {
        // Integer types
        byte b = 100;
        short s = 10000;
        int i = 500000;
        long l = 10000000000L;

        // Floating point types
        float f = 5.75f;
        double d = 19.99;

        // Character type
        char c = 'A';

        // Boolean type
        boolean bool = true;

        // Print them
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
    }
}
```

---

## 🔵 B. Non-Primitive Data Types

| Type       | Description                           | Examples               |
| ---------- | ------------------------------------- | ---------------------- |
| `String`   | Sequence of characters                | `"Hello World"`        |
| Arrays     | Collection of same data type elements | `int[] arr = {1,2,3};` |
| Classes    | Blueprint for objects                 | Custom objects         |
| Interfaces | Abstraction mechanism                 | `Runnable` etc.        |

### ✅ Code Snippet:

```java
public class NonPrimitiveExample {
    public static void main(String[] args) {
        String str = "Hello Java";
        int[] arr = {1, 2, 3, 4};

        System.out.println("String: " + str);
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```

---

### 🔷 What is an *Instance* of a Class in Java?

An **instance of a class** is simply **an object** created from that class.
When you define a class in Java, you're just creating a blueprint. An **instance** is the **actual usable object** based on that blueprint.

---

### 🔨 Analogy:

Think of a **class** as a blueprint of a house 🏠.
An **instance** is the actual house built using that blueprint.

---

### ✅ Example:

```java
// Class definition
public class Car {
    // Instance variable
    String color = "Red";
}
```

```java
// Main class
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // This is an instance of the Car class
        System.out.println("Color of my car: " + myCar.color);
    }
}
```

### 🔍 Breakdown:

* `Car` is a class (blueprint).
* `myCar` is an **instance (object)** of the class `Car`.
* You access class members (like `color`) using that instance: `myCar.color`.

---

### 📌 Key Points:

* Each instance has its **own copy** of instance variables.
* You can create **multiple instances** of the same class.

```java
Car car1 = new Car();
Car car2 = new Car();
car1.color = "Blue";
car2.color = "Black";
```

Here, `car1` and `car2` are two separate **instances**, with independent values.

---

## Summary
- Java supports 3 types of variables: local, instance, static.
- Primitive types include byte, short, int, long, float, double, char, boolean.
- Non-primitive types include String, arrays, classes, interfaces.
- An object is an instance of a class.
