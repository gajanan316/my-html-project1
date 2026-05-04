/*Description: Create Employee class with empId, empName and monthlySalary. Use constructor to initialize values. 
Calculate yearly salary (monthlySalary × 12) and display it.
INPUT:
Enter Employee Id: 201
Enter Employee Name: Amit
Enter Monthly Salary: 25000

OUTPUT:
Employee Name: Amit
Yearly Salary: 300000*/
import java.util.*;

class Employee {
    int empId;
    String empName;
    double monthlySalary;

    // Constructor
    Employee(int id, String name, double salary) {
        empId = id;
        empName = name;
        monthlySalary = salary;
    }

    // Method to calculate yearly salary
    void display() {
        double yearlySalary = monthlySalary * 12;
        System.out.println("Employee Name: " + empName);
        System.out.println("Yearly Salary: " + yearlySalary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Employee Id: ");
        int id = sc.nextInt();
        sc.nextLine(); // buffer clear

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Monthly Salary: ");
        double salary = sc.nextDouble();

        // Object creation
        Employee e = new Employee(id, name, salary);

        // Output
        e.display();
    }
}