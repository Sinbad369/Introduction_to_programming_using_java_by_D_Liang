/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_12.ExercisesEvenNumbered;

import java.io.*;
import java.util.*;

public class ReformatCode {

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Model usage is as follows: java ReformatCode yourFileName");
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist.");
            System.exit(2);
        }

        List<String> lines = new ArrayList<>();
        try (Scanner input = new Scanner(sourceFile)) {
            while (input.hasNextLine()) {
                lines.add(input.nextLine());
            }
        }

        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i).trim();

            if (line.equals("{")) {
                // Attach the opening brace to the previous line
                int lastIndex = buffer.lastIndexOf("\n");
                if (lastIndex != -1) {
                    buffer.replace(lastIndex, buffer.length(), " {"); // Replace \n with " {"
                } else {
                    buffer.append("{"); // If it's the first line
                }
                buffer.append("\n");
            } else {
                buffer.append(lines.get(i)).append("\n");
            }
        }

        // Write the reformatted content back to the file
        try (PrintWriter output = new PrintWriter(sourceFile)) {
            output.print(buffer.toString());
        }

        System.out.println("File has been reformatted to end-of-line brace style.");
    }
}
