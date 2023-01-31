//Riyadul islam
//ID-221-15-4828
//Section-H
import java.util.Scanner;

public class Task2_prob5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter A: ");
    int A = sc.nextInt();
    System.out.print("Enter B: ");
    int B = sc.nextInt();
    System.out.print("Enter C: ");
    int C = sc.nextInt();

    int max = Math.max(A, Math.max(B, C));

    System.out.println("Maximum Value = " + max);
  }
}
