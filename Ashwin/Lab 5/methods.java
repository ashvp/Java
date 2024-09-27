package Lab5;

import java.util.*;

public class methods {
    ArrayList<String> list = new ArrayList<String>();

    // Method to Append a String
    public void append(String value) {
        list.add(value);
    }

    // Method to Insert a String at Any Valid Position
    public int insertAtPosition(String value, int position) {
        if (position > list.size()) {
            return 0;
        }
        list.add(position, value);
        return 1;
    }

    // Method to search the String
    public boolean search(String value) {
        return list.contains(value);
    }

    // Method to Display All Elements Starting in the Character
    public void displayElementsStartingWith(char value) {
        for (String i : list) {
            if (i.charAt(0) == value) {
                System.out.println(i);
            }
        }
    }

    // Method to Sort Elements in Ascending Order
    public void ascendingSort() {
        Collections.sort(list);
    }

    // Method to Sort Elements in Descending Order
    public void descendingSort() {
        Collections.sort(list, Collections.reverseOrder());
    }

    // Method to Display all Elements
    public void displayElements() {
        for (String i : list) {
            System.out.println(i);
        }
    }
}
