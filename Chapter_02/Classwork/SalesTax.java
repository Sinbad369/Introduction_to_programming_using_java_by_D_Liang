/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_02.Classwork;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class SalesTax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $" + (int) (tax * 100) / 100.0);
    }
}
