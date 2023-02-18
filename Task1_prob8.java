//Riyadul islam
//ID-221-15-4828
//Section-H
import java.lang.Math;

public class Task1_prob8 {
    public static void main(String[] args) {
      int A = 5, B = 6, C = 7, D = 8;
      int resultA = A * B - C * D;
      int resultB = 2 * A - B + 3 * D;
      int resultC = (int) (Math.pow(A, 2) + Math.pow(B, 2) - Math.pow(C, 2) + Math.pow(D, 2));
      int resultD = (int) (Math.pow(A, 3) + B - Math.pow(C, 2));
      
      System.out.println("Result of A * B - C * D : " + resultA);
      System.out.println("Result of 2A - B + 3D : " + resultB);
      System.out.println("Result of A^2 + B^2 - C^2 + D^2 : " + resultC);
      System.out.println("Result of A^3 + B - C^2 : " + resultD);
    }
  }
  