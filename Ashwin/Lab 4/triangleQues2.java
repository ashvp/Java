package Lab.Lab4;

public class triangleQues2 extends baseclass {
    public triangleQues2(double base, double height) {
        super(base, height);
    }

    @Override
    void area() {
        System.out.println("Area of Triangle = " + (dim1 * dim2 / 2));
    }
}
