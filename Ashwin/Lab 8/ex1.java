import java.util.Scanner;

class hallExceptions extends Exception {
    public hallExceptions(int condition) {
        super(getMessageForCondition(condition));
    }

    public hallExceptions(String customMessage) {
        super(customMessage);
    }

    private static String getMessageForCondition(int condition) {
        switch (condition) {
            case 1:
                return "You are Not Allowed in Hall 2 and Hall 3.";
            case 2:
                return "You are Not Allowed in Hall 1 and Hall 3.";
            case 3:
                return "You are Not Allowed in Hall 1 and Hall 2.";
            default:
                return "Access denied to specified halls.";
        }
    }
}

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int employeeID;
        boolean condition = true;
        int totalAge[] = new int[3];
        int count[] = new int[3];
        int age;
        while (condition) {
            System.out.println("Hello!");
            System.out.println("1. Entering Details.");
            System.out.println("2. Exit.");
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Enter the Employee's ID: ");
                employeeID = input.nextInt();
                System.out.print("Enter the Employee's Age: ");
                age = input.nextInt();
                try {
                    if (age < 30 && employeeID % 2 == 0) {
                        totalAge[0] += age;
                        count[0]++;
                        throw new hallExceptions(1);
                    } else if (age > 30 && employeeID % 2 != 0) {
                        totalAge[1] += age;
                        count[1]++;
                        throw new hallExceptions(2);
                    } else {
                        totalAge[2] += age;
                        count[2]++;
                        throw new hallExceptions(3);
                    }
                } catch (hallExceptions e) {
                    System.out.println(e);
                } finally {
                    System.out.println("Welcome to the Party!");
                }
            } else {
                condition = false;
            }
        }
        System.out.println("Average Age of Employees in Hall 1: " + totalAge[0] / count[0]);
        System.out.println("Average Age of Employees in Hall 2: " + totalAge[1] / count[1]);
        System.out.println("Average Age of Employees in Hall 3: " + totalAge[2] / count[2]);
        System.out.println("Exiting...");
    }
}