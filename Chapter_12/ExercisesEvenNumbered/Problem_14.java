/*
12.14 (Reading in a sorted file) Write a method public static int
readInFile(String line, File file) that returns the position number
of a line in the file filename or −1 if there is no such line or file.
We assume that this file contains names of people with a name per line.
Names (and hence lines) are listed in ascending alphabetical order in the file.
We can not find the same line twice.
 */
package Chapter_12.ExercisesEvenNumbered;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class Problem_14 {

    public static void main(String[] args) throws FileNotFoundException {
        URL resource = Problem_14.class.getResource("/Names.txt");

        if (resource == null) {
            System.out.println("File not found in the classpath");
            return;
        }

        File file = new File(resource.getFile());
        String searchName = "Bob";

        int position = readInFile(searchName, file);
        if (position != -1) {
            System.out.println(searchName + "'s position is " + position);
        } else {
            System.out.println(searchName + " is not found at the file");
        }
    }

    public static int readInFile(String line, File file) throws FileNotFoundException {
        if (!file.exists()) {
            return -1;
        }
        try (Scanner input = new Scanner(file)) {
            int position = 1;
            while (input.hasNextLine()) {
                String currentLine = input.nextLine().trim();
                if (currentLine.equals(line)) {
                    return position;
                }
                position++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + ex);
        }

        return -1;
    }
}
