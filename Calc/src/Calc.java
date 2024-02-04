//package Calc;
import java.util.Scanner;

public class Calc {
	public static void main(String [] args) {
		//double int1, int2, sum;
		//int option1, option2, option3, option4, option5;
		System.out.println("Welcome to the simple Calculator!\n");
		double sum;
		//String answer;
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		double num1 = input.nextDouble();
		
		System.out.println("Enter Second number: ");
		double num2 = input.nextDouble();
		
		System.out.println("\nSelect an operation:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division/n");
		
		System.out.println("Enter the operation number: ");
		int option = input.nextInt();
		
		
		//while (answer != "no || No");
		
			System.out.println("");
			switch (option) {
			case 1: sum = (num1 + num2); 
				System.out.println("Result: " + (int)num1 + " + " + (int)num2 + " = " + (int)sum);
				break;
			case 2: sum = (num1-num2);
				System.out.println("Result: " + (int)num1 + " - " + (int)num2 + " = " + (int)(num1-num2));
				break;
			case 3: sum = (num1*num2);
			System.out.println("Result: " + (int)num1 + " * " + (int)num2 + " = " + (int)(num1*num2));
				break;
			case 4: sum = (num1/num2);
			System.out.println("Result: " + num1 + " / " + num2 + " = " + (num1/num2));
				break;
			
			default: System.out.println("Error! choose an option from 1-4!");
		//int option = input.nextInt();
				break;
		
		
		
			
			}
		System.out.println("Do you want to perform another calculation? (yes/no): ");
		//answer = input.next();
		
		
		
	}

}
