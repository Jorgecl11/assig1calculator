import java.util.Scanner;

public class Calculator {
    public void main() {
        //Variables
        double sum;
        Scanner input = new Scanner(System.in);

        //Number inputs
        System.out.println("Welcome to the simple Calculator!\n");
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter Second number: ");
        double num2 = input.nextDouble();

        //Operator selector
        System.out.println("\nSelect an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division\n");

        System.out.print("Enter the operation number: ");
        int option = input.nextInt();
        while (option > 4 || option <= 0) {
            System.out.print("Error! choose an option from 1-4!");
            option = input.nextInt();
        }

        //Calculator logic
        System.out.println();
        switch (option) {
            case 1:
                sum = (num1 + num2);
                System.out.println("Result: " + (int) num1 + " + " + (int) num2 + " = " + (int) sum);
                break;
            case 2:
                sum = (num1 - num2);
                System.out.println("Result: " + (int) num1 + " - " + (int) num2 + " = " + (int) (sum));
                break;
            case 3:
                sum = (num1 * num2);
                System.out.println("Result: " + (int) num1 + " * " + (int) num2 + " = " + (int) (sum));
                break;
            case 4:
                sum = (num1 / num2);
                System.out.println("Result: " + num1 + " / " + num2 + " = " + (sum));
                break;
            default:
                System.out.println("Error! choose an option from 1-4!");
                break;
        }
        System.out.println();

        //Perform another calculation
        System.out.print("Do you want to perform another calculation? (yes/no): ");
        String answer = input.next();
        if (answer.equalsIgnoreCase("yes")) {
            for (int i = 0; i < 10; i++) {
                System.out.println("\n");
            }

            main();
        }
    }
}
