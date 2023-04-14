//Riyadul islam
//ID-221-15-4828
//Section-H

import java.util.Scanner;

public class Task4_prob6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("String - 1: ");
        String s1 = scan.nextLine();

        System.out.print("String - 2: ");
        String s2 = scan.nextLine();

        System.out.print("String - 3: ");
        String s3 = scan.nextLine();

        if (s1.equals(s2)) {
           System.out.println("String - 1 is Equal to String - 2");
        }
        else if (s1.equals(s3)) {
           System.out.println("String - 1 is Equal to String - 3");
        }
        else if (s2.equals(s3)) {
           System.out.println("String - 2 is Equal to String - 3");
        }
        else {
           System.out.println("String are not Equal."); 
        }
    }
}
