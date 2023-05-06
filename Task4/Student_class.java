//Riyadul islam
//ID-221-15-4828
//Section-H

import java.util.Scanner;
public class Student_class {

    public static void main(String[] args) {
        

    Scanner scan = new Scanner(System.in);
        System.out.print("Number of Students: ");
        int n = scan.nextInt();
        Student[] students = new Student[n];
        int i = 0;
        while (i < n) {
            students[i] = new Student();
            System.out.print("Enter Name of Student " + (i+1) + ": ");
            students[i].setName(scan.next());
            System.out.print("Enter ID of Student " + (i+1) + ": ");
            students[i].setId(scan.nextInt());
            System.out.print("Enter Cgpa of Student " + (i+1) + ": ");
            students[i].setCgpa(scan.nextDouble());
            System.out.printf("\nDetails of student %d:\n", i + 1);
            System.out.println("Name: " + students[i].getName());
            System.out.println("ID: " + students[i].getId());
            System.out.println("CGPA: " + students[i].getCgpa());
            i = i + 1;
       }
    }
}

