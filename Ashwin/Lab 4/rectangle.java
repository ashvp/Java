package Lab.Lab4;

public class rectangle extends shape {
    public rectangle(double length, double breadth) {
        super(length, breadth);
    }

    @Override
    void printArea() {
        System.out.println("Area of Rectangle = " + (a * b));
    }

}
