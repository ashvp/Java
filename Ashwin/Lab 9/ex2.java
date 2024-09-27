package Lab9;

import java.io.*;
import java.util.ArrayList;

public class ex2 {
    public void createBestPerformers(ArrayList<String> bestPerformers) {
        try (FileWriter writer = new FileWriter(new File("/home/snucse/Desktop/Java/Lab9/best_performers.txt"))) {
            for (String con : bestPerformers) {
                writer.write(con + "\n");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void createLowPerformers(ArrayList<String> lowPerformers) {
        try (FileWriter writer = new FileWriter(new File("/home/snucse/Desktop/Java/Lab9/low_performers.txt"))) {
            for (String con : lowPerformers) {
                writer.write(con + "\n");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> bestPerformers = new ArrayList<String>();
        ArrayList<String> lowPerformers = new ArrayList<String>();
        ex2 object = new ex2();
        try (BufferedReader reader = new BufferedReader(
                new FileReader(new File("/home/snucse/Desktop/Java/Lab9/marks.txt")))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String marks[] = line.split(",");
                if (marks.length == 2) {
                    if (Integer.parseInt(marks[1]) > 90) {
                        bestPerformers.add(marks[0]);
                    } else if (Integer.parseInt(marks[1]) < 40) {
                        lowPerformers.add(marks[0]);
                    }
                }
            }
            object.createBestPerformers(bestPerformers);
            object.createLowPerformers(lowPerformers);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
