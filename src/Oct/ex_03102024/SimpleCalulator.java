package Oct.ex_03102024;

import java.util.Scanner;

public class SimpleCalulator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Taking input for two numbers
        System.out.println("Enter First number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        //Taking input for the operation
        System.out.println("Enter operation(+,-.*,/):");
        char operation = scanner.next().charAt(0);
        double result = 0;
        boolean validOperation = true;

        //using switch case to perform the selected operation
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("invalid operation");
                validOperation = false;
        }

        //printing the result using SOP
        if (validOperation) {
            System.out.println("The result is: " + result);
        }
        scanner.close();
    }
}
