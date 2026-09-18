class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int profit=0;
        int max=prices[prices.length-1];
        for(int i=prices.length-1;i>=0;i--){
            if(prices[i]>max){
                max=prices[i];
            }
            profit=max-prices[i];
            ans=Math.max(ans, profit);
        }
      return ans;
    }
}
