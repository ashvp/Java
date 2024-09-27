// Class for Time Converter
package Lab.Lab_2;

public class timeConverter {
    // Constant Factors
    private static final double hoursToMinutesFactor = 60;
    private static final double minutesToHourFactor = 0.0167;
    private static final double minutesToSecondsFactor = 60;
    private static final double secondsToMinutesFactor = 0.0167;
    private static final double hoursToSecondsFactor = 3600;
    private static final double secondsToHoursFactor = 0.000278;
    // Methods defined in the Class
    public double hoursToMinutes(double hours)
    {
        return hours * hoursToMinutesFactor;
    }
    public double minutesToHours(double minutes)
    {
        return minutes * minutesToHourFactor;
    }
    public double minutesToSeconds(double minutes)
    {
        return minutes * minutesToSecondsFactor;
    }
    public double secondsToMinutes(double seconds)
    {
        return seconds * secondsToMinutesFactor;
    }
    public double hoursToSeconds(double hours)
    {
        return hours * hoursToSecondsFactor;
    }
    public double secondsToHours(double seconds)
    {
        return seconds * secondsToHoursFactor;
    }
}
