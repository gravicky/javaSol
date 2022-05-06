class Solution {
    public int maxSubArray(int[] nums) {
        int maxnow=nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++){
            maxnow=Math.max(maxnow+nums[i],nums[i]);
            max=Math.max(maxnow,max);
            
        }
        return max;
    }
}