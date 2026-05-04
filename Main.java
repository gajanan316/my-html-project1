import java.util.Scanner;

class Student {
    // Private data members
    private int rollNo;
    private String name;
    private int marks;

    // Parameterized Constructor
    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    void display() {
        System.out.println("Student Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();

        sc.nextLine(); // clear buffer

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        // Creating object using constructor
        Student s = new Student(rollNo, name, marks);

        // Display details
        s.display();
    }
}