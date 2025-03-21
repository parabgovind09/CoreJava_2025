package com.home.oop;
/*
The word Polymorphism is derived from the Greek words:

The word Polymorphism is derived from the Greek words "poly" (many) and "morph" (forms), meaning "many forms." 
In Java, polymorphism allows us to perform a single action in multiple ways.
Polymorphism in Java means the same method behaves differently based on the object that calls it.

✅ Key Advantages of Polymorphism:
✔ Allows code reusability and flexibility.
✔ Enables method overloading (compile-time polymorphism).
✔ Enables method overriding (runtime polymorphism).
✔ Helps achieve loose coupling (decoupling method calls from specific implementations).

Polymorphism is divided into two types in Java:

Compile-time Polymorphism (static polymorphism) (Method Overloading) --> Resolved at compile time.
Compile-time polymorphism is determined at compile time. 
This is achieved using method overloading, where multiple methods share the same name but have different method signatures.
✔ The compiler determines which method to call based on the arguments provided.


Runtime Polymorphism (dynamic polymorphism) (Method Overriding) --> Resolved at runtime using dynamic method dispatch.
Run-time polymorphism is determined at runtime, and it is achieved using method overriding.
Method overriding occurs when a subclass provides a specific implementation of a method that is already defined in its superclass.
Dynamic Method Dispatch: The method that gets called is determined at runtime based on the object type.
 */
public class Polymorphism {

	public static void main(String[] args) {
		MathOperations obj = new MathOperations();
        System.out.println("Sum of 10 and 20: " + obj.add(10, 20));
        System.out.println("Sum of 10, 20 and 30: " + obj.add(10, 20, 30));
        
//      Note:- pass arguments with the extension of data types for example to pass long->3l, int->3,float->3.0f, double->3.0d
        System.out.println("Sum of 5.5 and 6.5: " + MathOperations.operation(5.5d, 6.5d)); 
        System.out.println("Sum of 5.5 and 6.5: " + MathOperations.operation(5.5d, 6.5f));
        
//      Java performs automatic type promotion when no exact match is found.
        TypePromotionExample obj1 = new TypePromotionExample();
        obj1.show(10);
        obj1.show(10.5);
        
        
        Dog_1 myDog = new Dog_1();
        myDog.makeSound();
        
//      Dynamic Method Dispatch (also known as Runtime Polymorphism) is a mechanism in Java where a method call to an overridden method is resolved at runtime, instead of at compile-time.
//      It is achieved through method overriding and upcasting (parent class reference pointing to a child class object).
        
//      A parent class reference is used to store a child class object (A obj = new B();).
//      If the method is overridden in the child class, the child class version of the method gets executed at runtime.
//      The method call is resolved dynamically at runtime based on the actual object type (B), not the reference type (A).
        
//      Compile-time: The compiler only checks if the method exists in the parent class (A).
//      Runtime: The JVM determines which method to execute based on the actual object type (B or C).
//      Even though obj is of type A, the method call is dynamically dispatched to the correct version (B or C) at runtime.
        
        
        
        Animal_2 myAnimal;  // Reference of superclass
        myAnimal = new Dog_2();
        myAnimal.makeSound();  // ✅ Output: Dog barks: Woof woof!
        myAnimal = new Cat_2();
        myAnimal.makeSound();  // ✅ Output: Cat meows: Meow meow!
        
        Child_5 c = new Child_5();
        System.out.println(c.getValue());
        
	    //Using instanceof to Check Object Type
	    //Since method calls depend on runtime object type, we can check it using instanceof.
	    if (myAnimal instanceof Cat_2) {
	    	System.out.println("myAnimal is a Cat");
	     }
	     //✅ Output: myAnimal is a Dog
	}

}
/*
1️⃣ Compile-Time Polymorphism (Method Overloading)
Method Overloading is a feature in java in which a class has more than one method of the same name and their parameters are different(either in numbers or in data types)
✅ Method Overloading allows multiple methods in the same class with the same name but different parameters (method signature).

📌 Rules for Method Overloading
✔ The method name must be the same.
✔ The parameters must be different (either in number, type or in order).
✔ The return type does not matter in method overloading.
✅ Methods can differ in number, type, or order of parameters.

we can overload main method in java
we can overload static method in java
we can overload constructors in java

We cannot overload two methods in Java if they differ only by static keyword (the number of parameters and types of parameters are the same).

Note -> Java doesn’t support the Operator Overloading
 */
class MathOperations {
    // Method with two int parameters
    int add(int a, int b) {
        return a + b;
    }
    // Overloaded method with three int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }
    // Overloaded method with double parameters
    static double operation(double a, double b) {
        return a + b;
    }
    // Overloaded method with double parameters
    static double operation(double a, float b) {
        return a * b;
    }
}

class TypePromotionExample {
    void show(int a) {
        System.out.println("int: " + a);
    }
    void show(double a) {
        System.out.println("double: " + a);
    }
}

// Runtime Polymorphism (Method Overriding)
//Overriding in Java occurs when a subclass implements a method which is already defined in the superclass or Base Class. 
//The method in the subclass must have the same signature as in the superclass. It allows the subclass to modify the inherited methods.
//final and static methods cannot be overriden
// constructors cannot be overriden
//use super keyword to call parent class methods when required
// private methods cannot be overriden
//Rules
//✅ The method in the subclass must have the same method signature as in the superclass.
//✅ The return type must be the same (or a subtype – covariant return type).
//✅ The overridden method cannot have a more restrictive access modifier than the superclass method.
//✅ The method must be inherited from a superclass (it cannot override methods from interfaces unless implemented).

//in such cases method of the base class gets hidden by the method of the derieved class.
//we can apply super keyword for such situatiion to call the member of base class from derieved class.
class Animal_1 {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog_1 extends Animal_1 {
    @Override
    void makeSound() {
//    	If the subclass method needs to call the parent class’s version of the method, we use super.
        //super.makeSound();  // Calls superclass method
        System.out.println("Dog barks: Woof woof!");
    }
}


//✔ The method call is determined at runtime, based on the actual object type (Dog or Cat).
//✔ @Override annotation ensures correct method overriding.
class Animal_2 {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog_2 extends Animal_2 {
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof woof!");
    }
}

class Cat_2 extends Animal_2 {
    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow meow!");
    }
}

//Covariant Return Type in Method Overriding
//A subclass can change the return type of an overridden method, but only if the return type is a subtype of the original.
class Parent_5 {
    Number getValue() {
        return 10;
    }
}
//✔ Integer is a subclass of Number, so it's allowed.
class Child_5 extends Parent_5 {
    @Override
    Integer getValue() {  // ✅ Covariant return type (Integer is a subtype of Number)
        return 20;
    }
}

