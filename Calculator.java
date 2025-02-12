import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {

        //variables
        float result = 0;


        //create scanner object to read inputs
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float num2 = scanner.nextFloat();

        //Ask for operation
        System.out.print("Please enter '+' or '-' or '*' or '/' to select an operation: ");
        String operation = scanner.next().toLowerCase();


        //get result
        if (operation.equals("+")) {
            result = num1 + num2;
            System.out.println("The total is " + result);
        } else if (operation.equals("-")) {
            result = num1 - num2;
            System.out.println("The total is " + result);
        } else if (operation.equals("*")) {
            result = num1 * num2;
            System.out.println("The total is " + result);
        } else if (operation.equals("/")) {
            result = num1 / num2;
            System.out.println("The total is " + result);
        }

        //close scanner
        scanner.close();

    }
}