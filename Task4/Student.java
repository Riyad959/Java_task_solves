//Riyadul islam
//ID-221-15-4828
//Section-H

public class Student {
    private String name;
    private int id;
    private double cgpa;

    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public static void main(String[] args) {
        Student student_me = new Student("Riyadul Islam", 4828, 3.8);
        System.out.println("Name: " + student_me.getName());
        System.out.println("ID: " + student_me.getId());
        System.out.println("CGPA: " + student_me.getCgpa());
    }
}