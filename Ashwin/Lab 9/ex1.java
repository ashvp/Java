package Lab9;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;

class DummyCredentials {
    public void writingDummyCredentials(String fileName) {
        File f = new File("/home/snucse/Desktop/Java/Lab9/" + fileName + ".txt");
        try (FileWriter fileWriter = new FileWriter(f)) {
            fileWriter.write("ashwin,ashwin2005\nprasad,prasad1971");
            System.out.println("A File with Dummy Credentials is Created.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void readingDummyCredentials(String fileName) {
        try (BufferedReader fileReader = new BufferedReader(
                new FileReader(new File("/home/snucse/Desktop/Java/Lab9/" + fileName + ".txt")))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                String credentials[] = line.split(",");
                if (credentials.length == 2) {
                    System.out.println("User Name = " + credentials[0]);
                    System.out.println("Password = " + credentials[1]);
                } else {
                    System.out.println("Invalid Format..");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean credentialsChecker(String username, String password, String fileName) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader(new File("/home/snucse/Desktop/Java/Lab9/" + fileName + ".txt")))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String content[] = line.split(",");
                if (content[0].equals(username)) {
                    if (content[1].equals(password)) {
                        System.out.println("Login Credentials are Correct!");
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Login Credentials are Incorrect..");
        return false;
    }

    public void contentWriter(String[] args, String fileName) {
        File f = new File("/home/snucse/Desktop/Java/Lab9/" + fileName + ".txt");
        try (FileWriter writer = new FileWriter(f)) {
            for (String con : args) {
                writer.write(con + "\n");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void contentReader(String fileName) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader(new File("/home/snucse/Desktop/Java/Lab9/" + fileName + ".txt")))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class ex1 {
    public static void main(String[] args) {
        DummyCredentials dc = new DummyCredentials();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Name of the File: ");
        String fileName = input.nextLine();
        System.out.println("Going to Write Dummy Credentials in the File.");
        dc.writingDummyCredentials(fileName);
        System.out.println("Printing the Contents of the File:");
        dc.readingDummyCredentials(fileName);
        System.out.println("-----------------------------------------------");
        System.out.print("Enter the Username: ");
        String username = input.nextLine();
        System.out.print("Enter the Password: ");
        String password = input.nextLine();
        if (dc.credentialsChecker(username, password, fileName)) {
            System.out.println("-----------------------------------------------");
            System.out.print("Enter the Name of the File: ");
            String outputFile = input.nextLine();
            System.out.println("Writing the Command Line Arguments into the File..");
            dc.contentWriter(args, fileName);
            System.out.println("Reading the Contents of the Output File:");
            dc.contentReader(fileName);
        }
    }
}
