class Solution {
    public int findPeakElement(int[] nums) {
        return find(nums,0,nums.length-1);
    }
    
    public int find(int[] nums, int start, int end){
        if(start==end)
            return start;
        else
            if(start==end-1){
                if(nums[start]>nums[end])
                    return start;
                else
                    return end;
            }
        else{
            int m = (end-start)/2 + start;
            if(nums[m]>nums[m-1] && nums[m]>nums[m+1])
                return m;
            else
                if(nums[m-1]>nums[m] && nums[m]>nums[m+1])
                    return find(nums,start,m-1);
            else
                return find(nums,m+1,end);
        }
    }
}