//Riyadul islam
//ID-221-15-4828
//Section-H
import java.lang.Math;
import java.util.Scanner;

public class Task1_prob7 {
    public static void main(String[] args) {
        double radius, area;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        radius = scan.nextDouble();

        area = Math.PI * radius * radius;

        System.out.printf("The area of the circle is %.2f", area);
    }
}
