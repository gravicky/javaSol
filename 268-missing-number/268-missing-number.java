class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length,sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            
        }
        int fin=(n)*(n+1)/2-sum;
        return fin;
        
    }
}