/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11.ExercisesEvenNumbered.Problem_08;

/**
 *
 * @author Admin
 */
import java.util.Date;

public class Transaction {

    private Date date;
    private char type;  // 'D' for deposit, 'W' for withdrawal
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.date = new Date();  // Set to the current date and time
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Transaction{"
                + "date=" + date
                + ", type=" + type
                + ", amount=" + amount
                + ", balance=" + balance
                + ", description='" + description + '\''
                + '}';
    }
}
