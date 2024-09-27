// Class for Currency Converter
package Lab.Lab_2;

public class currencyConverter {
    // Constant Factors
    private double dollarToINRFactor = 83.72;
    private static final double INRToDollarFactor = 0.012;
    private static final double euroToINRFactor = 90.96;
    private static final double INRToEuroFactor = 0.011;
    private static final double yenToINRFactor = 0.55;
    private static final double INRToYenFactor = 1.83;

    // Methods defined in the Class
    public double dollarToINR(double dollar) {
        double INR = dollar * dollarToINRFactor;
        return INR;
    }

    public double INRToDollar(double INR) {
        double dollar = INR * INRToDollarFactor;
        return dollar;
    }

    public double euroToINR(double euro) {
        double INR = euro * euroToINRFactor;
        return INR;
    }

    public double INRtoEuro(double INR) {
        double euro = INR * INRToEuroFactor;
        return euro;
    }

    public double yenToINR(double yen) {
        double INR = yen * yenToINRFactor;
        return INR;
    }

    public double INRToYen(double INR) {
        double yen = INR * INRToYenFactor;
        return yen;
    }
}
