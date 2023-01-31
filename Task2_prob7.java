//Riyadul islam
//ID-221-15-4828
//Section-H
import java.util.Scanner;

public class Task2_prob7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of test cases: ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.print("Enter a character: ");
      char c = sc.next().charAt(0);

      if (Character.isDigit(c)) {
        System.out.println("The character is a digit.");
      } else if (Character.isAlphabetic(c)) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
          System.out.println("The character is an Alphabet : It is an Vowel.");
        } else {
          System.out.println("The character is an Alphabet : It is an Consonant.");
        }
      } else {
        System.out.println("This is a special character.");
      }
    }
  }
}
