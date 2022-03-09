class Solution {
    public int missingNumber(int[] nums) {
        if(nums==null)
            return 0;
        Arrays.sort(nums);
        int mi=nums[0];
        for(int i=1;i<nums.length;i++)
            if(nums[i]!=++mi)
                return mi;
        if(nums[0]==0)
            return (nums[nums.length-1]+1);
        else
            return (nums[0]-1);
}
}