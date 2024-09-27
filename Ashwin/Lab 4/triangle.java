package Lab.Lab4;

public class triangle extends shape {
    public triangle(double base, double height) {
        super(base, height);
    }

    @Override
    void printArea() {
        System.out.println("Area of Triangle = " + (a * b / 2));
    }
}
