/*Question 3: Write a Java program to demonstrate constructor overloading using a Book class.

Description: Create Book class with bookId, bookName and price. Create one default constructor and one parameterized constructor. Display values initialized by both constructors.
INPUT:
(Default constructor gives default values)
Enter Book Id: 11
Enter Book Name: Java Basics
Enter Price: 450

OUTPUT:
Book from Default Constructor:
Book Id: 0
Book Name: Unknown
Price: 0

Book from Parameterized Constructor:
Book Id: 11
Book Name: Java Basics
Price: 450*/

import java.util.*;

class BookCon {
    int bookId;
    String bookName;
    double price;

    // Default Constructor
    BookCon() {
        bookId = 0;
        bookName = "Unknown";
        price = 0;
    }

    // Parameterized Constructor
    BookCon(int id, String name, double p) {
        bookId = id;
        bookName = name;
        price = p;
    }

    // Display Method
    void display() {
        System.out.println("Book Id: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Default Constructor Object
        BookCon b1 = new BookCon();

        // Input for Parameterized Constructor
        System.out.print("Enter Book Id: ");
        int id = sc.nextInt();
        sc.nextLine(); // buffer clear

        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        // Parameterized Constructor Object
        BookCon b2 = new BookCon(id, name, price);

        // Output
        System.out.println("\nBook from Default Constructor:");
        b1.display();

        System.out.println("\nBook from Parameterized Constructor:");
        b2.display();
    }
}