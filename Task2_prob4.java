//Riyadul islam
//ID-221-15-4828
//Section-H
import java.util.Scanner;

public class Task2_prob4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter A: ");
    int A = sc.nextInt();
    System.out.print("Enter B: ");
    int B = sc.nextInt();
    System.out.print("Enter C: ");
    int C = sc.nextInt();
    System.out.print("Enter D: ");
    int D = sc.nextInt();

    int result1 = A * B - C * D;
    int result2 = 2 * A - B + 3 * D;
    int result3 = A * A + B * B - C * C + D * D;
    int result4 = (A * A * A) + B - (C * C);

    System.out.println("Solution of equation -1 = " + result1);
    System.out.println("Solution of equation -2 = " + result2);
    System.out.println("Solution of equation -3 = " + result3);
    System.out.println("Solution of equation -4 = " + result4);
  }
}

