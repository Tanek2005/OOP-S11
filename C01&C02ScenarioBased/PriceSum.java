public class PriceSum {
    public static void main(String[] args) {
        double[] prices = {499.99, 1299.50, 299.99, 899.00};
        double total = 0;

        for (double price : prices) {
            total += price;
        }

        System.out.println("Total Sum of Prices: $" + total);
    }
}