//Riyadul islam
//ID-221-15-4828
//Section-H

import java.lang.Math;
import java.util.Scanner;

public class Task3_prob9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = scan.nextInt();

        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Area of the circle: " + area);
    }
}
