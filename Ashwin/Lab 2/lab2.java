// Main Class
package Lab.Lab_2;
// Importing the other classes
import Lab.Lab_2.distanceConverter;
import Lab.Lab_2.currencyConverter;
import Lab.Lab_2.timeConverter;
import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        int choice;
        int subChoice;
        double value;
        boolean loopController = true;
        Scanner input = new Scanner(System.in);
        // Menu Driven Program
        while(loopController)
        {
            System.out.println("Hello!");
            System.out.println("Enter the Serial Number for the Converter Required :");
            System.out.println("1. Distance Converter.");
            System.out.println("2. Currency Converter.");
            System.out.println("3. Time Converter.");
            System.out.println("4. Exit.");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    distanceConverter objDistance = new distanceConverter();
                    System.out.println("Enter the Serial Number for the Type of Conversion : ");
                    System.out.println("1. Miles to Kilometers.");
                    System.out.println("2. Kilometers to Miles.");
                    subChoice = input.nextInt();
                    switch (subChoice) {
                        case 1:
                            System.out.println("Enter the number of Miles : ");
                            value = input.nextDouble();
                            System.out.println("Kilometers = "+objDistance.milesToKilometer(value));
                            break;
                        case 2:
                            System.out.println("Enter the number of Kilometers : ");
                            value = input.nextDouble();
                            System.out.println("Miles = "+objDistance.kilometerToMiles(value));
                            break;
                        default:
                            System.out.println("Invalid Input.");
                            break;
                    }
                    break;
                
                case 2:
                    currencyConverter objCurrency = new currencyConverter();
                    System.out.println("Enter the Serial Number for the Type of Conversion : ");
                    System.out.println("1. INR to Dollars.");
                    System.out.println("2. Dollars to INR.");
                    System.out.println("3. INR to Euro.");
                    System.out.println("4. Euro to INR.");
                    System.out.println("5. INR to Yen.");
                    System.out.println("6. Yen to INR.");
                    subChoice = input.nextInt();
                    switch (subChoice) {
                        case 1:
                            System.out.println("Enter the number of INR : ");
                            value = input.nextDouble();
                            System.out.println("Dollars = "+objCurrency.INRToDollar(value));                            
                            break;
                        case 2:
                            System.out.println("Enter the number of Dollars : ");
                            value = input.nextDouble();
                            System.out.println("INR = "+objCurrency.dollarToINR(value));                            
                            break;
                        case 3:
                            System.out.println("Enter the number of INR : ");
                            value = input.nextDouble();
                            System.out.println("Euro = "+objCurrency.INRtoEuro(value));                            
                            break;
                        case 4:
                            System.out.println("Enter the number of Euro : ");
                            value = input.nextDouble();
                            System.out.println("INR = "+objCurrency.euroToINR(value));                            
                            break;
                        case 5:
                            System.out.println("Enter the number of INR : ");
                            value = input.nextDouble();
                            System.out.println("Yen = "+objCurrency.INRToYen(value));                            
                            break;
                        case 6:
                            System.out.println("Enter the number of Yen : ");
                            value = input.nextDouble();
                            System.out.println("INR = "+objCurrency.yenToINR(value));
                            break;
                        default:
                            System.out.println("Invalid Input.");
                            break;
                    }
                    break;
                
                case 3:
                    timeConverter objTime = new timeConverter();
                    System.out.println("Enter the Serial Number for the Type of Conversion : ");
                    System.out.println("1. Hours to Minutes.");
                    System.out.println("2. Minutes to Hours.");
                    System.out.println("3. Minutes to Seconds.");
                    System.out.println("4. Seconds to Minutes.");
                    System.out.println("5. Hours to Seconds");
                    System.out.println("6. Seconds to Hours.");
                    subChoice = input.nextInt();
                    switch (subChoice) {
                        case 1:
                            System.out.println("Enter the number of Hours : ");
                            value = input.nextDouble();
                            System.out.println("Minutes = "+objTime.hoursToMinutes(value));                            
                            break;
                        case 2:
                            System.out.println("Enter the number of Minutes : ");
                            value = input.nextDouble();
                            System.out.println("Hours = "+objTime.minutesToHours(value));                            
                            break;
                        case 3:
                            System.out.println("Enter the number of Minutes : ");
                            value = input.nextDouble();
                            System.out.println("Seconds = "+objTime.minutesToSeconds(value));                            
                            break;
                        case 4:
                            System.out.println("Enter the number of Seconds : ");
                            value = input.nextDouble();
                            System.out.println("Minutes = "+objTime.secondsToMinutes(value));                            
                            break;
                        case 5:
                            System.out.println("Enter the number of Hours : ");
                            value = input.nextDouble();
                            System.out.println("Seconds = "+objTime.hoursToSeconds(value));                            
                            break;
                        case 6:
                            System.out.println("Enter the number of Seconds : ");
                            value = input.nextDouble();
                            System.out.println("Hours = "+objTime.secondsToHours(value));
                            break;
                        default:
                            System.err.println("Invalid Input.");
                            break;
                    }
                    break;
                
                case 4:
                    System.err.println("Exiting...");
                    loopController = false;
                    break;
                default:
                    System.out.println("Invalid Input.");
                    break;
            }
        }                
    }
}
