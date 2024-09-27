package Lab6;

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String word = input.next();
        System.out.print("Enter the Index : ");
        int index = input.nextInt();
        if (index > word.length()) {
            System.out.println("Index Out of the Length of String.");
        } else {
            char answer = word.charAt(index);
            System.out.println("The character at the given Index is " + answer);
        }
    }
}
