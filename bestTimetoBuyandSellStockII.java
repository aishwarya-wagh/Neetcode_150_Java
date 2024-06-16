public class bestTimetoBuyandSellStockII {
    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/?envType=study-plan-v2&envId=top-interview-150

    /**

     You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
    On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
    However, you can buy it then immediately sell it on the same day.
    Find and return the maximum profit you can achieve.

    **/
    public int maxProfit(int[] prices) {
        int maxProfit =0;
        int buy = prices[0];

        for(int i=1;i<prices.length;i++){
            if(buy< prices[i]){
                maxProfit = maxProfit+ (prices[i]-buy);
            }
            buy=prices[i];
        }


        return maxProfit;

    }
}
