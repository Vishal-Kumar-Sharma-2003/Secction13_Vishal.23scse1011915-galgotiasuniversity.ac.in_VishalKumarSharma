class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max_profit = 0;
        int buy_prices = prices[0];
        for(int i =1; i<n; i++){
            int curr_profit = prices[i] - buy_prices;
            if(curr_profit > max_profit){
                max_profit = curr_profit;
            }
            if(prices[i] < buy_prices){
                buy_prices = prices[i];
            }
        }
        return max_profit;
        
    }
}