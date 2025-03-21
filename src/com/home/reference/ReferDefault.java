package com.home.reference;

import com.home.oop.AccessSpecifiers;

public class ReferDefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//✔ Protected members are inherited by subclasses outside the package.
		Child obj = new Child();
        obj.accessProtected(); // ✅ Works through inheritance
	}

}
//✔ Protected members are inherited by subclasses outside the package.
class Child extends AccessSpecifiers {
    void accessProtected() {
    	greet();  // ✅ Works in subclass (even outside the package)
        System.out.println("Value from Parent: " + number);
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.accessProtected(); // ✅ Works through inheritance
    }
}