//Riyadul islam
//ID-221-15-4828
//Section-H

import java.util.Scanner;
import java.math.*;

public class Task5_prob2 {
    double r;

    public Task5_prob2(double r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        double r = scan.nextDouble();

        Task5_prob2 circle = new Task5_prob2(r);
        double area = circle.getArea();

        System.out.println("Area of the circle is " + area);
    }
}
