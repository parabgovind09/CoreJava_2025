package com.home.basics;

import java.util.Scanner;

public class DecisionMaking {
	
	static int a;
	static Scanner sc;
	
	static void getValue(int n) {
		try {
			sc = new Scanner(System.in);
			if(n == 0) {
				System.out.println("Enter a number : ");
				a = sc.nextInt();
				sc.nextLine();
			}
			else {
				System.out.println("Enter a bool value : ");
				a = (sc.nextBoolean()?1:0);
				sc.nextLine();
			}
			
		}
		catch(Exception e) {
			System.out.println("Exception is : "+e.toString());
			sc.close();
		}
	}
	
	static void ifStatement() {
		getValue(0);
		//if statement to check if number is positive, negative or neutral
		if(a > 0) {
			System.out.println(a+" is a positive number");
		}
		if(a < 0) {
			System.out.println(a+" is a negative number");
		}
		if(a == 0) {
			System.out.println(a+" is a neutral number");
		}
	}
	
	static void ifElseStatement() {
		getValue(0);
		//if-else statement to check if number is even or odd
		if(a % 2 == 0) {
			System.out.println(a+" is a even number");
		}
		else {
			System.out.println(a+" is a odd number");
		}
	}
	
	static void nestedIfStatement() {
		getValue(0);
		//nested if to check age based permissions
		if(a > 18) {
			getValue(1);
			if(a == 1) {
				System.out.println("You are eligible to vote");
			}
			else {
				System.out.println("You are not eligible to vote");
			}
		}
		else {
			System.out.println("You are not eligible to vote");
		}
	}
	
	static void ternaryOperator() {
		getValue(0);
		//check if number is divisible by both 3 and 5 or not
		System.out.println((a % 3 == 0 && a % 5 == 0) ? a+" is divisible by both 3 and 5" : a+" is not divisible by both 3 and 5");	
	}
	
	static void ifElseLadder() {
		getValue(0);
		//check the grade obtained by student based on marks
		if(a > 90) {
			System.out.println("Grade O");
		}
		else if(a > 80) {
			System.out.println("Grade A");
		}
		else if(a > 70) {
			System.out.println("Grade B");
		}
		else if(a > 60) {
			System.out.println("Grade C");
		}
		else if(a > 50) {
			System.out.println("Grade D");
		}
		else if(a > 35) {
			System.out.println("Grade E");
		}
		else {
			System.out.println("Grade F");
		}
	}
	
	static void switchStatement() {
		//with integer
		int dayOfWeek = 5;
		switch(dayOfWeek) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid Day of Week");
		}
		
		//with enum
		enum Color {RED,GREEN,ORANGE};
		switch(Color.GREEN) {
		case RED:
			System.out.println("Red Color");
			break;
		case GREEN:
			System.out.println("Green Color");
			break;
		case ORANGE:
			System.out.println("Orange Color");
			break;
		default:
			System.out.println("Invalid Color");
		}
		
		//with string
		String msg = "Afternoon";
		switch(msg) {
		case "Morning":
			System.out.println("Good Morning");
			break;
		case "Afternoon":
			System.out.println("Good Afternoon");
			break;
		case "Evening":
			System.out.println("Good Evening");
			break;
		case "Night":
			System.out.println("Good Night");
			break;
		default:
			System.out.println("Invalid Message");
		}
		
		//with char
		char grade = 'B';
		switch(grade) {
		case 'O':
			System.out.println("Between 90-100");
			break;
		case 'A':
			System.out.println("Between 80-90");
			break;
		case 'B':
			System.out.println("Between 70-80");
			break;
		case 'C':
			System.out.println("Between 60-70");
			break;
		case 'D':
			System.out.println("Between 35-60");
			break;
		case 'F':
			System.out.println("Between 0-35");
			break;
		default:
			System.out.println("Invalid Grade");	
		}
		
		//with expression and without default statement
		switch(50 % 2) {
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;
		}
	}
	static void switchExpression(){
//		Both switch expressions and switch statements are used to control the flow of execution based on different values of a variable or an expression. 
//		However, they differ in their syntax, flexibility, and how they return or handle results. 
//		A switch statement is a control flow statement used to execute one out of many blocks of code based on the value of a variable or expression. 
//		The switch statement can handle multiple possible values (or cases), and based on which case matches the evaluated expression, the corresponding code block is executed.
//		In Switch
//		Break is important to prevent the execution from "falling through" to the next case (unless intentional).
//		The default case is optional and executes if no case matches the expression.
		
		//switch expression
//		A switch expression is a more flexible and concise form of the switch statement. 
//		It was introduced in Java 12 and allows for expressions to return values. 
//		It eliminates the need for the break statement, and its syntax is more compact, especially when working with values.
//		-> (arrow): Used to indicate the result for each case.
//		Expression: The value that is evaluated.
//		Return Values: The result of each case is returned, and the switch expression can directly assign a value.
//		No break required: Unlike the switch statement, you don't need to use the break keyword.
//		Return Value: A switch expression directly returns a value, making it more compact and usable in assignment statements.
//		Blocks: In case you need more than one line of code to execute for a case, you can use a block in the expression:
		
//		Additional Features in Switch Expression (Java 12+)
//		Multiple Labels: You can group multiple values in one case using commas.
		int day = 5;
		String dayType = switch (day) {
		    case 1, 2, 3, 4, 5 -> "Weekday";
		    case 6, 7 -> "Weekend";
		    default -> throw new IllegalArgumentException("Invalid day");
		};
		System.out.println(dayType);
		
//		Using Blocks: You can use multiple statements within a case using curly braces {}.
		int month = 5;
		String season = switch (month) {
		    case 12, 1, 2 -> {
		        System.out.println("Winter months");
		        yield "Winter"; // 'yield' returns a value from a block.
		    }
		    case 3, 4, 5 -> "Spring";
		    case 6, 7, 8 -> "Summer";
		    case 9, 10, 11 -> "Autumn";
		    default -> throw new IllegalArgumentException("Invalid month");
		};
		System.out.println(season);
		
//		yield in Java (Introduced in Java 13)
//		In Java, the yield keyword is used within a switch expression to return a value from a case block. 
//		It was introduced in Java 13 as part of the enhanced switch expressions, which allow for more flexibility and readability in switch-case scenarios.

//		The yield keyword allows you to return a value from a switch case block when you're using a block (curly braces {}) inside the switch expression.
//		This is necessary because when you use a block inside a case, you need a way to return a value to the switch expression, and yield is the keyword that provides this functionality.
		
		String res = switch(151%5) {
			case 1,3,5 -> {
				System.out.println("Odd Remainder");
				yield "1,3,5";
			}
			case 2,4,6 -> "2,4,6";
		    default -> throw new IllegalArgumentException("Unexpected value: " + 152%5);
		};
		System.out.println(res);
	}

	public static void main(String[] args) {
//		ifStatement();
//		ifElseStatement();
//		nestedIfStatement();
//		ternaryOperator();
//		ifElseLadder();
//		switchStatement();
		switchExpression();
//		sc.close();
	}
}