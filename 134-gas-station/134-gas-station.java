class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank=0;
        for(int i=0;i<gas.length;i++){
            tank+=(gas[i]-cost[i]);
            
        }
        if(tank<0)
            return -1;
        int tol=0,k=0;
        for(int start=0;start<gas.length;start++){
            tol+=(gas[start]-cost[start]);
            if(tol<0){
                tol=0;
                k=start+1;
            }
            
            
        }
        return k;
    }
}