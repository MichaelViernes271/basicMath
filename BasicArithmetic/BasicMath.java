/*author: Viernes, Michael
Date: 25/06/23*/ 

package BasicArithmetic;

import java.lang.management.OperatingSystemMXBean;
import java.util.Scanner;

import javax.management.openmbean.OpenDataException;

public class BasicMath {

	/*
	 * operate on two operands using selected operator: 
	 * add, subtract, multiply, divide
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // get user input
		int option = 0, a = 0, b = 0; // selected operator and operands
		
		// setup the basic math
		BasicMath basicMath = new BasicMath();
		
		while (true) {
			basicMath.display();
			option = scanner.nextInt();
			System.out.print("a = ");
			a = scanner.nextInt();
			System.out.print("b = ");
			b = scanner.nextInt();
			if (option == 1)
				basicMath.add(a, b);
			else if (option == 2)
				basicMath.subtract(a, b);
			else if (option == 3)
				basicMath.multiply(a, b);
			else if (option == 4)
				basicMath.divide(a, b);
			else
				break;
			System.out.println("Type a number to proceed...");
			int wait = scanner.nextInt(); // wait
			
		}
	}
	
	/* returns the selected operation */
	private void display() {
		System.out.print("Select number for a math operation: \n" +
				"1. Addition\n" +
				"2. Subtraction\n" +
				"3. Multiplication\n" +
				"4. Divison\n" +
				"5. Exit\n"
						);
	}

	private void add(int a, int b){
		int c = 0;
		c = a + b; 
		System.out.println("result: " + c);
	}

	private void subtract(int a, int b){
		int c = 0;
		c = a - b; 
		System.out.println("result: " + c);
	}
	
	private void multiply(int a, int b){
		int c = 0;
		c = a * b; 
		System.out.println("result: " + c);
	}
	
	private void divide(int a, int b){
		int c = 0;
		c = a / b; 
		System.out.println("result: " + c);
	}
	
}
