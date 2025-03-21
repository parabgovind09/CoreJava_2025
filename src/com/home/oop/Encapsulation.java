package com.home.oop;
/*
Encapsulation
Encapsulation is the process of hiding the data (variables) of a class and allowing access only through public methods.
Encapsulation in Java is a fundamental OOP (object-oriented programming) principle that combines data and methods in a class. 
It allows implementation details to be hidden while exposing a public interface for interaction.

✔ Data Security: Prevents unauthorized access to data.
✔ Data Hiding: Variables cannot be accessed directly; only controlled methods can modify them.
✔ Code Maintainability: Changes in the class structure won’t affect external code.
✔ Better Control: Can control how data is stored and modified using setter and getter methods.

Encapsulation is achieved using private variables and public getter/setter methods.
✔ Steps to Implement Encapsulation:
1️⃣ Declare variables as private.
2️⃣ Provide getter and setter methods to access and update data.

without the encapsulation data is not secured as anyone can modify the data which breaks the data security

Advantages of Encapsulation
✅ Protects data from direct modification.
✅ Allows validation and control over data modification.
✅ Enhances code reusability and flexibility.
✅ Helps in achieving a modular structure. 


Encapsulation		Wrapping variables and methods together and restricting direct access.
Achieved Using		Private variables + Public getter/setter methods.
Benefits			Security, Data Hiding, Code Maintainability, Control over data.
 */
public class Encapsulation {

//	Encapsulation with Read-Only and Write-Only Classes
//	✔ Read-Only Class: Only getter methods are provided.
//	✔ Write-Only Class: Only setter methods are provided.
	private String username;
	private int password;

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(int password) {
		this.password = password;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		✔ Use Case: Password storage systems where passwords can be set but not retrieved.
		Encapsulation obj = new Encapsulation();
		obj.setUsername("govindparab");
		obj.setPassword(784);
		System.out.println(obj.getUsername());
		
		BankAccount account = new BankAccount(5000); // ✅ Initial balance

        account.deposit(1000);
        System.out.println("Current Balance: " + account.getBalance());

        account.withdraw(2000);
        System.out.println("Remaining Balance: " + account.getBalance());

        // Trying to access balance directly ❌ (Not possible)
        // account.balance = 10000;  // Compilation Error!
	}

}

//✔ Encapsulation ensures:
//
//Only valid transactions are performed.
//Balance is not modified directly.
class BankAccount {
    private double balance;  // ✅ Private variable

    public BankAccount(double balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
            System.out.println("Invalid balance, setting to 0.");
        }
    }

    // ✅ Getter method
    public double getBalance() {
        return balance;
    }

    // ✅ Setter method with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}
