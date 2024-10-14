/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_09.ExercisesEvenNumbered.Problem_02;

/**
 *
 * @author Admin
 */
public class Problem_02 {

    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);

        System.out.printf("Stock symbol: %s, Stock name: %s \n", stock.symbol, stock.name);
        System.out.println("The previous closing price is: " + stock.getPreviousClosingPrice());
        System.out.println("The current price is: " + stock.getCurrentPrice());
        System.out.printf("Percent change is: %.2f%%", stock.getChangePercent());
    }

    public static class Stock {

        String symbol;
        String name;
        double previousClosingPrice;
        double currentPrice;

        public Stock(String newSymbol, String newName) {
            symbol = newSymbol;
            name = newName;
        }

        public double getChangePercent() {
            return (currentPrice - previousClosingPrice) * 100 / previousClosingPrice;
        }

        public double getPreviousClosingPrice() {
            return previousClosingPrice;
        }

        public double getCurrentPrice() {
            return currentPrice;
        }

        public void setPreviousClosingPrice(double newPreviousClosingPrice) {
            previousClosingPrice = newPreviousClosingPrice;
        }

        public void setCurrentPrice(double newCurrentPrice) {
            currentPrice = newCurrentPrice;
        }
    }
}
