//Riyadul islam
//ID-221-15-4828
//Section-H


import java.util.*;

public class Task3_prob3 {
    public static void main(String[] args) {
        
        System.out.println("How many students' CGpA you want to insert? ");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        /////////////cgpa number double/////
        double[] cgpa = new double[N];

        System.out.println("Enter " + N + " array elements");
        
        for (int i = 0; i < N; i++) {
            cgpa[i] = scan.nextDouble();
        }

        double largest= 0;
        double smallest= 0;
        for (int i = 1; i < N; i++) {
            if (cgpa[i] > largest) {
                largest = cgpa[i];
            }else smallest = cgpa[i];
        }

        System.out.println("Largest CgpA = " + largest);
        System.out.println("smallest cCgPA = " + smallest);
        
    }
}
