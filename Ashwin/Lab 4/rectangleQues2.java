package Lab.Lab4;

public class rectangleQues2 extends baseclass {
    public rectangleQues2(double length, double breadth) {
        super(length, breadth);
    }

    @Override
    void area() {
        System.out.println("Area of Rectangle = " + dim1 * dim2);
    }
}
