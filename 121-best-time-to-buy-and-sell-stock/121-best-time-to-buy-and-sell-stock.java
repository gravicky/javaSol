class Solution {
    public int maxProfit(int[] prices) {
        int bestnow=0;
        int bestever=0;
        for(int i=1;i<prices.length;i++){
            bestnow=Math.max(0,bestnow+prices[i]-prices[i-1]);
            bestever=Math.max(bestever,bestnow);
        }
        return bestever;
    }
}