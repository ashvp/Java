package Lab7;

import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Age : ");
        int age = input.nextInt();
        try {
            if (age < 18) {
                throw new notEligibleForVotingException("Not Eligible for Voting");
            } else {
                System.out.println("Eligible for Voting.");
            }
        } catch (notEligibleForVotingException e) {
            System.out.println("Exception Raised : " + e);
        } finally {
            System.out.println("Eligibility for Voting is checked.");
        }
    }
}
