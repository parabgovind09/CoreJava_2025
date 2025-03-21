package com.home.oop;
/*
Java, Inheritance is an important pillar of OOP(Object-Oriented Programming). 
It is the mechanism in Java by which one class is allowed to inherit the features(fields and methods) of another class. 
In Java, Inheritance means creating new classes based on existing ones. 
A class that inherits from another class can reuse the methods and fields of that class. 
In addition, you can add new fields and methods to your current class as well.

Inheritance is one of the fundamental Object-Oriented Programming (OOP) concepts in Java. 
It allows a child class (subclass) to inherit properties and behaviors from a parent class (superclass). 
This enables code reusability, hierarchical classification, and method overriding.

🔹 What is Inheritance?
Inheritance allows one class to acquire properties and behaviors of another class.
It eliminates code duplication and promotes reusability.

🔹 Key Benefits:
✅ Code Reusability – Avoid rewriting the same code multiple times.
✅ Improved Maintainability – Changes in the base class reflect in subclasses.
✅ Extensibility – New features can be added easily.
✅ Supports Polymorphism – Enables method overriding for dynamic method dispatch.

Why Java Doesn't Support Multiple Inheritance with Classes?
🔹 Problem: Diamond Problem
If a class inherits from multiple classes, ambiguity arises if both parents have a method with the same name.
 */
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grass g = new Grass();
		g.name();
		g.setAttack(50);
		g.setDefence(40);
		System.out.println(g.toString());
		
		Water w = new Water();
		w.setAttack(55);
		System.out.println(w.toString());
		
		Fire f = new Fire();
		System.out.println(f.toString());
		
		 Three obj = new Three();
	     obj.show();
	     obj.display();
	     
	     
	     DZ obj1 = new DZ();
	     obj1.methodAZ();
	     obj1.methodBZ();
	     obj1.methodCZ();
	     obj1.printMessage();
	}

}
//types of inheritance
//single level inheritance
class Pokemon{
	int attack;
	int defence;
	String type;
	Pokemon(String type,int attack, int defence){
		this.attack = attack;
		this.defence = defence;
		this.type = type;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefence() {
		return defence;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Pokemon [attack=" + attack + ", defence=" + defence + ", type=" + type + "]";
	}
	
}
class Grass extends Pokemon{

	Grass() {
		super("Grass", 80, 70);
	}
	Grass(String type,int attack,int defence) {
		super(type,attack,defence);
		System.out.println("Grass Constructor");
	}
	void name() {
		System.out.println("Name = Oddish Type = "+super.getType());
	}
}

//Multilevel Inheritance
//A derived class acts as a base class for another class.
class Water extends Grass{
	Water(){
		super("water-grass",60,50);
	}
	void name() {
		System.out.println("Lottat");
	}
}

//Hierarchical Inheritance
//Multiple child classes inherit from a single parent class.
class Fire extends Pokemon{
	Fire(){
		super("Fire",90,85);
	}
	void name() {
		System.out.println("Magma");
	}
}

//Multiple inheritance through interface
//In Multiple inheritances, one class can have more than one superclass and inherit features from all parent classes. 
//Please note that Java does not support multiple inheritances with classes. 
//In Java, we can achieve multiple inheritances only through Interfaces.
//Java does not allow multiple inheritance with classes to avoid ambiguity problems.
//🔹 This issue is called the Diamond Problem.
//Interface 1
interface One {
 void show();
}

//Interface 2
interface Two {
 void display();
}

//Class implementing both interfaces
//What If Both Interfaces Have the Same Method?
//✅ The implementing class must override the method.
//Multiple Inheritance with Default Methods in Interfaces
//Java 8 introduced default methods in interfaces.
//🔹 If two interfaces have the same default method, the implementing class must override it.
//✅ If multiple interfaces have the same method, the implementing class must override it.
class Three implements One, Two {
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Class C implementing display()");
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Class C implementing show()");
	}
}

//Hybrid Inheritance in Java
//Hybrid Inheritance is a combination of Hierarchical and Multiple Inheritance.
//Java does not support Hybrid Inheritance directly due to Multiple Inheritance issues.
//✅ Solution: Use Interfaces
//Hybrid Inheritance is a combination of multiple types of inheritance in a single program. 
//Since Java does not support multiple inheritance with classes, we achieve Hybrid Inheritance using interfaces.
//Parent interface AZ
interface AZ {
	 void methodAZ();
	 default void printMessage() {
		 System.out.println("AZ");
	 }
}

//Parent interface BZ
interface BZ {
	 void methodBZ();
	 default void printMessage() {
		 System.out.println("BZ");
	}
}
//Parent class CZ
class CZ {
	 void methodCZ() {
	     System.out.println("Inside methodCZ() of class CZ");
	 }
}

//Class D implementing both A and B
class DZ extends CZ implements AZ, BZ {
	 public void methodAZ() {
	     System.out.println("Inside methodAZ() of interface AZ");
	 }
	
	 public void methodBZ() {
	     System.out.println("Inside methodBZ() of interface BZ");
	 }

	@Override
	public void printMessage() {
		// TODO Auto-generated method stub
		AZ.super.printMessage();
	}
}