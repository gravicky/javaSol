class Solution {
    public int climbStairs(int n) {
        int[] num=new int[n+1];
        if(n==1)
            return 1;
        if(n==0)
            return 0;
        num[1]=1;
        num[2]=2;
        for(int i=3;i<=n;i++){
            num[i]=num[i-1]+num[i-2];
        }
        return num[n];
    }
}