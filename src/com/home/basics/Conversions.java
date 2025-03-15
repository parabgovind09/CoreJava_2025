package com.home.basics;

import java.util.ArrayList;
import java.util.List;

public class Conversions{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		In Java, type casting is a method or process that converts a data type into another data type in both ways manually
		and automatically. The automatic conversion is done by the compiler and manual conversion performed by the programmer.
		 */
		/*
		Converting a lower data type into a higher one is called widening type casting.
		It is also known as implicit conversion or casting down. It is done automatically.
		It is safe because there is no chance to lose data. It takes place when:

		Both data types must be compatible with each other.

		The target type must be larger than the source type.

		byte -> short -> char -> int -> long -> float -> double  
		 */
		int x = 7;  
		//automatically converts the integer type into long type  
		long y = x;  
		//automatically converts the long type into float type  
		float z = y;  
		System.out.println("Before conversion, int value "+x);  
		System.out.println("After conversion, long value "+y);  
		System.out.println("After conversion, float value "+z);
        
		/*
		In Java, type casting is a method or process that converts a data type into another data type in both ways manually
		and automatically. The automatic conversion is done by the compiler and manual conversion performed by the programmer.
		 */
		/*
		Converting a higher data type into a lower one is called narrowing type casting.
		It is also known as explicit conversion or casting up. It is done manually by the programmer.
		If we do not perform casting then the compiler reports a compile-time error.

		double -> float -> long -> int -> char -> short -> byte  
		
		here data loss may happen
		 */
		double d = 166.6645455215623;  
		//converting double data type into long data type  
		long l = (long)d;  
		//converting long data type into int data type  
		int i = (int)d;  
		//converting long data type into float data type  
		float j = (float)d;  
		System.out.println("Before conversion: "+d);  
		//fractional part lost  
		System.out.println("After conversion into long type: "+l);  
		//fractional part lost  
		System.out.println("After conversion into int type: "+i);
		//some part of fractional part lost  
		System.out.println("After conversion into float type: "+j);
		
		/*
		 * In Java, when performing arithmetic operations, smaller data types (like byte, short, char) are automatically promoted to int. 
		 * This is a type of implicit conversion. 
		 * If the result is a floating-point operation (like division with a decimal), the result is promoted to float or double.
		 */
		byte a = 5;
        byte b = 10;
        // Both 'a' and 'b' are promoted to 'int' before the operation
        System.out.println("Result of a + b: " + a+b);

        char c1 = 'A'; // char to int promotion
        char c2 = 'B'; // char to int promotion
        int charResult = c1 + c2; // char to int promotion
        System.out.println("Result of c1 + c2: " + charResult);
        
        /*
         * Integer Division: When performing division between two integers (e.g., int / int), the result will be an integer (with any fractional part discarded).
		   Floating-Point Division: When one or both operands are of a floating-point type (float or double), the result will be promoted to float or double, respectively, depending on the type of the operand with the largest precision.
         */
        //In this case, the result of 5 / 2 is 2 because it's integer division and the fractional part (0.5) is discarded.
        int x1 = 5;
        int y1 = 2;
        System.out.println("Result of integer division: " + (x1 / y1));  // Output: 2
        
        int x11 = 5;
        int y11 = 2;
        System.out.println("Result of floating-point division: " + ((double) x11 / y11));  // Output: 2.5
        
        /*
         * Autoboxing is the automatic conversion of primitive types to their corresponding object wrapper classes.
         * Unboxing is the opposite process, where the object wrapper classes are converted back to primitive types.
         * Converting an int to an Integer is autoboxing
		 * Converting an Integer to an int is unboxing
         */
        int num = 10;
        Integer integerObj = num;  // autoboxing: int to Integer        
        System.out.println("Integer object: " + integerObj);
        
        Integer integerObj1 = 10;
        int num1 = integerObj1;  // unboxing: Integer to int
        System.out.println("Primitive int: " + num1);
        
        String str = "100";
        int num2 = Integer.parseInt(str);  // String to int
        double d2 = Double.parseDouble(str);  // String to double
        
        System.out.println("String to int: " + num2);
        System.out.println("String to double: " + d2);

        int number = 200;
        String numStr = String.valueOf(number);  // int to String
        System.out.println("int to String: " + numStr);
        
        // Creating an empty Arraylist of integer type
        ArrayList<Integer> al = new ArrayList<Integer>();
 
        // Adding the int primitives type values
        // Autoboxing
        al.add(1);
        al.add(2);
        al.add(24);
 
        System.out.println("ArrayList: " + al);
        //we have created a list of elements of the Integer type. 
        //We are adding int primitive type values instead of Integer Object and the code is successfully compiled. 
        //It does not generate a compile-time error as the Java compiler creates an Integer wrapper Object from primitive int i and adds it to the list. 
        
        //check for above statements
        // Creating an empty ArrayList of integer type
        List<Integer> list = new ArrayList<Integer>();
 
        // Adding the int primitives type values by
        //  converting them into Integer wrapper object
        for (int i1 = 0; i1 < 10; i1++) {
            System.out.println(
            list.add(Integer.valueOf(i1)));
        }
	}

}
