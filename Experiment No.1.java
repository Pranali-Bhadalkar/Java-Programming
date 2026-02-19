//Program Based on Fundamental Concepts of Java 

import java.util.Scanner;

class StudentDetails 
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);

        float mark1, mark2, mark3;
        float total, percentage;

        System.out.println("Enter your roll number:");
        int rollno = sc.nextInt();

        System.out.println("Enter your name:");
        String name = sc.next();

        System.out.println("Enter your Marks in Subject 1:");
        mark1 = sc.nextFloat();

        System.out.println("Enter your Marks in Subject 2:");
        mark2 = sc.nextFloat();

        System.out.println("Enter your Marks in Subject 3:");
        mark3 = sc.nextFloat();

        total = mark1 + mark2 + mark3;
        percentage = (total / 300) * 100;

        System.out.println("\n--- Student Details ---");	
        System.out.println("Roll No     : " + rollno);
        System.out.println("Name        : " + name);
        System.out.println("Total Marks : " + total);
        System.out.println("Percentage  : " + percentage + "%");

        sc.close();
    }
}







