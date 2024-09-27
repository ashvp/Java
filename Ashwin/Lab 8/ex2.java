import java.util.Scanner;

class ageException extends Exception {
    public ageException() {
        super("You are not Eligible to Vote!");
    }
}

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Date of Birth (Use DD/MM/YYYY Format): ");
        String dob = input.nextLine();
        String dateOfBirth[] = dob.split("/");
        int day = Integer.parseInt(dateOfBirth[0]);
        int month = Integer.parseInt(dateOfBirth[1]);
        int year = Integer.parseInt(dateOfBirth[2]);
        if (dateOfBirth.length != 3) {
            System.out.println("Invalid Date of Birth Format!");
            return;
        } else if (day < 1 || day > 31 || month < 1 || month > 12) {
            System.out.println("Invalid Date of Birth Format!");
            return;
        }
        System.out.println("Current Date: 06/09/2024");
        try {
            if (year > 2006) {
                throw new ageException();
            } else if (year == 2006) {
                if (month >= 9) {
                    if (day >= 6) {
                        throw new ageException();
                    }
                }
            }
            System.out.println("You are Eligible to Vote!");
        } catch (ageException e) {
            System.out.println(e);
        } finally {
            System.out.println("Age Eligibility for Voting is Verified!");
        }
    }
}
