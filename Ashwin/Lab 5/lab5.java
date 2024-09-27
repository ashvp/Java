package Lab5;

import java.util.*;

public class lab5 {
    // Main Method
    public static void main(String[] args) {
        methods operations = new methods();
        Scanner input = new Scanner(System.in);
        String val;
        boolean loopController = true;
        while (loopController) {
            System.out.println("Hello!");
            System.out.println("1. Append");
            System.out.println("2. Insert at Particular Index");
            System.out.println("3. Search");
            System.out.println("4. List All Strings Starting With The Given Letter");
            System.out.println("5. Sort");
            System.out.println("6. Display all Elements");
            System.out.println("7. Exit");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the String to Append:");
                    val = input.next();
                    operations.append(val);
                    System.out.println("Insertion Successful.");
                    break;
                case 2:
                    System.out.println("Enter the String to Add:");
                    val = input.next();
                    System.out.println("Enter the Position (Zero Index Based):");
                    int position = input.nextInt();
                    int flag = operations.insertAtPosition(val, position);
                    if (flag == 0) {
                        System.out.println("Error while Inserting Value.");
                    } else {
                        System.out.println("Insertion Successful.");
                    }
                    break;
                case 3:
                    System.out.println("Enter the String to Search:");
                    val = input.next();
                    if (operations.search(val))
                        System.out.println("String Found in List.");
                    else
                        System.out.println("String Not Found in List");
                    break;
                case 4:
                    System.out.println("Enter the Character to Search:");
                    char character = input.next().charAt(0);
                    operations.displayElementsStartingWith(character);
                    break;
                case 5:
                    System.out.println("Enter:\n1. Ascending Order");
                    System.out.println("2. Descending Order");
                    int orderChoice = input.nextInt();
                    switch (orderChoice) {
                        case 1:
                            operations.ascendingSort();
                            System.out.println("Ascending Sort Successful.");
                            break;
                        case 2:
                            operations.descendingSort();
                            System.out.println("Descending Sort Successful.");
                            break;
                        default:
                            System.out.println("Invalid Input..");
                            break;
                    }
                    break;
                case 6:
                    operations.displayElements();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    loopController = false;
                    break;
                default:
                    System.out.println("Invalid Input..");
                    break;
            }
        }
    }
}