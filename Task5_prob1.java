//Riyadul islam
//ID-221-15-4828
//Section-H

import java.util.Scanner;

public class Task5_prob1 {
    public int add(int x, int y) {
        return x + y;
    }

    public int sub(int x, int y) {
        return x - y;
    }

    public int multi(int x, int y) {
        return x * y;
    }

    public double div(double x, double y) {
        if (y == 0) {
            System.out.println("Cannot divide by zero");   
        }
        return x / y;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Task5_prob1 calculator = new Task5_prob1();

        System.out.print("Enter 1st num: ");
        int x = scan.nextInt();

        System.out.print("Enter 2nd num: ");
        int y = scan.nextInt();

        System.out.print("Enter oparator u want to perform (+, -, *, /): ");
        char oparator = scan.next().charAt(0);   // char scan neoar jonno            kisuekta= s.next().charAt(o)

        switch (oparator) {
            case '+':
                int sum = calculator.add(x, y);
                System.out.println("Sum: " + sum);
                break;
            case '-':
                int difference = calculator.sub(x, y);
                System.out.println("Difference: " + difference);
                break;
            case '*':
                int product = calculator.multi(x, y);
                System.out.println("Product: " + product);
                break;
            case '/':
                //try {
                    double quotient = calculator.div(x, y);
                    System.out.println("Quotient: " + quotient);
                break;
            default:
                System.out.println("Check all again.");
        }
    }
}
