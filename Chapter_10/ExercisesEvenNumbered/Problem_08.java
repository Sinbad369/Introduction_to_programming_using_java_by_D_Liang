/*
***10.8 (Financial: the Tax class) Programming Exercise 8.12 writes a program for
computing taxes using arrays. Design a class named Tax to contain the following instance data fields:
■■ int filingStatus: One of the four tax-filing statuses: 0—single filer,
1—married filing jointly or qualifying widow(er), 2—married filing separately,
and 3—head of household. Use the public static constants SINGLE_FILER
(0), MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(ER) (1), MARRIED_
SEPARATELY (2), HEAD_OF_HOUSEHOLD (3) to represent the statuses.
■■ int[][] brackets: Stores the tax brackets for each filing status.
■■ double[] rates: Stores the tax rates for each bracket.
■■ double taxableIncome: Stores the taxable income.
Provide the getter and setter methods for each data field and the getTax()
method that returns the tax. Also, provide a no-arg constructor and the constructor Tax(filingStatus, brackets, rates, taxableIncome).
Draw the UML diagram for the class and then implement the class. Write a test
program that uses the Tax class to print the 2001 and 2009 tax tables for taxable
income from $50,000 to $60,000 with intervals of $1,000 for all four statuses.
The tax rates for the year 2009 were given in Table 3.2. The tax rates for 2001
are shown in Table 10.1
 */
package Chapter_10.ExercisesEvenNumbered;

/**
 *
 * @author Admin
 */
public class Problem_08 {

    public static void main(String[] args) {
        // Define tax brackets and rates for 2001
        int[][] brackets2001 = {
            {27050, 65550, 136750, 297350}, // Single
            {45000, 109250, 166500, 297350}, // Married Filing Jointly
            {22600, 54625, 83250, 148675}, // Married Filing Separately
            {36250, 93650, 151650, 297350} // Head of Household
        };

        double[] rates2001 = {0.15, 0.275, 0.305, 0.355}; // Rates for each bracket

        // Display header
        System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "Taxable Income",
                "Single (2001)", "Married Joint (2001)",
                " Married Sep (2001)", "Head of Household (2001)");

        // Calculate and display tax for each filing status
        for (double income = 50000; income <= 60000; income += 1000) {
            System.out.printf("%-20.2f", income); // Display income
            for (int status = 0; status <= 3; status++) {
                // Create a Tax object for each status
                Tax tax = new Tax(status, brackets2001, rates2001, income);
                // Display tax
                System.out.printf("%-20.2f", tax.getTax());
            }
            System.out.println(); // Move to the next line after all statuses
        }
    }
}

class Tax {

    private int filingStatus;
    final public static int SINGLE_FILER = 0;
    final public static int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    final public static int MARRIED_SEPARATELY = 2;
    final public static int HEAD_OF_HOUSEHOLD = 3;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double getTax() {
        double tax = 0;
        for (int i = 0; i < brackets[filingStatus][i]; i++) {
            if (taxableIncome > brackets[filingStatus][i]) {
                if (i == brackets[filingStatus].length - 1 || taxableIncome < brackets[filingStatus][i + 1]) {
                    tax += (taxableIncome - brackets[filingStatus][i]) * rates[i];
                    break;
                } else {
                    tax += (brackets[filingStatus][i + 1] - brackets[filingStatus][i]) * rates[i];
                }
            } else {
                break;
            }
        }
        return tax;
    }

    public Tax() {
        this.brackets = new int[][]{
            {27050, 65550, 136750, 297350}, // Single
            {45000, 109250, 166500, 297350}, // Married Filing Jointly
            {22600, 54625, 83250, 148675}, // Married Filing Separately
            {36250, 93650, 151650, 297350} // Head of Household
        };

        this.rates = new double[]{0.15, 0.275, 0.305, 0.355, 0.391};
    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

}
