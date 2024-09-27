package Lab.Lab4;

abstract class shape {
    double a;
    double b;

    shape(double a, double b) {
        this.a = a;
        this.b = b;
    }

    abstract void printArea();
}
