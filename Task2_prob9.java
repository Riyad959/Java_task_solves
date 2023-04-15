//Riyadul islam
//ID-221-15-4828
//Section-H
public class Task2_prob9 {
    public static void main(String[] args) {
      System.out.println("Numbers between 1 and 100 that are divisible by 3 and 6, except for 30, 60, and 90:");
      for (int i = 1; i <= 100; i++) {
        if (i % 3 == 0 && i % 6 == 0 && i != 30 && i != 60 && i != 90) {
          System.out.println(i);
        }
      }
    }
  }
  