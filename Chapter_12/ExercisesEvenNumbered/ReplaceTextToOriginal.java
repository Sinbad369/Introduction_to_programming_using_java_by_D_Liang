/*
12.16 (Replace text) Listing 12.16, ReplaceText.java, gives a program that replaces
text in a source file and saves the change into a new file. Revise the program to
save the change into the original file. For example, invoking
 java Exercise12_16 file oldString newString
 */
package Chapter_12.ExercisesEvenNumbered;

import java.io.*;
import java.util.*;

public class ReplaceTextToOriginal {

    public static void main(String[] args) throws Exception {
        // Check command line parameter usage
        if (args.length != 3) {
            System.out.println(
                    "Usage: java ReplaceTextToOriginal sourceFile oldStr newStr");
            System.exit(1);
        }

        // Check if the source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " doesn't exist");
            System.exit(2);
        }

        // Check if the source file exists
        StringBuilder content = new StringBuilder();
        try (Scanner input = new Scanner(sourceFile)) {
            while (input.hasNextLine()) {
                String line = input.nextLine();
                // Replace the old string with the new string
                content.append(line.replaceAll(args[1], args[2]) + System.lineSeparator());
            }
        }

        // Write the updated content back to the same file
        try (PrintWriter output = new PrintWriter(sourceFile)) {
            output.print(content.toString());
        }

        System.out.println("Text replacement done successfully in the original file.");

    }
}
