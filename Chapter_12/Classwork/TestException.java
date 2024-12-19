/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_12.Classwork;

public class TestException {

    public static void main(String[] args) {
        try {
            System.out.println(sum(new int[]{1, 2, 3, 4, 5}));
        } catch (Exception ex) {
            ex.printStackTrace(); // Print the complete stack trace of the exception
            System.out.println("\n" + ex.getMessage()); // Print the exception's message
            System.out.println("\n" + ex.toString()); // Print a string representation of the exception

            System.out.println("\nTrace Info Obtained from getStackTrace:");
            StackTraceElement[] traceElements = ex.getStackTrace(); // Obtain the stack trace
            for (int i = 0; i < traceElements.length; i++) {
                System.out.print("method " + traceElements[i].getMethodName());
                System.out.print("(" + traceElements[i].getClassName() + ":");
                System.out.println(traceElements[i].getLineNumber() + ")");
            }
        }
    }

    private static int sum(int[] list) {
        int result = 0;
        for (int i = 0; i <= list.length; i++) { // This will cause an ArrayIndexOutOfBoundsException
            result += list[i];
        }
        return result;
    }
}
