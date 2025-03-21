package com.home.oop;
/*
An Interface in Java programming language is defined as an abstract type used to specify the behaviour of a class. An interface in Java is a blueprint of a behaviour. A Java interface contains static constants and abstract methods.

The interface in Java is a mechanism to achieve abstraction.
By default, variables in an interface are public, static, and final.
It is used to achieve abstraction and multiple inheritances in Java.
It is also used to achieve loose coupling.
In other words, interfaces primarily define methods that other classes must implement.

To declare an interface, use the interface keyword. It is used to provide total abstraction. 
That means all the methods in an interface are declared with an empty body and are public and all fields are public, static, and final by default. 
A class that implements an interface must implement all the methods declared in the interface. 
To implement the interface, use the implements keyword.

Class																			Interface

In class, you can instantiate variables and create an object.					In an interface, you must initialize variables as they are final but you can’t create an object.                       
A class can contain concrete (with implementation) methods						The interface cannot contain concrete (with implementation) methods.
The access specifiers used with classes are private, protected, and public.		In Interface only one specifier is used- Public.

Unlike class inheritance, where a class can only extend one class, a class can implement multiple interfaces.


New Features Added in Interfaces in JDK 8
There are certain features added to Interfaces in JDK 8 update mentioned below:
1. Default Methods
Interfaces can define methods with default implementations.
Useful for adding new methods to interfaces without breaking existing implementations.

2. Static Methods
Interfaces can now include static methods.
These methods are called directly using the interface name and are not inherited by implementing classes.
Another feature that was added in JDK 8 is that we can now define static methods in interfaces that can be called independently without an object. 
These methods are not inherited.


Extending Interfaces
One interface can inherit another by the use of keyword extends.
When a class implements an interface that inherits another interface, it must provide an implementation for all methods required by the interface inheritance chain.


We can’t create an instance (interface can’t be instantiated) of the interface but we can make the reference of it that refers to the Object of its implementing class.
A class can implement more than one interface.
An interface can extend to another interface or interface (more than one interface).
A class that implements the interface must implement all the methods in the interface.
All the methods are public and abstract. All the fields are public, static, and final.
It is used to achieve multiple inheritances.
It is used to achieve loose coupling.
Inside the Interface not possible to declare instance variables because by default variables are public static final.
Inside the Interface, constructors are not allowed.
Inside the interface main method is not allowed.
 */

//A static method belongs to the interface and cannot be overridden.
interface MathUtils {
    static int square(int x) {
        return x * x;
    }
}
interface Details {
	public void printName();
}
public class Interface implements Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface obj = new Interface();
		obj.printName();
		MultiOperation obj1 = new MultiOperation();
		obj1.add(10,5);
		obj1.sub(10,5);
		obj1.mul(10,5);
		Car1 myCar = new Car1();
        myCar.start();  // ✅ Output: Car started with max speed: 120
//        ✔ speed() has a default implementation, so Car1 does not need to override it.
        myCar.speed();
        System.out.println(MathUtils.square(5));
        
//      In a Simple way, the interface contains multiple abstract methods, so write the implementation in implementation classes. 
//      If the implementation is unable to provide an implementation of all abstract methods, then declare the implementation class with an abstract modifier, and complete the remaining method implementation in the next created child classes. 
//      It is possible to declare multiple child classes but at final we have completed the implementation of all abstract methods.
        Second s = new Second();
        s.method1();
        s.method2();
        s.method3();
        s.method5();
        
        C c = new C();
        c.show();  // ✅ Output: Class C: Resolving show() conflict!
	}

	@Override
	public void printName() {
		// TODO Auto-generated method stub
		System.out.println("Govind Parab");
	}

}
//Multiple Inheritance in Java Using Interface
//Multiple Inheritance is an OOPs concept that can’t be implemented in Java using classes. But we can use multiple inheritances in Java using Interface.
interface addition{
	public void add(int a, int b);
}
interface subtraction{
	public void sub(int a, int b);
}
interface multiplication{
	public void mul(int a, int b);
}
class MultiOperation implements addition, subtraction, multiplication{

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a*b);
	}
}

//All variables declared in an interface are public static final by default.
interface Vehicle1 {
    int MAX_SPEED = 120;  // Automatically public, static, final
    void start();
//    A default method allows adding new methods to an interface without breaking existing code.
    default void speed() {
    	System.out.println("Zero");
    }
}

class Car1 implements Vehicle1 {
    public void start() {
        System.out.println("Car started with max speed: " + MAX_SPEED);
    }
}

interface A3 {
    void method1();
    void method2();
}

// B now includes method1 and method2
interface B extends A3 {
    void method3();
    
    //can't acceessed directly need public method to call
    private void method4() {
    	System.out.println("Method 4");
    }
    
    //calling private
    default void method5() {
    	method4();
    }
}
// the class must implement all method of A and B.
abstract class First implements B {
	
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Method 2");
	}
	
	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("Method 3");
    }
}
class Second extends First{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Method 1");
	}
}

//Java does not support multiple inheritance with classes to avoid ambiguity.
//But interfaces can have default methods (from Java 8), so if two interfaces provide the same default method, Java forces the implementing class to explicitly override it.
//This ensures clarity and avoids conflicts in method resolution.

interface A4 {
    default void show() {
        System.out.println("Interface A: show()");
    }
}

interface B4 {
    default void show() {
        System.out.println("Interface B: show()");
    }
}

// Class implementing both interfaces
class C implements A4, B4 {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		A4.super.show();
	}
    // Or Must override show() to resolve conflict	
}

