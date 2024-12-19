/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_12.Classwork;

/**
 *
 * @author Admin
 */
public class WriteDataWithAutoClose {

    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }
        try (
                // Create a file
                java.io.PrintWriter output = new java.io.PrintWriter(file);) {
            // Write formatted output to the file
            output.print("John T Smith  ");
            output.print(90);
            output.print("John T Smith  ");
            output.print(85);
        }
    }
}
