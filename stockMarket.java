public class stockMarket {
    public static void main(String[] args) {
        int stocks[] = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(stocks));
    }

    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int currentProfit = prices[i] - minPrice; // today profit
                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }

        return maxProfit;
    }
}
