/*
 12.2 (ArrayIndexOutOfBoundsException) Using the two arrays shown below,
write a program that prompts the user to enter an integer between 1 and 12 and
then displays the months and its number of days corresponding to the integer
entered. Your program should display “wrong number” if the user enters a
wrong number by catching ArrayIndexOutOfBoundsException.
 */
package Chapter_12.ExercisesEvenNumbered;

public class Problem_02 {

    public static void main(String[] args)
            throws ArrayIndexOutOfBoundsException {
        java.util.Scanner input = new java.util.Scanner(System.in);
        // Array of months
        String[] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };

        // Array of days in each month
        int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Enter the the number between 1 and 12: ");
        try {
            int choiceOfNumber = input.nextInt();
            System.out.println("The month is " + months[choiceOfNumber - 1]
                    + " and the number of days is " + daysOfMonth[choiceOfNumber - 1]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Wrong number, try again pls: " + ex);
            input.nextLine();
        } catch (Exception ex) {
            System.out.println("Invalid input. Please enter a number.");
        }
    }
}
