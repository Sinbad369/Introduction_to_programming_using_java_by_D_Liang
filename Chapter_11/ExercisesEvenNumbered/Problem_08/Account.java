/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11.ExercisesEvenNumbered.Problem_08;

import java.util.ArrayList;

public class Account {

    private String name;
    private String id;
    private double balance;
    private double annualInterestRate;
    private ArrayList<Transaction> transactions;

    public Account(String name, String id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.transactions = new ArrayList<>();
        this.annualInterestRate = 1.5;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // Deposit method
    public void deposit(double amount) {
        this.balance += amount;
        transactions.add(new Transaction('D', amount, this.balance, "Deposit"));
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            transactions.add(new Transaction('W', amount, this.balance, "Withdrawal"));
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    @Override
    public String toString() {
        return "Account{"
                + "name='" + name + '\''
                + ", id='" + id + '\''
                + ", balance=" + balance
                + ", annualInterestRate=" + annualInterestRate + "%"
                + ", transactions=" + transactions
                + '}';

    }
}
