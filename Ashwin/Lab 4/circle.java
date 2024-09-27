package Lab.Lab4;

public class circle extends shape {
    public circle(double radius) {
        super(radius, 0);
    }

    @Override
    void printArea() {
        System.out.println("Area of Circle = " + (3.14 * a * a));
    }
}
