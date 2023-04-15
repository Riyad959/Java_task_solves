//Riyadul islam
//ID-221-15-4828
//Section-H


import java.util.*;

public class Task3_prob6 {
    public static void main(String[] args) {
        //int num1 = 10;
        //int num2 = 20;
        //int num3 = 30;
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first integer number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter the second integer number: ");
        int num2 = scan.nextInt();

        System.out.print("Enter the third integer number: ");
        int num3 = scan.nextInt();


        int max = Math.max(num1, Math.max(num2, num3));
        int min = Math.min(num1, Math.min(num2, num3));
        
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
