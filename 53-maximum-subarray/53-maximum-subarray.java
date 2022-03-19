class Solution {
    public int maxSubArray(int[] nums) {
        int maxsofar=nums[0],maxending=nums[0];
        for(int i=1;i<nums.length;i++){
            maxsofar=Math.max(maxsofar+nums[i],nums[i]);
            maxending=Math.max(maxending,maxsofar);
        }
        return maxending;
        
    }
}