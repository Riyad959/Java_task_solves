//Riyadul islam
//ID-221-15-4828
//Section-H
import java.util.Scanner;

public class Task2_prob6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your mark Riyad: ");
    int mark = sc.nextInt();

    if (mark >= 80) {
      System.out.println("Grade: A+, 4.00, Outstanding");
        } 
      else if (mark >= 75 || mark <=79) {
        System.out.println("Grade: A, 3.75, Excellent");
      } 
      else if (mark >= 70 || mark <=74) {
        System.out.println("Grade: A-, 3.50, Very Good");
      }
      else if (mark >= 65 || mark <=69) {
        System.out.println("Grade: B+, 3.25, Good");
      }
      else if (mark >= 60 || mark <=64) {
        System.out.println("Grade: B, 3.00, Satisfactory");
      }
      else if (mark >= 55 || mark <=59) {
        System.out.println("Grade: B-, 2.75, Above Average");
      }
      else if (mark >= 50 || mark <=54) {
        System.out.println("Grade: C+, 2.50, Average");
      }
      else if (mark >= 45 || mark <=49) {
        System.out.println("Grade: C, 2.25, Below Average");
      }
      else if (mark >= 40 || mark <=44) {
        System.out.println("Grade: D, 2.00, Pass");
      }
    else {
      System.out.println("Grade: F, 0.00, Fail");
    }
  }
}
