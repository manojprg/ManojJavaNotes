package array;

public class StockSellBuy {
    public static void main(String[] args) {
        int stockPrices[] = {7, 1, 5, 3, 6, 4};
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < stockPrices.length; i++) {
            min = Math.min(stockPrices[i], min);
            int tempProfit = stockPrices[i] - min;
            profit = Math.max(profit, tempProfit);
        }
        System.out.println("Highest =" + profit);
    }
}
