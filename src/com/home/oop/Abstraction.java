package com.home.oop;
/*
Abstraction in Java is the process of hiding the implementation details and only showing the essential functionality or features to the user. 
This helps simplify the system by focusing on what an object does rather than how it does it. 
The unnecessary details or complexities are not displayed to the user.
✔ Achieved using Abstract Classes and Interfaces.

✔ Hides Complexity – The user doesn’t need to know the internal details.
✔ Increases Security – Prevents direct access to implementation logic.
✔ Enhances Maintainability – Changing internal implementation doesn’t affect users.
✔ Promotes Reusability – Common functionalities can be shared across multiple classes.

An abstract class may or may not have all abstract methods. Some of them can be concrete methods
A abstract method must always be redefined in the subclass, thus making overriding compulsory or making the subclass itself abstract.
Any class that contains one or more abstract methods must also be declared with an abstract keyword.
There can be no object of an abstract class. That is, an abstract class can not be directly instantiated with the new operator.
An abstract class can have parameterized constructors and the default constructor is always present in an abstract class.

✔ An abstract class cannot be instantiated.
✔ It can have both abstract and concrete methods.
✔ A subclass must override all abstract methods, or it becomes abstract itself.
✔ An abstract class can have constructors, static methods, and final methods.
 */
/*
Encapsulation																		Abstraction

Encapsulation is data hiding(information hiding)									Abstraction is detailed hiding(implementation hiding).
Encapsulation groups together data and methods that act upon the data				Data Abstraction deals with exposing the interface to the user and hiding the details of implementation
Encapsulated classes are Java classes that follow data hiding and abstraction		Implementation of abstraction is done using abstract classes and interface
Encapsulation is a procedure that takes place at the implementation level			Abstraction is a design-level process
 */


//✔ Abstract classes can have constructors.
//✔ Objects cannot be created directly from an abstract class.
//✔ When a subclass object is created, the abstract class constructor runs first.
//✔ Common properties are initialized in the abstract class to avoid code duplication.
//✔ super() is used in the subclass constructor to call the abstract class constructor.
public class Abstraction {

	public static void main(String[] args) {
		
//		An abstract class cannot be instantiated in Java because it may contain abstract methods (methods without implementation). 
//		Since an abstract class does not provide a complete definition of its functionality, creating an object from it directly would be meaningless.
		
		
		// TODO Auto-generated method stub
//		✅ start() is abstract, forcing subclasses to implement it.
//		✅ stop() is concrete, so subclasses inherit its behavior.
		 Vehicle myCar = new Car(); // ✅ Creating object of concrete class
	     myCar.start();  // Output: Car is starting with a key...
	     myCar.stop();   // Output: Vehicle is stopping...
	     Dog myDog = new Dog("Buddy");
	     myDog.makeSound(); // Output: Buddy barks!
	     myDog.sleep();     // Output: Buddy is sleeping...
	     Employee emp = new Developer("Alice", 70000);
	     emp.work();  // Output: Alice is coding...
	     emp.showDetails(); // Output: Employee: Alice, Salary: $70000
	     
	     Calculator calc = new MyCalculator();
	     System.out.println(calc.add(5, 10));   // Output: 15
	     System.out.println(calc.add(5, 10, 15)); // Output: 30
	     
	     Game g = new Football();
	     g.play();
	     g.rules();
	     g.players();
	     
	     Utility.printMessage(); // ✅ Output: This is a static method in an abstract class.
	     
	     Reveal obj = new Reveal();
	     obj.reveal(); // Output: This is a private method.
	}
}
//Creating an Abstract Class
//Declared using the abstract keyword.
//Cannot be instantiated directly.
//Can have abstract (unimplemented) methods and concrete (implemented) methods.

//Abstract class
abstract class Vehicle {
	Vehicle(){
		System.out.println("This is Constructor");
	}
	 abstract void start(); // Abstract method (No implementation)

	 void stop() { // Concrete method (Has implementation)
	     System.out.println("Vehicle is stopping...");
	 }
}

//Concrete class implementing the abstract class
class Car extends Vehicle {
	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Car is starting with a key...");
	}
}

abstract class Animal {
    String name;
    Animal(){
		System.out.println("This is Constructor");
	}

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();

    void sleep() {
        System.out.println(name + " is sleeping...");
    }
}

class Dog extends Animal {

	Dog(String name) {
		super(name);
	}

	@Override
	void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Barking....");
	}
    
}


//✔ Abstract classes can have fields (variables).
//✔ Concrete methods can access abstract class fields.
abstract class Employee {
    protected String name;
    protected double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Abstract Method
    abstract void work();

    // Concrete Method
    void showDetails() {
        System.out.println("Employee: " + name + ", Salary: $" + salary);
    }
}

// Concrete Class
class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    void work() {
        System.out.println(name + " is coding...");
    }
}

//Same as Method Overriding we can do Method Overloading in Abstract Class
abstract class Calculator {
    abstract int add(int a, int b);
    abstract int add(int a, int b, int c);
}

class MyCalculator extends Calculator {

	@Override
	int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	int add(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a+b+c;
	}    
}

//✔ Final methods in abstract classes cannot be overridden.
abstract class Game {
    abstract void play();

    void players() {
        System.out.println("These are the game players.");
    }
    final void rules() { // Cannot be overridden since its final
        System.out.println("These are the game rules.");
    }
}

class Football extends Game {
    void play() {
        System.out.println("Playing Football.");
    }
    void players() {
    	super.players();
        System.out.println("These are the Football players.");
    }
}

//✔ Static methods can be called directly without creating an object.
abstract class Utility {
    static void printMessage() {
        System.out.println("This is a static method in an abstract class.");
    }
}


abstract class Secret {
    private void secretMessage() {
        System.out.println("This is a private method.");
    }

    void reveal() {  // Public method calling private method
        secretMessage();
    }
}

class Reveal extends Secret {}

//Feature				Normal Class																	Abstract Class
//Object Creation		✅ Can be instantiated (object can be created).							❌ Cannot be instantiated (object cannot be created directly).
//Abstract Methods		❌ Cannot have abstract methods (methods without body).					✅ Can have abstract methods (must be implemented by subclasses).
//Concrete Methods		✅ Can have fully implemented methods.									✅ Can have both abstract and fully implemented methods.
//Constructors			✅ Can have constructors to initialize fields.							✅ Can have constructors, but objects can only be created through subclasses.
//Instance Variables	✅ Can have variables (instance and static).								✅ Can have variables (instance and static), but cannot have final abstract variables.
//Static Methods		✅ Can have static methods.												✅ Can have static methods, but static methods cannot be abstract.
//Final Methods			✅ Can have final methods.												✅ Can have final methods (cannot be overridden in subclasses).
//Access Modifiers		✅ Public, private, protected, default									✅ Public, private, protected, default (same as normal classes)
//Implementation		✅ Can provide complete functionality.									✅ Provides partial implementation and acts as a blueprint for subclasses.
//Usage					✅ Used when complete functionality is defined inside the class.			✅ Used when common features need to be shared, but some methods must be implemented differently by subclasses.