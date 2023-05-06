//Riyadul islam
//ID-221-15-4828
//Section-H

//Task5_prob5;

import java.util.Scanner;

public class Student {
    private String name;
    private int id;
    private double cgpa;

    public void insertRecord(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public void displayRecord() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Student student1 = new Student();
        Student student2 = new Student();

        // input for s1
        System.out.print("Enter student1's name: ");
        String name1 = scan.nextLine();
        System.out.print("Enter student1's ID: ");
        int id1 = scan.nextInt();
        System.out.print("Enter student1's CGPA: ");
        double cgpa1 = scan.nextDouble();
        scan.nextLine();


        student1.insertRecord(name1, id1, cgpa1);

        // input for s2
        System.out.print("Enter student2's name: ");
        String name2 = scan.nextLine();
        System.out.print("Enter student2's ID: ");
        int id2 = scan.nextInt();
        System.out.print("Enter student2's CGPA: ");
        double cgpa2 = scan.nextDouble();

        student2.insertRecord(name2, id2, cgpa2);

        // Display korbo
        System.out.println("\nStudent 1 Record:");
        student1.displayRecord();

        System.out.println("\nStudent 2 Record:");
        student2.displayRecord();

    }
}