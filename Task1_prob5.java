//Riyadul islam
//ID-221-15-4828
//Section-H
import java.util.Scanner;

public class Task1_prob5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;

        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
    }
}
