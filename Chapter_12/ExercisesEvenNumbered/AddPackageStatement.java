/*
12.18 (Add package statement) Suppose you have Java source files under the direc
tories chapter1, chapter2, . . . , chapter34. Write a program to insert the
statement package chapteri; as the first line for each Java source file under
the directory chapteri. Suppose chapter1, chapter2, . . . ,  chapter34
are under the root directory srcRootDirectory. The root  directory and
chapteri directory may contain other folders and files. Use the following
command to run the program:
 java Exercise12_18 srcRootDirectory
 */
package Chapter_12.ExercisesEvenNumbered;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

/**
 *
 * @author Admin
 */
public class AddPackageStatement {

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: java AddPackageStatement srcRootDirectory");
            System.exit(1);
        }

        String rootDir = args[0];
        File rootDirectory = new File(rootDir);

        if (!rootDirectory.exists() || !rootDirectory.isDirectory()) {
            System.out.println("Invalid directory: " + rootDir);
            System.exit(2);
        }

        // Process each chapter directory (chapter1, chapter2, ..., chapter34)
        for (int i = 1; i <= 34; i++) {
            String chapterDirPath = rootDir + File.separator + "chapter" + i;
            File chapterDir = new File(chapterDirPath);

            // If the chapter directory exists, process the Java files inside it
            if (chapterDir.exists() && chapterDir.isDirectory()) {
                processJavaFilesInChapter(chapterDir, "chapter" + i);
            }
        }

        System.out.println("Package statements added successfully.");
    }

    private static void processJavaFilesInChapter(File chapterDir, String packageName) throws IOException {
        // List all files in the directory
        File[] files = chapterDir.listFiles();

        // If the directory contains files
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".java")) {
                    addPackageStatement(file, packageName);
                }
            }
        }
    }

    private static void addPackageStatement(File javaFile, String packageName) throws IOException {
        // Read the content of the Java file
        List<String> lines = Files.readAllLines(javaFile.toPath());

        // Insert the package statement as the first line
        lines.add(0, "package " + packageName + ";");

        // Write the updated content back to the file
        Files.write(javaFile.toPath(), lines);
    }
}
