package com.home.oop;

public class AccessSpecifiersReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//default
//		✔ Accessible inside the same package.
//		✔ No import is required for default members within the same package.
		A1 obj = new A1();
		System.out.println("Calling in AccessSpecifiersReference class ");
		System.out.println(+obj.data);
		obj.display();
		
		//protected
		A2 obj2 = new A2();
        obj2.show();  // ✅ Works inside the same package
        
        Child1 obj3 = new Child1();
        obj3.accessParentMethod();  // ✅ Works inside the same package
	}

}
class Child1 extends Parent1 {
    void accessParentMethod() {
        greet();  // ✅ Works in the same package
        System.out.println("Number: " + number);
    }
}