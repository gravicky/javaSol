class Solution {
    public int removeDuplicates(int[] nums) {
        int x = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] == nums[i])
                continue;
            nums[x] = nums[i];
            x++;
        }
        return x;
    }
}