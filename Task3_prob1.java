//Riyadul islam
//ID-221-15-4828
//Section-H

import java.util.Scanner;

public class Task3_prob1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many Numbers you want to insert? ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        
        //Ascending korlam
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
