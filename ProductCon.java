/*Description: Create Product POJO class with productId, productName and price. Use constructor to initialize values. If price > 1000 print Expensive otherwise Affordable.
INPUT:
Enter Product Id: 501
Enter Product Name: Headphones
Enter Price: 1200

OUTPUT:
Product Name: Headphones
Category: Expensive Product*/

import java.util.*;

class ProductCon {
    int productId;
    String productName;
    double price;

    // Constructor
    ProductCon(int id, String name, double p) {
        productId = id;
        productName = name;
        price = p;
    }

    // Method to display category
    void display() {
        System.out.println("Product Name: " + productName);

        if (price > 1000) {
            System.out.println("Category: Expensive Product");
        } else {
            System.out.println("Category: Affordable Product");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Product Id: ");
        int id = sc.nextInt();
        sc.nextLine(); // buffer clear

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        // Object creation
        ProductCon p = new ProductCon(id, name, price);

        // Output
        p.display();
    }
}