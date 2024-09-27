// Class for Distance Converter
package Lab.Lab_2;

public class distanceConverter {
    // Constant Factors
    private static final double milesToKilometerFactor = 1.609;
    private static final double kilometerToMilesFactor = 0.621;
    // Methods defined in the Class
    public double milesToKilometer(double miles)
    {
        double km = miles * milesToKilometerFactor;
        return km;
    }
    public double kilometerToMiles(double km)
    {
        double miles = km * kilometerToMilesFactor;
        return miles;
    }
}
