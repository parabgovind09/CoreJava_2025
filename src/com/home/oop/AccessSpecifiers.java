package com.home.oop;
/*
Access specifiers control where a class, method, or variable can be accessed. Java has four access specifiers:

Specifier	Class	Same Package	Different Package (Subclass)	Different Package (Non-Subclass)
private		✅ Yes	❌ No			❌ No							❌ No
default		✅ Yes	✅ Yes			❌ No							❌ No
protected	✅ Yes	✅ Yes			✅ Yes							❌ No
public		✅ Yes	✅ Yes			✅ Yes							✅ Yes
 */
public class AccessSpecifiers {

    protected int number = 50; // Protected variable
    
    protected void greet() {  // Protected method
        System.out.println("Hello from Protected Parent!");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
        // System.out.println(obj.data);  // ❌ ERROR: data has private access
        // obj.display();                 // ❌ ERROR: display() has private access
        obj.accessPrivate(); // ✅ Allowed via a public method
        
        Outer outer = new Outer();
//      ✔ Private inner class can be accessed only inside the outer class.
//      ❌ Cannot be accessed directly from outside.
        outer.accessInner(); // ✅ Works
        // Outer.Inner obj = outer.new Inner(); // ❌ ERROR: Inner class is private
        
//      ✔ Private static inner class can be accessed inside the outer class.
//      ❌ Cannot be accessed outside the outer class.
        // Outer1.Inner obj = new Outer1.Inner(); // ❌ ERROR: Inner class is private
        // obj.display();
        Outer1 outer1 = new Outer1();
        outer1.accessInner(); // ✅ Works
        
//      ✔ Singleton ensures only one object is created.
//      ❌ Direct instantiation is not allowed.
        // Singleton obj = new Singleton(); // ❌ ERROR: Constructor is private
        Singleton obj1 = Singleton.getInstance(); // ✅ Works
        System.out.println(System.identityHashCode(obj1));
        // after above line executes the instance is no more null
        Singleton obj2 = Singleton.getInstance(); // Returns the same instance
        System.out.println(System.identityHashCode(obj2));
        
        //default
        A1 obj3 = new A1();
        obj3.display();  // ✅ Works within the same class
        
        //protected
        A2 obj4 = new A2();
        obj4.show();  // ✅ Works inside the same class
	}
}

//private Access Specifier
//Accessible only within the same class.
//Not accessible in subclasses, same package, or different packages.

//✔ Private members are accessible only inside the same class.
//✔ We use a public method (accessPrivate()) to access private members.
class A {
    private int data = 100; // Private variable

    private void display() { // Private method
        System.out.println("Data: " + data);
    }

    void accessPrivate() {
        display(); // ✅ Private method can be accessed within the class
        System.out.println(data);// ✅ Private variable can be accessed within the class
    }
}
// Private and Protected Top-Level Class (Not Allowed)
// Public Default Abstract and Final Top-Level Class (Allowed)

//Private Inner Class (Allowed)
class Outer {
    private class Inner {  // ✅ Private inner class
        void display() {
            System.out.println("Hello from the private inner class!");
        }
    }

    void accessInner() {
        Inner obj = new Inner(); // ✅ Allowed inside Outer class
        obj.display();
    }
}

// Private Static Inner Class (Allowed)
class Outer1 {
    private static class Inner {  // ✅ Private static inner class
        static void display() {
            System.out.println("Hello from private static inner class!");
        }
    }

    void accessInner() {
        Inner.display(); // ✅ Allowed inside Outer class
    }
}

//Private Constructor to Restrict Object Creation
//Even though a class cannot be private, you can prevent object creation using a private constructor.
class Singleton {
    private static Singleton instance; // Static instance

    private Singleton() { // ✅ Private constructor prevents instantiation
        System.out.println("Singleton instance created!");
    }

    public static Singleton getInstance() { // Public method to access the instance
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

//Default Access Specifier in Java (Package-Private)
//Java does not have a keyword for "default" access, but if no access specifier is provided, it is considered "default" (also called "package-private").
//Default members are accessible: ✅ Inside the same class
//✅ Inside the same package (any class)
//❌ Not accessible outside the package, even in a subclass

//visit AccessSpecifiersReference class
//All classes within the same package can access default members.
class A1 {
    int data = 10;  // Default access (No modifier)
    
    void display() {  // Default method
        System.out.println("Data: " + data);
        System.out.println("From class AccessSpecifiers");
    }
}

//A class without public is "default" and cannot be accessed outside its package.
//Default Method in Subclass (Same Package ✅)
//A subclass can access default methods if it's in the same package.
//✔ Subclass in the same package can access default members.
class Parent {  // Default class
    void greet() {  // Default method
        System.out.println("Hello from Parent!");
    }
}
class Child extends Parent {
    void callParentMethod() {
        greet(); // ✅ Works because Child is in the same package
    }
}
//✔ Default members are NOT inherited in subclasses from other packages.
//✔ Use protected instead if you want inheritance across packages.
//A constructor with default access can be accessed within the same package.

//Protected Access Specifier in Java
//The protected access modifier in Java provides more visibility than default but less than public.
//
//✔ Protected members are accessible:
//✅ Inside the same class
//✅ Inside the same package (just like default)
//✅ In a subclass (even if the subclass is in a different package)
//❌ Not accessible outside the package if there's no inheritance

//✔ Protected members can be accessed inside the same package (just like default).
class A2 {
    protected int data = 100; // Protected variable

    protected void show() { // Protected method
        System.out.println("Protected Data: " + data);
    }

    void accessInsideClass() {
        show();  // ✅ Works inside the same class
    }
}

class Parent1 {
    protected int number = 50; // Protected variable
    
    protected void greet() {  // Protected method
        System.out.println("Hello from Parent!");
    }
}

//Protected Variable and Method in Subclass (Different Package ✅)
//✔ Protected members can be accessed in a subclass outside the package using extends.
//✔ Protected members are inherited by subclasses outside the package.
//❌ Protected members are NOT accessible in a non-subclass outside the package.
//✔ Useful for inheritance while keeping controlled access.
//✔ Cannot be used for top-level classes (only for members and inner classes).

//Scenario							Accessible in Same Class?					Accessible in Same Package?	Accessible in Different Package (Subclass)?	Accessible in Different Package (Non-Subclass)?
//Protected Variable				✅ Yes										✅ Yes						✅ Yes										❌ No
//Protected Method					✅ Yes										✅ Yes						✅ Yes										❌ No
//Protected Class					❌ No (Only inner classes can be protected)	❌ No						❌ No										❌ No
//Protected Constructor				✅ Yes										✅ Yes						✅ Yes										❌ No
//Protected Static Variable/Method	✅ Yes										✅ Yes						✅ Yes										❌ No


//Public Access Specifier in Java
//The public access specifier provides the highest level of visibility.
//
//✔ Public members are accessible:
//✅ Inside the same class
//✅ Inside the same package
//✅ In a subclass (even if it's in a different package)
//✅ Outside the package (even in a non-subclass)
//
//❌ Public cannot be used with local variables inside methods.

//✔ Local variables are already limited to the method scope, so access modifiers like public, private, protected, and default do not apply.
//✔ Java does not allow access specifiers on local variables inside methods.