package leetcode_problems;

import java.util.Scanner;

public class circle_Area_Perimeter {
    public static void main(String[] args) {
        //Write a Java program to print the area and perimeter of a circle.
        //Test Data:
        //Radius = 7.5
        //Expected Output
        //Perimeter is = 47.12388980384689
        //Area is = 176.71458676442586

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your circle radius: ");
        double radius = scanner.nextDouble();
        scanner.nextLine();

        System.out.println();
        double circlePerimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter is = " + circlePerimeter);
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("Area is = " + circleArea);
    }
}
