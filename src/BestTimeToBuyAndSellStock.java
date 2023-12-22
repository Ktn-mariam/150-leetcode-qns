// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j= 1;

        int maxProfit = 0;
        while (j < prices.length) {
            if (prices[i] >= prices[j]){
                i = j;
            } else {
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(profit, maxProfit);
            }
            j++;
        }

        return maxProfit;
    }
}
