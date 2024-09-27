package Lab.Lab4;

import java.util.*;

public class lab4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Dimension 1 : ");
        double dimension1 = input.nextDouble();
        System.out.println("Enter Dimension 2 : ");
        double dimension2 = input.nextDouble();
        System.err.println("Example of Overriding : ");
        rectangleQues2 objRectangle = new rectangleQues2(dimension1, dimension2);
        triangleQues2 objTriangle = new triangleQues2(dimension1, dimension2);
        objRectangle.area();
        objTriangle.area();
    }
}
