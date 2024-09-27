package Lab.Lab4;

import java.util.*;

public class lab4_3 {
    public static double area(double length, double breadth) {
        return length * breadth;
    }

    public static double area(double length) {
        return length * length;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        boolean loopController = true;
        while (loopController) {
            System.out.println("Hello!");
            System.out.println("1. Rectangle");
            System.out.println("2. Square");
            System.out.println("3. Exit");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Length : ");
                    double length = input.nextDouble();
                    System.out.println("Enter Breadth : ");
                    double breadth = input.nextDouble();
                    System.out.println("Area of Rectangle = " + area(length, breadth));
                    break;
                case 2:
                    System.out.println("Enter Length : ");
                    double side = input.nextDouble();
                    System.out.println("Area of Square = " + area(side));
                    break;
                case 3:
                    loopController = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Input..");
                    break;
            }
        }
    }
}