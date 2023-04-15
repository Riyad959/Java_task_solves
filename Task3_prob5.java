//Riyadul islam
//ID-221-15-4828
//Section-H

import java.lang.Math;
import java.util.Scanner;

public class Task3_prob5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter Your Number: ");
        double number = scan.nextDouble();
        
        System.out.println("Which option you like to choice-");
        System.out.println("1 : Absolute value");
        System.out.println("2 : Floor value");
        System.out.println("3 : Ceiling value");
        System.out.println("4 : Round value");
        System.out.println("5 : Square root Value");
        System.out.println("6 : All option at onece");

        int option = scan.nextInt();

        //sob option gula
        switch (option) {
            case 1:
                System.out.println("Absolute value :"+ Math.abs(number));
                break;

            case 2:
                System.out.println("Floor value :"+Math.floor(number));
                break;

            case 3:
                System.out.println("Ceiling value :"+ Math.ceil(number));
                break;

            case 4:
            System.out.println("Round value :"+ Math.round(number));
                break;

            case 5:
            System.out.println("Square root value :"+Math.sqrt(number));
                break;

            case 6:
            System.out.println("Absolute value: " + Math.abs(number));
            System.out.println("Floor value: " + Math.floor(number));
            System.out.println("Ceiling value: " + Math.ceil(number));
            System.out.println("Round value: " + Math.round(number));
            System.out.println("Square root value: " + Math.sqrt(number));
                break;
                
            default:System.out.println("Your number is not right. Please check.");
                break;
        }

    }
}
