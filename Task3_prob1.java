//Riyadul islam
//ID-221-15-4828
//Section-H

import java.util.Scanner;

public class Task3_prob1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many Numbers you want to insert? ");
        int N = scan.nextInt();

        int[] arr = new int[N];
        System.out.print("Enter " + N + " array elements: ");
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        
        //Ascending korlam
        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
