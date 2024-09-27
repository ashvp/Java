package Lab.Lab4;

abstract class baseclass {
    double dim1;
    double dim2;

    public baseclass(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract void area();
}
