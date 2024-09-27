package Lab7;

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int length = input.nextInt();
        try {
            int arr[] = new int[length];
            System.out.println("No Exception");
        } catch (NegativeArraySizeException e) {
            System.out.print("Exception Encountered : ");
            System.out.println(e);
        }
    }
}
