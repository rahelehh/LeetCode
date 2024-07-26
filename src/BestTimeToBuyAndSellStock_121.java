public class BestTimeToBuyAndSellStock_121 {
    public int maxProfit(int[] prices) {
        int candidate = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < candidate) {
                candidate = prices[i];
            }
            if (prices[i] - candidate > profit) {
                profit = prices[i] - candidate;
            }
        }
        return profit;
    }
}
