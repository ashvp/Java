package Lab6;

import java.util.LinkedList;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList<>();
        boolean loopController = true;
        while (loopController) {
            System.out.println("Hello!");
            System.out.println("1. Insertion");
            System.out.println("2. Deletion");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the Value to be Inserted : ");
                    String insValue = input.next();
                    if (list.add(insValue)) {
                        System.out.println("Insertion Successful!");
                    } else {
                        System.out.println("Insertion Unsuccessful.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the Value to be Deleted : ");
                    String delValue = input.next();
                    if (list.remove(delValue)) {
                        System.out.println("Deletion Successful!");
                    } else {
                        System.out.println("Deletion Unsuccessful.");
                    }
                    break;
                case 3:
                    System.out.println(list);
                    break;
                case 4:
                    loopController = false;
                    break;
                default:
                    System.out.println("Invalid Input..");
                    break;
            }
        }
    }
}