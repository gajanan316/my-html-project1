/*Question 5: Write a Java program to create a Rectangle class and calculate area using constructor.

Description: Create Rectangle class with length and width. Initialize values using constructor and calculate area using formula length × width.
INPUT:
Enter Length: 10
Enter Width: 5

OUTPUT:
Area of Rectangle is: 50*/

import java.util.*;

class Rectangle {
    double length, width;

    // Constructor
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    // Method to calculate area
    void display() {
        double area = length * width;
        System.out.println("Area of Rectangle is: " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Length: ");
        double l = sc.nextDouble();

        System.out.print("Enter Width: ");
        double w = sc.nextDouble();

        // Object creation
        Rectangle r = new Rectangle(l, w);

        // Output
        r.display();
    }
}