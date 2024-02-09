import org.junit.Test;
import static org.junit.Assert.*;

//Test all calculation operators
public class CalculatorTest {
    @Test
    public void testAddition() {
        provideInput("10\n5\n1\nno\n");
        Calculator.main();
        assertEquals("Welcome to the simple Calculator!\n\n" +
                "Enter first number: Enter Second number: \n" +
                "Select an operation:\n" +
                "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division\n\n" +
                "Enter the operation number: Result: 10 + 5 = 15\n\n" +
                "Do you want to perform another calculation? (yes/no): ";
    }

    @Test
    public void testSubtraction() {
        provideInput("10\n5\n2\nno\n");
        Calculator.main();
        assertEquals("Welcome to the simple Calculator!\n\n" +
                "Enter first number: Enter Second number: \n" +
                "Select an operation:\n" +
                "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division\n\n" +
                "Enter the operation number: Result: 10 - 5 = 5\n\n" +
                "Do you want to perform another calculation? (yes/no): ";
    }

    @Test
    public void testMultiplication() {
        provideInput("10\n5\n3\nno\n");
        Calculator.main();
        assertEquals("Welcome to the simple Calculator!\n\n" +
                "Enter first number: Enter Second number: \n" +
                "Select an operation:\n" +
                "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division\n\n" +
                "Enter the operation number: Result: 10 * 5 = 50\n\n" +
                "Do you want to perform another calculation? (yes/no): ";
    }

    @Test
    public void testDivision() {
        provideInput("10\n5\n4\nno\n");
        Calculator.main();
        assertEquals("Welcome to the simple Calculator!\n\n" +
                "Enter first number: Enter Second number: \n" +
                "Select an operation:\n" +
                "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division\n\n" +
                "Enter the operation number: Result: 10.0 / 5.0 = 2.0\n\n" +
                "Do you want to perform another calculation? (yes/no): ";
    }
}
