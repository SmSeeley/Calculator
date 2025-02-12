import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {

        //create scanner object to read inputs
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        //calculate and print sum
        int sum = num1 + num2;

        System.out.println("The sum is " + sum);

        //close scanner
        scanner.close();

    }
}