//Riyadul islam
//ID-221-15-4828
//Section-H

import java.util.Scanner;

public class Task4_prob8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input two sings
        System.out.print("Enter first string: ");
        String s1 = scan.nextLine();

        System.out.print("Enter second string: ");
        String s2 = scan.nextLine();

        String s1LowerCase = s1.toLowerCase();//boro soto korlam  -   something.touper/lowercase()
        String s1UpperCase = s1.toUpperCase();
        String s2LowerCase = s2.toLowerCase();
        String s2UpperCase = s2.toUpperCase();

        System.out.println("Lower Case:");
        System.out.println(s1LowerCase);
        System.out.println(s2LowerCase);
        System.out.println("Upper Case:");
        System.out.println(s1UpperCase);
        System.out.println(s2UpperCase);
    }
}
