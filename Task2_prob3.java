//Riyadul islam
//ID-221-15-4828
//Section-H
import java.util.Scanner;

public class Task2_prob3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = sc.nextLine();
    System.out.print("Enter your age: ");
    int age = sc.nextInt();
    System.out.print("Enter your CGPA: ");
    double cgpa = sc.nextDouble();
    sc.nextLine(); // Consuming the remaining newline character
    System.out.print("Enter your department: ");
    String department = sc.nextLine();
    System.out.print("Enter your section: ");
    String section = sc.nextLine();
    System.out.println("Hello " + name+",");
    System.out.println("Here is your info-");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("CGPA: " + cgpa);
    System.out.println("Department: " + department);
    System.out.println("Section: " + section);
  }
}
