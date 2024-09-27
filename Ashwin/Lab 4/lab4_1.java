package Lab.Lab4;

import java.util.*;

public class lab4_1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello:");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the length:");
                double length = input.nextDouble();
                System.out.println("Enter the breadth:");
                double breadth = input.nextDouble();
                rectangle objRectangle = new rectangle(length, breadth);
                objRectangle.printArea();
                break;
            case 2:
                System.out.println("Enter the base:");
                double base = input.nextDouble();
                System.out.println("Enter the height:");
                double height = input.nextDouble();
                triangle objTriangle = new triangle(base, height);
                objTriangle.printArea();
                break;
            case 3:
                System.out.println("Enter the radius:");
                double radius = input.nextDouble();
                circle objcCircle = new circle(radius);
                objcCircle.printArea();
                break;
            default:
                System.out.println("Invalid Input..");
                break;
        }
    }
}
