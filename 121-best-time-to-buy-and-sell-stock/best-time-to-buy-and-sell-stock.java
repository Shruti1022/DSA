class Solution {
    public int maxProfit(int[] prices) {
       int buy_price= prices[0];
       int profit = 0;

        for( int i = 0; i<prices.length; i++){
            if(buy_price > prices[i]){
                buy_price =prices[i];
            }
            else{
                int current_profit = prices[i]-buy_price;
                profit = Math.max(current_profit, profit);
            }
        }
        return profit;
    }
}