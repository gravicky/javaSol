class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dyn=new int[amount+1];
        for(int i=1;i<=amount;i++){
            int min=Integer.MAX_VALUE;
            for(int coin:coins){
                if((i-coin)>=0 &&dyn[i-coin]!=-1)
                    min=(min>dyn[i-coin])?dyn[i-coin]:min;
            }
            dyn[i]=(min==Integer.MAX_VALUE)?-1:min+1;
        }
        return dyn[amount];
        
    }
}