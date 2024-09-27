package Lab6;

import java.util.HashMap;
import java.util.Scanner;

class methods {
    // I am using a class called "HashMap", which is present in the Util Package. It
    // is used to store Key-Value pairs. The Time Complexity of lookups is in O(1)
    public boolean isAnagram(String word1, String word2, int k) {
        if (word1.length() != word2.length()) {
            return false;
        }
        HashMap<Character, Integer> hash1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hash2 = new HashMap<Character, Integer>();
        for (int i = 0; i < word1.length(); i++) {
            if (hash1.get(word1.charAt(i)) == null) {
                hash1.put(word1.charAt(i), 1);
            } else {
                hash1.put(word1.charAt(i), hash1.get(word1.charAt(i)) + 1);
            }
            if (hash2.get(word2.charAt(i)) == null) {
                hash2.put(word2.charAt(i), 1);
            } else {
                hash2.put(word2.charAt(i), hash2.get(word2.charAt(i)) + 1);
            }
        }
        if (hash1.keySet().containsAll(hash2.keySet()) && hash2.keySet().containsAll(hash1.keySet())) {
            return true;
        }
        HashMap<Character, Integer> hash3 = new HashMap<>(hash1);
        hash1.keySet().removeAll(hash2.keySet());
        hash2.keySet().removeAll(hash3.keySet());
        if (hash1.size() > k || hash2.size() > k) {
            return false;
        }
        return true;
    }

}

public class ex2 {
    public static void main(String[] args) {
        methods obj = new methods();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Word 1 : ");
        String word1 = input.next();
        System.out.print("Enter the Word 2 : ");
        String word2 = input.next();
        System.out.print("Enter the k Value : ");
        int k = input.nextInt();
        boolean ans = obj.isAnagram(word1, word2, k);
        if (ans) {
            System.out.println("The Words are Anagrams.");
        } else {
            System.out.println("The Words are Not Anagrams.");
        }
    }
}
