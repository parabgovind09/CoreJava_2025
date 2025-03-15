package com.home.basics;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Primitive Data Types
		
		//By default every integer value is considered as int and every fractional value is considered as double by default that's using L,F,.. or casting is recommended.
		
		//A language is considered statistically typed if the type of a variable is known at compile-time rather than at runtime. 
		//In Java, every variable must have a declared type, and this type is checked at compile-time.
		
		// byte: 1 byte, range: -128 to 127
        byte byteValue = 100;
        System.out.println("byte value: " + byteValue);
        System.out.println("byte size: " + Byte.SIZE + " bits");
        System.out.println("byte range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);

        // short: 2 bytes, range: -32,768 to 32,767
        short shortValue = 10000;
        System.out.println("\nshort value: " + shortValue);
        System.out.println("short size: " + Short.SIZE + " bits");
        System.out.println("short range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);

        // int: 4 bytes, range: -2^31 to 2^31-1
        int intValue = 100000;
        System.out.println("\nint value: " + intValue);
        System.out.println("int size: " + Integer.SIZE + " bits");
        System.out.println("int range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);

        // long: 8 bytes, range: -2^63 to 2^63-1
        long longValue = 1000000000L;
        System.out.println("\nlong value: " + longValue);
        System.out.println("long size: " + Long.SIZE + " bits");
        System.out.println("long range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        // float: 4 bytes, range: approximately ±3.40282347E+38F (6-7 decimal digits)
        float floatValue = 10.5f;
        System.out.println("\nfloat value: " + floatValue);
        System.out.println("float size: " + Float.SIZE + " bits");
        System.out.println("float range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);

        // double: 8 bytes, range: approximately ±1.7976931348623157E+308 (15 decimal digits)
        double doubleValue = 20.999999;
        System.out.println("\ndouble value: " + doubleValue);
        System.out.println("double size: " + Double.SIZE + " bits");
        System.out.println("double range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

        // char: 2 bytes, stores a single Unicode character
        char charValue = 'A';
        System.out.println("\nchar value: " + charValue);
        System.out.println("char size: " + Character.SIZE + " bits");
        System.out.println("char range: " + (int)Character.MIN_VALUE + " to " + (int)Character.MAX_VALUE);

        // boolean: 1 bit, stores true or false
        boolean booleanValue = true;
        System.out.println("\nboolean value: " + booleanValue);
        System.out.println("boolean size: 1 bit");
        
        //Non-Primitive Data Type
        //String
        //class
        //interface
        //array, etc...
    	String name = "Govind";
    	System.out.println("\n"+name.length());
	}

}
class PrimitiveDataTypesRange {
    public static void main(String[] args) {
        System.out.println("Smallest and Largest Values of Primitive Data Types in Java:");
        
        // byte
        System.out.println("byte: ");
        System.out.println("Minimum: " + (-128));
        System.out.println("Maximum: " + (127));
        System.out.println("Minimum: " + Byte.MIN_VALUE);
        System.out.println("Maximum: " + Byte.MAX_VALUE);

        // short
        System.out.println("short: ");
        System.out.println("Minimum: " + (-32768));
        System.out.println("Maximum: " + (32767));
        System.out.println("Minimum: " + Short.MIN_VALUE);
        System.out.println("Maximum: " + Short.MAX_VALUE);

        // int
        System.out.println("int: ");
        System.out.println("Minimum: " + (-2147483648));
        System.out.println("Maximum: " + (2147483647));
        System.out.println("Minimum: " + Integer.MIN_VALUE);
        System.out.println("Maximum: " + Integer.MAX_VALUE);

        // long
        System.out.println("long: ");
        System.out.println("Minimum: " + (-9223372036854775808L));
        System.out.println("Maximum: " + (9223372036854775807L));
        System.out.println("Minimum: " + Long.MIN_VALUE);
        System.out.println("Maximum: " + Long.MAX_VALUE);

        // Both float and double data types were designed especially for scientific calculations, where approximation errors are acceptable. 
        // If accuracy is the most prior concern then, it is recommended not to use these data types and use BigDecimal class instead. 
        // understand the float and double while studying BigDecimal
        // float
        System.out.println("float: ");
        System.out.println("Minimum: " + Float.MIN_VALUE);
        System.out.println("Maximum: " + Float.MAX_VALUE);

        // double
        System.out.println("double: ");
        System.out.println("Minimum: " + Double.MIN_VALUE);
        System.out.println("Maximum: " + Double.MAX_VALUE);

        // Unlike languages such as C or C++ that use the ASCII character set, Java uses the Unicode character set to support internationalization. 
        // Unicode requires more than 8 bits to represent a wide range of characters from different languages, including Latin, Greek, Cyrillic, Chinese, Arabic, and more. 
        // As a result, Java uses 2 bytes to store a char, ensuring it can represent any Unicode character.
        // char
        System.out.println("char: ");
        System.out.println("Minimum: " + (int) '\u0000');
        System.out.println("Maximum: " + (int) '\uffff');
        System.out.println("Minimum: " + (int) Character.MIN_VALUE);
        System.out.println("Maximum: " + (int) Character.MAX_VALUE);

        // boolean
        System.out.println("boolean: ");
        System.out.println("Values: " + false + " and " + true);
        System.out.println("Values: " + Boolean.FALSE + " and " + Boolean.TRUE);
    }
}
