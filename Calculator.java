import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {

        //variables
        int result = 0;


        //create scanner object to read inputs
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        //Ask for operation
        System.out.print("Please enter '+' or '-' to select an operation: ");
        String operation = scanner.next().toLowerCase();


        //get result
        if (operation.equals("+")) {
            result = num1 + num2;
            System.out.println("The sum is " + result);
        } else if (operation.equals("-")) {
            result = num1 - num2;
            System.out.println("the difference is " + result);
        }

        //close scanner
        scanner.close();

    }
}