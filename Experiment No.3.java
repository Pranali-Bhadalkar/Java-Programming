//Program based on concept of Inheritance like single inheritance, multilevel inheritance, hierarchical inheritance etc.
//(IT Company Resource & Payroll Management System)

import java.util.Scanner;

class Person {
    String name;
    String email;

    void inputPersonDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Email: ");
        email = sc.nextLine();
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

class Employee extends Person {
    int employeeId;
    double basicSalary;

    void inputEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        employeeId = sc.nextInt();
        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class SoftwareEngineer extends Employee {
    double hra;
    double performanceBonus;
    double totalSalary;

    void calculateSalary() {
        hra = basicSalary * 0.20;
        totalSalary = basicSalary + hra + performanceBonus;
    }

    void displaySalaryDetails() {
        System.out.println("HRA: " + hra);
        System.out.println("Performance Bonus: " + performanceBonus);
        System.out.println("Total Salary: " + totalSalary);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SoftwareEngineer se = new SoftwareEngineer();

        se.inputPersonDetails();
        se.inputEmployeeDetails();

        System.out.print("Enter Performance Bonus: ");
        se.performanceBonus = sc.nextDouble();

        se.calculateSalary();

        System.out.println("\nEmployee Details");
        se.displayPersonDetails();
        se.displayEmployeeDetails();
        se.displaySalaryDetails();
    }
}
