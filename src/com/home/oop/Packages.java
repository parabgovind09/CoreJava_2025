package com.home.oop;
import java.util.Vector;

public class Packages {
/*
Packages in Java are a mechanism that encapsulates a group of classes, sub-packages, and interfaces. Packages are used for:

Prevent naming conflicts by allowing classes with the same name to exist in different packages, like college.staff.cse.Employee and college.staff.ee.Employee.
They make it easier to organize, locate, and use classes, interfaces, and other components.
Packages also provide controlled access for Protected members that are accessible within the same package and by subclasses.
Also for default members (no access specifier) that are accessible only within the same package.
By grouping related classes into packages, Java promotes data encapsulation, making code reusable and easier to manage. 
Simply import the desired class from a package to use it in your program.
 */
/*
Directory Structure: Package names and directory structures are closely related. 
For example, if a package name is college.staff.cse, then three directories are, college, staff, and cse, where cse is inside staff, and staff is inside the college.
Naming Conventions: Package names are written in reverse order of domain names,
 */
/*
In Java, we can import classes from a package using either of the following methods:
1. Import a specific class:
import java.util.Vector; 
This imports only the Vector class from the java.util package.
2. Import all classes from a package:
import java.util.*; 
This imports all classes and interfaces from the java.util package but does not include sub-packages.
 */
/*
Using import package.*; imports all classes in a package, but not classes from its sub-packages.
When two packages have classes with the same name (e.g., java.util.Date and my.package.Date), use the fully qualified name to avoid conflicts:
 */
/*
Types of Java Packages
Built-in Packages
User-defined Packages == These are the one which we create
1. Built-in Packages
These packages consist of a large number of classes which are a part of Java API.Some of the commonly used built-in packages are:

java.lang: Contains language support classes(e.g classes which defines primitive data types, math operations). This package is automatically imported.
java.io: Contains classes for supporting input / output operations.
java.util: Contains utility classes which implement data structures like Linked List, Dictionary and support ; for Date / Time operations.
java.net: Contain classes for supporting networking operations.
 */
/*
Static Import In Java
Static Import in Java is about simplifying access to static members and separates it from the broader discussion of user-defined packages.
Static import is a feature introduced in Java programming language (versions 5 and above) that allows members (fields and methods) defined in a class as public static to be used in Java code without specifying the class in which the field is defined.
 */
/*
Access Modifiers in the Context of Packages
Public: Members with the public modifier are accessible from anywhere, regardless of whether the accessing class is in the same package or not.
Protected: Memebers with the protected modifier are accessible within the same package, In subclasses
Default: Members with no modifier are accessible only within the same package
Private: Members with the private modifier are accessible only within the same class. They cannot be accessed by classes in the same package, subclasses, or different packages.
Important points:

Every class is part of some package.
If no package is specified, the classes in the file goes into a special unnamed package (the same unnamed package for all files).
All classes/interfaces in a file are part of the same package. Multiple files can specify the same package name.
If package name is specified, the file must be in a subdirectory called name (i.e., the directory name must match the package name).
We can access public classes in another (named) package using: package-name.class-name
 */
	
	public static void main(String[] args) {
		// java.util.Vector is imported, hence we are able to access it directly in our code.
		Vector v = new Vector(5);
		// java.util.ArrayList is not imported, hence we are referring to it using the complete package name.
		java.util.ArrayList<String> s = new java.util.ArrayList<String>();
	}

}
