// Java Tutorial in One File
// Author: Vibranium's Assistant (Normey 😎)

import java.io.*;
import java.util.*;

// ===============================
// MAIN CLASS
// ===============================
public class JavaTutorial {
    public static void main(String[] args) {

        // ===============================
        // 1. Java Output
        // ===============================
        System.out.println("Hello World!"); // println = new line
        System.out.print("Hello ");         // print = same line
        System.out.print("Java\n\n");

        // ===============================
        // 2. Java Comments
        // ===============================
        // This is a single-line comment
        /* This is a multi-line comment */
        /** Documentation comment example */

        // ===============================
        // 3. Java Variables & Data Types
        // ===============================
        System.out.println("=== Variables & Data Types ===");
        String name = "John";
        int age = 25;
        double salary = 5000.50;
        boolean isJavaFun = true;
        System.out.println(name + " is " + age + " years old with salary " + salary);
        System.out.println("Is Java fun? " + isJavaFun + "\n");

        // ===============================
        // 4. Java Type Casting
        // ===============================
        System.out.println("=== Type Casting ===");
        int x = 9;
        double y = x;  // Widening
        double a = 9.78;
        int b = (int) a; // Narrowing
        System.out.println("Widening int->double: " + y);
        System.out.println("Narrowing double->int: " + b + "\n");

        // ===============================
        // 5. Java Operators
        // ===============================
        System.out.println("=== Operators ===");
        int m = 10, n = 5;
        System.out.println("m + n = " + (m + n));
        System.out.println("m > n ? " + (m > n));
        System.out.println("Logical && : " + (m == 10 && n == 5));
        m += 3;
        System.out.println("After += 3: " + m + "\n");

        // ===============================
        // 6. Java Strings
        // ===============================
        System.out.println("=== Strings ===");
        String txt = "Hello Java";
        System.out.println("Length: " + txt.length());
        System.out.println("Upper: " + txt.toUpperCase());
        System.out.println("Lower: " + txt.toLowerCase());
        System.out.println("Index of 'Java': " + txt.indexOf("Java") + "\n");

        // ===============================
        // 7. Java Math
        // ===============================
        System.out.println("=== Math ===");
        System.out.println("Max(5,10): " + Math.max(5, 10));
        System.out.println("Min(5,10): " + Math.min(5, 10));
        System.out.println("Sqrt(64): " + Math.sqrt(64));
        System.out.println("Abs(-4): " + Math.abs(-4));
        System.out.println("Random: " + Math.random() + "\n");

        // ===============================
        // 8. Java Booleans
        // ===============================
        System.out.println("=== Booleans ===");
        boolean isCodingFun = true;
        if (isCodingFun) {
            System.out.println("Yes, coding is fun!\n");
        }

        // ===============================
        // 9. Java If...Else
        // ===============================
        System.out.println("=== If Else ===");
        int ageCheck = 18;
        if (ageCheck >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }
        System.out.println();

        // ===============================
        // 10. Java Switch
        // ===============================
        System.out.println("=== Switch ===");
        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Other day");
        }
        System.out.println();

        // ===============================
        // 11. Java While Loop
        // ===============================
        System.out.println("=== While Loop ===");
        int i = 1;
        while (i <= 3) {
            System.out.println("i = " + i);
            i++;
        }
        System.out.println();

        // ===============================
        // 12. Java For Loop
        // ===============================
        System.out.println("=== For Loop ===");
        for (int j = 1; j <= 3; j++) {
            System.out.println("j = " + j);
        }
        System.out.println();

        // ===============================
        // 13. Java Break/Continue
        // ===============================
        System.out.println("=== Break/Continue ===");
        for (int k = 1; k <= 5; k++) {
            if (k == 3) continue;  // skips 3
            if (k == 5) break;     // stops loop
            System.out.println("k = " + k);
        }
        System.out.println();

        // ===============================
        // 14. Java Arrays
        // ===============================
        System.out.println("=== Arrays ===");
        String[] cars = {"Volvo", "BMW", "Ford"};
        System.out.println("First car: " + cars[0]);
        System.out.println("All cars:");
        for (String car : cars) {
            System.out.println(car);
        }
        System.out.println();

        // ===============================
        // 15. Java Methods
        // ===============================
        System.out.println("=== Methods ===");
        sayHello("Vibranium");
        int sum = addNumbers(10, 20);
        System.out.println("Sum: " + sum + "\n");

        // ===============================
        // 16. Java Classes & Objects
        // ===============================
        System.out.println("=== Classes & Objects ===");
        Car myCar = new Car("Tesla", "Model S");
        myCar.drive();
        System.out.println();

        // ===============================
        // 17. Inheritance
        // ===============================
        System.out.println("=== Inheritance ===");
        ElectricCar eCar = new ElectricCar("Tesla", "Model 3", 85);
        eCar.drive();
        eCar.charge();
        System.out.println();

        // ===============================
        // 18. Polymorphism
        // ===============================
        System.out.println("=== Polymorphism ===");
        Car polyCar = new ElectricCar("BYD", "Seal", 70);
        polyCar.drive(); // same method, different behavior
        System.out.println();

        // ===============================
        // 19. Encapsulation
        // ===============================
        System.out.println("=== Encapsulation ===");
        Account acc = new Account();
        acc.setBalance(5000);
        System.out.println("Balance: RM" + acc.getBalance() + "\n");

        // ===============================
        // 20. Abstraction
        // ===============================
        System.out.println("=== Abstraction ===");
        Shape circle = new Circle(5);
        System.out.println("Circle Area: " + circle.area() + "\n");

        // ===============================
        // 21. Exception Handling
        // ===============================
        System.out.println("=== Exception Handling ===");
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Try-catch completed.\n");
        }

        // ===============================
        // 22. Collections Framework
        // ===============================
        System.out.println("=== Collections Framework ===");
        ArrayList<String> list = new ArrayList<>();
        list.add("Volvo");
        list.add("BMW");
        list.add("Ford");
        System.out.println("Car List: " + list);
        Collections.sort(list);
        System.out.println("Sorted Cars: " + list + "\n");

        // ===============================
        // 23. File Handling
        // ===============================
        System.out.println("=== File Handling ===");
        try {
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Hello, this is Vibranium's Assistant writing to a file!");
            writer.close();
            System.out.println("Successfully wrote to file.");

            FileReader reader = new FileReader("sample.txt");
            int ch;
            System.out.print("File content: ");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
            System.out.println("\n");
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        // ===============================
        // 24. Threads
        // ===============================
        System.out.println("=== Threads ===");
        MyThread t1 = new MyThread();
        t1.start();
        try { t1.join(); } catch (InterruptedException e) {}
        System.out.println();

        // ===============================
        // 25. Java 8 Features (Lambda & Streams)
        // ===============================
        System.out.println("=== Java 8 Features ===");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(num -> System.out.print(num + " "));
        System.out.println();
        int evenSum = numbers.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of even numbers: " + evenSum);

        System.out.println("\n=== End of Java Tutorial ===");
    }

    // ===============================
    // Method examples
    // ===============================
    static void sayHello(String user) {
        System.out.println("Hello, " + user + "!");
    }

    static int addNumbers(int a, int b) {
        return a + b;
    }

    // ===============================
    // Supporting Inner Classes
    // ===============================

    static class Car {
        String brand;
        String model;

        Car(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        void drive() {
            System.out.println("Driving a " + brand + " " + model);
        }
    }

    static class ElectricCar extends Car {
        int batteryCapacity;

        ElectricCar(String brand, String model, int batteryCapacity) {
            super(brand, model);
            this.batteryCapacity = batteryCapacity;
        }

        @Override
        void drive() {
            System.out.println("Driving electric " + brand + " " + model + " (" + batteryCapacity + " kWh)");
        }

        void charge() {
            System.out.println("Charging the " + brand + " " + model + "...");
        }
    }

    static class Account {
        private double balance;
        public void setBalance(double balance) { this.balance = balance; }
        public double getBalance() { return balance; }
    }

    static abstract class Shape {
        abstract double area();
    }

    static class Circle extends Shape {
        double radius;
        Circle(double radius) { this.radius = radius; }
        double area() { return Math.PI * radius * radius; }
    }

    static class MyThread extends Thread {
        public void run() {
            System.out.println("Thread is running: " + Thread.currentThread().getName());
        }
    }
}
