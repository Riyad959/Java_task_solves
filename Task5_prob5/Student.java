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
        System.out.println("Enter name, ID, and CGPA for 1st:");
        String name1 = scan.next();
        int id1 = scan.nextInt();
        double cgpa1 = scan.nextDouble();
        student1.insertRecord(name1, id1, cgpa1);

        Student student2 = new Student();
        System.out.println("Enter name, ID, and CGPA for 2nd:");
        String name2 = scan.next();
        int id2 = scan.nextInt();
        double cgpa2 = scan.nextDouble();
        student2.insertRecord(name2, id2, cgpa2);

        System.out.println("1st Student :");
        student1.displayRecord();
        System.out.println("2nd Student 2:");
        student2.displayRecord();
    }
}

